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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Apps {

    private String createdAt;

    private String description;

    private List<String> events;

    private String externalUrl;

    private String htmlUrl;

    private Integer id;

    private String name;

    private String nodeId;

    private Owner owner;

    private Permissions permissions;

    private String slug;

    private String updatedAt;

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("events")
    public List<String> getEvents() {
        return this.events;
    }

    @JsonbProperty("external_url")
    public String getExternalUrl() {
        return this.externalUrl;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("owner")
    public Owner getOwner() {
        return this.owner;
    }

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    @JsonbProperty("external_url")
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
