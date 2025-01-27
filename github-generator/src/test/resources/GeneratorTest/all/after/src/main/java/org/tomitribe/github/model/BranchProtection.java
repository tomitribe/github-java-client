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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("branch-protection")
public class BranchProtection {

    private AllowDeletions allowDeletions;

    private AllowForcePushes allowForcePushes;

    private Boolean enabled;

    private ProtectedBranchAdminEnforced enforceAdmins;

    private String name;

    private String protectionUrl;

    private RequiredLinearHistory requiredLinearHistory;

    private ProtectedBranchPullRequestReview requiredPullRequestReviews;

    private RequiredStatusChecks requiredStatusChecks;

    private BranchRestrictionPolicy restrictions;

    private String url;

    @JsonbProperty("allow_deletions")
    public AllowDeletions getAllowDeletions() {
        return this.allowDeletions;
    }

    @JsonbProperty("allow_force_pushes")
    public AllowForcePushes getAllowForcePushes() {
        return this.allowForcePushes;
    }

    @JsonbProperty("enabled")
    public Boolean getEnabled() {
        return this.enabled;
    }

    @JsonbProperty("enforce_admins")
    public ProtectedBranchAdminEnforced getEnforceAdmins() {
        return this.enforceAdmins;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("protection_url")
    public String getProtectionUrl() {
        return this.protectionUrl;
    }

    @JsonbProperty("required_linear_history")
    public RequiredLinearHistory getRequiredLinearHistory() {
        return this.requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public ProtectedBranchPullRequestReview getRequiredPullRequestReviews() {
        return this.requiredPullRequestReviews;
    }

    @JsonbProperty("required_status_checks")
    public RequiredStatusChecks getRequiredStatusChecks() {
        return this.requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public BranchRestrictionPolicy getRestrictions() {
        return this.restrictions;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("allow_deletions")
    public void setAllowDeletions(AllowDeletions allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    @JsonbProperty("allow_force_pushes")
    public void setAllowForcePushes(AllowForcePushes allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    @JsonbProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonbProperty("enforce_admins")
    public void setEnforceAdmins(ProtectedBranchAdminEnforced enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("protection_url")
    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    @JsonbProperty("required_linear_history")
    public void setRequiredLinearHistory(RequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(ProtectedBranchPullRequestReview requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    @JsonbProperty("required_status_checks")
    public void setRequiredStatusChecks(RequiredStatusChecks requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public void setRestrictions(BranchRestrictionPolicy restrictions) {
        this.restrictions = restrictions;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
