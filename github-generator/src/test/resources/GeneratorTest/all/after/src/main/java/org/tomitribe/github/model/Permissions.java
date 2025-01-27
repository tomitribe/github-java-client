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
public class Permissions {

    private Boolean admin;

    private Boolean canCreateRepository;

    private String checks;

    private String contents;

    private String defNotRepo;

    private String deployments;

    private String issues;

    private Boolean maintain;

    private String metadata;

    private String organizationAdministration;

    private Boolean pull;

    private String pullRequests;

    private Boolean push;

    private Boolean read;

    private String singleFile;

    private String statuses;

    private Boolean triage;

    private Boolean write;

    @JsonbProperty("admin")
    public Boolean getAdmin() {
        return this.admin;
    }

    @JsonbProperty("can_create_repository")
    public Boolean getCanCreateRepository() {
        return this.canCreateRepository;
    }

    @JsonbProperty("checks")
    public String getChecks() {
        return this.checks;
    }

    @JsonbProperty("contents")
    public String getContents() {
        return this.contents;
    }

    @JsonbProperty("def_not_a_repo")
    public String getDefNotRepo() {
        return this.defNotRepo;
    }

    @JsonbProperty("deployments")
    public String getDeployments() {
        return this.deployments;
    }

    @JsonbProperty("issues")
    public String getIssues() {
        return this.issues;
    }

    @JsonbProperty("maintain")
    public Boolean getMaintain() {
        return this.maintain;
    }

    @JsonbProperty("metadata")
    public String getMetadata() {
        return this.metadata;
    }

    @JsonbProperty("organization_administration")
    public String getOrganizationAdministration() {
        return this.organizationAdministration;
    }

    @JsonbProperty("pull")
    public Boolean getPull() {
        return this.pull;
    }

    @JsonbProperty("pull_requests")
    public String getPullRequests() {
        return this.pullRequests;
    }

    @JsonbProperty("push")
    public Boolean getPush() {
        return this.push;
    }

    @JsonbProperty("read")
    public Boolean getRead() {
        return this.read;
    }

    @JsonbProperty("single_file")
    public String getSingleFile() {
        return this.singleFile;
    }

    @JsonbProperty("statuses")
    public String getStatuses() {
        return this.statuses;
    }

    @JsonbProperty("triage")
    public Boolean getTriage() {
        return this.triage;
    }

    @JsonbProperty("write")
    public Boolean getWrite() {
        return this.write;
    }

    @JsonbProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @JsonbProperty("can_create_repository")
    public void setCanCreateRepository(Boolean canCreateRepository) {
        this.canCreateRepository = canCreateRepository;
    }

    @JsonbProperty("checks")
    public void setChecks(String checks) {
        this.checks = checks;
    }

    @JsonbProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    @JsonbProperty("def_not_a_repo")
    public void setDefNotRepo(String defNotRepo) {
        this.defNotRepo = defNotRepo;
    }

    @JsonbProperty("deployments")
    public void setDeployments(String deployments) {
        this.deployments = deployments;
    }

    @JsonbProperty("issues")
    public void setIssues(String issues) {
        this.issues = issues;
    }

    @JsonbProperty("maintain")
    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    @JsonbProperty("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @JsonbProperty("organization_administration")
    public void setOrganizationAdministration(String organizationAdministration) {
        this.organizationAdministration = organizationAdministration;
    }

    @JsonbProperty("pull")
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    @JsonbProperty("pull_requests")
    public void setPullRequests(String pullRequests) {
        this.pullRequests = pullRequests;
    }

    @JsonbProperty("push")
    public void setPush(Boolean push) {
        this.push = push;
    }

    @JsonbProperty("read")
    public void setRead(Boolean read) {
        this.read = read;
    }

    @JsonbProperty("single_file")
    public void setSingleFile(String singleFile) {
        this.singleFile = singleFile;
    }

    @JsonbProperty("statuses")
    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    @JsonbProperty("triage")
    public void setTriage(Boolean triage) {
        this.triage = triage;
    }

    @JsonbProperty("write")
    public void setWrite(Boolean write) {
        this.write = write;
    }
}
