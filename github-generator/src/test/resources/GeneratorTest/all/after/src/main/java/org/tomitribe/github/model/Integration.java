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
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("integration")
public class Integration {

    private String clientId;

    private String clientSecret;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String description;

    private List<String> events;

    private URI externalUrl;

    private URI htmlUrl;

    private Integer id;

    private Integer installationsCount;

    private String name;

    private String nodeId;

    private SimpleUser owner;

    private String pem;

    private Map<String, String> permissions;

    private String slug;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private String webhookSecret;

    @JsonbProperty("client_id")
    public String getClientId() {
        return this.clientId;
    }

    @JsonbProperty("client_secret")
    public String getClientSecret() {
        return this.clientSecret;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("events")
    public List<String> getEvents() {
        return this.events;
    }

    @JsonbProperty("external_url")
    public URI getExternalUrl() {
        return this.externalUrl;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("installations_count")
    public Integer getInstallationsCount() {
        return this.installationsCount;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("owner")
    public SimpleUser getOwner() {
        return this.owner;
    }

    @JsonbProperty("pem")
    public String getPem() {
        return this.pem;
    }

    @JsonbProperty("permissions")
    public Map<String, String> getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("slug")
    public String getSlug() {
        return this.slug;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("webhook_secret")
    public String getWebhookSecret() {
        return this.webhookSecret;
    }

    @JsonbProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonbProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    @JsonbProperty("external_url")
    public void setExternalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("installations_count")
    public void setInstallationsCount(Integer installationsCount) {
        this.installationsCount = installationsCount;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("owner")
    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    @JsonbProperty("pem")
    public void setPem(String pem) {
        this.pem = pem;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Map<String, String> permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("webhook_secret")
    public void setWebhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
    }
}
