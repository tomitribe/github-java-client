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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Links {

    private Link comments;

    private Link commits;

    private LinkWithType currentUser;

    private LinkWithType currentUserActor;

    private LinkWithType currentUserOrganization;

    private List<LinkWithType> currentUserOrganizations;

    private LinkWithType currentUserPublic;

    private URI git;

    private Link html;

    private Link issue;

    private Link pullRequest;

    private Link reviewComment;

    private Link reviewComments;

    private LinkWithType securityAdvisories;

    private Link self;

    private Link statuses;

    private LinkWithType timeline;

    private LinkWithType user;

    @JsonbProperty("comments")
    public Link getComments() {
        return this.comments;
    }

    @JsonbProperty("commits")
    public Link getCommits() {
        return this.commits;
    }

    @JsonbProperty("current_user")
    public LinkWithType getCurrentUser() {
        return this.currentUser;
    }

    @JsonbProperty("current_user_actor")
    public LinkWithType getCurrentUserActor() {
        return this.currentUserActor;
    }

    @JsonbProperty("current_user_organization")
    public LinkWithType getCurrentUserOrganization() {
        return this.currentUserOrganization;
    }

    @JsonbProperty("current_user_organizations")
    public List<LinkWithType> getCurrentUserOrganizations() {
        return this.currentUserOrganizations;
    }

    @JsonbProperty("current_user_public")
    public LinkWithType getCurrentUserPublic() {
        return this.currentUserPublic;
    }

    @JsonbProperty("git")
    public URI getGit() {
        return this.git;
    }

    @JsonbProperty("html")
    public String getHtml() {
        return this.html;
    }

    @JsonbProperty("issue")
    public Link getIssue() {
        return this.issue;
    }

    @JsonbProperty("pull_request")
    public PullRequest getPullRequest() {
        return this.pullRequest;
    }

    @JsonbProperty("review_comment")
    public Link getReviewComment() {
        return this.reviewComment;
    }

    @JsonbProperty("review_comments")
    public Link getReviewComments() {
        return this.reviewComments;
    }

    @JsonbProperty("security_advisories")
    public LinkWithType getSecurityAdvisories() {
        return this.securityAdvisories;
    }

    @JsonbProperty("self")
    public URI getSelf() {
        return this.self;
    }

    @JsonbProperty("statuses")
    public Link getStatuses() {
        return this.statuses;
    }

    @JsonbProperty("timeline")
    public LinkWithType getTimeline() {
        return this.timeline;
    }

    @JsonbProperty("user")
    public LinkWithType getUser() {
        return this.user;
    }

    @JsonbProperty("comments")
    public void setComments(Link comments) {
        this.comments = comments;
    }

    @JsonbProperty("commits")
    public void setCommits(Link commits) {
        this.commits = commits;
    }

    @JsonbProperty("current_user")
    public void setCurrentUser(LinkWithType currentUser) {
        this.currentUser = currentUser;
    }

    @JsonbProperty("current_user_actor")
    public void setCurrentUserActor(LinkWithType currentUserActor) {
        this.currentUserActor = currentUserActor;
    }

    @JsonbProperty("current_user_organization")
    public void setCurrentUserOrganization(LinkWithType currentUserOrganization) {
        this.currentUserOrganization = currentUserOrganization;
    }

    @JsonbProperty("current_user_organizations")
    public void setCurrentUserOrganizations(List<LinkWithType> currentUserOrganizations) {
        this.currentUserOrganizations = currentUserOrganizations;
    }

    @JsonbProperty("current_user_public")
    public void setCurrentUserPublic(LinkWithType currentUserPublic) {
        this.currentUserPublic = currentUserPublic;
    }

    @JsonbProperty("git")
    public void setGit(URI git) {
        this.git = git;
    }

    @JsonbProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    @JsonbProperty("issue")
    public void setIssue(Link issue) {
        this.issue = issue;
    }

    @JsonbProperty("pull_request")
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @JsonbProperty("review_comment")
    public void setReviewComment(Link reviewComment) {
        this.reviewComment = reviewComment;
    }

    @JsonbProperty("review_comments")
    public void setReviewComments(Link reviewComments) {
        this.reviewComments = reviewComments;
    }

    @JsonbProperty("security_advisories")
    public void setSecurityAdvisories(LinkWithType securityAdvisories) {
        this.securityAdvisories = securityAdvisories;
    }

    @JsonbProperty("self")
    public void setSelf(URI self) {
        this.self = self;
    }

    @JsonbProperty("statuses")
    public void setStatuses(Link statuses) {
        this.statuses = statuses;
    }

    @JsonbProperty("timeline")
    public void setTimeline(LinkWithType timeline) {
        this.timeline = timeline;
    }

    @JsonbProperty("user")
    public void setUser(LinkWithType user) {
        this.user = user;
    }
}
