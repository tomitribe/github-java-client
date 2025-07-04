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

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBooleanAdapterTest {

    @Test
    public void test() throws Exception {

        final Gist yes = new Gist(true);
        JsonAsserts.assertJsonb("{\n" +
                "  \"visible\":true\n" +
                "}", yes);

        final Jsonb jsonb = JsonbInstances.get();
        final Gist gist = jsonb.fromJson("{\n" +
                "  \"visible\":\"true\"\n" +
                "}", Gist.class);

        assertEquals(Boolean.TRUE, gist.getVisible());
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Gist {

        @JsonbTypeAdapter(StringBooleanAdapter.class)
        private Boolean visible;
    }

}