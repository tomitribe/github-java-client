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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("traffic")
public class Traffic {

    private Integer count;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date timestamp;

    private Integer uniques;

    @JsonbProperty("count")
    public Integer getCount() {
        return this.count;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("timestamp")
    public Date getTimestamp() {
        return this.timestamp;
    }

    @JsonbProperty("uniques")
    public Integer getUniques() {
        return this.uniques;
    }

    @JsonbProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonbProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonbProperty("uniques")
    public void setUniques(Integer uniques) {
        this.uniques = uniques;
    }
}
