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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.StringBooleanAdapter;
import org.tomitribe.github.gen.code.BooleanString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OneOf {

    @JsonbTypeAdapter(StringBooleanAdapter.class)
    private Boolean _public;

    private String description;

    private String files;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("files")
    public String getFiles() {
        return this.files;
    }

    @JsonbProperty("public")
    public Boolean get_public() {
        return this._public;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("files")
    public void setFiles(String files) {
        this.files = files;
    }

    @JsonbProperty("public")
    public void set_public(Boolean _public) {
        this._public = _public;
    }
}
