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
@ComponentId("group-mapping")
public class GroupMapping {

    private String groupDescription;

    private String groupId;

    private String groupName;

    private List<Groups> groups;

    private String status;

    private String syncedAt;

    @JsonbProperty("group_description")
    public String getGroupDescription() {
        return this.groupDescription;
    }

    @JsonbProperty("group_id")
    public String getGroupId() {
        return this.groupId;
    }

    @JsonbProperty("group_name")
    public String getGroupName() {
        return this.groupName;
    }

    @JsonbProperty("groups")
    public List<Groups> getGroups() {
        return this.groups;
    }

    @JsonbProperty("status")
    public String getStatus() {
        return this.status;
    }

    @JsonbProperty("synced_at")
    public String getSyncedAt() {
        return this.syncedAt;
    }

    @JsonbProperty("group_description")
    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @JsonbProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @JsonbProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonbProperty("groups")
    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @JsonbProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonbProperty("synced_at")
    public void setSyncedAt(String syncedAt) {
        this.syncedAt = syncedAt;
    }
}
