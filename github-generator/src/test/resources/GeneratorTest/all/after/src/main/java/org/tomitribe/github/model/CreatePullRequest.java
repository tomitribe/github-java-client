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
public class CreatePullRequest {

    private String base;

    private String body;

    private Boolean draft;

    private String head;

    private Integer issue;

    private Boolean maintainerCanModify;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String title;

    @JsonbProperty("base")
    public String getBase() {
        return this.base;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("draft")
    public Boolean getDraft() {
        return this.draft;
    }

    @JsonbProperty("head")
    public String getHead() {
        return this.head;
    }

    @JsonbProperty("issue")
    public Integer getIssue() {
        return this.issue;
    }

    @JsonbProperty("maintainer_can_modify")
    public Boolean getMaintainerCanModify() {
        return this.maintainerCanModify;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @JsonbProperty("head")
    public void setHead(String head) {
        this.head = head;
    }

    @JsonbProperty("issue")
    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    @JsonbProperty("maintainer_can_modify")
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
}
