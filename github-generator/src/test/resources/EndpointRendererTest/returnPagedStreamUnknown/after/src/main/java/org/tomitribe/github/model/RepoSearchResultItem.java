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
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.InstantAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("repo-search-result-item")
public class RepoSearchResultItem {

    private Boolean _private;

    private Boolean allowMergeCommit;

    private Boolean allowRebaseMerge;

    private Boolean allowSquashMerge;

    private String archiveUrl;

    private Boolean archived;

    private String assigneesUrl;

    private String blobsUrl;

    private String branchesUrl;

    private String cloneUrl;

    private String collaboratorsUrl;

    private String commentsUrl;

    private String commitsUrl;

    private String compareUrl;

    private String contentsUrl;

    private URI contributorsUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant createdAt;

    private String defaultBranch;

    private Boolean deleteBranchOnMerge;

    private URI deploymentsUrl;

    private String description;

    private Boolean disabled;

    private URI downloadsUrl;

    private URI eventsUrl;

    private Boolean fork;

    private Integer forks;

    private Integer forksCount;

    private URI forksUrl;

    private String fullName;

    private String gitCommitsUrl;

    private String gitRefsUrl;

    private String gitTagsUrl;

    private String gitUrl;

    private Boolean hasDownloads;

    private Boolean hasIssues;

    private Boolean hasPages;

    private Boolean hasProjects;

    private Boolean hasWiki;

    private URI homepage;

    private URI hooksUrl;

    private URI htmlUrl;

    private Integer id;

    private String issueCommentUrl;

    private String issueEventsUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelsUrl;

    private String language;

    private URI languagesUrl;

    private LicenseSimple license;

    private String masterBranch;

    private URI mergesUrl;

    private String milestonesUrl;

    private URI mirrorUrl;

    private String name;

    private String nodeId;

    private String notificationsUrl;

    private Integer openIssues;

    private Integer openIssuesCount;

    private SimpleUser owner;

    private Permissions permissions;

    private String pullsUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant pushedAt;

    private String releasesUrl;

    private Integer score;

    private Integer size;

    private String sshUrl;

    private Integer stargazersCount;

    private URI stargazersUrl;

    private String statusesUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private URI svnUrl;

    private URI tagsUrl;

    private URI teamsUrl;

    private String tempCloneToken;

    private List<SearchResultTextMatches> textMatches;

    private List<String> topics;

    private String treesUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant updatedAt;

    private URI url;

    private Integer watchers;

    private Integer watchersCount;

    @JsonbProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return this.allowMergeCommit;
    }

    @JsonbProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return this.allowRebaseMerge;
    }

    @JsonbProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return this.allowSquashMerge;
    }

    @JsonbProperty("archive_url")
    public String getArchiveUrl() {
        return this.archiveUrl;
    }

    @JsonbProperty("archived")
    public Boolean getArchived() {
        return this.archived;
    }

    @JsonbProperty("assignees_url")
    public String getAssigneesUrl() {
        return this.assigneesUrl;
    }

    @JsonbProperty("blobs_url")
    public String getBlobsUrl() {
        return this.blobsUrl;
    }

    @JsonbProperty("branches_url")
    public String getBranchesUrl() {
        return this.branchesUrl;
    }

    @JsonbProperty("clone_url")
    public String getCloneUrl() {
        return this.cloneUrl;
    }

    @JsonbProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return this.collaboratorsUrl;
    }

    @JsonbProperty("comments_url")
    public String getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("commits_url")
    public String getCommitsUrl() {
        return this.commitsUrl;
    }

    @JsonbProperty("compare_url")
    public String getCompareUrl() {
        return this.compareUrl;
    }

    @JsonbProperty("contents_url")
    public String getContentsUrl() {
        return this.contentsUrl;
    }

    @JsonbProperty("contributors_url")
    public URI getContributorsUrl() {
        return this.contributorsUrl;
    }

    @JsonbProperty("created_at")
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("default_branch")
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    @JsonbProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return this.deleteBranchOnMerge;
    }

    @JsonbProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return this.deploymentsUrl;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("disabled")
    public Boolean getDisabled() {
        return this.disabled;
    }

    @JsonbProperty("downloads_url")
    public URI getDownloadsUrl() {
        return this.downloadsUrl;
    }

    @JsonbProperty("events_url")
    public URI getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("fork")
    public Boolean getFork() {
        return this.fork;
    }

    @JsonbProperty("forks")
    public Integer getForks() {
        return this.forks;
    }

    @JsonbProperty("forks_count")
    public Integer getForksCount() {
        return this.forksCount;
    }

    @JsonbProperty("forks_url")
    public URI getForksUrl() {
        return this.forksUrl;
    }

    @JsonbProperty("full_name")
    public String getFullName() {
        return this.fullName;
    }

    @JsonbProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return this.gitCommitsUrl;
    }

    @JsonbProperty("git_refs_url")
    public String getGitRefsUrl() {
        return this.gitRefsUrl;
    }

    @JsonbProperty("git_tags_url")
    public String getGitTagsUrl() {
        return this.gitTagsUrl;
    }

    @JsonbProperty("git_url")
    public String getGitUrl() {
        return this.gitUrl;
    }

    @JsonbProperty("has_downloads")
    public Boolean getHasDownloads() {
        return this.hasDownloads;
    }

    @JsonbProperty("has_issues")
    public Boolean getHasIssues() {
        return this.hasIssues;
    }

    @JsonbProperty("has_pages")
    public Boolean getHasPages() {
        return this.hasPages;
    }

    @JsonbProperty("has_projects")
    public Boolean getHasProjects() {
        return this.hasProjects;
    }

    @JsonbProperty("has_wiki")
    public Boolean getHasWiki() {
        return this.hasWiki;
    }

    @JsonbProperty("homepage")
    public URI getHomepage() {
        return this.homepage;
    }

    @JsonbProperty("hooks_url")
    public URI getHooksUrl() {
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

    @JsonbProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return this.issueCommentUrl;
    }

    @JsonbProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return this.issueEventsUrl;
    }

    @JsonbProperty("issues_url")
    public String getIssuesUrl() {
        return this.issuesUrl;
    }

    @JsonbProperty("keys_url")
    public String getKeysUrl() {
        return this.keysUrl;
    }

    @JsonbProperty("labels_url")
    public String getLabelsUrl() {
        return this.labelsUrl;
    }

    @JsonbProperty("language")
    public String getLanguage() {
        return this.language;
    }

    @JsonbProperty("languages_url")
    public URI getLanguagesUrl() {
        return this.languagesUrl;
    }

    @JsonbProperty("license")
    public LicenseSimple getLicense() {
        return this.license;
    }

    @JsonbProperty("master_branch")
    public String getMasterBranch() {
        return this.masterBranch;
    }

    @JsonbProperty("merges_url")
    public URI getMergesUrl() {
        return this.mergesUrl;
    }

    @JsonbProperty("milestones_url")
    public String getMilestonesUrl() {
        return this.milestonesUrl;
    }

    @JsonbProperty("mirror_url")
    public URI getMirrorUrl() {
        return this.mirrorUrl;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("notifications_url")
    public String getNotificationsUrl() {
        return this.notificationsUrl;
    }

    @JsonbProperty("open_issues")
    public Integer getOpenIssues() {
        return this.openIssues;
    }

    @JsonbProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return this.openIssuesCount;
    }

    @JsonbProperty("owner")
    public SimpleUser getOwner() {
        return this.owner;
    }

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("pulls_url")
    public String getPullsUrl() {
        return this.pullsUrl;
    }

    @JsonbProperty("pushed_at")
    public Instant getPushedAt() {
        return this.pushedAt;
    }

    @JsonbProperty("releases_url")
    public String getReleasesUrl() {
        return this.releasesUrl;
    }

    @JsonbProperty("score")
    public Integer getScore() {
        return this.score;
    }

    @JsonbProperty("size")
    public Integer getSize() {
        return this.size;
    }

    @JsonbProperty("ssh_url")
    public String getSshUrl() {
        return this.sshUrl;
    }

    @JsonbProperty("stargazers_count")
    public Integer getStargazersCount() {
        return this.stargazersCount;
    }

    @JsonbProperty("stargazers_url")
    public URI getStargazersUrl() {
        return this.stargazersUrl;
    }

    @JsonbProperty("statuses_url")
    public String getStatusesUrl() {
        return this.statusesUrl;
    }

    @JsonbProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return this.subscribersUrl;
    }

    @JsonbProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return this.subscriptionUrl;
    }

    @JsonbProperty("svn_url")
    public URI getSvnUrl() {
        return this.svnUrl;
    }

    @JsonbProperty("tags_url")
    public URI getTagsUrl() {
        return this.tagsUrl;
    }

    @JsonbProperty("teams_url")
    public URI getTeamsUrl() {
        return this.teamsUrl;
    }

    @JsonbProperty("temp_clone_token")
    public String getTempCloneToken() {
        return this.tempCloneToken;
    }

    @JsonbProperty("text_matches")
    public List<SearchResultTextMatches> getTextMatches() {
        return this.textMatches;
    }

    @JsonbProperty("topics")
    public List<String> getTopics() {
        return this.topics;
    }

    @JsonbProperty("trees_url")
    public String getTreesUrl() {
        return this.treesUrl;
    }

    @JsonbProperty("updated_at")
    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("watchers")
    public Integer getWatchers() {
        return this.watchers;
    }

    @JsonbProperty("watchers_count")
    public Integer getWatchersCount() {
        return this.watchersCount;
    }

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("allow_merge_commit")
    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    @JsonbProperty("allow_rebase_merge")
    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    @JsonbProperty("allow_squash_merge")
    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    @JsonbProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    @JsonbProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonbProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    @JsonbProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    @JsonbProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    @JsonbProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    @JsonbProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonbProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    @JsonbProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    @JsonbProperty("contributors_url")
    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @JsonbProperty("delete_branch_on_merge")
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    @JsonbProperty("deployments_url")
    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @JsonbProperty("downloads_url")
    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    @JsonbProperty("forks")
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    @JsonbProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    @JsonbProperty("forks_url")
    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    @JsonbProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonbProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    @JsonbProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    @JsonbProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    @JsonbProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    @JsonbProperty("has_downloads")
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    @JsonbProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    @JsonbProperty("has_pages")
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    @JsonbProperty("has_projects")
    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    @JsonbProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    @JsonbProperty("homepage")
    public void setHomepage(URI homepage) {
        this.homepage = homepage;
    }

    @JsonbProperty("hooks_url")
    public void setHooksUrl(URI hooksUrl) {
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

    @JsonbProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    @JsonbProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    @JsonbProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonbProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    @JsonbProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @JsonbProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonbProperty("languages_url")
    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    @JsonbProperty("license")
    public void setLicense(LicenseSimple license) {
        this.license = license;
    }

    @JsonbProperty("master_branch")
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    @JsonbProperty("merges_url")
    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    @JsonbProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    @JsonbProperty("mirror_url")
    public void setMirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    @JsonbProperty("open_issues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    @JsonbProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    @JsonbProperty("owner")
    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    @JsonbProperty("pushed_at")
    public void setPushedAt(Instant pushedAt) {
        this.pushedAt = pushedAt;
    }

    @JsonbProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    @JsonbProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonbProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonbProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    @JsonbProperty("stargazers_count")
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    @JsonbProperty("stargazers_url")
    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    @JsonbProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @JsonbProperty("subscribers_url")
    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    @JsonbProperty("subscription_url")
    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    @JsonbProperty("svn_url")
    public void setSvnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
    }

    @JsonbProperty("tags_url")
    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    @JsonbProperty("teams_url")
    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    @JsonbProperty("temp_clone_token")
    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    @JsonbProperty("text_matches")
    public void setTextMatches(List<SearchResultTextMatches> textMatches) {
        this.textMatches = textMatches;
    }

    @JsonbProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonbProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("watchers")
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    @JsonbProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    @JsonbProperty("private")
    public void set_private(Boolean _private) {
        this._private = _private;
    }
}
