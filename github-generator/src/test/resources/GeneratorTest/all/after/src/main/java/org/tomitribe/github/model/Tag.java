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
@ComponentId("tag")
public class Tag {

    private Commit commit;

    private String name;

    private String nodeId;

    private URI tarballUrl;

    private URI zipballUrl;

    @JsonbProperty("commit")
    public Commit getCommit() {
        return this.commit;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("tarball_url")
    public URI getTarballUrl() {
        return this.tarballUrl;
    }

    @JsonbProperty("zipball_url")
    public URI getZipballUrl() {
        return this.zipballUrl;
    }

    @JsonbProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("tarball_url")
    public void setTarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    @JsonbProperty("zipball_url")
    public void setZipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
    }
}
