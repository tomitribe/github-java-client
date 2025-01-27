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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("commit-comparison")
public class CommitComparison {

    private Integer aheadBy;

    private Commit baseCommit;

    private Integer behindBy;

    private List<Commit> commits;

    private URI diffUrl;

    private List<DiffEntry> files;

    private URI htmlUrl;

    private Commit mergeBaseCommit;

    private URI patchUrl;

    private URI permalinkUrl;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    private Integer totalCommits;

    private URI url;

    @JsonbProperty("ahead_by")
    public Integer getAheadBy() {
        return this.aheadBy;
    }

    @JsonbProperty("base_commit")
    public Commit getBaseCommit() {
        return this.baseCommit;
    }

    @JsonbProperty("behind_by")
    public Integer getBehindBy() {
        return this.behindBy;
    }

    @JsonbProperty("commits")
    public List<Commit> getCommits() {
        return this.commits;
    }

    @JsonbProperty("diff_url")
    public URI getDiffUrl() {
        return this.diffUrl;
    }

    @JsonbProperty("files")
    public List<DiffEntry> getFiles() {
        return this.files;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("merge_base_commit")
    public Commit getMergeBaseCommit() {
        return this.mergeBaseCommit;
    }

    @JsonbProperty("patch_url")
    public URI getPatchUrl() {
        return this.patchUrl;
    }

    @JsonbProperty("permalink_url")
    public URI getPermalinkUrl() {
        return this.permalinkUrl;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("total_commits")
    public Integer getTotalCommits() {
        return this.totalCommits;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("ahead_by")
    public void setAheadBy(Integer aheadBy) {
        this.aheadBy = aheadBy;
    }

    @JsonbProperty("base_commit")
    public void setBaseCommit(Commit baseCommit) {
        this.baseCommit = baseCommit;
    }

    @JsonbProperty("behind_by")
    public void setBehindBy(Integer behindBy) {
        this.behindBy = behindBy;
    }

    @JsonbProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    @JsonbProperty("diff_url")
    public void setDiffUrl(URI diffUrl) {
        this.diffUrl = diffUrl;
    }

    @JsonbProperty("files")
    public void setFiles(List<DiffEntry> files) {
        this.files = files;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("merge_base_commit")
    public void setMergeBaseCommit(Commit mergeBaseCommit) {
        this.mergeBaseCommit = mergeBaseCommit;
    }

    @JsonbProperty("patch_url")
    public void setPatchUrl(URI patchUrl) {
        this.patchUrl = patchUrl;
    }

    @JsonbProperty("permalink_url")
    public void setPermalinkUrl(URI permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonbProperty("total_commits")
    public void setTotalCommits(Integer totalCommits) {
        this.totalCommits = totalCommits;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum Status {

        DIVERGED("diverged"), AHEAD("ahead"), BEHIND("behind"), IDENTICAL("identical");

        private final String name;

        Status(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class StatusAdapter extends EnumAdapter<Status> {

        public StatusAdapter() {
            super(Status.class);
        }
    }
}
