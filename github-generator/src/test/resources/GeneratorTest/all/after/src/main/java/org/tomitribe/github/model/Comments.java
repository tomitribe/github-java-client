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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comments {

    private String body;

    private Integer line;

    private String path;

    private Integer position;

    private String side;

    private Integer startLine;

    private String startSide;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("line")
    public Integer getLine() {
        return this.line;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("position")
    public Integer getPosition() {
        return this.position;
    }

    @JsonbProperty("side")
    public String getSide() {
        return this.side;
    }

    @JsonbProperty("start_line")
    public Integer getStartLine() {
        return this.startLine;
    }

    @JsonbProperty("start_side")
    public String getStartSide() {
        return this.startSide;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonbProperty("side")
    public void setSide(String side) {
        this.side = side;
    }

    @JsonbProperty("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    @JsonbProperty("start_side")
    public void setStartSide(String startSide) {
        this.startSide = startSide;
    }
}
