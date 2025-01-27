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
public class UpdateRepositoryWebhook {

    private Boolean active;

    private List<String> addEvents;

    private Config config;

    private List<String> events;

    @JsonbTransient
    @PathParam("hook-id")
    private Integer hookId;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private List<String> removeEvents;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbProperty("active")
    public Boolean getActive() {
        return this.active;
    }

    @JsonbProperty("add_events")
    public List<String> getAddEvents() {
        return this.addEvents;
    }

    @JsonbProperty("config")
    public Config getConfig() {
        return this.config;
    }

    @JsonbProperty("events")
    public List<String> getEvents() {
        return this.events;
    }

    @JsonbTransient
    @PathParam("hook-id")
    public Integer getHookId() {
        return this.hookId;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("remove_events")
    public List<String> getRemoveEvents() {
        return this.removeEvents;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonbProperty("add_events")
    public void setAddEvents(List<String> addEvents) {
        this.addEvents = addEvents;
    }

    @JsonbProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonbProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    @JsonbTransient
    @PathParam("hook-id")
    public void setHookId(Integer hookId) {
        this.hookId = hookId;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("remove_events")
    public void setRemoveEvents(List<String> removeEvents) {
        this.removeEvents = removeEvents;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }
}
