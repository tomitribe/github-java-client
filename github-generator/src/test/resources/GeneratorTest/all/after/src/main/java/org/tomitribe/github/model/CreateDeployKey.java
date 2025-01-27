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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateDeployKey {

    private String key;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private Boolean readOnly;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String title;

    @JsonbProperty("key")
    public String getKey() {
        return this.key;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("read_only")
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("read_only")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
}
