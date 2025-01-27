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
@ComponentId("rate-limit")
public class RateLimit {

    private Integer limit;

    private Integer remaining;

    private Integer reset;

    @JsonbProperty("limit")
    public Integer getLimit() {
        return this.limit;
    }

    @JsonbProperty("remaining")
    public Integer getRemaining() {
        return this.remaining;
    }

    @JsonbProperty("reset")
    public Integer getReset() {
        return this.reset;
    }

    @JsonbProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonbProperty("remaining")
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    @JsonbProperty("reset")
    public void setReset(Integer reset) {
        this.reset = reset;
    }
}
