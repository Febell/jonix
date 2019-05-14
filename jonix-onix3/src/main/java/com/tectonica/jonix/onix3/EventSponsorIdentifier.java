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
import com.tectonica.jonix.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.codelist.NameIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixEventSponsorIdentifier;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Event sponsor identifier composite</h1><p>An optional and repeatable group of data elements which together carry
 * a coded identifier for an organizer or sponsor of an event.</p><table border='1' cellpadding='3'><tr><td>Reference
 * name</td><td>&lt;EventSponsorIdentifier&gt;</td></tr><tr><td>Short tag</td><td>&lt;eventsponsoridentifier&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;n</td></tr></table>
 */
public class EventSponsorIdentifier
    implements OnixDataCompositeWithKey<JonixEventSponsorIdentifier, NameIdentifierTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "EventSponsorIdentifier";
    public static final String shortname = "eventsponsoridentifier";

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
    public static final EventSponsorIdentifier EMPTY = new EventSponsorIdentifier();

    public EventSponsorIdentifier() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public EventSponsorIdentifier(org.w3c.dom.Element element) {
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
                case EventSponsorIDType.refname:
                case EventSponsorIDType.shortname:
                    eventSponsorIDType = new EventSponsorIDType(e);
                    break;
                case IDTypeName.refname:
                case IDTypeName.shortname:
                    idTypeName = new IDTypeName(e);
                    break;
                case IDValue.refname:
                case IDValue.shortname:
                    idValue = new IDValue(e);
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private EventSponsorIDType eventSponsorIDType = EventSponsorIDType.EMPTY;

    /**
     * (this field is required)
     */
    public EventSponsorIDType eventSponsorIDType() {
        _initialize();
        return eventSponsorIDType;
    }

    private IDTypeName idTypeName = IDTypeName.EMPTY;

    /**
     * (this field is optional)
     */
    public IDTypeName idTypeName() {
        _initialize();
        return idTypeName;
    }

    private IDValue idValue = IDValue.EMPTY;

    /**
     * (this field is required)
     */
    public IDValue idValue() {
        _initialize();
        return idValue;
    }

    @Override
    public JonixEventSponsorIdentifier asStruct() {
        _initialize();
        JonixEventSponsorIdentifier struct = new JonixEventSponsorIdentifier();
        struct.eventSponsorIDType = eventSponsorIDType.value;
        struct.idTypeName = idTypeName.value;
        struct.idValue = idValue.value;
        return struct;
    }

    @Override
    public NameIdentifierTypes structKey() {
        return eventSponsorIDType().value;
    }
}