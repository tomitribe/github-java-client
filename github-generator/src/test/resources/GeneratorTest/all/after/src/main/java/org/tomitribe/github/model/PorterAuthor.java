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
@ComponentId("porter-author")
public class PorterAuthor {

    private String email;

    private Integer id;

    private URI importUrl;

    private String name;

    private String remoteId;

    private String remoteName;

    private URI url;

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("import_url")
    public URI getImportUrl() {
        return this.importUrl;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("remote_id")
    public String getRemoteId() {
        return this.remoteId;
    }

    @JsonbProperty("remote_name")
    public String getRemoteName() {
        return this.remoteName;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("import_url")
    public void setImportUrl(URI importUrl) {
        this.importUrl = importUrl;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("remote_id")
    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    @JsonbProperty("remote_name")
    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
