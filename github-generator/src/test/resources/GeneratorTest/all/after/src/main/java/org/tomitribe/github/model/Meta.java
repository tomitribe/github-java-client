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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Meta {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date created;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date lastModified;

    private URI location;

    private String resourceType;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created")
    public Date getCreated() {
        return this.created;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("lastModified")
    public Date getLastModified() {
        return this.lastModified;
    }

    @JsonbProperty("location")
    public URI getLocation() {
        return this.location;
    }

    @JsonbProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    @JsonbProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonbProperty("lastModified")
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @JsonbProperty("location")
    public void setLocation(URI location) {
        this.location = location;
    }

    @JsonbProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
