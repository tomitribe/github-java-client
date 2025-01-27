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
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.CheckIfPullRequestHasBeenMerged;
import org.tomitribe.github.model.CreatePullRequest;
import org.tomitribe.github.model.CreateReplyForReviewComment;
import org.tomitribe.github.model.CreateReviewCommentForPullRequest;
import org.tomitribe.github.model.CreateReviewForPullRequest;
import org.tomitribe.github.model.DeletePendingReviewForPullRequest;
import org.tomitribe.github.model.DeleteReviewCommentForPullRequest;
import org.tomitribe.github.model.DiffEntry;
import org.tomitribe.github.model.DismissReviewForPullRequest;
import org.tomitribe.github.model.GetPullRequest;
import org.tomitribe.github.model.GetReviewCommentForPullRequest;
import org.tomitribe.github.model.GetReviewForPullRequest;
import org.tomitribe.github.model.ListCommentsForPullRequestReview;
import org.tomitribe.github.model.ListCommitsOnPullRequest;
import org.tomitribe.github.model.ListPullRequests;
import org.tomitribe.github.model.ListPullRequestsFiles;
import org.tomitribe.github.model.ListRequestedReviewersForPullRequest;
import org.tomitribe.github.model.ListReviewCommentsInRepository;
import org.tomitribe.github.model.ListReviewCommentsOnPullRequest;
import org.tomitribe.github.model.ListReviewsForPullRequest;
import org.tomitribe.github.model.MergePullRequest;
import org.tomitribe.github.model.PullRequest;
import org.tomitribe.github.model.PullRequestMergeResult;
import org.tomitribe.github.model.PullRequestReview;
import org.tomitribe.github.model.PullRequestReviewComment;
import org.tomitribe.github.model.PullRequestReviewRequest;
import org.tomitribe.github.model.PullRequestSimple;
import org.tomitribe.github.model.RequestReviewersForPullRequest;
import org.tomitribe.github.model.ReviewComment;
import org.tomitribe.github.model.SimpleCommit;
import org.tomitribe.github.model.SubmitReviewForPullRequest;
import org.tomitribe.github.model.UpdatePullRequest;
import org.tomitribe.github.model.UpdatePullRequestBranch;
import org.tomitribe.github.model.UpdatePullRequestBranchResponse;
import org.tomitribe.github.model.UpdateReviewCommentForPullRequest;
import org.tomitribe.github.model.UpdateReviewForPullRequest;

public interface PullsClient {

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/merge")
    @Docs("https://developer.github.com/v3/pulls/#check-if-a-pull-request-has-been-merged")
    @EnabledForGithubApps
    void checkIfPullRequestHasBeenMerged(final CheckIfPullRequestHasBeenMerged checkIfPullRequestHasBeenMerged);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/merge")
    @Docs("https://developer.github.com/v3/pulls/#check-if-a-pull-request-has-been-merged")
    @EnabledForGithubApps
    void checkIfPullRequestHasBeenMerged(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @POST
    @Path("/repos/{owner}/{repo}/pulls")
    @Docs("https://developer.github.com/v3/pulls/#create-a-pull-request")
    @EnabledForGithubApps
    @Preview("sailor-v")
    PullRequest createPullRequest(final CreatePullRequest createPullRequest);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies")
    @Docs("https://developer.github.com/v3/pulls/comments/#create-a-reply-for-a-review-comment")
    PullRequestReviewComment createReplyForReviewComment(final CreateReplyForReviewComment createReplyForReviewComment);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    @Docs("https://developer.github.com/v3/pulls/comments/#create-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    PullRequestReviewComment createReviewCommentForPullRequest(final CreateReviewCommentForPullRequest createReviewCommentForPullRequest);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews")
    @Docs("https://developer.github.com/v3/pulls/reviews/#create-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview createReviewForPullRequest(final CreateReviewForPullRequest createReviewForPullRequest);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    @Docs("https://developer.github.com/v3/pulls/reviews/#delete-a-pending-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview deletePendingReviewForPullRequest(final DeletePendingReviewForPullRequest deletePendingReviewForPullRequest);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    @Docs("https://developer.github.com/v3/pulls/reviews/#delete-a-pending-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview deletePendingReviewForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber, @PathParam("review_id") final int reviewId);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/pulls/comments/#delete-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    void deleteReviewCommentForPullRequest(final DeleteReviewCommentForPullRequest deleteReviewCommentForPullRequest);

    @DELETE
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/pulls/comments/#delete-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    void deleteReviewCommentForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @PUT
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals")
    @Docs("https://developer.github.com/v3/pulls/reviews/#dismiss-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview dismissReviewForPullRequest(final DismissReviewForPullRequest dismissReviewForPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}")
    @Docs("https://developer.github.com/v3/pulls/#get-a-pull-request")
    @EnabledForGithubApps
    @Preview("sailor-v")
    PullRequest getPullRequest(final GetPullRequest getPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}")
    @Docs("https://developer.github.com/v3/pulls/#get-a-pull-request")
    @EnabledForGithubApps
    @Preview("sailor-v")
    PullRequest getPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/pulls/comments/#get-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    PullRequestReviewComment getReviewCommentForPullRequest(final GetReviewCommentForPullRequest getReviewCommentForPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/pulls/comments/#get-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    PullRequestReviewComment getReviewCommentForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    @Docs("https://developer.github.com/v3/pulls/reviews/#get-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview getReviewForPullRequest(final GetReviewForPullRequest getReviewForPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    @Docs("https://developer.github.com/v3/pulls/reviews/#get-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview getReviewForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber, @PathParam("review_id") final int reviewId);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments")
    @Docs("https://developer.github.com/v3/pulls/reviews/#list-comments-for-a-pull-request-review")
    @EnabledForGithubApps
    @Paged(ReviewComment[].class)
    Stream<ReviewComment> listCommentsForPullRequestReview(final ListCommentsForPullRequestReview listCommentsForPullRequestReview);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments")
    @Docs("https://developer.github.com/v3/pulls/reviews/#list-comments-for-a-pull-request-review")
    @EnabledForGithubApps
    @Paged(ReviewComment[].class)
    Stream<ReviewComment> listCommentsForPullRequestReview(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber, @PathParam("review_id") final int reviewId);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/commits")
    @Docs("https://developer.github.com/v3/pulls/#list-commits-on-a-pull-request")
    @EnabledForGithubApps
    @Paged(SimpleCommit[].class)
    Stream<SimpleCommit> listCommitsOnPullRequest(final ListCommitsOnPullRequest listCommitsOnPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/commits")
    @Docs("https://developer.github.com/v3/pulls/#list-commits-on-a-pull-request")
    @EnabledForGithubApps
    @Paged(SimpleCommit[].class)
    Stream<SimpleCommit> listCommitsOnPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @GET
    @Path("/repos/{owner}/{repo}/pulls")
    @Docs("https://developer.github.com/v3/pulls/#list-pull-requests")
    @EnabledForGithubApps
    @Preview("sailor-v")
    @Paged(PullRequestSimple[].class)
    Stream<PullRequestSimple> listPullRequests(final ListPullRequests listPullRequests);

    @GET
    @Path("/repos/{owner}/{repo}/pulls")
    @Docs("https://developer.github.com/v3/pulls/#list-pull-requests")
    @EnabledForGithubApps
    @Preview("sailor-v")
    @Paged(PullRequestSimple[].class)
    Stream<PullRequestSimple> listPullRequests(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/files")
    @Docs("https://developer.github.com/v3/pulls/#list-pull-requests-files")
    @EnabledForGithubApps
    @Paged(DiffEntry[].class)
    Stream<DiffEntry> listPullRequestsFiles(final ListPullRequestsFiles listPullRequestsFiles);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/files")
    @Docs("https://developer.github.com/v3/pulls/#list-pull-requests-files")
    @EnabledForGithubApps
    @Paged(DiffEntry[].class)
    Stream<DiffEntry> listPullRequestsFiles(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers")
    @Docs("https://developer.github.com/v3/pulls/review_requests/#list-requested-reviewers-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReviewRequest listRequestedReviewersForPullRequest(final ListRequestedReviewersForPullRequest listRequestedReviewersForPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers")
    @Docs("https://developer.github.com/v3/pulls/review_requests/#list-requested-reviewers-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReviewRequest listRequestedReviewersForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments")
    @Docs("https://developer.github.com/v3/pulls/comments/#list-review-comments-in-a-repository")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    @Paged(PullRequestReviewComment[].class)
    Stream<PullRequestReviewComment> listReviewCommentsInRepository(final ListReviewCommentsInRepository listReviewCommentsInRepository);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/comments")
    @Docs("https://developer.github.com/v3/pulls/comments/#list-review-comments-in-a-repository")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    @Paged(PullRequestReviewComment[].class)
    Stream<PullRequestReviewComment> listReviewCommentsInRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    @Docs("https://developer.github.com/v3/pulls/comments/#list-review-comments-on-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    @Paged(PullRequestReviewComment[].class)
    Stream<PullRequestReviewComment> listReviewCommentsOnPullRequest(final ListReviewCommentsOnPullRequest listReviewCommentsOnPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/comments")
    @Docs("https://developer.github.com/v3/pulls/comments/#list-review-comments-on-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    @Preview("squirrel-girl")
    @Paged(PullRequestReviewComment[].class)
    Stream<PullRequestReviewComment> listReviewCommentsOnPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews")
    @Docs("https://developer.github.com/v3/pulls/reviews/#list-reviews-for-a-pull-request")
    @EnabledForGithubApps
    @Paged(PullRequestReview[].class)
    Stream<PullRequestReview> listReviewsForPullRequest(final ListReviewsForPullRequest listReviewsForPullRequest);

    @GET
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews")
    @Docs("https://developer.github.com/v3/pulls/reviews/#list-reviews-for-a-pull-request")
    @EnabledForGithubApps
    @Paged(PullRequestReview[].class)
    Stream<PullRequestReview> listReviewsForPullRequest(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("pull-number") final int pullNumber);

    @PUT
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/merge")
    @Docs("https://developer.github.com/v3/pulls/#merge-a-pull-request")
    @EnabledForGithubApps
    PullRequestMergeResult mergePullRequest(final MergePullRequest mergePullRequest);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers")
    @Docs("https://developer.github.com/v3/pulls/review_requests/#request-reviewers-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestSimple requestReviewersForPullRequest(final RequestReviewersForPullRequest requestReviewersForPullRequest);

    @POST
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events")
    @Docs("https://developer.github.com/v3/pulls/reviews/#submit-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview submitReviewForPullRequest(final SubmitReviewForPullRequest submitReviewForPullRequest);

    @PATCH
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}")
    @Docs("https://developer.github.com/v3/pulls/#update-a-pull-request")
    @EnabledForGithubApps
    @Preview("sailor-v")
    PullRequest updatePullRequest(final UpdatePullRequest updatePullRequest);

    @PUT
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/update-branch")
    @Docs("https://developer.github.com/v3/pulls/#update-a-pull-request-branch")
    @Preview("lydian")
    UpdatePullRequestBranchResponse updatePullRequestBranch(final UpdatePullRequestBranch updatePullRequestBranch);

    @PATCH
    @Path("/repos/{owner}/{repo}/pulls/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/pulls/comments/#update-a-review-comment-for-a-pull-request")
    @EnabledForGithubApps
    @Preview("comfort-fade")
    PullRequestReviewComment updateReviewCommentForPullRequest(final UpdateReviewCommentForPullRequest updateReviewCommentForPullRequest);

    @PUT
    @Path("/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}")
    @Docs("https://developer.github.com/v3/pulls/reviews/#update-a-review-for-a-pull-request")
    @EnabledForGithubApps
    PullRequestReview updateReviewForPullRequest(final UpdateReviewForPullRequest updateReviewForPullRequest);
}
