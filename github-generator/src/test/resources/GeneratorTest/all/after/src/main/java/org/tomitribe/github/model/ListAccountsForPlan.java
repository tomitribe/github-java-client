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
public class ListAccountsForPlan {

    @JsonbTransient
    @QueryParam("direction")
    @JsonbTypeAdapter(DirectionAdapter.class)
    private Direction direction;

    @JsonbTransient
    @PathParam("plan_id")
    private Integer planId;

    @JsonbTransient
    @QueryParam("sort")
    private Sort sort;

    @JsonbTypeAdapter(DirectionAdapter.class)
    @JsonbTransient
    @QueryParam("direction")
    public Direction getDirection() {
        return this.direction;
    }

    @JsonbTransient
    @PathParam("plan_id")
    public Integer getPlanId() {
        return this.planId;
    }

    @JsonbTransient
    @QueryParam("sort")
    public Sort getSort() {
        return this.sort;
    }

    @JsonbTransient
    @QueryParam("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @JsonbTransient
    @PathParam("plan_id")
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @JsonbTransient
    @QueryParam("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
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
}
