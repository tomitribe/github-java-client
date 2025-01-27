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
@ComponentId("runner-application")
public class RunnerApplication {

    private String architecture;

    private String downloadUrl;

    private String filename;

    private String os;

    @JsonbProperty("architecture")
    public String getArchitecture() {
        return this.architecture;
    }

    @JsonbProperty("download_url")
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @JsonbProperty("filename")
    public String getFilename() {
        return this.filename;
    }

    @JsonbProperty("os")
    public String getOs() {
        return this.os;
    }

    @JsonbProperty("architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    @JsonbProperty("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonbProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonbProperty("os")
    public void setOs(String os) {
        this.os = os;
    }
}
