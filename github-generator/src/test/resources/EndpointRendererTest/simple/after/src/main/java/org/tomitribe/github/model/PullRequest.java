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
import java.net.URI;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.InstantAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PullRequest {

    private URI diffUrl;

    private URI htmlUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant mergedAt;

    private URI patchUrl;

    private URI url;

    @JsonbProperty("diff_url")
    public URI getDiffUrl() {
        return this.diffUrl;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("merged_at")
    public Instant getMergedAt() {
        return this.mergedAt;
    }

    @JsonbProperty("patch_url")
    public URI getPatchUrl() {
        return this.patchUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("diff_url")
    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("merged_at")
    public void setMergedAt(Instant mergedAt) {
        this.mergedAt = mergedAt;
    }

    @JsonbProperty("patch_url")
    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
