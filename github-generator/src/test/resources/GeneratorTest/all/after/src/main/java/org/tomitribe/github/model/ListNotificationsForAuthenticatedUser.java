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
public class ListNotificationsForAuthenticatedUser {

    @JsonbTransient
    @QueryParam("all")
    private Boolean all;

    @JsonbTransient
    @QueryParam("before")
    private String before;

    @JsonbTransient
    @QueryParam("participating")
    private Boolean participating;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("all")
    public Boolean getAll() {
        return this.all;
    }

    @JsonbTransient
    @QueryParam("before")
    public String getBefore() {
        return this.before;
    }

    @JsonbTransient
    @QueryParam("participating")
    public Boolean getParticipating() {
        return this.participating;
    }

    @JsonbTransient
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTransient
    @QueryParam("all")
    public void setAll(Boolean all) {
        this.all = all;
    }

    @JsonbTransient
    @QueryParam("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonbTransient
    @QueryParam("participating")
    public void setParticipating(Boolean participating) {
        this.participating = participating;
    }

    @JsonbTransient
    @QueryParam("since")
    public void setSince(String since) {
        this.since = since;
    }
}
