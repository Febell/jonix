/*
 * Copyright (C) 2012-2024 Zach Melamed
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

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.common.JPU;
import com.tectonica.jonix.common.ListOfOnixElement;
import com.tectonica.jonix.common.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.common.codelist.AudienceCodeTypes;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;
import com.tectonica.jonix.common.struct.JonixAudience;

import java.io.Serializable;
import java.util.function.Consumer;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Audience composite</h1>
 * <p>
 * An optional group of data elements which together describe an audience to which the product is directed. Repeatable,
 * both to specify multiple distinct audiences, and to express audiences using multiple schemes.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;Audience&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;audience&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 * <p/>
 * Technical notes about &lt;Audience&gt; from the schema author:
 * 
 * <pre>
 * Details of a target audience or readership of a product
 * &#9679; Added &lt;MainAudience/&gt; at release 3.1
 * &#9679; Added &lt;AudienceHeadingText&gt; at revision 3.0.8
 * </pre>
 * 
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link DescriptiveDetail}&gt;</li>
 * </ul>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Audience}</li>
 * </ul>
 */
public class Audience implements OnixDataCompositeWithKey<JonixAudience, AudienceCodeTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Audience";
    public static final String shortname = "audience";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    public RecordSourceTypes sourcetype;

    /////////////////////////////////////////////////////////////////////////////////
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final Audience EMPTY = new Audience();

    public Audience() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public Audience(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcename = JPU.getAttribute(element, "sourcename");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
    }

    @Override
    public void _initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case AudienceCodeType.refname:
                case AudienceCodeType.shortname:
                    audienceCodeType = new AudienceCodeType(e);
                    break;
                case AudienceCodeValue.refname:
                case AudienceCodeValue.shortname:
                    audienceCodeValue = new AudienceCodeValue(e);
                    break;
                case MainAudience.refname:
                case MainAudience.shortname:
                    mainAudience = new MainAudience(e);
                    break;
                case AudienceCodeTypeName.refname:
                case AudienceCodeTypeName.shortname:
                    audienceCodeTypeName = new AudienceCodeTypeName(e);
                    break;
                case AudienceHeadingText.refname:
                case AudienceHeadingText.shortname:
                    audienceHeadingTexts = JPU.addToList(audienceHeadingTexts, new AudienceHeadingText(e));
                    break;
                default:
                    break;
            }
        });
    }

    /**
     * @return whether this tag (&lt;Audience&gt; or &lt;audience&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    public void ifExists(Consumer<Audience> action) {
        if (exists) {
            action.accept(this);
        }
    }

    @Override
    public org.w3c.dom.Element getXmlElement() {
        return element;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private AudienceCodeType audienceCodeType = AudienceCodeType.EMPTY;

    /**
     * <p>
     * An ONIX code which identifies the scheme from which the code in &lt;AudienceCodeValue&gt; is taken. Mandatory in
     * each occurrence of the &lt;Audience&gt; composite, and non-repeating.
     * </p>
     * JONIX adds: this field is required
     */
    public AudienceCodeType audienceCodeType() {
        _initialize();
        return audienceCodeType;
    }

    private AudienceCodeValue audienceCodeValue = AudienceCodeValue.EMPTY;

    /**
     * <p>
     * A code value taken from the scheme specified in &lt;AudienceCodeType&gt;. Either &lt;AudienceCodeValue&gt; or
     * &lt;AudienceHeadingText&gt; or both must be present in each occurrence of the &lt;Audience&gt; composite.
     * Non-repeating.
     * </p>
     * JONIX adds: this field is required
     */
    public AudienceCodeValue audienceCodeValue() {
        _initialize();
        return audienceCodeValue;
    }

    private MainAudience mainAudience = MainAudience.EMPTY;

    /**
     * <p>
     * An empty element that identifies an instance of the &lt;Audience&gt; composite as representing the primary or
     * main audience for the product. The main audience may be expressed in more than one audience scheme, <i>ie</i>
     * there may be two or more instances of the &lt;Audience&gt; composite, using different schemes, each carrying the
     * &lt;MainAudience/&gt; flag, so long as there is only one main audience <em>per scheme</em> (<i>ie</i> per value
     * of &lt;AudienceCodeType&gt;). Optional and non-repeating in each occurrence of the &lt;Audience&gt; composite.
     * </p>
     * JONIX adds: this field is optional
     */
    public MainAudience mainAudience() {
        _initialize();
        return mainAudience;
    }

    public boolean isMainAudience() {
        return (mainAudience().exists());
    }

    private AudienceCodeTypeName audienceCodeTypeName = AudienceCodeTypeName.EMPTY;

    /**
     * <p>
     * A name which identifies a proprietary audience scheme when the code in &lt;AudienceCodeType&gt; indicates a
     * proprietary scheme, <i>eg</i> a vendor’s own coding scheme. Optional and non-repeating.
     * </p>
     * JONIX adds: this field is optional
     */
    public AudienceCodeTypeName audienceCodeTypeName() {
        _initialize();
        return audienceCodeTypeName;
    }

    private ListOfOnixElement<AudienceHeadingText, String> audienceHeadingTexts = ListOfOnixElement.empty();

    /**
     * <p>
     * The text of an audience heading taken from the scheme specified in the &lt;AudienceCodeType&gt; element; or the
     * text equivalent to the &lt;AudienceCodeValue&gt; if both code and text are sent. Either &lt;AudienceCodeValue&gt;
     * or &lt;AudienceHeadingText&gt; or both must be present in each occurrence of the &lt;Audience&gt; composite.
     * </p>
     * <p>
     * Optional, and repeatable if the text is sent in multiple languages. The <i>language</i> attribute is optional for
     * a single instance of &lt;AudienceHeadingText&gt;, but must be included in each instance if
     * &lt;AudienceHeadingText&gt; is repeated.
     * </p>
     * JONIX adds: this list may be empty
     */
    public ListOfOnixElement<AudienceHeadingText, String> audienceHeadingTexts() {
        _initialize();
        return audienceHeadingTexts;
    }

    @Override
    public JonixAudience asStruct() {
        _initialize();
        JonixAudience struct = new JonixAudience();
        struct.audienceCodeType = audienceCodeType.value;
        struct.audienceCodeTypeName = audienceCodeTypeName.value;
        struct.audienceCodeValue = audienceCodeValue.value;
        return struct;
    }

    @Override
    public AudienceCodeTypes structKey() {
        return audienceCodeType().value;
    }
}
