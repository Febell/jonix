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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.DateFormats;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Event date</h1><p>The date of an event to which the product is related. Optional and non-repeating.</p><table
 * border='1' cellpadding='3'><tr><td>Format</td><td>As specified by the value in the dateformat attribute, or the
 * default of YYYY if the attribute is missing. Note that the dateformat attribute allows exact dates to be supplied if
 * necessary, including the cases where an event spreads over a range of dates or the date can only be supplied as a
 * text string</td></tr><tr><td>Reference name</td><td>&lt;EventDate&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;x520&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Attributes</td><td>dateformat</td></tr><tr><td>Example</td><td>&lt;EventDate
 * dateformat=&quot;06&quot;&gt;2015113020151215&lt;/EventDate&gt; (30 November-15 December 2015)</td></tr></table>
 */
public class EventDate implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "EventDate";
    public static final String shortname = "x520";

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

    public DateFormats dateformat;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: As specified by the value in the dateformat attribute, or the default of YYYY if the attribute is
     * missing. Note that the dateformat attribute allows exact dates to be supplied if necessary, including the cases
     * where an event spreads over a range of dates or the date can only be supplied as a text string<p> (type:
     * dt.NonEmptyString)
     */
    public String value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final EventDate EMPTY = new EventDate();

    public EventDate() {
        exists = false;
    }

    public EventDate(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
        dateformat = DateFormats.byCode(JPU.getAttribute(element, "dateformat"));

        value = JPU.getContentAsString(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}