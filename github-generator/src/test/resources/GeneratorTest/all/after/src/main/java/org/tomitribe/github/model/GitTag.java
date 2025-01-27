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
@ComponentId("git-tag")
public class GitTag {

    private String message;

    private String nodeId;

    private Object object;

    private String sha;

    private String tag;

    private Tagger tagger;

    private URI url;

    private Verification verification;

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("object")
    public Object getObject() {
        return this.object;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("tag")
    public String getTag() {
        return this.tag;
    }

    @JsonbProperty("tagger")
    public Tagger getTagger() {
        return this.tagger;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("verification")
    public Verification getVerification() {
        return this.verification;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("object")
    public void setObject(Object object) {
        this.object = object;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonbProperty("tagger")
    public void setTagger(Tagger tagger) {
        this.tagger = tagger;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("verification")
    public void setVerification(Verification verification) {
        this.verification = verification;
    }
}
