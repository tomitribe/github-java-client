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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("simple-commit")
public class SimpleCommit {

    private Author author;

    private Committer committer;

    private String id;

    private String message;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date timestamp;

    private String treeId;

    @JsonbProperty("author")
    public Author getAuthor() {
        return this.author;
    }

    @JsonbProperty("committer")
    public Committer getCommitter() {
        return this.committer;
    }

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("timestamp")
    public Date getTimestamp() {
        return this.timestamp;
    }

    @JsonbProperty("tree_id")
    public String getTreeId() {
        return this.treeId;
    }

    @JsonbProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonbProperty("committer")
    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonbProperty("tree_id")
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }
}
