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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Plan {

    private Integer collaborators;

    private Integer filledSeats;

    private String name;

    private Integer privateRepos;

    private Integer seats;

    private Integer space;

    @JsonbProperty("collaborators")
    public Integer getCollaborators() {
        return this.collaborators;
    }

    @JsonbProperty("filled_seats")
    public Integer getFilledSeats() {
        return this.filledSeats;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("private_repos")
    public Integer getPrivateRepos() {
        return this.privateRepos;
    }

    @JsonbProperty("seats")
    public Integer getSeats() {
        return this.seats;
    }

    @JsonbProperty("space")
    public Integer getSpace() {
        return this.space;
    }

    @JsonbProperty("collaborators")
    public void setCollaborators(Integer collaborators) {
        this.collaborators = collaborators;
    }

    @JsonbProperty("filled_seats")
    public void setFilledSeats(Integer filledSeats) {
        this.filledSeats = filledSeats;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("private_repos")
    public void setPrivateRepos(Integer privateRepos) {
        this.privateRepos = privateRepos;
    }

    @JsonbProperty("seats")
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @JsonbProperty("space")
    public void setSpace(Integer space) {
        this.space = space;
    }
}
