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

import static org.tomitribe.github.gen.openapi.normalize.Normalizations.assertScenario;

public class PruneUnusedSchemaTest {

    @Test
    public void simple() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void pathQueryParameter() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void pathPathParameter() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void pathRequestBody() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void pathResponseBody() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void webhookRequestBody() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void webhookRequestHeader() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void webhookResponseBody() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void webhookResponseHeader() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void webhookCookieParameter() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaObjectProperty() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaArrayItem() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaAllOfComposition() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaOneOfComposition() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaAnyOfComposition() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaAdditionalProperties() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

    @Test
    public void schemaNot() throws Exception {
        assertScenario(new PruneUnusedSchema());
    }

}