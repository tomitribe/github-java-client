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

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListCommits {

    @JsonbTransient
    @QueryParam("author")
    private String author;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @QueryParam("path")
    private String path;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @QueryParam("sha")
    private String sha;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("until")
    private String until;

    @JsonbTransient
    @QueryParam("author")
    public String getAuthor() {
        return this.author;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @QueryParam("path")
    public String getPath() {
        return this.path;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @QueryParam("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbTransient
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTransient
    @QueryParam("until")
    public String getUntil() {
        return this.until;
    }

    @JsonbTransient
    @QueryParam("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @QueryParam("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbTransient
    @QueryParam("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbTransient
    @QueryParam("since")
    public void setSince(String since) {
        this.since = since;
    }

    @JsonbTransient
    @QueryParam("until")
    public void setUntil(String until) {
        this.until = until;
    }
}
