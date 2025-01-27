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
public class MinutesUsedBreakdown {

    private Integer mACOS;

    private Integer uBUNTU;

    private Integer wINDOWS;

    @JsonbProperty("MACOS")
    public Integer getMACOS() {
        return this.mACOS;
    }

    @JsonbProperty("UBUNTU")
    public Integer getUBUNTU() {
        return this.uBUNTU;
    }

    @JsonbProperty("WINDOWS")
    public Integer getWINDOWS() {
        return this.wINDOWS;
    }

    @JsonbProperty("MACOS")
    public void setMACOS(Integer mACOS) {
        this.mACOS = mACOS;
    }

    @JsonbProperty("UBUNTU")
    public void setUBUNTU(Integer uBUNTU) {
        this.uBUNTU = uBUNTU;
    }

    @JsonbProperty("WINDOWS")
    public void setWINDOWS(Integer wINDOWS) {
        this.wINDOWS = wINDOWS;
    }
}
