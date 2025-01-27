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
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResetAuthorization {

    @JsonbTransient
    @PathParam("access-token")
    private String accessToken;

    @JsonbTransient
    @PathParam("client-id")
    private String clientId;

    @JsonbTransient
    @PathParam("access-token")
    public String getAccessToken() {
        return this.accessToken;
    }

    @JsonbTransient
    @PathParam("client-id")
    public String getClientId() {
        return this.clientId;
    }

    @JsonbTransient
    @PathParam("access-token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonbTransient
    @PathParam("client-id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
