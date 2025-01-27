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
public class CreateRelease {

    private String body;

    private Boolean draft;

    private String name;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private Boolean prerelease;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String tagName;

    private String targetCommitish;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("draft")
    public Boolean getDraft() {
        return this.draft;
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

    @JsonbProperty("prerelease")
    public Boolean getPrerelease() {
        return this.prerelease;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("tag_name")
    public String getTagName() {
        return this.tagName;
    }

    @JsonbProperty("target_commitish")
    public String getTargetCommitish() {
        return this.targetCommitish;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
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

    @JsonbProperty("prerelease")
    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @JsonbProperty("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }
}
