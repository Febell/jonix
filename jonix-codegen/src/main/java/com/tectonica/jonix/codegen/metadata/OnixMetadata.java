/*
 * Copyright (C) 2012-2020 Zach Melamed
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

package com.tectonica.jonix.codegen.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tectonica.jonix.codegen.util.OnixSpecs.OnixVersion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@JsonPropertyOrder(
    {"onixVersion", "isShort", "codelistIssue", "composites", "elements", "flags", "types", "enums", "structs"})
public class OnixMetadata {
    public final OnixVersion onixVersion;
    public final boolean isShort;
    public final String codelistIssue;

    @JsonIgnore
    public Map<String, OnixCompositeDef> onixComposites = new HashMap<>();
    @JsonIgnore
    public Map<String, OnixElementDef> onixElements = new HashMap<>();
    @JsonIgnore
    public Map<String, OnixFlagDef> onixFlags = new HashMap<>();
    @JsonIgnore
    public Map<String, OnixSimpleType> onixTypes = new HashMap<>();
    @JsonIgnore
    public Map<String, OnixSimpleType> onixEnums = new HashMap<>();

    @JsonIgnore
    public Map<String, OnixStruct> jonixStructs = new HashMap<>(); // set on postAnalysis()

    // the following is to be filled during code-generation, not parsing
    @JsonIgnore
    public Map<String, OnixSimpleType> unifiedCodelists = null; // set on unifyCodelists()
    @JsonIgnore
    public Map<String, OnixStruct> unifiedStructs = null; // set on unifyStructs

    public OnixMetadata(OnixVersion onixVersion, boolean isShort, String codelistIssue) {
        this.onixVersion = onixVersion;
        this.isShort = isShort;
        this.codelistIssue = codelistIssue;
    }

    // convenience getters

    public Collection<OnixCompositeDef> getComposites() {
        return onixComposites.values();
    }

    public Collection<OnixElementDef> getElements() {
        return onixElements.values();
    }

    public Collection<OnixFlagDef> getFlags() {
        return onixFlags.values();
    }

    public Collection<OnixSimpleType> getTypes() {
        return onixTypes.values();
    }

    public Collection<OnixSimpleType> getEnums() {
        return onixEnums.values();
    }

    public Collection<OnixStruct> getStructs() {
        return jonixStructs.values();
    }

    public OnixSimpleType typeByName(String name) {
        OnixSimpleType type = onixTypes.get(name);
        if (type == null) {
            type = onixEnums.get(name);
        }
        return type;
    }

    public OnixClassDef classByName(String name) {
        OnixClassDef onixClass = onixComposites.get(name);
        if (onixClass == null) {
            onixClass = onixElements.get(name);
            if (onixClass == null) {
                onixClass = onixFlags.get(name);
            }
        }
        return onixClass;
    }

    public Stream<OnixClassDef> onixClasses() {
        return Stream.concat(
            Stream.concat(
                onixComposites.values().stream(),
                onixElements.values().stream()),
            onixFlags.values().stream()
        );
    }
}
