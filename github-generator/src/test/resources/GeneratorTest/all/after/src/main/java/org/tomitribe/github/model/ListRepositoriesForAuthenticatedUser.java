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
public class ListRepositoriesForAuthenticatedUser {

    @JsonbTransient
    @QueryParam("affiliation")
    private String affiliation;

    @JsonbTransient
    @QueryParam("before")
    private String before;

    @JsonbTransient
    @QueryParam("direction")
    @JsonbTypeAdapter(DirectionAdapter.class)
    private Direction direction;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("sort")
    @JsonbTypeAdapter(SortAdapter.class)
    private Sort sort;

    @JsonbTransient
    @QueryParam("type")
    @JsonbTypeAdapter(TypeAdapter.class)
    private Type type;

    @JsonbTransient
    @QueryParam("visibility")
    @JsonbTypeAdapter(VisibilityAdapter.class)
    private Visibility visibility;

    @JsonbTransient
    @QueryParam("affiliation")
    public String getAffiliation() {
        return this.affiliation;
    }

    @JsonbTransient
    @QueryParam("before")
    public String getBefore() {
        return this.before;
    }

    @JsonbTypeAdapter(DirectionAdapter.class)
    @JsonbTransient
    @QueryParam("direction")
    public Direction getDirection() {
        return this.direction;
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

    @JsonbTypeAdapter(TypeAdapter.class)
    @JsonbTransient
    @QueryParam("type")
    public Type getType() {
        return this.type;
    }

    @JsonbTypeAdapter(VisibilityAdapter.class)
    @JsonbTransient
    @QueryParam("visibility")
    public Visibility getVisibility() {
        return this.visibility;
    }

    @JsonbTransient
    @QueryParam("affiliation")
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @JsonbTransient
    @QueryParam("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonbTransient
    @QueryParam("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
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
    @QueryParam("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonbTransient
    @QueryParam("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public enum Direction {

        ASC("asc"), DESC("desc");

        private final String name;

        Direction(final String name) {
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

    public static class DirectionAdapter extends EnumAdapter<Direction> {

        public DirectionAdapter() {
            super(Direction.class);
        }
    }

    public enum Sort {

        CREATED("created"), UPDATED("updated"), PUSHED("pushed"), FULL_NAME("full_name");

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

    public enum Type {

        ALL("all"), OWNER("owner"), PUBLIC("public"), PRIVATE("private"), MEMBER("member");

        private final String name;

        Type(final String name) {
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

    public static class TypeAdapter extends EnumAdapter<Type> {

        public TypeAdapter() {
            super(Type.class);
        }
    }

    public enum Visibility {

        ALL("all"), PUBLIC("public"), PRIVATE("private");

        private final String name;

        Visibility(final String name) {
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

    public static class VisibilityAdapter extends EnumAdapter<Visibility> {

        public VisibilityAdapter() {
            super(Visibility.class);
        }
    }
}
