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

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.HeaderParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostProcessWithModeHeader {

    @JsonbTransient
    @HeaderParam("X-Mode")
    private XMode xMode;

    @JsonbTransient
    @HeaderParam("X-Mode")
    public XMode getXMode() {
        return this.xMode;
    }

    @JsonbTransient
    @HeaderParam("X-Mode")
    public void setXMode(XMode xMode) {
        this.xMode = xMode;
    }
}
