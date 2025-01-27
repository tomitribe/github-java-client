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
@ComponentId("organization-simple")
public class OrganizationSimple {

    private String avatarUrl;

    private String description;

    private URI eventsUrl;

    private String hooksUrl;

    private Integer id;

    private String issuesUrl;

    private String login;

    private String membersUrl;

    private String nodeId;

    private String publicMembersUrl;

    private URI reposUrl;

    private URI url;

    @JsonbProperty("avatar_url")
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("events_url")
    public URI getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("hooks_url")
    public String getHooksUrl() {
        return this.hooksUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("issues_url")
    public String getIssuesUrl() {
        return this.issuesUrl;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("members_url")
    public String getMembersUrl() {
        return this.membersUrl;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("public_members_url")
    public String getPublicMembersUrl() {
        return this.publicMembersUrl;
    }

    @JsonbProperty("repos_url")
    public URI getReposUrl() {
        return this.reposUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("members_url")
    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("public_members_url")
    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    @JsonbProperty("repos_url")
    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
