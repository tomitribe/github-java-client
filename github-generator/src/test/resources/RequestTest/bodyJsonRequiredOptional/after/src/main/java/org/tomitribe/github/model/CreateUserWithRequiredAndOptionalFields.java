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
public class CreateUserWithRequiredAndOptionalFields {

    private Integer age;

    private String email;

    private String username;

    @JsonbProperty("age")
    public Integer getAge() {
        return this.age;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("username")
    public String getUsername() {
        return this.username;
    }

    @JsonbProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }
}
