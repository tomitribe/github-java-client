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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class App {

    private String clientId;

    private String name;

    private URI url;

    @JsonbProperty("client_id")
    public String getClientId() {
        return this.clientId;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
