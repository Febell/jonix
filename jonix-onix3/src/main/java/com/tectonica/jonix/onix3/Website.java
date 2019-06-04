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
import com.tectonica.jonix.common.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;
import com.tectonica.jonix.common.struct.JonixWebsite;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Website composite</h1>
 * <p>
 * An optional group of data elements which together identify and provide a pointer to a website which is related to the
 * person or organization identified in an occurrence of the &lt;Contributor&gt; composite. Repeatable to provide links
 * to multiple websites.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;Website&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;website&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;Conference&gt;</li>
 * <li>&lt;Supplier&gt;</li>
 * <li>&lt;Publisher&gt;</li>
 * <li>&lt;Event&gt;</li>
 * <li>&lt;Contributor&gt;</li>
 * <li>&lt;PublisherRepresentative&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Conference ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ SupplyDetail ⯈ Supplier ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ PublishingDetail ⯈ Publisher ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Event ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Contributor ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ ContentDetail ⯈ ContentItem ⯈ Contributor ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Collection ⯈ Contributor ⯈ Website</li>
 * <li>ONIXMessage ⯈ Product ⯈ ProductSupply ⯈ MarketPublishingDetail ⯈ PublisherRepresentative ⯈ Website</li>
 * </ul>
 */
public class Website implements OnixDataComposite<JonixWebsite>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Website";
    public static final String shortname = "website";

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
    public static final Website EMPTY = new Website();

    public Website() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public Website(org.w3c.dom.Element element) {
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
                case WebsiteRole.refname:
                case WebsiteRole.shortname:
                    websiteRole = new WebsiteRole(e);
                    break;
                case WebsiteDescription.refname:
                case WebsiteDescription.shortname:
                    websiteDescriptions = JPU.addToList(websiteDescriptions, new WebsiteDescription(e));
                    break;
                case WebsiteLink.refname:
                case WebsiteLink.shortname:
                    websiteLinks = JPU.addToList(websiteLinks, new WebsiteLink(e));
                    break;
                default:
                    break;
            }
        });
    }

    /**
     * @return whether this tag (&lt;Website&gt; or &lt;website&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private WebsiteRole websiteRole = WebsiteRole.EMPTY;

    /**
     * <p>
     * An ONIX code which identifies the role or purpose of the website which is linked through the &lt;WebsiteLink&gt;
     * element. Optional and non-repeating.
     * </p>
     * Jonix-Comment: this field is optional
     */
    public WebsiteRole websiteRole() {
        _initialize();
        return websiteRole;
    }

    private ListOfOnixElement<WebsiteDescription, String> websiteDescriptions = ListOfOnixElement.empty();

    /**
     * <p>
     * Free text describing the nature of the website which is linked through the &lt;WebsiteLink&gt; element. Optional,
     * and repeatable to provide parallel descriptive text in multiple languages. The <i>language</i> attribute is
     * optional for a single instance of &lt;WebsiteDescription&gt;, but must be included in each instance if
     * &lt;WebsiteDescription&gt; is repeated.
     * </p>
     * Jonix-Comment: this list may be empty
     */
    public ListOfOnixElement<WebsiteDescription, String> websiteDescriptions() {
        _initialize();
        return websiteDescriptions;
    }

    private ListOfOnixElement<WebsiteLink, String> websiteLinks = ListOfOnixElement.empty();

    /**
     * <p>
     * The URL for the website. Mandatory in each occurrence of the &lt;Website&gt; composite, and repeatable to provide
     * multiple URLs where the website content is available in multiple languages. The <i>language</i> attribute is
     * optional for a single instance of &lt;WebsiteLink&gt;, but must be included in each instance if
     * &lt;WebsiteLink&gt; is repeated.
     * </p>
     * Jonix-Comment: this list is required to contain at least one item
     */
    public ListOfOnixElement<WebsiteLink, String> websiteLinks() {
        _initialize();
        return websiteLinks;
    }

    @Override
    public JonixWebsite asStruct() {
        _initialize();
        JonixWebsite struct = new JonixWebsite();
        struct.websiteDescriptions = websiteDescriptions.values();
        struct.websiteLinks = websiteLinks.values();
        struct.websiteRole = websiteRole.value;
        return struct;
    }
}
