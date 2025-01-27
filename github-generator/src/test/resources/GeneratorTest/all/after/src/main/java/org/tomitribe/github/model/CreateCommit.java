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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCommit {

    private Author author;

    private Committer committer;

    private String message;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private List<String> parents;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String signature;

    private String tree;

    @JsonbProperty("author")
    public Author getAuthor() {
        return this.author;
    }

    @JsonbProperty("committer")
    public Committer getCommitter() {
        return this.committer;
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

    @JsonbProperty("parents")
    public List<String> getParents() {
        return this.parents;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("signature")
    public String getSignature() {
        return this.signature;
    }

    @JsonbProperty("tree")
    public String getTree() {
        return this.tree;
    }

    @JsonbProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonbProperty("committer")
    public void setCommitter(Committer committer) {
        this.committer = committer;
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

    @JsonbProperty("parents")
    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonbProperty("tree")
    public void setTree(String tree) {
        this.tree = tree;
    }
}
