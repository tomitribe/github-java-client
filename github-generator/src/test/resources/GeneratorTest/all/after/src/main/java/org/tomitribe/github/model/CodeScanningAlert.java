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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("code-scanning-alert")
public class CodeScanningAlert {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date closedAt;

    private SimpleUser closedBy;

    @JsonbTypeAdapter(ClosedReasonAdapter.class)
    private ClosedReason closedReason;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String htmlUrl;

    private Integer number;

    private Boolean open;

    private String ruleDescription;

    private String ruleId;

    @JsonbTypeAdapter(RuleSeverityAdapter.class)
    private RuleSeverity ruleSeverity;

    private String tool;

    private String url;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("closed_at")
    public Date getClosedAt() {
        return this.closedAt;
    }

    @JsonbProperty("closed_by")
    public SimpleUser getClosedBy() {
        return this.closedBy;
    }

    @JsonbTypeAdapter(ClosedReasonAdapter.class)
    @JsonbProperty("closed_reason")
    public ClosedReason getClosedReason() {
        return this.closedReason;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("open")
    public Boolean getOpen() {
        return this.open;
    }

    @JsonbProperty("rule_description")
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    @JsonbProperty("rule_id")
    public String getRuleId() {
        return this.ruleId;
    }

    @JsonbTypeAdapter(RuleSeverityAdapter.class)
    @JsonbProperty("rule_severity")
    public RuleSeverity getRuleSeverity() {
        return this.ruleSeverity;
    }

    @JsonbProperty("tool")
    public String getTool() {
        return this.tool;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("closed_at")
    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    @JsonbProperty("closed_by")
    public void setClosedBy(SimpleUser closedBy) {
        this.closedBy = closedBy;
    }

    @JsonbProperty("closed_reason")
    public void setClosedReason(ClosedReason closedReason) {
        this.closedReason = closedReason;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

    @JsonbProperty("rule_description")
    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    @JsonbProperty("rule_id")
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    @JsonbProperty("rule_severity")
    public void setRuleSeverity(RuleSeverity ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
    }

    @JsonbProperty("tool")
    public void setTool(String tool) {
        this.tool = tool;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public enum ClosedReason {

        FALSE_POSITIVE("false positive"), WONT_FIX("won't fix"), USED_IN_TESTS("used in tests");

        private final String name;

        ClosedReason(final String name) {
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

    public static class ClosedReasonAdapter extends EnumAdapter<ClosedReason> {

        public ClosedReasonAdapter() {
            super(ClosedReason.class);
        }
    }

    public enum RuleSeverity {

        NONE("none"), NOTE("note"), WARNING("warning"), ERROR("error");

        private final String name;

        RuleSeverity(final String name) {
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

    public static class RuleSeverityAdapter extends EnumAdapter<RuleSeverity> {

        public RuleSeverityAdapter() {
            super(RuleSeverity.class);
        }
    }
}
