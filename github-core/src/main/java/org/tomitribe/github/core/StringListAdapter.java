/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tomitribe.github.core;

import jakarta.json.bind.adapter.JsonbAdapter;

import java.util.ArrayList;
import java.util.List;

public class StringListAdapter implements JsonbAdapter<List<String>, List<Object>> {

    @Override
    public List<Object> adaptToJson(final List<String> obj) {
        // Already strings; just return
        return new ArrayList<>(obj);
    }

    @Override
    public List<String> adaptFromJson(final List<Object> obj) {
        final List<String> result = new ArrayList<>();

        try {
            for (final Object element : obj) {
                if (element == null) continue;
                if (element instanceof Boolean) {
                    result.add(String.valueOf(element));
                } else if (element instanceof String) {
                    result.add((String) element);
                } else {
                    throw new IllegalArgumentException("Unexpected type: " + element.getClass().getName());
                }
            }
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}