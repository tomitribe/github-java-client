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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("code-of-conduct-simple")
public class CodeOfConductSimple {

    private URI htmlUrl;

    private String key;

    private String name;

    private URI url;

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("key")
    public String getKey() {
        return this.key;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("key")
    public void setKey(String key) {
        this.key = key;
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
