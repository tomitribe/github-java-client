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
public class CreateCommitComment {

    private String body;

    @JsonbTransient
    @PathParam("commit_sha")
    private String commitSha;

    private Integer line;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private String path;

    private Integer position;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbTransient
    @PathParam("commit_sha")
    public String getCommitSha() {
        return this.commitSha;
    }

    @JsonbProperty("line")
    public Integer getLine() {
        return this.line;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("position")
    public Integer getPosition() {
        return this.position;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbTransient
    @PathParam("commit_sha")
    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    @JsonbProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }
}
