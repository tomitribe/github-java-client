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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StartImport {

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String tfvcProject;

    @JsonbTypeAdapter(VcsAdapter.class)
    private Vcs vcs;

    private String vcsPassword;

    private String vcsUrl;

    private String vcsUsername;

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("tfvc_project")
    public String getTfvcProject() {
        return this.tfvcProject;
    }

    @JsonbTypeAdapter(VcsAdapter.class)
    @JsonbProperty("vcs")
    public Vcs getVcs() {
        return this.vcs;
    }

    @JsonbProperty("vcs_password")
    public String getVcsPassword() {
        return this.vcsPassword;
    }

    @JsonbProperty("vcs_url")
    public String getVcsUrl() {
        return this.vcsUrl;
    }

    @JsonbProperty("vcs_username")
    public String getVcsUsername() {
        return this.vcsUsername;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("tfvc_project")
    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    @JsonbProperty("vcs")
    public void setVcs(Vcs vcs) {
        this.vcs = vcs;
    }

    @JsonbProperty("vcs_password")
    public void setVcsPassword(String vcsPassword) {
        this.vcsPassword = vcsPassword;
    }

    @JsonbProperty("vcs_url")
    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    @JsonbProperty("vcs_username")
    public void setVcsUsername(String vcsUsername) {
        this.vcsUsername = vcsUsername;
    }

    public enum Vcs {

        SUBVERSION("subversion"), GIT("git"), MERCURIAL("mercurial"), TFVC("tfvc");

        private final String name;

        Vcs(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class VcsAdapter extends EnumAdapter<Vcs> {

        public VcsAdapter() {
            super(Vcs.class);
        }
    }
}
