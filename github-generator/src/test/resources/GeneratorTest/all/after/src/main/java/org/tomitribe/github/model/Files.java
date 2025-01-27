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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Files {

    private Integer additions;

    private String blobUrl;

    private Integer changes;

    private CodeOfConductSimple codeOfConduct;

    private String contentsUrl;

    private CommunityHealthFile contributing;

    private Integer deletions;

    private String filename;

    private CommunityHealthFile issueTemplate;

    private LicenseSimple license;

    private String patch;

    private String previousFilename;

    private CommunityHealthFile pullRequestTemplate;

    private String rawUrl;

    private CommunityHealthFile readme;

    private String sha;

    private String status;

    @JsonbProperty("additions")
    public Integer getAdditions() {
        return this.additions;
    }

    @JsonbProperty("blob_url")
    public String getBlobUrl() {
        return this.blobUrl;
    }

    @JsonbProperty("changes")
    public Integer getChanges() {
        return this.changes;
    }

    @JsonbProperty("code_of_conduct")
    public CodeOfConductSimple getCodeOfConduct() {
        return this.codeOfConduct;
    }

    @JsonbProperty("contents_url")
    public String getContentsUrl() {
        return this.contentsUrl;
    }

    @JsonbProperty("contributing")
    public CommunityHealthFile getContributing() {
        return this.contributing;
    }

    @JsonbProperty("deletions")
    public Integer getDeletions() {
        return this.deletions;
    }

    @JsonbProperty("filename")
    public String getFilename() {
        return this.filename;
    }

    @JsonbProperty("issue_template")
    public CommunityHealthFile getIssueTemplate() {
        return this.issueTemplate;
    }

    @JsonbProperty("license")
    public LicenseSimple getLicense() {
        return this.license;
    }

    @JsonbProperty("patch")
    public String getPatch() {
        return this.patch;
    }

    @JsonbProperty("previous_filename")
    public String getPreviousFilename() {
        return this.previousFilename;
    }

    @JsonbProperty("pull_request_template")
    public CommunityHealthFile getPullRequestTemplate() {
        return this.pullRequestTemplate;
    }

    @JsonbProperty("raw_url")
    public String getRawUrl() {
        return this.rawUrl;
    }

    @JsonbProperty("readme")
    public CommunityHealthFile getReadme() {
        return this.readme;
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
    public void setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
    }

    @JsonbProperty("changes")
    public void setChanges(Integer changes) {
        this.changes = changes;
    }

    @JsonbProperty("code_of_conduct")
    public void setCodeOfConduct(CodeOfConductSimple codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    @JsonbProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    @JsonbProperty("contributing")
    public void setContributing(CommunityHealthFile contributing) {
        this.contributing = contributing;
    }

    @JsonbProperty("deletions")
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @JsonbProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonbProperty("issue_template")
    public void setIssueTemplate(CommunityHealthFile issueTemplate) {
        this.issueTemplate = issueTemplate;
    }

    @JsonbProperty("license")
    public void setLicense(LicenseSimple license) {
        this.license = license;
    }

    @JsonbProperty("patch")
    public void setPatch(String patch) {
        this.patch = patch;
    }

    @JsonbProperty("previous_filename")
    public void setPreviousFilename(String previousFilename) {
        this.previousFilename = previousFilename;
    }

    @JsonbProperty("pull_request_template")
    public void setPullRequestTemplate(CommunityHealthFile pullRequestTemplate) {
        this.pullRequestTemplate = pullRequestTemplate;
    }

    @JsonbProperty("raw_url")
    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    @JsonbProperty("readme")
    public void setReadme(CommunityHealthFile readme) {
        this.readme = readme;
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
