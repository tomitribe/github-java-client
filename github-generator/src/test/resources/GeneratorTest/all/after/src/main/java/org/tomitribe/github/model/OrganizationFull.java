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
@ComponentId("organization-full")
public class OrganizationFull {

    private String avatarUrl;

    private String billingEmail;

    private URI blog;

    private Integer collaborators;

    private String company;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String defaultRepositoryPermission;

    private String description;

    private Integer diskUsage;

    private String email;

    private URI eventsUrl;

    private Integer followers;

    private Integer following;

    private Boolean hasOrganizationProjects;

    private Boolean hasRepositoryProjects;

    private String hooksUrl;

    private URI htmlUrl;

    private Integer id;

    private Boolean isVerified;

    private String issuesUrl;

    private String location;

    private String login;

    private String membersAllowedRepositoryCreationType;

    private Boolean membersCanCreateInternalRepositories;

    private Boolean membersCanCreatePrivateRepositories;

    private Boolean membersCanCreatePublicRepositories;

    private Boolean membersCanCreateRepositories;

    private String membersUrl;

    private String name;

    private String nodeId;

    private Integer ownedPrivateRepos;

    private Plan plan;

    private Integer privateGists;

    private Integer publicGists;

    private String publicMembersUrl;

    private Integer publicRepos;

    private URI reposUrl;

    private Integer totalPrivateRepos;

    private String twitterUsername;

    private Boolean twoFactorRequirementEnabled;

    private String type;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("avatar_url")
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("billing_email")
    public String getBillingEmail() {
        return this.billingEmail;
    }

    @JsonbProperty("blog")
    public URI getBlog() {
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

    @JsonbProperty("default_repository_permission")
    public String getDefaultRepositoryPermission() {
        return this.defaultRepositoryPermission;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
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
    public URI getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("followers")
    public Integer getFollowers() {
        return this.followers;
    }

    @JsonbProperty("following")
    public Integer getFollowing() {
        return this.following;
    }

    @JsonbProperty("has_organization_projects")
    public Boolean getHasOrganizationProjects() {
        return this.hasOrganizationProjects;
    }

    @JsonbProperty("has_repository_projects")
    public Boolean getHasRepositoryProjects() {
        return this.hasRepositoryProjects;
    }

    @JsonbProperty("hooks_url")
    public String getHooksUrl() {
        return this.hooksUrl;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("is_verified")
    public Boolean getIsVerified() {
        return this.isVerified;
    }

    @JsonbProperty("issues_url")
    public String getIssuesUrl() {
        return this.issuesUrl;
    }

    @JsonbProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("members_allowed_repository_creation_type")
    public String getMembersAllowedRepositoryCreationType() {
        return this.membersAllowedRepositoryCreationType;
    }

    @JsonbProperty("members_can_create_internal_repositories")
    public Boolean getMembersCanCreateInternalRepositories() {
        return this.membersCanCreateInternalRepositories;
    }

    @JsonbProperty("members_can_create_private_repositories")
    public Boolean getMembersCanCreatePrivateRepositories() {
        return this.membersCanCreatePrivateRepositories;
    }

    @JsonbProperty("members_can_create_public_repositories")
    public Boolean getMembersCanCreatePublicRepositories() {
        return this.membersCanCreatePublicRepositories;
    }

    @JsonbProperty("members_can_create_repositories")
    public Boolean getMembersCanCreateRepositories() {
        return this.membersCanCreateRepositories;
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

    @JsonbProperty("public_members_url")
    public String getPublicMembersUrl() {
        return this.publicMembersUrl;
    }

    @JsonbProperty("public_repos")
    public Integer getPublicRepos() {
        return this.publicRepos;
    }

    @JsonbProperty("repos_url")
    public URI getReposUrl() {
        return this.reposUrl;
    }

    @JsonbProperty("total_private_repos")
    public Integer getTotalPrivateRepos() {
        return this.totalPrivateRepos;
    }

    @JsonbProperty("twitter_username")
    public String getTwitterUsername() {
        return this.twitterUsername;
    }

    @JsonbProperty("two_factor_requirement_enabled")
    public Boolean getTwoFactorRequirementEnabled() {
        return this.twoFactorRequirementEnabled;
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
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("billing_email")
    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    @JsonbProperty("blog")
    public void setBlog(URI blog) {
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

    @JsonbProperty("default_repository_permission")
    public void setDefaultRepositoryPermission(String defaultRepositoryPermission) {
        this.defaultRepositoryPermission = defaultRepositoryPermission;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @JsonbProperty("following")
    public void setFollowing(Integer following) {
        this.following = following;
    }

    @JsonbProperty("has_organization_projects")
    public void setHasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    @JsonbProperty("has_repository_projects")
    public void setHasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    @JsonbProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("is_verified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @JsonbProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonbProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("members_allowed_repository_creation_type")
    public void setMembersAllowedRepositoryCreationType(String membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = membersAllowedRepositoryCreationType;
    }

    @JsonbProperty("members_can_create_internal_repositories")
    public void setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
    }

    @JsonbProperty("members_can_create_private_repositories")
    public void setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
    }

    @JsonbProperty("members_can_create_public_repositories")
    public void setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
    }

    @JsonbProperty("members_can_create_repositories")
    public void setMembersCanCreateRepositories(Boolean membersCanCreateRepositories) {
        this.membersCanCreateRepositories = membersCanCreateRepositories;
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

    @JsonbProperty("public_members_url")
    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    @JsonbProperty("public_repos")
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    @JsonbProperty("repos_url")
    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    @JsonbProperty("total_private_repos")
    public void setTotalPrivateRepos(Integer totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    @JsonbProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonbProperty("two_factor_requirement_enabled")
    public void setTwoFactorRequirementEnabled(Boolean twoFactorRequirementEnabled) {
        this.twoFactorRequirementEnabled = twoFactorRequirementEnabled;
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
