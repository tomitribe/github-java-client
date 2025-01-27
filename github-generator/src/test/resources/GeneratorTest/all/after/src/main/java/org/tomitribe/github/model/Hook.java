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
@ComponentId("hook")
public class Hook {

    private Boolean active;

    private Config config;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private List<String> events;

    private Integer id;

    private HookResponse lastResponse;

    private String name;

    private URI pingUrl;

    private URI testUrl;

    private String type;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("active")
    public Boolean getActive() {
        return this.active;
    }

    @JsonbProperty("config")
    public Config getConfig() {
        return this.config;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("events")
    public List<String> getEvents() {
        return this.events;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("last_response")
    public HookResponse getLastResponse() {
        return this.lastResponse;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("ping_url")
    public URI getPingUrl() {
        return this.pingUrl;
    }

    @JsonbProperty("test_url")
    public URI getTestUrl() {
        return this.testUrl;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonbProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("last_response")
    public void setLastResponse(HookResponse lastResponse) {
        this.lastResponse = lastResponse;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("ping_url")
    public void setPingUrl(URI pingUrl) {
        this.pingUrl = pingUrl;
    }

    @JsonbProperty("test_url")
    public void setTestUrl(URI testUrl) {
        this.testUrl = testUrl;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
