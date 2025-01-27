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
public class SearchResultTextMatches {

    private String fragment;

    private List<Matches> matches;

    private String objectType;

    private String objectUrl;

    private String property;

    @JsonbProperty("fragment")
    public String getFragment() {
        return this.fragment;
    }

    @JsonbProperty("matches")
    public List<Matches> getMatches() {
        return this.matches;
    }

    @JsonbProperty("object_type")
    public String getObjectType() {
        return this.objectType;
    }

    @JsonbProperty("object_url")
    public String getObjectUrl() {
        return this.objectUrl;
    }

    @JsonbProperty("property")
    public String getProperty() {
        return this.property;
    }

    @JsonbProperty("fragment")
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    @JsonbProperty("matches")
    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

    @JsonbProperty("object_type")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonbProperty("object_url")
    public void setObjectUrl(String objectUrl) {
        this.objectUrl = objectUrl;
    }

    @JsonbProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }
}
