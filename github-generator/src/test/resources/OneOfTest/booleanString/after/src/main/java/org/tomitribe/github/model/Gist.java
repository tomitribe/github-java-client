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
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.StringBooleanAdapter;
import org.tomitribe.github.gen.code.BooleanString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("Gist")
public class Gist {

    @JsonbTypeAdapter(StringBooleanAdapter.class)
    private Boolean secret;

    @JsonbProperty("secret")
    public Boolean getSecret() {
        return this.secret;
    }

    @JsonbProperty("secret")
    public void setSecret(Boolean secret) {
        this.secret = secret;
    }
}
