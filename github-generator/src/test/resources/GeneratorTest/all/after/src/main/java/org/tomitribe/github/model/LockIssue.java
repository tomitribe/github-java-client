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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockIssue {

    @JsonbTransient
    @PathParam("issue_number")
    private Integer issueNumber;

    @JsonbTypeAdapter(LockReasonAdapter.class)
    private LockReason lockReason;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("issue_number")
    public Integer getIssueNumber() {
        return this.issueNumber;
    }

    @JsonbTypeAdapter(LockReasonAdapter.class)
    @JsonbProperty("lock_reason")
    public LockReason getLockReason() {
        return this.lockReason;
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

    @JsonbTransient
    @PathParam("issue_number")
    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    @JsonbProperty("lock_reason")
    public void setLockReason(LockReason lockReason) {
        this.lockReason = lockReason;
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

    public enum LockReason {

        OFF_TOPIC("off-topic"), TOO_HEATED("too heated"), RESOLVED("resolved"), SPAM("spam");

        private final String name;

        LockReason(final String name) {
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

    public static class LockReasonAdapter extends EnumAdapter<LockReason> {

        public LockReasonAdapter() {
            super(LockReason.class);
        }
    }
}
