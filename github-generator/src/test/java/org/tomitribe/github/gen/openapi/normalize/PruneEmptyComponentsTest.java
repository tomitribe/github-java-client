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
package org.tomitribe.github.gen.openapi.normalize;

import org.junit.Test;
import org.tomitribe.github.gen.openapi.Components;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Response;
import org.tomitribe.github.gen.openapi.Schema;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class PruneEmptyComponentsTest {

    @Test
    public void testPrunesEmptyComponents() {
        final Components components = new Components();
        components.setExamples(Collections.emptyMap());
        components.setHeaders(Collections.emptyMap());
        components.setParameters(Collections.emptyMap());
        components.setResponses(Collections.emptyMap());
        components.setSchemas(Collections.emptyMap());

        final OpenApi openApi = new OpenApi();
        openApi.setComponents(components);

        final OpenApi result = new PruneEmptyComponents().apply(openApi);

        assertNull(result.getComponents());
    }

    @Test
    public void testKeepsNonEmptyComponent() {
        final Components components = new Components();
        components.setSchemas(Map.of("Foo", new Schema()));

        final OpenApi openApi = new OpenApi();
        openApi.setComponents(components);

        final OpenApi result = new PruneEmptyComponents().apply(openApi);

        assertNotNull(result.getComponents());
        assertNotNull(result.getComponents().getSchemas());
        assertTrue(result.getComponents().getSchemas().containsKey("Foo"));
    }

    @Test
    public void testPartiallyEmptyComponents() {
        final Components components = new Components();
        components.setExamples(Collections.emptyMap());
        components.setResponses(Map.of("default", new Response())); // substitute as needed

        final OpenApi openApi = new OpenApi();
        openApi.setComponents(components);

        final OpenApi result = new PruneEmptyComponents().apply(openApi);

        assertNotNull(result.getComponents());
        assertNull(result.getComponents().getExamples());
        assertNotNull(result.getComponents().getResponses());
    }
}
