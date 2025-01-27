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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("organization-invitation")
public class OrganizationInvitation {

    private String createdAt;

    private String email;

    private Integer id;

    private String invitationTeamUrl;

    private String invitationTeamsUrl;

    private SimpleUser inviter;

    private String login;

    private String nodeId;

    private String role;

    private Integer teamCount;

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("invitation_team_url")
    public String getInvitationTeamUrl() {
        return this.invitationTeamUrl;
    }

    @JsonbProperty("invitation_teams_url")
    public String getInvitationTeamsUrl() {
        return this.invitationTeamsUrl;
    }

    @JsonbProperty("inviter")
    public SimpleUser getInviter() {
        return this.inviter;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("role")
    public String getRole() {
        return this.role;
    }

    @JsonbProperty("team_count")
    public Integer getTeamCount() {
        return this.teamCount;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("invitation_team_url")
    public void setInvitationTeamUrl(String invitationTeamUrl) {
        this.invitationTeamUrl = invitationTeamUrl;
    }

    @JsonbProperty("invitation_teams_url")
    public void setInvitationTeamsUrl(String invitationTeamsUrl) {
        this.invitationTeamsUrl = invitationTeamsUrl;
    }

    @JsonbProperty("inviter")
    public void setInviter(SimpleUser inviter) {
        this.inviter = inviter;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonbProperty("team_count")
    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }
}
