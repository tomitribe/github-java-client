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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("team-simple")
public class TeamSimple {

    private String description;

    private URI htmlUrl;

    private Integer id;

    private String ldapDn;

    private String membersUrl;

    private String name;

    private String nodeId;

    private String permission;

    private String privacy;

    private URI repositoriesUrl;

    private String slug;

    private URI url;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("ldap_dn")
    public String getLdapDn() {
        return this.ldapDn;
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

    @JsonbProperty("permission")
    public String getPermission() {
        return this.permission;
    }

    @JsonbProperty("privacy")
    public String getPrivacy() {
        return this.privacy;
    }

    @JsonbProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return this.repositoriesUrl;
    }

    @JsonbProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("ldap_dn")
    public void setLdapDn(String ldapDn) {
        this.ldapDn = ldapDn;
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

    @JsonbProperty("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    @JsonbProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonbProperty("repositories_url")
    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    @JsonbProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
