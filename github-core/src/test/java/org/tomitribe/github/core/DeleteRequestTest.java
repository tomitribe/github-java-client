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

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.ClientErrorException;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;

import static org.junit.Assert.assertEquals;


public class DeleteRequestTest {

    private static URI uri;

    @BeforeClass
    public static void before() throws Exception {
        uri = MockGithub.run();
    }

    @Test
    public void returnVoid() throws Exception {
        final DeleteClient client = getClient(DeleteClient.class);
        try {
            client.returnVoid("red", "green", 418);
        } catch (final ClientErrorException e) {
            assertEquals(418, e.getResponse().getStatus());
        }

        client.returnVoid("red", "green", null);
    }

    @Test
    public void returnJson() throws Exception {
        final DeleteClient client = getClient(DeleteClient.class);
        try {
            client.returnJson("red", "green", 489);
        } catch (final ClientErrorException e) {
            assertEquals(489, e.getResponse().getStatus());
        }

        final Message message = client.returnJson("red", "green", null);
        assertEquals("here you go", message.getText());
    }

    public static <Client> Client getClient(final Class<Client> clientClass) {
        return ClientFactory.builder()
                .accessToken("23456789dfghjklkjhgfdsdfghuiytrewertyui")
                .host(uri)
                .build()
                .getClient(clientClass);
    }

    @Data
    @Builder(builderClassName = "Builder")
    public static class GetPullRequest {
        @PathParam("owner")
        final String owner;
        @PathParam("repo")
        final String repo;
        @PathParam("pull_number")
        final int pullNumber;
    }

    public interface DeleteClient {
        @DELETE
        @Path("repos/{owner}/{name}/returnVoid")
        void returnVoid(@PathParam("owner") final String owner, @PathParam("name") final String name, @QueryParam("code") final Integer code);

        @DELETE
        @Path("repos/{owner}/{name}/returnJson")
        Message returnJson(@PathParam("owner") final String owner, @PathParam("name") final String name, @QueryParam("code") final Integer code);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Message {
        private String text;
    }

    @Path("/")
    public static class MockGithub {

        @Context
        private HttpServletRequest request;

        @DELETE
        @Path("repos/{owner}/{name}/returnVoid")
        public void returnVoid(@PathParam("owner") final String owner,
                               @PathParam("name") final String name,
                               @QueryParam("code") Integer code) throws IOException {
            if (code != null) throw new WebApplicationException(code);
        }

        @DELETE
        @Path("repos/{owner}/{name}/returnJson")
        public Message returnJson(@PathParam("owner") final String owner,
                                  @PathParam("name") final String name,
                                  @QueryParam("code") final Integer code) throws IOException {
            if (code != null) throw new WebApplicationException(code);
            return new Message("here you go");
        }

        public static URI run() throws Exception {
            return MockService.run(MockGithub.class);
        }
    }
}