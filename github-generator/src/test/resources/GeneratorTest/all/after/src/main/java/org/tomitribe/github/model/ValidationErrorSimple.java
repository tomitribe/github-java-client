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
@ComponentId("validation-error-simple")
public class ValidationErrorSimple {

    private String documentationUrl;

    private List<String> errors;

    private String message;

    @JsonbProperty("documentation_url")
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    @JsonbProperty("errors")
    public List<String> getErrors() {
        return this.errors;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("documentation_url")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    @JsonbProperty("errors")
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }
}
