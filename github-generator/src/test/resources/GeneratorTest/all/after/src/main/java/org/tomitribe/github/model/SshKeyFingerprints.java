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
public class SshKeyFingerprints {

    private String mD5DSA;

    private String mD5RSA;

    private String sHA256DSA;

    private String sHA256RSA;

    @JsonbProperty("MD5_DSA")
    public String getMD5DSA() {
        return this.mD5DSA;
    }

    @JsonbProperty("MD5_RSA")
    public String getMD5RSA() {
        return this.mD5RSA;
    }

    @JsonbProperty("SHA256_DSA")
    public String getSHA256DSA() {
        return this.sHA256DSA;
    }

    @JsonbProperty("SHA256_RSA")
    public String getSHA256RSA() {
        return this.sHA256RSA;
    }

    @JsonbProperty("MD5_DSA")
    public void setMD5DSA(String mD5DSA) {
        this.mD5DSA = mD5DSA;
    }

    @JsonbProperty("MD5_RSA")
    public void setMD5RSA(String mD5RSA) {
        this.mD5RSA = mD5RSA;
    }

    @JsonbProperty("SHA256_DSA")
    public void setSHA256DSA(String sHA256DSA) {
        this.sHA256DSA = sHA256DSA;
    }

    @JsonbProperty("SHA256_RSA")
    public void setSHA256RSA(String sHA256RSA) {
        this.sHA256RSA = sHA256RSA;
    }
}
