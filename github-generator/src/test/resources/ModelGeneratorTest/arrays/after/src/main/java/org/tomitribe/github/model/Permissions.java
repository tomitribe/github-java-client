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

    private String contents;

    private String defNotRepo;

    private String deployments;

    private String issues;

    private String singleFile;

    @JsonbProperty("contents")
    public String getContents() {
        return this.contents;
    }

    @JsonbProperty("def_not_a_repo")
    public String getDefNotRepo() {
        return this.defNotRepo;
    }

    @JsonbProperty("deployments")
    public String getDeployments() {
        return this.deployments;
    }

    @JsonbProperty("issues")
    public String getIssues() {
        return this.issues;
    }

    @JsonbProperty("single_file")
    public String getSingleFile() {
        return this.singleFile;
    }

    @JsonbProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    @JsonbProperty("def_not_a_repo")
    public void setDefNotRepo(String defNotRepo) {
        this.defNotRepo = defNotRepo;
    }

    @JsonbProperty("deployments")
    public void setDeployments(String deployments) {
        this.deployments = deployments;
    }

    @JsonbProperty("issues")
    public void setIssues(String issues) {
        this.issues = issues;
    }

    @JsonbProperty("single_file")
    public void setSingleFile(String singleFile) {
        this.singleFile = singleFile;
    }
}
