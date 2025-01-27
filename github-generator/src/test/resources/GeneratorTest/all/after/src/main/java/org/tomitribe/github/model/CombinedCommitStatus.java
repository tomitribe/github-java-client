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
@ComponentId("combined-commit-status")
public class CombinedCommitStatus {

    private URI commitUrl;

    private MinimalRepository repository;

    private String sha;

    private String state;

    private List<SimpleCommitStatus> statuses;

    private Integer totalCount;

    private URI url;

    @JsonbProperty("commit_url")
    public URI getCommitUrl() {
        return this.commitUrl;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("statuses")
    public List<SimpleCommitStatus> getStatuses() {
        return this.statuses;
    }

    @JsonbProperty("total_count")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("commit_url")
    public void setCommitUrl(URI commitUrl) {
        this.commitUrl = commitUrl;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("statuses")
    public void setStatuses(List<SimpleCommitStatus> statuses) {
        this.statuses = statuses;
    }

    @JsonbProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
