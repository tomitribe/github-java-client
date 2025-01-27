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
@ComponentId("contributor")
public class Contributor {

    private URI avatarUrl;

    private Integer contributions;

    private String email;

    private String eventsUrl;

    private URI followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private URI htmlUrl;

    private Integer id;

    private String login;

    private String name;

    private String nodeId;

    private URI organizationsUrl;

    private URI receivedEventsUrl;

    private URI reposUrl;

    private Boolean siteAdmin;

    private String starredUrl;

    private URI subscriptionsUrl;

    private String type;

    private URI url;

    @JsonbProperty("avatar_url")
    public URI getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("contributions")
    public Integer getContributions() {
        return this.contributions;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("events_url")
    public String getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("followers_url")
    public URI getFollowersUrl() {
        return this.followersUrl;
    }

    @JsonbProperty("following_url")
    public String getFollowingUrl() {
        return this.followingUrl;
    }

    @JsonbProperty("gists_url")
    public String getGistsUrl() {
        return this.gistsUrl;
    }

    @JsonbProperty("gravatar_id")
    public String getGravatarId() {
        return this.gravatarId;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("organizations_url")
    public URI getOrganizationsUrl() {
        return this.organizationsUrl;
    }

    @JsonbProperty("received_events_url")
    public URI getReceivedEventsUrl() {
        return this.receivedEventsUrl;
    }

    @JsonbProperty("repos_url")
    public URI getReposUrl() {
        return this.reposUrl;
    }

    @JsonbProperty("site_admin")
    public Boolean getSiteAdmin() {
        return this.siteAdmin;
    }

    @JsonbProperty("starred_url")
    public String getStarredUrl() {
        return this.starredUrl;
    }

    @JsonbProperty("subscriptions_url")
    public URI getSubscriptionsUrl() {
        return this.subscriptionsUrl;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("avatar_url")
    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("contributions")
    public void setContributions(Integer contributions) {
        this.contributions = contributions;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("followers_url")
    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    @JsonbProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    @JsonbProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    @JsonbProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("organizations_url")
    public void setOrganizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    @JsonbProperty("received_events_url")
    public void setReceivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    @JsonbProperty("repos_url")
    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    @JsonbProperty("site_admin")
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    @JsonbProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    @JsonbProperty("subscriptions_url")
    public void setSubscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
