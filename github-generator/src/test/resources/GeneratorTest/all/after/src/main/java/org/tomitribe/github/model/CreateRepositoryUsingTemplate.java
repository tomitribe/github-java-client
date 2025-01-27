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
public class CreateRepositoryUsingTemplate {

    private Boolean _private;

    private String description;

    private String name;

    private String owner;

    @JsonbTransient
    @PathParam("template_owner")
    private String templateOwner;

    @JsonbTransient
    @PathParam("template_repo")
    private String templateRepo;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("template_owner")
    public String getTemplateOwner() {
        return this.templateOwner;
    }

    @JsonbTransient
    @PathParam("template_repo")
    public String getTemplateRepo() {
        return this.templateRepo;
    }

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("template_owner")
    public void setTemplateOwner(String templateOwner) {
        this.templateOwner = templateOwner;
    }

    @JsonbTransient
    @PathParam("template_repo")
    public void setTemplateRepo(String templateRepo) {
        this.templateRepo = templateRepo;
    }

    @JsonbProperty("private")
    public void set_private(Boolean _private) {
        this._private = _private;
    }
}
