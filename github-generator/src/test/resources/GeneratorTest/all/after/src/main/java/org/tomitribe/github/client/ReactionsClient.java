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
package org.tomitribe.github.client;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.DeprecationDate;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.model.CreateReactionForCommitComment;
import org.tomitribe.github.model.CreateReactionForIssue;
import org.tomitribe.github.model.CreateReactionForIssueComment;
import org.tomitribe.github.model.CreateReactionForPullRequestReviewComment;
import org.tomitribe.github.model.CreateReactionForTeamDiscussion;
import org.tomitribe.github.model.CreateReactionForTeamDiscussionComment;
import org.tomitribe.github.model.CreateReactionForTeamDiscussionCommentLegacy;
import org.tomitribe.github.model.CreateReactionForTeamDiscussionLegacy;
import org.tomitribe.github.model.DeleteCommitCommentReaction;
import org.tomitribe.github.model.DeleteIssueCommentReaction;
import org.tomitribe.github.model.DeleteIssueReaction;
import org.tomitribe.github.model.DeletePullRequestCommentReaction;
import org.tomitribe.github.model.DeleteReactionLegacy;
import org.tomitribe.github.model.DeleteTeamDiscussionCommentReaction;
import org.tomitribe.github.model.DeleteTeamDiscussionReaction;
import org.tomitribe.github.model.ListReactionsForCommitComment;
import org.tomitribe.github.model.ListReactionsForIssue;
import org.tomitribe.github.model.ListReactionsForIssueComment;
import org.tomitribe.github.model.ListReactionsForPullRequestReviewComment;
import org.tomitribe.github.model.ListReactionsForTeamDiscussion;
import org.tomitribe.github.model.ListReactionsForTeamDiscussionComment;
import org.tomitribe.github.model.ListReactionsForTeamDiscussionCommentLegacy;
import org.tomitribe.github.model.ListReactionsForTeamDiscussionLegacy;
import org.tomitribe.github.model.Reaction;

public interface ReactionsClient {

    @POST
    @Path("/repos/{owner}/{repo}/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-commit-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    Reaction createReactionForCommitComment(final CreateReactionForCommitComment createReactionForCommitComment);

    @POST
    @Path("/repos/{owner}/{repo}/issues/{issue_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-an-issue")
    @Preview("squirrel-girl")
    Reaction createReactionForIssue(final CreateReactionForIssue createReactionForIssue);

    @POST
    @Path("/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-an-issue-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    Reaction createReactionForIssueComment(final CreateReactionForIssueComment createReactionForIssueComment);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-pull-request-review-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    Reaction createReactionForPullRequestReviewComment(final CreateReactionForPullRequestReviewComment createReactionForPullRequestReviewComment);

    @POST
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion")
    @Preview("squirrel-girl")
    Reaction createReactionForTeamDiscussion(final CreateReactionForTeamDiscussion createReactionForTeamDiscussion);

    @POST
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    Reaction createReactionForTeamDiscussionComment(final CreateReactionForTeamDiscussionComment createReactionForTeamDiscussionComment);

    @POST
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    Reaction createReactionForTeamDiscussionCommentLegacy(final CreateReactionForTeamDiscussionCommentLegacy createReactionForTeamDiscussionCommentLegacy);

    @POST
    @Path("/teams/{team_id}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @Preview("squirrel-girl")
    Reaction createReactionForTeamDiscussionLegacy(final CreateReactionForTeamDiscussionLegacy createReactionForTeamDiscussionLegacy);

    @DELETE
    @Path("/repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-commit-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteCommitCommentReaction(final DeleteCommitCommentReaction deleteCommitCommentReaction);

    @DELETE
    @Path("/repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-commit-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteCommitCommentReaction(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId, @PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-an-issue-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteIssueCommentReaction(final DeleteIssueCommentReaction deleteIssueCommentReaction);

    @DELETE
    @Path("/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-an-issue-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteIssueCommentReaction(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId, @PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-an-issue-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteIssueReaction(final DeleteIssueReaction deleteIssueReaction);

    @DELETE
    @Path("/repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-an-issue-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteIssueReaction(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("issue_number") final int issueNumber, @PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-pull-request-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deletePullRequestCommentReaction(final DeletePullRequestCommentReaction deletePullRequestCommentReaction);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-pull-request-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deletePullRequestCommentReaction(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId, @PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-reaction-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteReactionLegacy(final DeleteReactionLegacy deleteReactionLegacy);

    @DELETE
    @Path("/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-a-reaction-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteReactionLegacy(@PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-team-discussion-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteTeamDiscussionCommentReaction(final DeleteTeamDiscussionCommentReaction deleteTeamDiscussionCommentReaction);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-team-discussion-comment-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteTeamDiscussionCommentReaction(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber, @PathParam("reaction-id") final int reactionId);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-team-discussion-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteTeamDiscussionReaction(final DeleteTeamDiscussionReaction deleteTeamDiscussionReaction);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id}")
    @Docs("https://developer.github.com/v3/reactions/#delete-team-discussion-reaction")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    void deleteTeamDiscussionReaction(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber, @PathParam("reaction-id") final int reactionId);

    @GET
    @Path("/repos/{owner}/{repo}/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-commit-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForCommitComment(final ListReactionsForCommitComment listReactionsForCommitComment);

    @GET
    @Path("/repos/{owner}/{repo}/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-commit-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForCommitComment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/repos/{owner}/{repo}/issues/{issue_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-an-issue")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForIssue(final ListReactionsForIssue listReactionsForIssue);

    @GET
    @Path("/repos/{owner}/{repo}/issues/{issue_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-an-issue")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForIssue(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("issue_number") final int issueNumber);

    @GET
    @Path("/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-an-issue-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForIssueComment(final ListReactionsForIssueComment listReactionsForIssueComment);

    @GET
    @Path("/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-an-issue-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForIssueComment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-pull-request-review-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForPullRequestReviewComment(final ListReactionsForPullRequestReviewComment listReactionsForPullRequestReviewComment);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-pull-request-review-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForPullRequestReviewComment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussion(final ListReactionsForTeamDiscussion listReactionsForTeamDiscussion);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussion(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionComment(final ListReactionsForTeamDiscussionComment listReactionsForTeamDiscussionComment);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionComment(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionCommentLegacy(final ListReactionsForTeamDiscussionCommentLegacy listReactionsForTeamDiscussionCommentLegacy);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionCommentLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionLegacy(final ListReactionsForTeamDiscussionLegacy listReactionsForTeamDiscussionLegacy);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/reactions")
    @Docs("https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy")
    @RemovalDate("2021-02-21")
    @DeprecationDate("2020-02-26")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(Reaction[].class)
    Stream<Reaction> listReactionsForTeamDiscussionLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber);
}
