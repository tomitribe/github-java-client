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
import java.net.URI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DismissalRestrictions {

    private List<String> teams;

    private URI teamsUrl;

    private URI url;

    private List<String> users;

    private URI usersUrl;

    @JsonbProperty("teams")
    public List<Team> getTeams() {
        return this.teams;
    }

    @JsonbProperty("teams_url")
    public String getTeamsUrl() {
        return this.teamsUrl;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("users")
    public List<SimpleUser> getUsers() {
        return this.users;
    }

    @JsonbProperty("users_url")
    public String getUsersUrl() {
        return this.usersUrl;
    }

    @JsonbProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @JsonbProperty("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("users")
    public void setUsers(List<SimpleUser> users) {
        this.users = users;
    }

    @JsonbProperty("users_url")
    public void setUsersUrl(String usersUrl) {
        this.usersUrl = usersUrl;
    }
}
