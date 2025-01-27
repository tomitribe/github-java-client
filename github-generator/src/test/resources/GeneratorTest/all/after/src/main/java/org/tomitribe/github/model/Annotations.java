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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Annotations {

    @JsonbTypeAdapter(AnnotationLevelAdapter.class)
    private AnnotationLevel annotationLevel;

    private Integer endColumn;

    private Integer endLine;

    private String message;

    private String path;

    private String rawDetails;

    private Integer startColumn;

    private Integer startLine;

    private String title;

    @JsonbTypeAdapter(AnnotationLevelAdapter.class)
    @JsonbProperty("annotation_level")
    public AnnotationLevel getAnnotationLevel() {
        return this.annotationLevel;
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
    public void setAnnotationLevel(AnnotationLevel annotationLevel) {
        this.annotationLevel = annotationLevel;
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

    public enum AnnotationLevel {

        NOTICE("notice"), WARNING("warning"), FAILURE("failure");

        private final String name;

        AnnotationLevel(final String name) {
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

    public static class AnnotationLevelAdapter extends EnumAdapter<AnnotationLevel> {

        public AnnotationLevelAdapter() {
            super(AnnotationLevel.class);
        }
    }
}
