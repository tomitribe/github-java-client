/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.github.core;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tomitribe.util.Join;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class StreamPagedArrayTest {

    private static URI uri;

    @BeforeClass
    public static void before() throws Exception {
        uri = MockGithub.run();
    }

    @Test
    public void test() throws Exception {
        final PullsClient client = getClient();

        final List<String> titles = client.listPullRequests("jakartaee", "specifications")
                .map(PullRequest::getTitle)
                .sorted()
                .collect(Collectors.toList());

        assertEquals("CDI 3.0 final release update\n" +
                "EL 4.0.0 part 1\n" +
                "EL 4.0.0 part 2\n" +
                "JDSOL spec update for 2.0\n" +
                "Jakarta Activation 2.0 apidocs\n" +
                "Jakarta Activation 2.0 spec\n" +
                "Jakarta Annotations 2.0\n" +
                "Jakarta Authentication 2.0\n" +
                "Jakarta Authorization 2.0\n" +
                "Jakarta EE 9 Platform Specification\n" +
                "Jakarta Enterprise Beans 4.0 Final\n" +
                "Jakarta Enterprise WS 2.0\n" +
                "Jakarta Interceptors 2.0\n" +
                "Jakarta JSON Binding 2.0\n" +
                "Jakarta JSON Processing 2.0\n" +
                "Jakarta Mail 2.0\n" +
                "Jakarta Messaging 3.0 Final\n" +
                "Jakarta Persistence 3.0\n" +
                "Jakarta RESTful Web Services 3.0 - Spec and Javadocs\n" +
                "Jakarta SOAP 2.0\n" +
                "Jakarta Security 2.0\n" +
                "Jakarta Servlet 5.0\n" +
                "Jakarta Transactions draft PR\n" +
                "Jakarta WS Metadata 3.0\n" +
                "Jakarta XML Binding 3.0\n" +
                "Jakarta XML WS 3.0\n" +
                "ManagedBeans 2.0 release\n" +
                "Nosql Status update\n" +
                "Update Javadoc for WebSocket 2.0.0\n" +
                "Web Profile 9 Specification\n" +
                "Websocket 2.0.0 part1\n" +
                "[DO_NOT_MERGE] Hugo tests\n" +
                "add Scott Wang vote to Jakarta Batch 2.0 result\n" +
                "adding CODE_OF_CONDUCT.md", Join.join("\n", titles));
    }

    private PullsClient getClient() {
        return ClientFactory.builder()
                .host(uri)
                .accessToken("23456789dfghjklkjhgfdsdfghuiytrewertyui")
                .build()
                .getClient(PullsClient.class);
    }

    public interface PullsClient {
        @GET
        @Path("/repos/{owner}/{repo}/pulls")
        @Paged(PullRequest[].class)
        Stream<PullRequest> listPullRequests(@PathParam("owner") final String owner, @PathParam("repo") final String repo);
    }

    @Path("/")
    public static class MockGithub {

        @GET
        @Path("repos/{owner}/{repo}/pulls")
        public Response createPullRequest(@PathParam("owner") final String owner,
                                          @PathParam("repo") final String repo,
                                          @QueryParam("page") int page) throws IOException {

            if (page == 0) page = 1;

            final String format = String.format("%%s/repos/%s/%s/pulls?page=%%s", owner, repo);
            final Link link = TestLinks.getLink(uri, format, page, 2);

            return Response.ok()
                    .header("Link", link.asHeader())
                    .entity(read(String.format("response%s.json", page)))
                    .build();
        }

        private String read(final String name) throws IOException {
            return Resources.read(StreamPagedArrayTest.class, name);
        }

        public static URI run() throws Exception {
            return MockService.run(MockGithub.class);
        }
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PullRequest {

        @JsonbProperty("additions")
        private Long additions;

        @JsonbProperty("author_association")
        private String authorAssociation;

        @JsonbProperty("body")
        private String body;

        @JsonbProperty("changed_files")
        private Long changedFiles;

        @JsonbProperty("closed_at")
        private String closedAt;

        @JsonbProperty("comments")
        private Long comments;

        @JsonbProperty("comments_url")
        private String commentsUrl;

        @JsonbProperty("commits")
        private Long commits;

        @JsonbProperty("commits_url")
        private String commitsUrl;

        @JsonbProperty("created_at")
        private String createdAt;

        @JsonbProperty("deletions")
        private Long deletions;

        @JsonbProperty("diff_url")
        private String diffUrl;

        @JsonbProperty("draft")
        private Boolean draft;

        @JsonbProperty("href")
        private String href;

        @JsonbProperty("html_url")
        private String htmlUrl;

        @JsonbProperty("id")
        private Long id;

        @JsonbProperty("issue_url")
        private String issueUrl;

        @JsonbProperty("locked")
        private Boolean locked;

        @JsonbProperty("maintainer_can_modify")
        private Boolean maintainerCanModify;

        @JsonbProperty("merge_commit_sha")
        private String mergeCommitSha;

        @JsonbProperty("mergeable")
        private Boolean mergeable;

        @JsonbProperty("mergeable_state")
        private String mergeableState;

        @JsonbProperty("merged")
        private Boolean merged;

        @JsonbProperty("merged_at")
        private String mergedAt;

        @JsonbProperty("merged_by")
        private String mergedBy;

        @JsonbProperty("node_id")
        private String nodeId;

        @JsonbProperty("number")
        private Long number;

        @JsonbProperty("patch_url")
        private String patchUrl;

        @JsonbProperty("rebaseable")
        private Boolean rebaseable;

        @JsonbProperty("requested_teams")
        private String[] requestedTeams;

        @JsonbProperty("review_comment_url")
        private String reviewCommentUrl;

        @JsonbProperty("review_comments")
        private Long reviewComments;

        @JsonbProperty("review_comments_url")
        private String reviewCommentsUrl;

        @JsonbProperty("state")
        private String state;

        @JsonbProperty("statuses_url")
        private String statusesUrl;

        @JsonbProperty("title")
        private String title;

        @JsonbProperty("updated_at")
        private String updatedAt;

        @JsonbProperty("url")
        private String url;
    }

}