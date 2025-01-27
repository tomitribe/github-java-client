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
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.model.Blob;
import org.tomitribe.github.model.CreateBlob;
import org.tomitribe.github.model.CreateCommit;
import org.tomitribe.github.model.CreateReference;
import org.tomitribe.github.model.CreateTagObject;
import org.tomitribe.github.model.CreateTree;
import org.tomitribe.github.model.DeleteReference;
import org.tomitribe.github.model.GetBlob;
import org.tomitribe.github.model.GetCommit;
import org.tomitribe.github.model.GetReference;
import org.tomitribe.github.model.GetTag;
import org.tomitribe.github.model.GetTree;
import org.tomitribe.github.model.GitCommit;
import org.tomitribe.github.model.GitRef;
import org.tomitribe.github.model.GitTag;
import org.tomitribe.github.model.GitTree;
import org.tomitribe.github.model.ListMatchingReferences;
import org.tomitribe.github.model.ShortBlob;
import org.tomitribe.github.model.UpdateReference;

public interface GitClient {

    @POST
    @Path("/repos/{owner}/{repo}/git/blobs")
    @Docs("https://developer.github.com/v3/git/blobs/#create-a-blob")
    @EnabledForGithubApps
    ShortBlob createBlob(final CreateBlob createBlob);

    @POST
    @Path("/repos/{owner}/{repo}/git/commits")
    @Docs("https://developer.github.com/v3/git/commits/#create-a-commit")
    @EnabledForGithubApps
    GitCommit createCommit(final CreateCommit createCommit);

    @POST
    @Path("/repos/{owner}/{repo}/git/refs")
    @Docs("https://developer.github.com/v3/git/refs/#create-a-reference")
    @EnabledForGithubApps
    GitRef createReference(final CreateReference createReference);

    @POST
    @Path("/repos/{owner}/{repo}/git/tags")
    @Docs("https://developer.github.com/v3/git/tags/#create-a-tag-object")
    @EnabledForGithubApps
    GitTag createTagObject(final CreateTagObject createTagObject);

    @POST
    @Path("/repos/{owner}/{repo}/git/trees")
    @Docs("https://developer.github.com/v3/git/trees/#create-a-tree")
    @EnabledForGithubApps
    GitTree createTree(final CreateTree createTree);

    @DELETE
    @Path("/repos/{owner}/{repo}/git/refs/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#delete-a-reference")
    @EnabledForGithubApps
    void deleteReference(final DeleteReference deleteReference);

    @DELETE
    @Path("/repos/{owner}/{repo}/git/refs/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#delete-a-reference")
    @EnabledForGithubApps
    void deleteReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/git/blobs/{file_sha}")
    @Docs("https://developer.github.com/v3/git/blobs/#get-a-blob")
    @EnabledForGithubApps
    Blob getBlob(final GetBlob getBlob);

    @GET
    @Path("/repos/{owner}/{repo}/git/blobs/{file_sha}")
    @Docs("https://developer.github.com/v3/git/blobs/#get-a-blob")
    @EnabledForGithubApps
    Blob getBlob(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("file_sha") final String fileSha);

    @GET
    @Path("/repos/{owner}/{repo}/git/commits/{commit_sha}")
    @Docs("https://developer.github.com/v3/git/commits/#get-a-commit")
    @EnabledForGithubApps
    GitCommit getCommit(final GetCommit getCommit);

    @GET
    @Path("/repos/{owner}/{repo}/git/commits/{commit_sha}")
    @Docs("https://developer.github.com/v3/git/commits/#get-a-commit")
    @EnabledForGithubApps
    GitCommit getCommit(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("commit_sha") final String commitSha);

    @GET
    @Path("/repos/{owner}/{repo}/git/ref/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#get-a-reference")
    @EnabledForGithubApps
    GitRef getReference(final GetReference getReference);

    @GET
    @Path("/repos/{owner}/{repo}/git/ref/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#get-a-reference")
    @EnabledForGithubApps
    GitRef getReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/git/tags/{tag_sha}")
    @Docs("https://developer.github.com/v3/git/tags/#get-a-tag")
    @EnabledForGithubApps
    GitTag getTag(final GetTag getTag);

    @GET
    @Path("/repos/{owner}/{repo}/git/tags/{tag_sha}")
    @Docs("https://developer.github.com/v3/git/tags/#get-a-tag")
    @EnabledForGithubApps
    GitTag getTag(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("tag_sha") final String tagSha);

    @GET
    @Path("/repos/{owner}/{repo}/git/trees/{tree_sha}")
    @Docs("https://developer.github.com/v3/git/trees/#get-a-tree")
    @EnabledForGithubApps
    GitTree getTree(final GetTree getTree);

    @GET
    @Path("/repos/{owner}/{repo}/git/trees/{tree_sha}")
    @Docs("https://developer.github.com/v3/git/trees/#get-a-tree")
    @EnabledForGithubApps
    GitTree getTree(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("tree_sha") final String treeSha);

    @GET
    @Path("/repos/{owner}/{repo}/git/matching-refs/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#list-matching-references")
    @EnabledForGithubApps
    @Paged(GitRef[].class)
    Stream<GitRef> listMatchingReferences(final ListMatchingReferences listMatchingReferences);

    @GET
    @Path("/repos/{owner}/{repo}/git/matching-refs/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#list-matching-references")
    @EnabledForGithubApps
    @Paged(GitRef[].class)
    Stream<GitRef> listMatchingReferences(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @PATCH
    @Path("/repos/{owner}/{repo}/git/refs/{ref}")
    @Docs("https://developer.github.com/v3/git/refs/#update-a-reference")
    @EnabledForGithubApps
    GitRef updateReference(final UpdateReference updateReference);
}
