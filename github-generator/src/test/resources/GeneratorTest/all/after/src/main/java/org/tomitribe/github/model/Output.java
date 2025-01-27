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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Output {

    private List<Annotations> annotations;

    private Integer annotationsCount;

    private URI annotationsUrl;

    private List<Images> images;

    private String summary;

    private String text;

    private String title;

    @JsonbProperty("annotations")
    public List<Annotations> getAnnotations() {
        return this.annotations;
    }

    @JsonbProperty("annotations_count")
    public Integer getAnnotationsCount() {
        return this.annotationsCount;
    }

    @JsonbProperty("annotations_url")
    public URI getAnnotationsUrl() {
        return this.annotationsUrl;
    }

    @JsonbProperty("images")
    public List<Images> getImages() {
        return this.images;
    }

    @JsonbProperty("summary")
    public String getSummary() {
        return this.summary;
    }

    @JsonbProperty("text")
    public String getText() {
        return this.text;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("annotations")
    public void setAnnotations(List<Annotations> annotations) {
        this.annotations = annotations;
    }

    @JsonbProperty("annotations_count")
    public void setAnnotationsCount(Integer annotationsCount) {
        this.annotationsCount = annotationsCount;
    }

    @JsonbProperty("annotations_url")
    public void setAnnotationsUrl(URI annotationsUrl) {
        this.annotationsUrl = annotationsUrl;
    }

    @JsonbProperty("images")
    public void setImages(List<Images> images) {
        this.images = images;
    }

    @JsonbProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonbProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
}
