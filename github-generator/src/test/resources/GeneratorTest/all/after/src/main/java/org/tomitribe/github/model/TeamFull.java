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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.net.URI;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("team-full")
public class TeamFull {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String description;

    private URI htmlUrl;

    private Integer id;

    private String ldapDn;

    private Integer membersCount;

    private String membersUrl;

    private String name;

    private String nodeId;

    private Organization organization;

    private TeamSimple parent;

    private String permission;

    @JsonbTypeAdapter(PrivacyAdapter.class)
    private Privacy privacy;

    private Integer reposCount;

    private URI repositoriesUrl;

    private String slug;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

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

    @JsonbProperty("members_count")
    public Integer getMembersCount() {
        return this.membersCount;
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

    @JsonbProperty("organization")
    public Organization getOrganization() {
        return this.organization;
    }

    @JsonbProperty("parent")
    public TeamSimple getParent() {
        return this.parent;
    }

    @JsonbProperty("permission")
    public String getPermission() {
        return this.permission;
    }

    @JsonbTypeAdapter(PrivacyAdapter.class)
    @JsonbProperty("privacy")
    public Privacy getPrivacy() {
        return this.privacy;
    }

    @JsonbProperty("repos_count")
    public Integer getReposCount() {
        return this.reposCount;
    }

    @JsonbProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return this.repositoriesUrl;
    }

    @JsonbProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    @JsonbProperty("members_count")
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
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

    @JsonbProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @JsonbProperty("parent")
    public void setParent(TeamSimple parent) {
        this.parent = parent;
    }

    @JsonbProperty("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    @JsonbProperty("privacy")
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    @JsonbProperty("repos_count")
    public void setReposCount(Integer reposCount) {
        this.reposCount = reposCount;
    }

    @JsonbProperty("repositories_url")
    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    @JsonbProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum Privacy {

        CLOSED("closed"), SECRET("secret");

        private final String name;

        Privacy(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class PrivacyAdapter extends EnumAdapter<Privacy> {

        public PrivacyAdapter() {
            super(Privacy.class);
        }
    }
}
