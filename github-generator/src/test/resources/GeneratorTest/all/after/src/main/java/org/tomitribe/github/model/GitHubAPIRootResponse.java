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
public class GitHubAPIRootResponse {

    private URI authorizationsUrl;

    private URI codeSearchUrl;

    private URI commitSearchUrl;

    private URI currentUserAuthorizationsHtmlUrl;

    private URI currentUserRepositoriesUrl;

    private URI currentUserUrl;

    private URI emailsUrl;

    private URI emojisUrl;

    private URI eventsUrl;

    private URI feedsUrl;

    private URI followersUrl;

    private URI followingUrl;

    private URI gistsUrl;

    private URI hubUrl;

    private URI issueSearchUrl;

    private URI issuesUrl;

    private URI keysUrl;

    private URI labelSearchUrl;

    private URI notificationsUrl;

    private URI organizationRepositoriesUrl;

    private URI organizationTeamsUrl;

    private URI organizationUrl;

    private URI publicGistsUrl;

    private URI rateLimitUrl;

    private URI repositorySearchUrl;

    private URI repositoryUrl;

    private URI starredGistsUrl;

    private URI starredUrl;

    private URI topicSearchUrl;

    private URI userOrganizationsUrl;

    private URI userRepositoriesUrl;

    private URI userSearchUrl;

    private URI userUrl;

    @JsonbProperty("authorizations_url")
    public URI getAuthorizationsUrl() {
        return this.authorizationsUrl;
    }

    @JsonbProperty("code_search_url")
    public URI getCodeSearchUrl() {
        return this.codeSearchUrl;
    }

    @JsonbProperty("commit_search_url")
    public URI getCommitSearchUrl() {
        return this.commitSearchUrl;
    }

    @JsonbProperty("current_user_authorizations_html_url")
    public URI getCurrentUserAuthorizationsHtmlUrl() {
        return this.currentUserAuthorizationsHtmlUrl;
    }

    @JsonbProperty("current_user_repositories_url")
    public URI getCurrentUserRepositoriesUrl() {
        return this.currentUserRepositoriesUrl;
    }

    @JsonbProperty("current_user_url")
    public URI getCurrentUserUrl() {
        return this.currentUserUrl;
    }

    @JsonbProperty("emails_url")
    public URI getEmailsUrl() {
        return this.emailsUrl;
    }

    @JsonbProperty("emojis_url")
    public URI getEmojisUrl() {
        return this.emojisUrl;
    }

    @JsonbProperty("events_url")
    public URI getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("feeds_url")
    public URI getFeedsUrl() {
        return this.feedsUrl;
    }

    @JsonbProperty("followers_url")
    public URI getFollowersUrl() {
        return this.followersUrl;
    }

    @JsonbProperty("following_url")
    public URI getFollowingUrl() {
        return this.followingUrl;
    }

    @JsonbProperty("gists_url")
    public URI getGistsUrl() {
        return this.gistsUrl;
    }

    @JsonbProperty("hub_url")
    public URI getHubUrl() {
        return this.hubUrl;
    }

    @JsonbProperty("issue_search_url")
    public URI getIssueSearchUrl() {
        return this.issueSearchUrl;
    }

    @JsonbProperty("issues_url")
    public URI getIssuesUrl() {
        return this.issuesUrl;
    }

    @JsonbProperty("keys_url")
    public URI getKeysUrl() {
        return this.keysUrl;
    }

    @JsonbProperty("label_search_url")
    public URI getLabelSearchUrl() {
        return this.labelSearchUrl;
    }

    @JsonbProperty("notifications_url")
    public URI getNotificationsUrl() {
        return this.notificationsUrl;
    }

    @JsonbProperty("organization_repositories_url")
    public URI getOrganizationRepositoriesUrl() {
        return this.organizationRepositoriesUrl;
    }

    @JsonbProperty("organization_teams_url")
    public URI getOrganizationTeamsUrl() {
        return this.organizationTeamsUrl;
    }

    @JsonbProperty("organization_url")
    public URI getOrganizationUrl() {
        return this.organizationUrl;
    }

    @JsonbProperty("public_gists_url")
    public URI getPublicGistsUrl() {
        return this.publicGistsUrl;
    }

    @JsonbProperty("rate_limit_url")
    public URI getRateLimitUrl() {
        return this.rateLimitUrl;
    }

    @JsonbProperty("repository_search_url")
    public URI getRepositorySearchUrl() {
        return this.repositorySearchUrl;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbProperty("starred_gists_url")
    public URI getStarredGistsUrl() {
        return this.starredGistsUrl;
    }

    @JsonbProperty("starred_url")
    public URI getStarredUrl() {
        return this.starredUrl;
    }

    @JsonbProperty("topic_search_url")
    public URI getTopicSearchUrl() {
        return this.topicSearchUrl;
    }

    @JsonbProperty("user_organizations_url")
    public URI getUserOrganizationsUrl() {
        return this.userOrganizationsUrl;
    }

    @JsonbProperty("user_repositories_url")
    public URI getUserRepositoriesUrl() {
        return this.userRepositoriesUrl;
    }

    @JsonbProperty("user_search_url")
    public URI getUserSearchUrl() {
        return this.userSearchUrl;
    }

    @JsonbProperty("user_url")
    public URI getUserUrl() {
        return this.userUrl;
    }

    @JsonbProperty("authorizations_url")
    public void setAuthorizationsUrl(URI authorizationsUrl) {
        this.authorizationsUrl = authorizationsUrl;
    }

    @JsonbProperty("code_search_url")
    public void setCodeSearchUrl(URI codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
    }

    @JsonbProperty("commit_search_url")
    public void setCommitSearchUrl(URI commitSearchUrl) {
        this.commitSearchUrl = commitSearchUrl;
    }

    @JsonbProperty("current_user_authorizations_html_url")
    public void setCurrentUserAuthorizationsHtmlUrl(URI currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
    }

    @JsonbProperty("current_user_repositories_url")
    public void setCurrentUserRepositoriesUrl(URI currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
    }

    @JsonbProperty("current_user_url")
    public void setCurrentUserUrl(URI currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    @JsonbProperty("emails_url")
    public void setEmailsUrl(URI emailsUrl) {
        this.emailsUrl = emailsUrl;
    }

    @JsonbProperty("emojis_url")
    public void setEmojisUrl(URI emojisUrl) {
        this.emojisUrl = emojisUrl;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("feeds_url")
    public void setFeedsUrl(URI feedsUrl) {
        this.feedsUrl = feedsUrl;
    }

    @JsonbProperty("followers_url")
    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    @JsonbProperty("following_url")
    public void setFollowingUrl(URI followingUrl) {
        this.followingUrl = followingUrl;
    }

    @JsonbProperty("gists_url")
    public void setGistsUrl(URI gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    @JsonbProperty("hub_url")
    public void setHubUrl(URI hubUrl) {
        this.hubUrl = hubUrl;
    }

    @JsonbProperty("issue_search_url")
    public void setIssueSearchUrl(URI issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
    }

    @JsonbProperty("issues_url")
    public void setIssuesUrl(URI issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonbProperty("keys_url")
    public void setKeysUrl(URI keysUrl) {
        this.keysUrl = keysUrl;
    }

    @JsonbProperty("label_search_url")
    public void setLabelSearchUrl(URI labelSearchUrl) {
        this.labelSearchUrl = labelSearchUrl;
    }

    @JsonbProperty("notifications_url")
    public void setNotificationsUrl(URI notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    @JsonbProperty("organization_repositories_url")
    public void setOrganizationRepositoriesUrl(URI organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
    }

    @JsonbProperty("organization_teams_url")
    public void setOrganizationTeamsUrl(URI organizationTeamsUrl) {
        this.organizationTeamsUrl = organizationTeamsUrl;
    }

    @JsonbProperty("organization_url")
    public void setOrganizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    @JsonbProperty("public_gists_url")
    public void setPublicGistsUrl(URI publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
    }

    @JsonbProperty("rate_limit_url")
    public void setRateLimitUrl(URI rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
    }

    @JsonbProperty("repository_search_url")
    public void setRepositorySearchUrl(URI repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("starred_gists_url")
    public void setStarredGistsUrl(URI starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
    }

    @JsonbProperty("starred_url")
    public void setStarredUrl(URI starredUrl) {
        this.starredUrl = starredUrl;
    }

    @JsonbProperty("topic_search_url")
    public void setTopicSearchUrl(URI topicSearchUrl) {
        this.topicSearchUrl = topicSearchUrl;
    }

    @JsonbProperty("user_organizations_url")
    public void setUserOrganizationsUrl(URI userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
    }

    @JsonbProperty("user_repositories_url")
    public void setUserRepositoriesUrl(URI userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
    }

    @JsonbProperty("user_search_url")
    public void setUserSearchUrl(URI userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
    }

    @JsonbProperty("user_url")
    public void setUserUrl(URI userUrl) {
        this.userUrl = userUrl;
    }
}
