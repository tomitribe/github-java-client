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
import java.util.List;
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
@ComponentId("pull-request")
public class PullRequest {

    private String activeLockReason;

    private Integer additions;

    private SimpleUser assignee;

    private List<SimpleUser> assignees;

    private String authorAssociation;

    private Base base;

    private String body;

    private Integer changedFiles;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date closedAt;

    private Integer comments;

    private URI commentsUrl;

    private Integer commits;

    private URI commitsUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Integer deletions;

    private URI diffUrl;

    private Boolean draft;

    private Head head;

    private String href;

    private URI htmlUrl;

    private Integer id;

    private URI issueUrl;

    private List<Labels> labels;

    private Links links;

    private Boolean locked;

    private Boolean maintainerCanModify;

    private String mergeCommitSha;

    private Boolean mergeable;

    private String mergeableState;

    private Boolean merged;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date mergedAt;

    private SimpleUser mergedBy;

    private Milestone milestone;

    private String nodeId;

    private Integer number;

    private URI patchUrl;

    private Boolean rebaseable;

    private List<SimpleUser> requestedReviewers;

    private List<TeamSimple> requestedTeams;

    private String reviewCommentUrl;

    private Integer reviewComments;

    private URI reviewCommentsUrl;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    private URI statusesUrl;

    private String title;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("active_lock_reason")
    public String getActiveLockReason() {
        return this.activeLockReason;
    }

    @JsonbProperty("additions")
    public Integer getAdditions() {
        return this.additions;
    }

    @JsonbProperty("assignee")
    public SimpleUser getAssignee() {
        return this.assignee;
    }

    @JsonbProperty("assignees")
    public List<SimpleUser> getAssignees() {
        return this.assignees;
    }

    @JsonbProperty("author_association")
    public String getAuthorAssociation() {
        return this.authorAssociation;
    }

    @JsonbProperty("base")
    public Base getBase() {
        return this.base;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("changed_files")
    public Integer getChangedFiles() {
        return this.changedFiles;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("closed_at")
    public Date getClosedAt() {
        return this.closedAt;
    }

    @JsonbProperty("comments")
    public Integer getComments() {
        return this.comments;
    }

    @JsonbProperty("comments_url")
    public URI getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("commits")
    public Integer getCommits() {
        return this.commits;
    }

    @JsonbProperty("commits_url")
    public URI getCommitsUrl() {
        return this.commitsUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("deletions")
    public Integer getDeletions() {
        return this.deletions;
    }

    @JsonbProperty("diff_url")
    public URI getDiffUrl() {
        return this.diffUrl;
    }

    @JsonbProperty("draft")
    public Boolean getDraft() {
        return this.draft;
    }

    @JsonbProperty("head")
    public Head getHead() {
        return this.head;
    }

    @JsonbProperty("href")
    public URI getHref() {
        return this.href;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("issue_url")
    public URI getIssueUrl() {
        return this.issueUrl;
    }

    @JsonbProperty("labels")
    public List<Labels> getLabels() {
        return this.labels;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("locked")
    public Boolean getLocked() {
        return this.locked;
    }

    @JsonbProperty("maintainer_can_modify")
    public Boolean getMaintainerCanModify() {
        return this.maintainerCanModify;
    }

    @JsonbProperty("merge_commit_sha")
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    @JsonbProperty("mergeable")
    public Boolean getMergeable() {
        return this.mergeable;
    }

    @JsonbProperty("mergeable_state")
    public String getMergeableState() {
        return this.mergeableState;
    }

    @JsonbProperty("merged")
    public Boolean getMerged() {
        return this.merged;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("merged_at")
    public Date getMergedAt() {
        return this.mergedAt;
    }

    @JsonbProperty("merged_by")
    public SimpleUser getMergedBy() {
        return this.mergedBy;
    }

    @JsonbProperty("milestone")
    public Milestone getMilestone() {
        return this.milestone;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("patch_url")
    public URI getPatchUrl() {
        return this.patchUrl;
    }

    @JsonbProperty("rebaseable")
    public Boolean getRebaseable() {
        return this.rebaseable;
    }

    @JsonbProperty("requested_reviewers")
    public List<SimpleUser> getRequestedReviewers() {
        return this.requestedReviewers;
    }

    @JsonbProperty("requested_teams")
    public List<TeamSimple> getRequestedTeams() {
        return this.requestedTeams;
    }

    @JsonbProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return this.reviewCommentUrl;
    }

    @JsonbProperty("review_comments")
    public Integer getReviewComments() {
        return this.reviewComments;
    }

    @JsonbProperty("review_comments_url")
    public URI getReviewCommentsUrl() {
        return this.reviewCommentsUrl;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbProperty("state")
    public State getState() {
        return this.state;
    }

    @JsonbProperty("statuses_url")
    public URI getStatusesUrl() {
        return this.statusesUrl;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
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

    @JsonbProperty("user")
    public SimpleUser getUser() {
        return this.user;
    }

    @JsonbProperty("active_lock_reason")
    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    @JsonbProperty("additions")
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    @JsonbProperty("assignee")
    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    @JsonbProperty("assignees")
    public void setAssignees(List<SimpleUser> assignees) {
        this.assignees = assignees;
    }

    @JsonbProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonbProperty("base")
    public void setBase(Base base) {
        this.base = base;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("changed_files")
    public void setChangedFiles(Integer changedFiles) {
        this.changedFiles = changedFiles;
    }

    @JsonbProperty("closed_at")
    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    @JsonbProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("commits")
    public void setCommits(Integer commits) {
        this.commits = commits;
    }

    @JsonbProperty("commits_url")
    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("deletions")
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @JsonbProperty("diff_url")
    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    @JsonbProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @JsonbProperty("head")
    public void setHead(Head head) {
        this.head = head;
    }

    @JsonbProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("issue_url")
    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    @JsonbProperty("labels")
    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonbProperty("maintainer_can_modify")
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    @JsonbProperty("merge_commit_sha")
    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    @JsonbProperty("mergeable")
    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    @JsonbProperty("mergeable_state")
    public void setMergeableState(String mergeableState) {
        this.mergeableState = mergeableState;
    }

    @JsonbProperty("merged")
    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    @JsonbProperty("merged_at")
    public void setMergedAt(Date mergedAt) {
        this.mergedAt = mergedAt;
    }

    @JsonbProperty("merged_by")
    public void setMergedBy(SimpleUser mergedBy) {
        this.mergedBy = mergedBy;
    }

    @JsonbProperty("milestone")
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("patch_url")
    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    @JsonbProperty("rebaseable")
    public void setRebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
    }

    @JsonbProperty("requested_reviewers")
    public void setRequestedReviewers(List<SimpleUser> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    @JsonbProperty("requested_teams")
    public void setRequestedTeams(List<TeamSimple> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    @JsonbProperty("review_comment_url")
    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    @JsonbProperty("review_comments")
    public void setReviewComments(Integer reviewComments) {
        this.reviewComments = reviewComments;
    }

    @JsonbProperty("review_comments_url")
    public void setReviewCommentsUrl(URI reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonbProperty("statuses_url")
    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public enum State {

        OPEN("open"), CLOSED("closed");

        private final String name;

        State(final String name) {
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

    public static class StateAdapter extends EnumAdapter<State> {

        public StateAdapter() {
            super(State.class);
        }
    }
}
