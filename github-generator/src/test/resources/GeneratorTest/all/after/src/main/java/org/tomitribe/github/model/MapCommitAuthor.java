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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MapCommitAuthor {

    @JsonbTransient
    @PathParam("author_id")
    private Integer authorId;

    private String email;

    private String name;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private String remoteId;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("author_id")
    public Integer getAuthorId() {
        return this.authorId;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("remote_id")
    public String getRemoteId() {
        return this.remoteId;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @PathParam("author_id")
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("remote_id")
    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }
}
