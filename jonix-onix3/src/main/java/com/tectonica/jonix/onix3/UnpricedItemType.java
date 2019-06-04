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
import com.tectonica.jonix.common.codelist.UnpricedItemTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Unpriced item type</h1>
 * <p>
 * An ONIX code which specifies the product is free of charge, or a reason why a price is not sent. <em>If code value 02
 * is used to send advance information without giving a price, the price must be confirmed as soon as possible.</em>
 * Optional and non-repeating, but required if the &lt;SupplyDetail&gt; composite does not carry a price.
 * </p>
 * <p>
 * Use here in preference to P.26.70a when the product is available <em>only</em> under free of charge or unpriced terms
 * from the supplier.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed length, two digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 57</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;UnpricedItemType&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;j192&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;j192&gt;01&lt;/j192&gt;</tt> (Free of charge)</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;SupplyDetail&gt;</li>
 * <li>&lt;Price&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ SupplyDetail ⯈ UnpricedItemType</li>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ SupplyDetail ⯈ Reissue ⯈ Price ⯈ UnpricedItemType</li>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ SupplyDetail ⯈ Price ⯈ UnpricedItemType</li>
 * </ul>
 */
public class UnpricedItemType implements OnixElement<UnpricedItemTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "UnpricedItemType";
    public static final String shortname = "j192";

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

    public UnpricedItemTypes value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public UnpricedItemTypes _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final UnpricedItemType EMPTY = new UnpricedItemType();

    public UnpricedItemType() {
        exists = false;
    }

    public UnpricedItemType(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = UnpricedItemTypes.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;UnpricedItemType&gt; or &lt;j192&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
