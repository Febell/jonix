/*
 * Copyright (C) 2012-2022 Zach Melamed
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
import com.tectonica.jonix.common.codelist.InsertPointTypes;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Insertion point type</h1>
 * <p>
 * An ONIX code specifying the format in which the insertion point is included in &lt;InsertPointValue&gt;.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed length, three letters</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 255</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;InsertPointType&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;x574&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;InsertPointType&gt;ALP&lt;/InsertPointType&gt;</tt> (Adjacent to logical page)</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link InsertPoint}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ProductionDetail} ⯈ {@link ProductionManifest} ⯈
 * {@link SupplementManifest} ⯈ {@link InsertManifest} ⯈ {@link InsertPoint} ⯈ {@link InsertPointType}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ProductionDetail} ⯈ {@link ProductionManifest} ⯈
 * {@link InsertManifest} ⯈ {@link InsertPoint} ⯈ {@link InsertPointType}</li>
 * </ul>
 *
 * @since Onix-3.08
 */
public class InsertPointType implements OnixElement<InsertPointTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "InsertPointType";
    public static final String shortname = "x574";

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
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public InsertPointTypes value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public InsertPointTypes _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final InsertPointType EMPTY = new InsertPointType();

    public InsertPointType() {
        exists = false;
    }

    public InsertPointType(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcename = JPU.getAttribute(element, "sourcename");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));

        value = InsertPointTypes.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;InsertPointType&gt; or &lt;x574&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}