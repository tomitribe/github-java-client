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
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalProperties {

    private Map<String, Boolean> flags;

    private Map<String, String> inputs;

    private Map<String, Long> language;

    private String ref;

    @JsonbProperty("flags")
    public Map<String, Boolean> getFlags() {
        return this.flags;
    }

    @JsonbProperty("inputs")
    public Map<String, String> getInputs() {
        return this.inputs;
    }

    @JsonbProperty("language")
    public Map<String, Long> getLanguage() {
        return this.language;
    }

    @JsonbProperty("ref")
    public String getRef() {
        return this.ref;
    }

    @JsonbProperty("flags")
    public void setFlags(Map<String,Boolean> flags) {
        this.flags = flags;
    }

    @JsonbProperty("inputs")
    public void setInputs(Map<String,String> inputs) {
        this.inputs = inputs;
    }

    @JsonbProperty("language")
    public void setLanguage(Map<String,Long> language) {
        this.language = language;
    }

    @JsonbProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }
}
