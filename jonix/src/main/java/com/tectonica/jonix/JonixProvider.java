/*
 * Copyright (C) 2012 Zach Melamed
 *
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix;

import com.tectonica.jonix.unify.BaseRecord;
import com.tectonica.jonix.util.GlobScanner;
import com.tectonica.xmlchunk.XmlChunkerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import repackaged.org.apache.commons.io.input.BOMInputStream;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.tectonica.jonix.JonixFactory.headerFromElement;
import static com.tectonica.jonix.JonixFactory.productFromElement;

public class JonixProvider implements Iterable<JonixRecord> {

    private static final Logger LOGGER = LoggerFactory.getLogger(JonixProvider.class);

    private final InputStream inputStream;
    private final List<File> files;
    private String encoding = "UTF-8";
    private List<OnSource> onSourceEvents = new ArrayList<>();

    /**
     * not to be called directly, used {@link Jonix#source(InputStream)}
     */
    JonixProvider(InputStream inputStream) {
        this.inputStream = Objects.requireNonNull(inputStream);
        this.files = new ArrayList<>();
    }

    /**
     * not to be called directly, used {@link Jonix#source(List)}
     */
    JonixProvider(List<File> files) {
        this.inputStream = null;
        this.files = new ArrayList<>(Objects.requireNonNull(files));
    }

    public JonixProvider source(List<File> files) {
        this.files.addAll(Objects.requireNonNull(files));
        return this;
    }

    public JonixProvider source(File file) {
        this.files.add(Objects.requireNonNull(file));
        return this;
    }

    public JonixProvider source(File folder, String glob, boolean recursive) throws IOException {
        this.files.addAll(GlobScanner.scan(folder, glob, recursive));
        return this;
    }

    public JonixProvider encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    @FunctionalInterface
    public interface OnSource {
        void onSource(OnixSource onixSource);
    }

    /**
     * NOTE: can be called more than once to register several event-listeners
     */
    public JonixProvider onSource(OnSource onSource) {
        this.onSourceEvents.add(onSource);
        return this;
    }

    public Stream<JonixRecord> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    public Stream<BaseRecord> streamUnified() {
        return stream().map(JonixUnifier::unifyRecord);
    }

    @Override
    public Iterator<JonixRecord> iterator() {
        return new SourceAndProductIterator();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private class ProductIterator implements Iterator<OnixProduct> {
        final SourceAndProductIterator iter;

        ProductIterator() {
            iter = new SourceAndProductIterator();
        }

        @Override
        public boolean hasNext() {
            return iter.hasNext();
        }

        @Override
        public OnixProduct next() {
            return iter.next().product;
        }
    }

    private class SourceAndProductIterator implements Iterator<JonixRecord> {
        final List<File> nextFiles;
        Iterator<JonixRecord> currentIterator;

        SourceAndProductIterator() {
            try {
                if (inputStream == null) {
                    nextFiles = files.subList(0, files.size());
                    currentIterator = nextFileIterator(nextFiles);
                } else {
                    nextFiles = Collections.emptyList();
                    currentIterator = inputStreamIterator(new OnixSource(inputStream));
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public boolean hasNext() {
            boolean hasNext = currentIterator.hasNext();
            while (!hasNext && !nextFiles.isEmpty()) {
                try {
                    currentIterator = nextFileIterator(nextFiles);
                    hasNext = currentIterator.hasNext();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            return hasNext;
        }

        @Override
        public JonixRecord next() {
            return currentIterator.next();
        }

        Iterator<JonixRecord> nextFileIterator(List<File> nextFiles)
            throws FileNotFoundException, XMLStreamException {
            File file = nextFiles.remove(0);
            return inputStreamIterator(new OnixSource(file));
        }

        Iterator<JonixRecord> inputStreamIterator(OnixSource source) throws XMLStreamException {
            // create iteration context, which holds the XML stream between next() invocations
            final XmlChunkerContext ctx = new XmlChunkerContext(new BOMInputStream(source.stream), encoding, 2);

            // read the first tag in the file, should always be <ONIXMessage>
            StartElement onixMessage = (StartElement) ctx.nextObject();
            // TODO: allow onixMessage = null, and check that it works on empty files
            if (!onixMessage.getName().getLocalPart()
                .equalsIgnoreCase("ONIXMessage")) { // TODO: check if should be 'equals'
                throw new RuntimeException(
                    "source doesn't start with the mandatory <ONIXMessage> tag: " + source.getSourceName());
            }

            // given the <ONIXMessage>, determine the ONIX version (provided as an attribute of the tag)
            final Attribute release = onixMessage.getAttributeByName(new QName("release"));
            boolean onix2 = (release == null || release.getValue().startsWith("2"));
            boolean onix3 = (release != null && release.getValue().startsWith("3"));
            if (onix2) {
                source.onixVersion = OnixVersion.ONIX2;
            } else if (onix3) {
                source.onixVersion = OnixVersion.ONIX3;
            } else {
                throw new RuntimeException(
                    "source doesn't comply with either ONIX2 or ONIX3: " + source.getSourceName());
            }

            // read the first chunk (level-2 element), which should either be a <Product> or <Header>
            Element firstElement = ctx.nextChunk();
            // TODO: allow firstProduct = null, and check that it works on files with not tags under OnixMessage
            boolean hasHeader = firstElement.getNodeName().equalsIgnoreCase("Header");
            if (hasHeader) {
                source.header = Optional.of(headerFromElement(firstElement, source.onixVersion));
            }
            onSourceEvents.forEach(e -> e.onSource(source));

            if (hasHeader) {
                // if the first chunk (level-2 element) was a <Header>, the next one must be a <Product>
                firstElement = ctx.nextChunk();
                // TODO: allow firstProduct = null, and check that it works on files with only header tag
                // TODO: Handle Onix3's <NoProduct>
            }

            // the context now points to the first product in the input-stream, we can start iterate
            final Element firstProduct = firstElement;
            return new Iterator<JonixRecord>() {
                Element nextProduct = firstProduct;

                @Override
                public boolean hasNext() {
                    return (nextProduct != null);
                }

                @Override
                public JonixRecord next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }

                    Element product = nextProduct;
                    try {
                        nextProduct = ctx.nextChunk();
                    } catch (XMLStreamException e) {
                        throw new RuntimeException(e);
                    }

                    // TODO: verify the product is indeed <Product> ?

                    return new JonixRecord(source, productFromElement(product, source.onixVersion));
                }
            };
        }
    }
}
