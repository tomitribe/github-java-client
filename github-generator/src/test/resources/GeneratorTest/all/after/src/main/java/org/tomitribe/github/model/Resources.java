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

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Resources {

    private RateLimit core;

    private RateLimit graphql;

    private RateLimit integrationManifest;

    private RateLimit search;

    private RateLimit sourceImport;

    @JsonbProperty("core")
    public RateLimit getCore() {
        return this.core;
    }

    @JsonbProperty("graphql")
    public RateLimit getGraphql() {
        return this.graphql;
    }

    @JsonbProperty("integration_manifest")
    public RateLimit getIntegrationManifest() {
        return this.integrationManifest;
    }

    @JsonbProperty("search")
    public RateLimit getSearch() {
        return this.search;
    }

    @JsonbProperty("source_import")
    public RateLimit getSourceImport() {
        return this.sourceImport;
    }

    @JsonbProperty("core")
    public void setCore(RateLimit core) {
        this.core = core;
    }

    @JsonbProperty("graphql")
    public void setGraphql(RateLimit graphql) {
        this.graphql = graphql;
    }

    @JsonbProperty("integration_manifest")
    public void setIntegrationManifest(RateLimit integrationManifest) {
        this.integrationManifest = integrationManifest;
    }

    @JsonbProperty("search")
    public void setSearch(RateLimit search) {
        this.search = search;
    }

    @JsonbProperty("source_import")
    public void setSourceImport(RateLimit sourceImport) {
        this.sourceImport = sourceImport;
    }
}
