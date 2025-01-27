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
public class CreateGitHubAppFromManifestResponse {

    private String clientId;

    private String clientSecret;

    private String pem;

    private String webhookSecret;

    @JsonbProperty("client_id")
    public String getClientId() {
        return this.clientId;
    }

    @JsonbProperty("client_secret")
    public String getClientSecret() {
        return this.clientSecret;
    }

    @JsonbProperty("pem")
    public String getPem() {
        return this.pem;
    }

    @JsonbProperty("webhook_secret")
    public String getWebhookSecret() {
        return this.webhookSecret;
    }

    @JsonbProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonbProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @JsonbProperty("pem")
    public void setPem(String pem) {
        this.pem = pem;
    }

    @JsonbProperty("webhook_secret")
    public void setWebhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
    }
}
