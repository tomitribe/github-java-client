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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListJobsForWorkflowRun {

    @JsonbTransient
    @QueryParam("filter")
    @JsonbTypeAdapter(FilterAdapter.class)
    private Filter filter;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("run-id")
    private Integer runId;

    @JsonbTypeAdapter(FilterAdapter.class)
    @JsonbTransient
    @QueryParam("filter")
    public Filter getFilter() {
        return this.filter;
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

    @JsonbTransient
    @PathParam("run-id")
    public Integer getRunId() {
        return this.runId;
    }

    @JsonbTransient
    @QueryParam("filter")
    public void setFilter(Filter filter) {
        this.filter = filter;
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

    @JsonbTransient
    @PathParam("run-id")
    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public enum Filter {

        LATEST("latest"), ALL("all");

        private final String name;

        Filter(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class FilterAdapter extends EnumAdapter<Filter> {

        public FilterAdapter() {
            super(Filter.class);
        }
    }
}
