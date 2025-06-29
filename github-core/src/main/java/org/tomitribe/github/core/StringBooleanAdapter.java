/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.github.core;

import jakarta.json.bind.adapter.JsonbAdapter;

public class StringBooleanAdapter implements JsonbAdapter<Boolean, Object> {

    @Override
    public Object adaptToJson(final Boolean obj) {
        return obj; // preserve native boolean output
    }

    @Override
    public Boolean adaptFromJson(final Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            final String value = ((String) obj).trim().toLowerCase();
            if ("true".equals(value)) return true;
            if ("false".equals(value)) return false;
            throw new IllegalArgumentException("Expected 'true' or 'false', got: " + obj);
        }
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("Unsupported type for boolean field: " + obj.getClass().getName());
    }
}