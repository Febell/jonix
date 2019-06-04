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

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.common.JPU;
import com.tectonica.jonix.common.OnixElement;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Year of annual</h1>
 * <p>
 * When the year of an annual is part of a title, this field should be used to carry the year (or, if required, a spread
 * of years such as 2009–2010). Optional and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Year or range of years, in the format YYYY or YYYY-YYYY</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;YearOfAnnual&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;b020&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;b020&gt;2009&lt;/b020&gt;</tt></td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;TitleElement&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ TitleDetail ⯈ TitleElement ⯈ YearOfAnnual</li>
 * <li>ONIXMessage ⯈ Product ⯈ ContentDetail ⯈ ContentItem ⯈ TitleDetail ⯈ TitleElement ⯈ YearOfAnnual</li>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Collection ⯈ TitleDetail ⯈ TitleElement ⯈ YearOfAnnual</li>
 * </ul>
 */
public class YearOfAnnual implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "YearOfAnnual";
    public static final String shortname = "b020";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Year or range of years, in the format YYYY or YYYY-YYYY
     * <p>
     * (type: dt.YearOrYearRange)
     */
    public String value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final YearOfAnnual EMPTY = new YearOfAnnual();

    public YearOfAnnual() {
        exists = false;
    }

    public YearOfAnnual(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getContentAsString(element);
    }

    /**
     * @return whether this tag (&lt;YearOfAnnual&gt; or &lt;b020&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
