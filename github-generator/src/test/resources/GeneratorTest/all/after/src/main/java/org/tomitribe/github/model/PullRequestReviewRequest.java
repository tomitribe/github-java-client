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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("pull-request-review-request")
public class PullRequestReviewRequest {

    private List<Teams> teams;

    private List<Users> users;

    @JsonbProperty("teams")
    public List<Teams> getTeams() {
        return this.teams;
    }

    @JsonbProperty("users")
    public List<Users> getUsers() {
        return this.users;
    }

    @JsonbProperty("teams")
    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    @JsonbProperty("users")
    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
