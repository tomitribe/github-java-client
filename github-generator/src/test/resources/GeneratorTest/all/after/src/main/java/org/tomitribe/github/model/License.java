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
import java.net.URI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("license")
public class License {

    private String body;

    private List<String> conditions;

    private String description;

    private Boolean featured;

    private URI htmlUrl;

    private String implementation;

    private String key;

    private List<String> limitations;

    private String name;

    private String nodeId;

    private List<String> permissions;

    private String spdxId;

    private URI url;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("conditions")
    public List<String> getConditions() {
        return this.conditions;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("featured")
    public Boolean getFeatured() {
        return this.featured;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("implementation")
    public String getImplementation() {
        return this.implementation;
    }

    @JsonbProperty("key")
    public String getKey() {
        return this.key;
    }

    @JsonbProperty("limitations")
    public List<String> getLimitations() {
        return this.limitations;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("permissions")
    public List<String> getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("spdx_id")
    public String getSpdxId() {
        return this.spdxId;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("conditions")
    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("implementation")
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    @JsonbProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonbProperty("limitations")
    public void setLimitations(List<String> limitations) {
        this.limitations = limitations;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("permissions")
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("spdx_id")
    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
