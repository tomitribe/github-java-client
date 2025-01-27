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
public class Groups {

    private String description;

    private String display;

    private String groupDescription;

    private String groupId;

    private String groupName;

    private String id;

    private String name;

    private String value;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("display")
    public String getDisplay() {
        return this.display;
    }

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

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("value")
    public String getValue() {
        return this.value;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("display")
    public void setDisplay(String display) {
        this.display = display;
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

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("value")
    public void setValue(String value) {
        this.value = value;
    }
}
