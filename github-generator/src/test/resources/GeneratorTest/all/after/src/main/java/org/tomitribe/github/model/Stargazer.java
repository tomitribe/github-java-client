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
@ComponentId("stargazer")
public class Stargazer {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date starredAt;

    private SimpleUser user;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("starred_at")
    public Date getStarredAt() {
        return this.starredAt;
    }

    @JsonbProperty("user")
    public SimpleUser getUser() {
        return this.user;
    }

    @JsonbProperty("starred_at")
    public void setStarredAt(Date starredAt) {
        this.starredAt = starredAt;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }
}
