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
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListPublicRepositories {

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("visibility")
    private String visibility;

    @JsonbTransient
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTransient
    @QueryParam("visibility")
    public String getVisibility() {
        return this.visibility;
    }

    @JsonbTransient
    @QueryParam("since")
    public void setSince(String since) {
        this.since = since;
    }

    @JsonbTransient
    @QueryParam("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
