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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("branch-restriction-policy")
public class BranchRestrictionPolicy {

    private List<Apps> apps;

    private URI appsUrl;

    private List<Teams> teams;

    private URI teamsUrl;

    private URI url;

    private List<Users> users;

    private URI usersUrl;

    @JsonbProperty("apps")
    public List<Apps> getApps() {
        return this.apps;
    }

    @JsonbProperty("apps_url")
    public URI getAppsUrl() {
        return this.appsUrl;
    }

    @JsonbProperty("teams")
    public List<Teams> getTeams() {
        return this.teams;
    }

    @JsonbProperty("teams_url")
    public URI getTeamsUrl() {
        return this.teamsUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("users")
    public List<Users> getUsers() {
        return this.users;
    }

    @JsonbProperty("users_url")
    public URI getUsersUrl() {
        return this.usersUrl;
    }

    @JsonbProperty("apps")
    public void setApps(List<Apps> apps) {
        this.apps = apps;
    }

    @JsonbProperty("apps_url")
    public void setAppsUrl(URI appsUrl) {
        this.appsUrl = appsUrl;
    }

    @JsonbProperty("teams")
    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    @JsonbProperty("teams_url")
    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("users")
    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @JsonbProperty("users_url")
    public void setUsersUrl(URI usersUrl) {
        this.usersUrl = usersUrl;
    }
}
