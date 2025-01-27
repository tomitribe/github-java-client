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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("api-overview")
public class ApiOverview {

    private List<String> api;

    private List<String> git;

    private String githubServicesSha;

    private List<String> hooks;

    private List<String> importer;

    private String installedVersion;

    private List<String> pages;

    private SshKeyFingerprints sshKeyFingerprints;

    private Boolean verifiablePasswordAuthentication;

    private List<String> web;

    @JsonbProperty("api")
    public List<String> getApi() {
        return this.api;
    }

    @JsonbProperty("git")
    public List<String> getGit() {
        return this.git;
    }

    @JsonbProperty("github_services_sha")
    public String getGithubServicesSha() {
        return this.githubServicesSha;
    }

    @JsonbProperty("hooks")
    public List<String> getHooks() {
        return this.hooks;
    }

    @JsonbProperty("importer")
    public List<String> getImporter() {
        return this.importer;
    }

    @JsonbProperty("installed_version")
    public String getInstalledVersion() {
        return this.installedVersion;
    }

    @JsonbProperty("pages")
    public List<String> getPages() {
        return this.pages;
    }

    @JsonbProperty("ssh_key_fingerprints")
    public SshKeyFingerprints getSshKeyFingerprints() {
        return this.sshKeyFingerprints;
    }

    @JsonbProperty("verifiable_password_authentication")
    public Boolean getVerifiablePasswordAuthentication() {
        return this.verifiablePasswordAuthentication;
    }

    @JsonbProperty("web")
    public List<String> getWeb() {
        return this.web;
    }

    @JsonbProperty("api")
    public void setApi(List<String> api) {
        this.api = api;
    }

    @JsonbProperty("git")
    public void setGit(List<String> git) {
        this.git = git;
    }

    @JsonbProperty("github_services_sha")
    public void setGithubServicesSha(String githubServicesSha) {
        this.githubServicesSha = githubServicesSha;
    }

    @JsonbProperty("hooks")
    public void setHooks(List<String> hooks) {
        this.hooks = hooks;
    }

    @JsonbProperty("importer")
    public void setImporter(List<String> importer) {
        this.importer = importer;
    }

    @JsonbProperty("installed_version")
    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    @JsonbProperty("pages")
    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    @JsonbProperty("ssh_key_fingerprints")
    public void setSshKeyFingerprints(SshKeyFingerprints sshKeyFingerprints) {
        this.sshKeyFingerprints = sshKeyFingerprints;
    }

    @JsonbProperty("verifiable_password_authentication")
    public void setVerifiablePasswordAuthentication(Boolean verifiablePasswordAuthentication) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
    }

    @JsonbProperty("web")
    public void setWeb(List<String> web) {
        this.web = web;
    }
}
