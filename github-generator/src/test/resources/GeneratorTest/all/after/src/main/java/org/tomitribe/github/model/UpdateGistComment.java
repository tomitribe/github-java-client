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
public class UpdateGistComment {

    private String body;

    @JsonbTransient
    @PathParam("comment_id")
    private Integer commentId;

    @JsonbTransient
    @PathParam("gist_id")
    private String gistId;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbTransient
    @PathParam("comment_id")
    public Integer getCommentId() {
        return this.commentId;
    }

    @JsonbTransient
    @PathParam("gist_id")
    public String getGistId() {
        return this.gistId;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbTransient
    @PathParam("comment_id")
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @JsonbTransient
    @PathParam("gist_id")
    public void setGistId(String gistId) {
        this.gistId = gistId;
    }
}
