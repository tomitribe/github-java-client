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
@ComponentId("short-branch")
public class ShortBranch {

    private Boolean _protected;

    private Commit commit;

    private String name;

    private BranchProtection protection;

    private URI protectionUrl;

    @JsonbProperty("commit")
    public Commit getCommit() {
        return this.commit;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("protection")
    public BranchProtection getProtection() {
        return this.protection;
    }

    @JsonbProperty("protection_url")
    public URI getProtectionUrl() {
        return this.protectionUrl;
    }

    @JsonbProperty("protected")
    public Boolean get_protected() {
        return this._protected;
    }

    @JsonbProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("protection")
    public void setProtection(BranchProtection protection) {
        this.protection = protection;
    }

    @JsonbProperty("protection_url")
    public void setProtectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    @JsonbProperty("protected")
    public void set_protected(Boolean _protected) {
        this._protected = _protected;
    }
}
