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
import com.tectonica.jonix.common.ListOfOnixElement;
import com.tectonica.jonix.common.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Sales restriction composite</h1>
 * <p>
 * A group of data elements which together identify a non-territorial sales restriction which a publisher applies to a
 * product within a particular territory. Optional, and repeatable if more than a single restriction applies.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;SalesRestriction&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;salesrestriction&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;PublishingDetail&gt;</li>
 * <li>&lt;Market&gt;</li>
 * <li>&lt;SalesRights&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ PublishingDetail ⯈ SalesRestriction</li>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ Market ⯈ SalesRestriction</li>
 * <li>ONIXMessage ⯈ Product ⯈ PublishingDetail ⯈ SalesRights ⯈ SalesRestriction</li>
 * </ul>
 */
public class SalesRestriction implements OnixSuperComposite, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "SalesRestriction";
    public static final String shortname = "salesrestriction";

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
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final SalesRestriction EMPTY = new SalesRestriction();

    public SalesRestriction() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public SalesRestriction(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
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
                case SalesRestrictionType.refname:
                case SalesRestrictionType.shortname:
                    salesRestrictionType = new SalesRestrictionType(e);
                    break;
                case SalesOutlet.refname:
                case SalesOutlet.shortname:
                    salesOutlets = JPU.addToList(salesOutlets, new SalesOutlet(e));
                    break;
                case SalesRestrictionNote.refname:
                case SalesRestrictionNote.shortname:
                    salesRestrictionNotes = JPU.addToList(salesRestrictionNotes, new SalesRestrictionNote(e));
                    break;
                case StartDate.refname:
                case StartDate.shortname:
                    startDate = new StartDate(e);
                    break;
                case EndDate.refname:
                case EndDate.shortname:
                    endDate = new EndDate(e);
                    break;
                default:
                    break;
            }
        });
    }

    /**
     * @return whether this tag (&lt;SalesRestriction&gt; or &lt;salesrestriction&gt;) is explicitly provided in the
     * ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private SalesRestrictionType salesRestrictionType = SalesRestrictionType.EMPTY;

    /**
     * <p>
     * An ONIX code which identifies a non-territorial sales restriction. Mandatory in each occurrence of the
     * &lt;SalesRestriction&gt; composite, and non-repeating.
     * </p>
     * Jonix-Comment: this field is required
     */
    public SalesRestrictionType salesRestrictionType() {
        _initialize();
        return salesRestrictionType;
    }

    private List<SalesOutlet> salesOutlets = Collections.emptyList();

    /**
     * <p>
     * An optional group of data elements which together identify a sales outlet to which a restriction is linked. Each
     * occurrence of the composite must include a &lt;SalesOutletIdentifier&gt; composite or a &lt;SalesOutletName&gt;
     * or both. Repeatable in order to identify multiple sales outlets subject to the restriction.
     * </p>
     * Jonix-Comment: this list may be empty
     */
    public List<SalesOutlet> salesOutlets() {
        _initialize();
        return salesOutlets;
    }

    private ListOfOnixElement<SalesRestrictionNote, String> salesRestrictionNotes = ListOfOnixElement.empty();

    /**
     * <p>
     * A free text field describing an ‘unspecified’ restriction, or giving more explanation of a coded restriction
     * type. Optional, and repeatable if parallel text is provided in multiple languages. The <i>language</i> attribute
     * is optional for a single instance of &lt;SalesRestrictionNote&gt;, but must be included in each instance if
     * &lt;SalesRestrictionNote&gt; is repeated.
     * </p>
     * Jonix-Comment: this list may be empty
     */
    public ListOfOnixElement<SalesRestrictionNote, String> salesRestrictionNotes() {
        _initialize();
        return salesRestrictionNotes;
    }

    private StartDate startDate = StartDate.EMPTY;

    /**
     * <p>
     * The date from which a sales restriction is effective. Optional and non-repeating.
     * </p>
     * Jonix-Comment: this field is optional
     */
    public StartDate startDate() {
        _initialize();
        return startDate;
    }

    private EndDate endDate = EndDate.EMPTY;

    /**
     * <p>
     * The date until which a sales restriction is effective. Optional and non-repeating.
     * </p>
     * Jonix-Comment: this field is optional
     */
    public EndDate endDate() {
        _initialize();
        return endDate;
    }
}
