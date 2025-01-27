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
@ComponentId("status")
public class Status {

    private String avatarUrl;

    private String context;

    private String createdAt;

    private SimpleUser creator;

    private String description;

    private Integer id;

    private String nodeId;

    private String state;

    private String targetUrl;

    private String updatedAt;

    private String url;

    @JsonbProperty("avatar_url")
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("context")
    public String getContext() {
        return this.context;
    }

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("creator")
    public SimpleUser getCreator() {
        return this.creator;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("target_url")
    public String getTargetUrl() {
        return this.targetUrl;
    }

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("creator")
    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
