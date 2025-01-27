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
@ComponentId("hook-response")
public class HookResponse {

    private Integer code;

    private String message;

    private String status;

    @JsonbProperty("code")
    public Integer getCode() {
        return this.code;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("status")
    public String getStatus() {
        return this.status;
    }

    @JsonbProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
