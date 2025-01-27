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
@ComponentId("import")
public class _import {

    private Integer authorsCount;

    private URI authorsUrl;

    private Integer commitCount;

    private String errorMessage;

    private String failedStep;

    private Boolean hasLargeFiles;

    private URI htmlUrl;

    private Integer importPercent;

    private Integer largeFilesCount;

    private Integer largeFilesSize;

    private String message;

    private List<ProjectChoices> projectChoices;

    private Integer pushPercent;

    private URI repositoryUrl;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    private String statusText;

    private String svcRoot;

    private String svnRoot;

    private String tfvcProject;

    private URI url;

    private String useLfs;

    private String vcs;

    private String vcsUrl;

    @JsonbProperty("authors_count")
    public Integer getAuthorsCount() {
        return this.authorsCount;
    }

    @JsonbProperty("authors_url")
    public URI getAuthorsUrl() {
        return this.authorsUrl;
    }

    @JsonbProperty("commit_count")
    public Integer getCommitCount() {
        return this.commitCount;
    }

    @JsonbProperty("error_message")
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @JsonbProperty("failed_step")
    public String getFailedStep() {
        return this.failedStep;
    }

    @JsonbProperty("has_large_files")
    public Boolean getHasLargeFiles() {
        return this.hasLargeFiles;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("import_percent")
    public Integer getImportPercent() {
        return this.importPercent;
    }

    @JsonbProperty("large_files_count")
    public Integer getLargeFilesCount() {
        return this.largeFilesCount;
    }

    @JsonbProperty("large_files_size")
    public Integer getLargeFilesSize() {
        return this.largeFilesSize;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("project_choices")
    public List<ProjectChoices> getProjectChoices() {
        return this.projectChoices;
    }

    @JsonbProperty("push_percent")
    public Integer getPushPercent() {
        return this.pushPercent;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("status_text")
    public String getStatusText() {
        return this.statusText;
    }

    @JsonbProperty("svc_root")
    public String getSvcRoot() {
        return this.svcRoot;
    }

    @JsonbProperty("svn_root")
    public String getSvnRoot() {
        return this.svnRoot;
    }

    @JsonbProperty("tfvc_project")
    public String getTfvcProject() {
        return this.tfvcProject;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("use_lfs")
    public String getUseLfs() {
        return this.useLfs;
    }

    @JsonbProperty("vcs")
    public String getVcs() {
        return this.vcs;
    }

    @JsonbProperty("vcs_url")
    public String getVcsUrl() {
        return this.vcsUrl;
    }

    @JsonbProperty("authors_count")
    public void setAuthorsCount(Integer authorsCount) {
        this.authorsCount = authorsCount;
    }

    @JsonbProperty("authors_url")
    public void setAuthorsUrl(URI authorsUrl) {
        this.authorsUrl = authorsUrl;
    }

    @JsonbProperty("commit_count")
    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    @JsonbProperty("error_message")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonbProperty("failed_step")
    public void setFailedStep(String failedStep) {
        this.failedStep = failedStep;
    }

    @JsonbProperty("has_large_files")
    public void setHasLargeFiles(Boolean hasLargeFiles) {
        this.hasLargeFiles = hasLargeFiles;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("import_percent")
    public void setImportPercent(Integer importPercent) {
        this.importPercent = importPercent;
    }

    @JsonbProperty("large_files_count")
    public void setLargeFilesCount(Integer largeFilesCount) {
        this.largeFilesCount = largeFilesCount;
    }

    @JsonbProperty("large_files_size")
    public void setLargeFilesSize(Integer largeFilesSize) {
        this.largeFilesSize = largeFilesSize;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("project_choices")
    public void setProjectChoices(List<ProjectChoices> projectChoices) {
        this.projectChoices = projectChoices;
    }

    @JsonbProperty("push_percent")
    public void setPushPercent(Integer pushPercent) {
        this.pushPercent = pushPercent;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonbProperty("status_text")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    @JsonbProperty("svc_root")
    public void setSvcRoot(String svcRoot) {
        this.svcRoot = svcRoot;
    }

    @JsonbProperty("svn_root")
    public void setSvnRoot(String svnRoot) {
        this.svnRoot = svnRoot;
    }

    @JsonbProperty("tfvc_project")
    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("use_lfs")
    public void setUseLfs(String useLfs) {
        this.useLfs = useLfs;
    }

    @JsonbProperty("vcs")
    public void setVcs(String vcs) {
        this.vcs = vcs;
    }

    @JsonbProperty("vcs_url")
    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    public enum Status {

        AUTH("auth"),
        ERROR("error"),
        NONE("none"),
        DETECTING("detecting"),
        CHOOSE("choose"),
        AUTH_FAILED("auth_failed"),
        IMPORTING("importing"),
        MAPPING("mapping"),
        WAITING_TO_PUSH("waiting_to_push"),
        PUSHING("pushing"),
        COMPLETE("complete"),
        SETUP("setup"),
        UNKNOWN("unknown"),
        DETECTION_FOUND_MULTIPLE("detection_found_multiple"),
        DETECTION_FOUND_NOTHING("detection_found_nothing"),
        DETECTION_NEEDS_AUTH("detection_needs_auth");

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
