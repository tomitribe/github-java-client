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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("scim-error")
public class ScimError {

    private String detail;

    private String documentationUrl;

    private String message;

    private List<String> schemas;

    private String scimType;

    private Integer status;

    @JsonbProperty("detail")
    public String getDetail() {
        return this.detail;
    }

    @JsonbProperty("documentation_url")
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("schemas")
    public List<String> getSchemas() {
        return this.schemas;
    }

    @JsonbProperty("scimType")
    public String getScimType() {
        return this.scimType;
    }

    @JsonbProperty("status")
    public Integer getStatus() {
        return this.status;
    }

    @JsonbProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @JsonbProperty("documentation_url")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("schemas")
    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @JsonbProperty("scimType")
    public void setScimType(String scimType) {
        this.scimType = scimType;
    }

    @JsonbProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }
}
