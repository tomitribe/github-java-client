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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    private URI avatarUrl;

    private String description;

    private String eventsUrl;

    private URI followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private String hooksUrl;

    private URI htmlUrl;

    private Integer id;

    private String issuesUrl;

    private String login;

    private String membersUrl;

    private String nodeId;

    private URI organizationsUrl;

    private String publicMembersUrl;

    private URI receivedEventsUrl;

    private URI reposUrl;

    private Boolean siteAdmin;

    private String starredUrl;

    private URI subscriptionsUrl;

    private String type;

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
    public String getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("followers_url")
    public String getFollowersUrl() {
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

    @JsonbProperty("hooks_url")
    public String getHooksUrl() {
        return this.hooksUrl;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
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

    @JsonbProperty("organizations_url")
    public String getOrganizationsUrl() {
        return this.organizationsUrl;
    }

    @JsonbProperty("public_members_url")
    public String getPublicMembersUrl() {
        return this.publicMembersUrl;
    }

    @JsonbProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return this.receivedEventsUrl;
    }

    @JsonbProperty("repos_url")
    public String getReposUrl() {
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
    public String getSubscriptionsUrl() {
        return this.subscriptionsUrl;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("url")
    public String getUrl() {
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
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
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

    @JsonbProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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

    @JsonbProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    @JsonbProperty("public_members_url")
    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    @JsonbProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    @JsonbProperty("repos_url")
    public void setReposUrl(String reposUrl) {
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
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
