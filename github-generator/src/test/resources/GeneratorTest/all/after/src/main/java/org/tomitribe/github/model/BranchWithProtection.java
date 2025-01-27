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
@ComponentId("branch-with-protection")
public class BranchWithProtection {

    private Boolean _protected;

    private Commit commit;

    private Links links;

    private String name;

    private String pattern;

    private BranchProtection protection;

    private URI protectionUrl;

    private Integer requiredApprovingReviewCount;

    @JsonbProperty("commit")
    public Commit getCommit() {
        return this.commit;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("pattern")
    public String getPattern() {
        return this.pattern;
    }

    @JsonbProperty("protection")
    public BranchProtection getProtection() {
        return this.protection;
    }

    @JsonbProperty("protection_url")
    public URI getProtectionUrl() {
        return this.protectionUrl;
    }

    @JsonbProperty("required_approving_review_count")
    public Integer getRequiredApprovingReviewCount() {
        return this.requiredApprovingReviewCount;
    }

    @JsonbProperty("protected")
    public Boolean get_protected() {
        return this._protected;
    }

    @JsonbProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @JsonbProperty("protection")
    public void setProtection(BranchProtection protection) {
        this.protection = protection;
    }

    @JsonbProperty("protection_url")
    public void setProtectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    @JsonbProperty("required_approving_review_count")
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    @JsonbProperty("protected")
    public void set_protected(Boolean _protected) {
        this._protected = _protected;
    }
}
