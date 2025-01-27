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
@ComponentId("check-annotation")
public class CheckAnnotation {

    private String annotationLevel;

    private String blobHref;

    private Integer endColumn;

    private Integer endLine;

    private String message;

    private String path;

    private String rawDetails;

    private Integer startColumn;

    private Integer startLine;

    private String title;

    @JsonbProperty("annotation_level")
    public String getAnnotationLevel() {
        return this.annotationLevel;
    }

    @JsonbProperty("blob_href")
    public String getBlobHref() {
        return this.blobHref;
    }

    @JsonbProperty("end_column")
    public Integer getEndColumn() {
        return this.endColumn;
    }

    @JsonbProperty("end_line")
    public Integer getEndLine() {
        return this.endLine;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("raw_details")
    public String getRawDetails() {
        return this.rawDetails;
    }

    @JsonbProperty("start_column")
    public Integer getStartColumn() {
        return this.startColumn;
    }

    @JsonbProperty("start_line")
    public Integer getStartLine() {
        return this.startLine;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("annotation_level")
    public void setAnnotationLevel(String annotationLevel) {
        this.annotationLevel = annotationLevel;
    }

    @JsonbProperty("blob_href")
    public void setBlobHref(String blobHref) {
        this.blobHref = blobHref;
    }

    @JsonbProperty("end_column")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    @JsonbProperty("end_line")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("raw_details")
    public void setRawDetails(String rawDetails) {
        this.rawDetails = rawDetails;
    }

    @JsonbProperty("start_column")
    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    @JsonbProperty("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
}
