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
public class Permissions {

    private Boolean admin;

    private Boolean pull;

    private Boolean push;

    @JsonbProperty("admin")
    public Boolean getAdmin() {
        return this.admin;
    }

    @JsonbProperty("pull")
    public Boolean getPull() {
        return this.pull;
    }

    @JsonbProperty("push")
    public Boolean getPush() {
        return this.push;
    }

    @JsonbProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @JsonbProperty("pull")
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    @JsonbProperty("push")
    public void setPush(Boolean push) {
        this.push = push;
    }
}
