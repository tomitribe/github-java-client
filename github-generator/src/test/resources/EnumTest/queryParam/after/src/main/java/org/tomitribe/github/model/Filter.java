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
package org.tomitribe.github.model;

import jakarta.json.bind.annotation.JsonbTypeAdapter;
import org.tomitribe.github.core.EnumAdapter;

@JsonbTypeAdapter(Filter.Adapter.class)
public enum Filter {

    ASSIGNED("assigned"), CREATED("created"), MENTIONED("mentioned"), SUBSCRIBED("subscribed"), ALL("all");

    private final String name;

    Filter(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static class Adapter extends EnumAdapter<Filter> {

        public Adapter() {
            super(Filter.class);
        }
    }
}
