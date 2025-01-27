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
public class Name {

    private String familyName;

    private String formatted;

    private String givenName;

    @JsonbProperty("familyName")
    public String getFamilyName() {
        return this.familyName;
    }

    @JsonbProperty("formatted")
    public String getFormatted() {
        return this.formatted;
    }

    @JsonbProperty("givenName")
    public String getGivenName() {
        return this.givenName;
    }

    @JsonbProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonbProperty("formatted")
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @JsonbProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
