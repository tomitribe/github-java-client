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
public class ListRepositoriesStarredByUser {

    @JsonbTransient
    @QueryParam("direction")
    private Direction direction;

    @JsonbTransient
    @QueryParam("sort")
    private Sort sort;

    @JsonbTransient
    @PathParam("username")
    private String username;

    @JsonbTransient
    @QueryParam("direction")
    public Direction getDirection() {
        return this.direction;
    }

    @JsonbTransient
    @QueryParam("sort")
    public Sort getSort() {
        return this.sort;
    }

    @JsonbTransient
    @PathParam("username")
    public String getUsername() {
        return this.username;
    }

    @JsonbTransient
    @QueryParam("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @JsonbTransient
    @QueryParam("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @JsonbTransient
    @PathParam("username")
    public void setUsername(String username) {
        this.username = username;
    }
}
