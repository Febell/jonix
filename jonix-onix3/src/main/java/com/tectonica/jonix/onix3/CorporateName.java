/*
 * Copyright (C) 2012-2023 Zach Melamed
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
import com.tectonica.jonix.common.OnixElement;
import com.tectonica.jonix.common.codelist.Languages;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;
import com.tectonica.jonix.common.codelist.TextScripts;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Corporate contributor name</h1>
 * <p>
 * The name of a corporate body which contributed to the creation of the product, unstructured, and presented in normal
 * order. Optional: see Group&nbsp;P.7 introductory text for valid options. Repeatable, to provide parallel names for a
 * single organization in multiple languages (<i>eg</i> ‘World Health Organization’ and
 * <span lang="fr">«&nbsp;Organisation mondiale de la santé&nbsp;»</span>).The <i>language</i> attribute is optional for
 * a single instance of &lt;CorporateName&gt;, but must be included in each instance if &lt;CorporateName&gt; is
 * repeated.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable length text, suggested maximum length 200 characters</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;CorporateName&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;b047&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * <tr>
 * <td>Attributes</td>
 * <td>collationkey, language, textscript</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;CorporateName&gt;Good Housekeeping Institute&lt;/CorporateName&gt;</tt></td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link AlternativeName}&gt;</li>
 * <li>&lt;{@link CopyrightOwner}&gt;</li>
 * <li>&lt;{@link EventSponsor}&gt;</li>
 * <li>&lt;{@link Contributor}&gt;</li>
 * <li>&lt;{@link NameAsSubject}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Contributor} ⯈ {@link AlternativeName}
 * ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link Contributor} ⯈
 * {@link AlternativeName} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PromotionDetail} ⯈ {@link PromotionalEvent} ⯈ {@link Contributor}
 * ⯈ {@link AlternativeName} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Collection} ⯈ {@link Contributor} ⯈
 * {@link AlternativeName} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link NameAsSubject} ⯈
 * {@link AlternativeName} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link NameAsSubject} ⯈
 * {@link AlternativeName} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link CopyrightStatement}
 * ⯈ {@link CopyrightOwner} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PublishingDetail} ⯈ {@link CopyrightStatement} ⯈
 * {@link CopyrightOwner} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Event} ⯈ {@link EventSponsor} ⯈
 * {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PromotionDetail} ⯈ {@link PromotionalEvent} ⯈
 * {@link EventOccurrence} ⯈ {@link EventSponsor} ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PromotionDetail} ⯈ {@link PromotionalEvent} ⯈ {@link EventSponsor}
 * ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Contributor} ⯈
 * {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link Contributor} ⯈
 * {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PromotionDetail} ⯈ {@link PromotionalEvent} ⯈ {@link Contributor}
 * ⯈ {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Collection} ⯈ {@link Contributor} ⯈
 * {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link NameAsSubject} ⯈
 * {@link CorporateName}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link NameAsSubject} ⯈
 * {@link CorporateName}</li>
 * </ul>
 */
public class CorporateName implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "CorporateName";
    public static final String shortname = "b047";

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

    /**
     * (type: dt.NonEmptyString)
     */
    public String collationkey;

    public TextScripts textscript;

    public Languages language;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * This is the raw content of CorporateName. Could be null if {@code exists() == false}. Use {@link #value()}
     * instead if you want to get this as an {@link java.util.Optional}.
     * <p>
     * Raw Format: Variable length text, suggested maximum length 200 characters
     * <p>
     * (type: dt.NonEmptyString)
     */
    public String value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public String __v() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final CorporateName EMPTY = new CorporateName();

    public CorporateName() {
        exists = false;
    }

    public CorporateName(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcename = JPU.getAttribute(element, "sourcename");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        collationkey = JPU.getAttribute(element, "collationkey");
        textscript = TextScripts.byCode(JPU.getAttribute(element, "textscript"));
        language = Languages.byCode(JPU.getAttribute(element, "language"));

        value = JPU.getContentAsString(element);
    }

    /**
     * @return whether this tag (&lt;CorporateName&gt; or &lt;b047&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
