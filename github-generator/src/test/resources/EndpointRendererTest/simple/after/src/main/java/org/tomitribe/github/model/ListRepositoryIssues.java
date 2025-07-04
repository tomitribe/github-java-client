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
public class ListRepositoryIssues {

    @JsonbTransient
    @QueryParam("assignee")
    private String assignee;

    @JsonbTransient
    @QueryParam("creator")
    private String creator;

    @JsonbTransient
    @QueryParam("direction")
    private Direction direction;

    @JsonbTransient
    @QueryParam("labels")
    private String labels;

    @JsonbTransient
    @QueryParam("mentioned")
    private String mentioned;

    @JsonbTransient
    @QueryParam("milestone")
    private String milestone;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @QueryParam("page")
    private Integer page;

    @JsonbTransient
    @QueryParam("per_page")
    private Integer perPage;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("sort")
    private Sort sort;

    @JsonbTransient
    @QueryParam("state")
    private State state;

    @JsonbTransient
    @QueryParam("assignee")
    public String getAssignee() {
        return this.assignee;
    }

    @JsonbTransient
    @QueryParam("creator")
    public String getCreator() {
        return this.creator;
    }

    @JsonbTransient
    @QueryParam("direction")
    public Direction getDirection() {
        return this.direction;
    }

    @JsonbTransient
    @QueryParam("labels")
    public String getLabels() {
        return this.labels;
    }

    @JsonbTransient
    @QueryParam("mentioned")
    public String getMentioned() {
        return this.mentioned;
    }

    @JsonbTransient
    @QueryParam("milestone")
    public String getMilestone() {
        return this.milestone;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @QueryParam("page")
    public Integer getPage() {
        return this.page;
    }

    @JsonbTransient
    @QueryParam("per_page")
    public Integer getPerPage() {
        return this.perPage;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTransient
    @QueryParam("sort")
    public Sort getSort() {
        return this.sort;
    }

    @JsonbTransient
    @QueryParam("state")
    public State getState() {
        return this.state;
    }

    @JsonbTransient
    @QueryParam("assignee")
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @JsonbTransient
    @QueryParam("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonbTransient
    @QueryParam("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @JsonbTransient
    @QueryParam("labels")
    public void setLabels(String labels) {
        this.labels = labels;
    }

    @JsonbTransient
    @QueryParam("mentioned")
    public void setMentioned(String mentioned) {
        this.mentioned = mentioned;
    }

    @JsonbTransient
    @QueryParam("milestone")
    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @QueryParam("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonbTransient
    @QueryParam("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbTransient
    @QueryParam("since")
    public void setSince(String since) {
        this.since = since;
    }

    @JsonbTransient
    @QueryParam("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @JsonbTransient
    @QueryParam("state")
    public void setState(State state) {
        this.state = state;
    }
}
