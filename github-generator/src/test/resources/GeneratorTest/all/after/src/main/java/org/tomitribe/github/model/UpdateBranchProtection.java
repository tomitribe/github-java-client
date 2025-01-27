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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBranchProtection {

    private Boolean allowDeletions;

    private Boolean allowForcePushes;

    @JsonbTransient
    @PathParam("branch")
    private String branch;

    private Boolean enforceAdmins;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private Boolean requiredLinearHistory;

    private RequiredPullRequestReviews requiredPullRequestReviews;

    private RequiredStatusChecks requiredStatusChecks;

    private Restrictions restrictions;

    @JsonbProperty("allow_deletions")
    public Boolean getAllowDeletions() {
        return this.allowDeletions;
    }

    @JsonbProperty("allow_force_pushes")
    public Boolean getAllowForcePushes() {
        return this.allowForcePushes;
    }

    @JsonbTransient
    @PathParam("branch")
    public String getBranch() {
        return this.branch;
    }

    @JsonbProperty("enforce_admins")
    public Boolean getEnforceAdmins() {
        return this.enforceAdmins;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("required_linear_history")
    public Boolean getRequiredLinearHistory() {
        return this.requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public RequiredPullRequestReviews getRequiredPullRequestReviews() {
        return this.requiredPullRequestReviews;
    }

    @JsonbProperty("required_status_checks")
    public RequiredStatusChecks getRequiredStatusChecks() {
        return this.requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public Restrictions getRestrictions() {
        return this.restrictions;
    }

    @JsonbProperty("allow_deletions")
    public void setAllowDeletions(Boolean allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    @JsonbProperty("allow_force_pushes")
    public void setAllowForcePushes(Boolean allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    @JsonbTransient
    @PathParam("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @JsonbProperty("enforce_admins")
    public void setEnforceAdmins(Boolean enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("required_linear_history")
    public void setRequiredLinearHistory(Boolean requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(RequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    @JsonbProperty("required_status_checks")
    public void setRequiredStatusChecks(RequiredStatusChecks requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }
}
