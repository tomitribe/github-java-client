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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payload {

    private String action;

    private IssueComment comment;

    private IssueSimple issue;

    private List<Pages> pages;

    @JsonbProperty("action")
    public String getAction() {
        return this.action;
    }

    @JsonbProperty("comment")
    public IssueComment getComment() {
        return this.comment;
    }

    @JsonbProperty("issue")
    public IssueSimple getIssue() {
        return this.issue;
    }

    @JsonbProperty("pages")
    public List<Pages> getPages() {
        return this.pages;
    }

    @JsonbProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonbProperty("comment")
    public void setComment(IssueComment comment) {
        this.comment = comment;
    }

    @JsonbProperty("issue")
    public void setIssue(IssueSimple issue) {
        this.issue = issue;
    }

    @JsonbProperty("pages")
    public void setPages(List<Pages> pages) {
        this.pages = pages;
    }
}
