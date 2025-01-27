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
import java.util.Date;
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
@ComponentId("event")
public class Event {

    private Boolean _public;

    private Actor actor;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String id;

    private Actor org;

    private Payload payload;

    private Repo repo;

    private String type;

    @JsonbProperty("actor")
    public Actor getActor() {
        return this.actor;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("org")
    public Actor getOrg() {
        return this.org;
    }

    @JsonbProperty("payload")
    public Payload getPayload() {
        return this.payload;
    }

    @JsonbProperty("repo")
    public Repo getRepo() {
        return this.repo;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("public")
    public Boolean get_public() {
        return this._public;
    }

    @JsonbProperty("actor")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("org")
    public void setOrg(Actor org) {
        this.org = org;
    }

    @JsonbProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @JsonbProperty("repo")
    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("public")
    public void set_public(Boolean _public) {
        this._public = _public;
    }
}
