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

package com.tectonica.jonix.codelist;

import com.tectonica.jonix.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * marker interface to assist in IDE navigation to code-list 240 (AV Item type code &lt;p&gt;NOTE: Introduced in Onix3)
 */
interface CodeList240 {
}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 240</b>
 * <p>
 * Description: AV Item type code &lt;p&gt;NOTE: Introduced in Onix3
 *
 * @see <a href="https://www.editeur.org/14/Code-Lists/">About ONIX Codelists</a>
 * @see <a href="https://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_45.html#codelist240">ONIX
 * Codelist 240 in Reference Guide</a>
 */
public enum AvItemTypes implements OnixCodelist, CodeList240 {
    /**
     * A complete audiovisual work which is published as a content item in a product which carries two or more such
     * works, eg when two or three AV works are published in a single omnibus package
     */
    Audiovisual_work("01", "Audiovisual work"), //

    /**
     * Audiovisual components such as a scene index or introduction which appear before the main content of the product
     */
    Front_matter("02", "Front matter"), //

    /**
     * Audiovisual components such as scenes or 'chapters' which appear as part of the main body of the AV material in
     * the product
     */
    Body_matter("03", "Body matter"), //

    /**
     * Audiovisual components such as advertising which appear after the main content of the product
     */
    End_matter("04", "End matter");

    public final String code;
    public final String description;

    AvItemTypes(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static AvItemTypes byCode(String code) {
        if (code == null || code.isEmpty()) {
            return null;
        }
        for (AvItemTypes e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}