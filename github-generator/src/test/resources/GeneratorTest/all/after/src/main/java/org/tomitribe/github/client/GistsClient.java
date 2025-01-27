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
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.model.BaseGist;
import org.tomitribe.github.model.CheckIfGistIsStarred;
import org.tomitribe.github.model.CreateGist;
import org.tomitribe.github.model.CreateGistComment;
import org.tomitribe.github.model.DeleteGist;
import org.tomitribe.github.model.DeleteGistComment;
import org.tomitribe.github.model.ForkGist;
import org.tomitribe.github.model.GetGist;
import org.tomitribe.github.model.GetGistComment;
import org.tomitribe.github.model.GetGistRevision;
import org.tomitribe.github.model.GistComment;
import org.tomitribe.github.model.GistCommit;
import org.tomitribe.github.model.GistFull;
import org.tomitribe.github.model.ListGistComments;
import org.tomitribe.github.model.ListGistCommits;
import org.tomitribe.github.model.ListGistForks;
import org.tomitribe.github.model.ListGistsForAuthenticatedUser;
import org.tomitribe.github.model.ListGistsForUser;
import org.tomitribe.github.model.ListPublicGists;
import org.tomitribe.github.model.ListStarredGists;
import org.tomitribe.github.model.StarGist;
import org.tomitribe.github.model.UnstarGist;
import org.tomitribe.github.model.UpdateGist;
import org.tomitribe.github.model.UpdateGistComment;

public interface GistsClient {

    @GET
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#check-if-a-gist-is-starred")
    void checkIfGistIsStarred(final CheckIfGistIsStarred checkIfGistIsStarred);

    @GET
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#check-if-a-gist-is-starred")
    void checkIfGistIsStarred(@PathParam("gist_id") final String gistId);

    @POST
    @Path("/gists")
    @Docs("https://developer.github.com/v3/gists/#create-a-gist")
    GistFull createGist(final CreateGist createGist);

    @POST
    @Path("/gists/{gist_id}/comments")
    @Docs("https://developer.github.com/v3/gists/comments/#create-a-gist-comment")
    GistComment createGistComment(final CreateGistComment createGistComment);

    @DELETE
    @Path("/gists/{gist_id}")
    @Docs("https://developer.github.com/v3/gists/#delete-a-gist")
    void deleteGist(final DeleteGist deleteGist);

    @DELETE
    @Path("/gists/{gist_id}")
    @Docs("https://developer.github.com/v3/gists/#delete-a-gist")
    void deleteGist(@PathParam("gist_id") final String gistId);

    @DELETE
    @Path("/gists/{gist_id}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/gists/comments/#delete-a-gist-comment")
    void deleteGistComment(final DeleteGistComment deleteGistComment);

    @DELETE
    @Path("/gists/{gist_id}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/gists/comments/#delete-a-gist-comment")
    void deleteGistComment(@PathParam("gist_id") final String gistId, @PathParam("comment_id") final int commentId);

    @POST
    @Path("/gists/{gist_id}/forks")
    @Docs("https://developer.github.com/v3/gists/#fork-a-gist")
    BaseGist forkGist(final ForkGist forkGist);

    @POST
    @Path("/gists/{gist_id}/forks")
    @Docs("https://developer.github.com/v3/gists/#fork-a-gist")
    BaseGist forkGist(@PathParam("gist_id") final String gistId);

    @GET
    @Path("/gists/{gist_id}")
    @Docs("https://developer.github.com/v3/gists/#get-a-gist")
    GistFull getGist(final GetGist getGist);

    @GET
    @Path("/gists/{gist_id}")
    @Docs("https://developer.github.com/v3/gists/#get-a-gist")
    GistFull getGist(@PathParam("gist_id") final String gistId);

    @GET
    @Path("/gists/{gist_id}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/gists/comments/#get-a-gist-comment")
    GistComment getGistComment(final GetGistComment getGistComment);

    @GET
    @Path("/gists/{gist_id}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/gists/comments/#get-a-gist-comment")
    GistComment getGistComment(@PathParam("gist_id") final String gistId, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/gists/{gist_id}/{sha}")
    @Docs("https://developer.github.com/v3/gists/#get-a-gist-revision")
    GistFull getGistRevision(final GetGistRevision getGistRevision);

    @GET
    @Path("/gists/{gist_id}/{sha}")
    @Docs("https://developer.github.com/v3/gists/#get-a-gist-revision")
    GistFull getGistRevision(@PathParam("gist_id") final String gistId, @PathParam("sha") final String sha);

    @GET
    @Path("/gists/{gist_id}/comments")
    @Docs("https://developer.github.com/v3/gists/comments/#list-gist-comments")
    @Paged(GistComment[].class)
    Stream<GistComment> listGistComments(final ListGistComments listGistComments);

    @GET
    @Path("/gists/{gist_id}/comments")
    @Docs("https://developer.github.com/v3/gists/comments/#list-gist-comments")
    @Paged(GistComment[].class)
    Stream<GistComment> listGistComments(@PathParam("gist_id") final String gistId);

    @GET
    @Path("/gists/{gist_id}/commits")
    @Docs("https://developer.github.com/v3/gists/#list-gist-commits")
    @Paged(GistCommit[].class)
    Stream<GistCommit> listGistCommits(final ListGistCommits listGistCommits);

    @GET
    @Path("/gists/{gist_id}/commits")
    @Docs("https://developer.github.com/v3/gists/#list-gist-commits")
    @Paged(GistCommit[].class)
    Stream<GistCommit> listGistCommits(@PathParam("gist_id") final String gistId);

    @GET
    @Path("/gists/{gist_id}/forks")
    @Docs("https://developer.github.com/v3/gists/#list-gist-forks")
    @Paged(GistFull[].class)
    Stream<GistFull> listGistForks(final ListGistForks listGistForks);

    @GET
    @Path("/gists/{gist_id}/forks")
    @Docs("https://developer.github.com/v3/gists/#list-gist-forks")
    @Paged(GistFull[].class)
    Stream<GistFull> listGistForks(@PathParam("gist_id") final String gistId);

    @GET
    @Path("/gists")
    @Docs("https://developer.github.com/v3/gists/#list-gists-for-the-authenticated-user")
    @Paged(BaseGist[].class)
    Stream<BaseGist> listGistsForAuthenticatedUser(final ListGistsForAuthenticatedUser listGistsForAuthenticatedUser);

    @GET
    @Path("/users/{username}/gists")
    @Docs("https://developer.github.com/v3/gists/#list-gists-for-a-user")
    @Paged(BaseGist[].class)
    Stream<BaseGist> listGistsForUser(final ListGistsForUser listGistsForUser);

    @GET
    @Path("/users/{username}/gists")
    @Docs("https://developer.github.com/v3/gists/#list-gists-for-a-user")
    @Paged(BaseGist[].class)
    Stream<BaseGist> listGistsForUser(@PathParam("username") final String username);

    @GET
    @Path("/gists/public")
    @Docs("https://developer.github.com/v3/gists/#list-public-gists")
    @Paged(BaseGist[].class)
    Stream<BaseGist> listPublicGists(final ListPublicGists listPublicGists);

    @GET
    @Path("/gists/starred")
    @Docs("https://developer.github.com/v3/gists/#list-starred-gists")
    @Paged(BaseGist[].class)
    Stream<BaseGist> listStarredGists(final ListStarredGists listStarredGists);

    @PUT
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#star-a-gist")
    void starGist(final StarGist starGist);

    @PUT
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#star-a-gist")
    void starGist(@PathParam("gist_id") final String gistId);

    @DELETE
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#unstar-a-gist")
    void unstarGist(final UnstarGist unstarGist);

    @DELETE
    @Path("/gists/{gist_id}/star")
    @Docs("https://developer.github.com/v3/gists/#unstar-a-gist")
    void unstarGist(@PathParam("gist_id") final String gistId);

    @PATCH
    @Path("/gists/{gist_id}")
    @Docs("https://developer.github.com/v3/gists/#update-a-gist")
    GistFull updateGist(final UpdateGist updateGist);

    @PATCH
    @Path("/gists/{gist_id}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/gists/comments/#update-a-gist-comment")
    GistComment updateGistComment(final UpdateGistComment updateGistComment);
}
