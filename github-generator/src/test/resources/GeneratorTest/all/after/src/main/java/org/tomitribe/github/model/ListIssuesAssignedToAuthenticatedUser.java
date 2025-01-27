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
public class ListIssuesAssignedToAuthenticatedUser {

    @JsonbTransient
    @QueryParam("collab")
    private Boolean collab;

    @JsonbTransient
    @QueryParam("direction")
    private Direction direction;

    @JsonbTransient
    @QueryParam("filter")
    @JsonbTypeAdapter(FilterAdapter.class)
    private Filter filter;

    @JsonbTransient
    @QueryParam("labels")
    private String labels;

    @JsonbTransient
    @QueryParam("orgs")
    private Boolean orgs;

    @JsonbTransient
    @QueryParam("owned")
    private Boolean owned;

    @JsonbTransient
    @QueryParam("pulls")
    private Boolean pulls;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("sort")
    @JsonbTypeAdapter(SortAdapter.class)
    private Sort sort;

    @JsonbTransient
    @QueryParam("state")
    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    @JsonbTransient
    @QueryParam("collab")
    public Boolean getCollab() {
        return this.collab;
    }

    @JsonbTransient
    @QueryParam("direction")
    public Direction getDirection() {
        return this.direction;
    }

    @JsonbTypeAdapter(FilterAdapter.class)
    @JsonbTransient
    @QueryParam("filter")
    public Filter getFilter() {
        return this.filter;
    }

    @JsonbTransient
    @QueryParam("labels")
    public String getLabels() {
        return this.labels;
    }

    @JsonbTransient
    @QueryParam("orgs")
    public Boolean getOrgs() {
        return this.orgs;
    }

    @JsonbTransient
    @QueryParam("owned")
    public Boolean getOwned() {
        return this.owned;
    }

    @JsonbTransient
    @QueryParam("pulls")
    public Boolean getPulls() {
        return this.pulls;
    }

    @JsonbTransient
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTypeAdapter(SortAdapter.class)
    @JsonbTransient
    @QueryParam("sort")
    public Sort getSort() {
        return this.sort;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbTransient
    @QueryParam("state")
    public State getState() {
        return this.state;
    }

    @JsonbTransient
    @QueryParam("collab")
    public void setCollab(Boolean collab) {
        this.collab = collab;
    }

    @JsonbTransient
    @QueryParam("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @JsonbTransient
    @QueryParam("filter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @JsonbTransient
    @QueryParam("labels")
    public void setLabels(String labels) {
        this.labels = labels;
    }

    @JsonbTransient
    @QueryParam("orgs")
    public void setOrgs(Boolean orgs) {
        this.orgs = orgs;
    }

    @JsonbTransient
    @QueryParam("owned")
    public void setOwned(Boolean owned) {
        this.owned = owned;
    }

    @JsonbTransient
    @QueryParam("pulls")
    public void setPulls(Boolean pulls) {
        this.pulls = pulls;
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

    public enum Filter {

        ASSIGNED("assigned"), CREATED("created"), MENTIONED("mentioned"), SUBSCRIBED("subscribed"), ALL("all");

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

    public enum Sort {

        CREATED("created"), UPDATED("updated"), COMMENTS("comments");

        private final String name;

        Sort(final String name) {
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

    public static class SortAdapter extends EnumAdapter<Sort> {

        public SortAdapter() {
            super(Sort.class);
        }
    }

    public enum State {

        OPEN("open"), CLOSED("closed"), ALL("all");

        private final String name;

        State(final String name) {
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

    public static class StateAdapter extends EnumAdapter<State> {

        public StateAdapter() {
            super(State.class);
        }
    }
}
