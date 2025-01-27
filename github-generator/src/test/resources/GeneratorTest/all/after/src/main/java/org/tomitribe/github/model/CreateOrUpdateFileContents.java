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
public class CreateOrUpdateFileContents {

    private Author author;

    private String branch;

    private Committer committer;

    private String content;

    private String message;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("path")
    private String path;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String sha;

    @JsonbProperty("author")
    public Author getAuthor() {
        return this.author;
    }

    @JsonbProperty("branch")
    public String getBranch() {
        return this.branch;
    }

    @JsonbProperty("committer")
    public Committer getCommitter() {
        return this.committer;
    }

    @JsonbProperty("content")
    public String getContent() {
        return this.content;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("path")
    public String getPath() {
        return this.path;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonbProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @JsonbProperty("committer")
    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    @JsonbProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }
}
