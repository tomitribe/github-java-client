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
@ComponentId("protected-branch")
public class ProtectedBranch {

    private AllowDeletions allowDeletions;

    private AllowForcePushes allowForcePushes;

    private EnforceAdmins enforceAdmins;

    private RequiredLinearHistory requiredLinearHistory;

    private RequiredPullRequestReviews requiredPullRequestReviews;

    private RequiredSignatures requiredSignatures;

    private StatusCheckPolicy requiredStatusChecks;

    private BranchRestrictionPolicy restrictions;

    private URI url;

    @JsonbProperty("allow_deletions")
    public AllowDeletions getAllowDeletions() {
        return this.allowDeletions;
    }

    @JsonbProperty("allow_force_pushes")
    public AllowForcePushes getAllowForcePushes() {
        return this.allowForcePushes;
    }

    @JsonbProperty("enforce_admins")
    public EnforceAdmins getEnforceAdmins() {
        return this.enforceAdmins;
    }

    @JsonbProperty("required_linear_history")
    public RequiredLinearHistory getRequiredLinearHistory() {
        return this.requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public RequiredPullRequestReviews getRequiredPullRequestReviews() {
        return this.requiredPullRequestReviews;
    }

    @JsonbProperty("required_signatures")
    public RequiredSignatures getRequiredSignatures() {
        return this.requiredSignatures;
    }

    @JsonbProperty("required_status_checks")
    public StatusCheckPolicy getRequiredStatusChecks() {
        return this.requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public BranchRestrictionPolicy getRestrictions() {
        return this.restrictions;
    }

    @JsonbProperty("url")
    public URI getUrl() {
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

    @JsonbProperty("enforce_admins")
    public void setEnforceAdmins(EnforceAdmins enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    @JsonbProperty("required_linear_history")
    public void setRequiredLinearHistory(RequiredLinearHistory requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    @JsonbProperty("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(RequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    @JsonbProperty("required_signatures")
    public void setRequiredSignatures(RequiredSignatures requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    @JsonbProperty("required_status_checks")
    public void setRequiredStatusChecks(StatusCheckPolicy requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    @JsonbProperty("restrictions")
    public void setRestrictions(BranchRestrictionPolicy restrictions) {
        this.restrictions = restrictions;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
