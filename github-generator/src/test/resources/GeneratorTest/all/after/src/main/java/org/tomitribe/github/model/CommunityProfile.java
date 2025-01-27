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
@ComponentId("community-profile")
public class CommunityProfile {

    private String description;

    private String documentation;

    private Files files;

    private Integer healthPercentage;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("documentation")
    public String getDocumentation() {
        return this.documentation;
    }

    @JsonbProperty("files")
    public Files getFiles() {
        return this.files;
    }

    @JsonbProperty("health_percentage")
    public Integer getHealthPercentage() {
        return this.healthPercentage;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @JsonbProperty("files")
    public void setFiles(Files files) {
        this.files = files;
    }

    @JsonbProperty("health_percentage")
    public void setHealthPercentage(Integer healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
