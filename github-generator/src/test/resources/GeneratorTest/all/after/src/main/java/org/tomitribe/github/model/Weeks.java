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
public class Weeks {

    private Integer a;

    private Integer c;

    private Integer d;

    private String w;

    @JsonbProperty("a")
    public Integer getA() {
        return this.a;
    }

    @JsonbProperty("c")
    public Integer getC() {
        return this.c;
    }

    @JsonbProperty("d")
    public Integer getD() {
        return this.d;
    }

    @JsonbProperty("w")
    public String getW() {
        return this.w;
    }

    @JsonbProperty("a")
    public void setA(Integer a) {
        this.a = a;
    }

    @JsonbProperty("c")
    public void setC(Integer c) {
        this.c = c;
    }

    @JsonbProperty("d")
    public void setD(Integer d) {
        this.d = d;
    }

    @JsonbProperty("w")
    public void setW(String w) {
        this.w = w;
    }
}
