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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.PathParam;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrUpdateIdPGroupConnectionsLegacy {

    private List<Groups> groups;

    private String syncedAt;

    @JsonbTransient
    @PathParam("team-id")
    private Integer teamId;

    @JsonbProperty("groups")
    public List<Groups> getGroups() {
        return this.groups;
    }

    @JsonbProperty("synced_at")
    public String getSyncedAt() {
        return this.syncedAt;
    }

    @JsonbTransient
    @PathParam("team-id")
    public Integer getTeamId() {
        return this.teamId;
    }

    @JsonbProperty("groups")
    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @JsonbProperty("synced_at")
    public void setSyncedAt(String syncedAt) {
        this.syncedAt = syncedAt;
    }

    @JsonbTransient
    @PathParam("team-id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
