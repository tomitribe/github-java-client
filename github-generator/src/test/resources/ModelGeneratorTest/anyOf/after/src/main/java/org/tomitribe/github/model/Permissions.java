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

    private String checks;

    private String contents;

    private String deployments;

    private String issues;

    private String metadata;

    private String organizationAdministration;

    private String pullRequests;

    private String statuses;

    @JsonbProperty("checks")
    public String getChecks() {
        return this.checks;
    }

    @JsonbProperty("contents")
    public String getContents() {
        return this.contents;
    }

    @JsonbProperty("deployments")
    public String getDeployments() {
        return this.deployments;
    }

    @JsonbProperty("issues")
    public String getIssues() {
        return this.issues;
    }

    @JsonbProperty("metadata")
    public String getMetadata() {
        return this.metadata;
    }

    @JsonbProperty("organization_administration")
    public String getOrganizationAdministration() {
        return this.organizationAdministration;
    }

    @JsonbProperty("pull_requests")
    public String getPullRequests() {
        return this.pullRequests;
    }

    @JsonbProperty("statuses")
    public String getStatuses() {
        return this.statuses;
    }

    @JsonbProperty("checks")
    public void setChecks(String checks) {
        this.checks = checks;
    }

    @JsonbProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    @JsonbProperty("deployments")
    public void setDeployments(String deployments) {
        this.deployments = deployments;
    }

    @JsonbProperty("issues")
    public void setIssues(String issues) {
        this.issues = issues;
    }

    @JsonbProperty("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @JsonbProperty("organization_administration")
    public void setOrganizationAdministration(String organizationAdministration) {
        this.organizationAdministration = organizationAdministration;
    }

    @JsonbProperty("pull_requests")
    public void setPullRequests(String pullRequests) {
        this.pullRequests = pullRequests;
    }

    @JsonbProperty("statuses")
    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }
}
