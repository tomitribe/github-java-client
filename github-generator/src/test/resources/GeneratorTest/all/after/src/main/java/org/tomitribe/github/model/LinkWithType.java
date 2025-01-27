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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("link-with-type")
public class LinkWithType {

    private String href;

    private String type;

    @JsonbProperty("href")
    public String getHref() {
        return this.href;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
