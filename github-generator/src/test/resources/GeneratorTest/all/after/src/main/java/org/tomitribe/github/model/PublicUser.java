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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("public-user")
public class PublicUser {

    private URI avatarUrl;

    private String bio;

    private String blog;

    private Integer collaborators;

    private String company;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Integer diskUsage;

    private String email;

    private String eventsUrl;

    private Integer followers;

    private URI followersUrl;

    private Integer following;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private Boolean hireable;

    private URI htmlUrl;

    private Integer id;

    private String location;

    private String login;

    private String name;

    private String nodeId;

    private URI organizationsUrl;

    private Integer ownedPrivateRepos;

    private Plan plan;

    private Integer privateGists;

    private Integer publicGists;

    private Integer publicRepos;

    private URI receivedEventsUrl;

    private URI reposUrl;

    private Boolean siteAdmin;

    private String starredUrl;

    private URI subscriptionsUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date suspendedAt;

    private Integer totalPrivateRepos;

    private String twitterUsername;

    private String type;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("avatar_url")
    public URI getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("bio")
    public String getBio() {
        return this.bio;
    }

    @JsonbProperty("blog")
    public String getBlog() {
        return this.blog;
    }

    @JsonbProperty("collaborators")
    public Integer getCollaborators() {
        return this.collaborators;
    }

    @JsonbProperty("company")
    public String getCompany() {
        return this.company;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("disk_usage")
    public Integer getDiskUsage() {
        return this.diskUsage;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("events_url")
    public String getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("followers")
    public Integer getFollowers() {
        return this.followers;
    }

    @JsonbProperty("followers_url")
    public URI getFollowersUrl() {
        return this.followersUrl;
    }

    @JsonbProperty("following")
    public Integer getFollowing() {
        return this.following;
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

    @JsonbProperty("hireable")
    public Boolean getHireable() {
        return this.hireable;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("location")
    public String getLocation() {
        return this.location;
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

    @JsonbProperty("owned_private_repos")
    public Integer getOwnedPrivateRepos() {
        return this.ownedPrivateRepos;
    }

    @JsonbProperty("plan")
    public Plan getPlan() {
        return this.plan;
    }

    @JsonbProperty("private_gists")
    public Integer getPrivateGists() {
        return this.privateGists;
    }

    @JsonbProperty("public_gists")
    public Integer getPublicGists() {
        return this.publicGists;
    }

    @JsonbProperty("public_repos")
    public Integer getPublicRepos() {
        return this.publicRepos;
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

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("suspended_at")
    public Date getSuspendedAt() {
        return this.suspendedAt;
    }

    @JsonbProperty("total_private_repos")
    public Integer getTotalPrivateRepos() {
        return this.totalPrivateRepos;
    }

    @JsonbProperty("twitter_username")
    public String getTwitterUsername() {
        return this.twitterUsername;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
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

    @JsonbProperty("avatar_url")
    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonbProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    @JsonbProperty("collaborators")
    public void setCollaborators(Integer collaborators) {
        this.collaborators = collaborators;
    }

    @JsonbProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("disk_usage")
    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @JsonbProperty("followers_url")
    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    @JsonbProperty("following")
    public void setFollowing(Integer following) {
        this.following = following;
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

    @JsonbProperty("hireable")
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("location")
    public void setLocation(String location) {
        this.location = location;
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

    @JsonbProperty("owned_private_repos")
    public void setOwnedPrivateRepos(Integer ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    @JsonbProperty("plan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @JsonbProperty("private_gists")
    public void setPrivateGists(Integer privateGists) {
        this.privateGists = privateGists;
    }

    @JsonbProperty("public_gists")
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    @JsonbProperty("public_repos")
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
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

    @JsonbProperty("suspended_at")
    public void setSuspendedAt(Date suspendedAt) {
        this.suspendedAt = suspendedAt;
    }

    @JsonbProperty("total_private_repos")
    public void setTotalPrivateRepos(Integer totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    @JsonbProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
