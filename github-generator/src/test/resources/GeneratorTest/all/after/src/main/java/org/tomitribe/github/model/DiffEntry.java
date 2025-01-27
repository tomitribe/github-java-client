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
@ComponentId("diff-entry")
public class DiffEntry {

    private Integer additions;

    private URI blobUrl;

    private Integer changes;

    private URI contentsUrl;

    private Integer deletions;

    private String filename;

    private String patch;

    private String previousFilename;

    private URI rawUrl;

    private String sha;

    private String status;

    @JsonbProperty("additions")
    public Integer getAdditions() {
        return this.additions;
    }

    @JsonbProperty("blob_url")
    public URI getBlobUrl() {
        return this.blobUrl;
    }

    @JsonbProperty("changes")
    public Integer getChanges() {
        return this.changes;
    }

    @JsonbProperty("contents_url")
    public URI getContentsUrl() {
        return this.contentsUrl;
    }

    @JsonbProperty("deletions")
    public Integer getDeletions() {
        return this.deletions;
    }

    @JsonbProperty("filename")
    public String getFilename() {
        return this.filename;
    }

    @JsonbProperty("patch")
    public String getPatch() {
        return this.patch;
    }

    @JsonbProperty("previous_filename")
    public String getPreviousFilename() {
        return this.previousFilename;
    }

    @JsonbProperty("raw_url")
    public URI getRawUrl() {
        return this.rawUrl;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("status")
    public String getStatus() {
        return this.status;
    }

    @JsonbProperty("additions")
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    @JsonbProperty("blob_url")
    public void setBlobUrl(URI blobUrl) {
        this.blobUrl = blobUrl;
    }

    @JsonbProperty("changes")
    public void setChanges(Integer changes) {
        this.changes = changes;
    }

    @JsonbProperty("contents_url")
    public void setContentsUrl(URI contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    @JsonbProperty("deletions")
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @JsonbProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonbProperty("patch")
    public void setPatch(String patch) {
        this.patch = patch;
    }

    @JsonbProperty("previous_filename")
    public void setPreviousFilename(String previousFilename) {
        this.previousFilename = previousFilename;
    }

    @JsonbProperty("raw_url")
    public void setRawUrl(URI rawUrl) {
        this.rawUrl = rawUrl;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
