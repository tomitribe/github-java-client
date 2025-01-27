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
@ComponentId("verification")
public class Verification {

    private String payload;

    private String reason;

    private String signature;

    private Boolean verified;

    @JsonbProperty("payload")
    public String getPayload() {
        return this.payload;
    }

    @JsonbProperty("reason")
    public String getReason() {
        return this.reason;
    }

    @JsonbProperty("signature")
    public String getSignature() {
        return this.signature;
    }

    @JsonbProperty("verified")
    public Boolean getVerified() {
        return this.verified;
    }

    @JsonbProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    @JsonbProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonbProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonbProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
