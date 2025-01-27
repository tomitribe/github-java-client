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
public class Teams {

    private String description;

    private String htmlUrl;

    private Integer id;

    private String membersUrl;

    private String name;

    private String nodeId;

    private String parent;

    private String permission;

    private String privacy;

    private String repositoriesUrl;

    private String slug;

    private String url;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("members_url")
    public String getMembersUrl() {
        return this.membersUrl;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("parent")
    public String getParent() {
        return this.parent;
    }

    @JsonbProperty("permission")
    public String getPermission() {
        return this.permission;
    }

    @JsonbProperty("privacy")
    public String getPrivacy() {
        return this.privacy;
    }

    @JsonbProperty("repositories_url")
    public String getRepositoriesUrl() {
        return this.repositoriesUrl;
    }

    @JsonbProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("members_url")
    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    @JsonbProperty("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    @JsonbProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonbProperty("repositories_url")
    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    @JsonbProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
