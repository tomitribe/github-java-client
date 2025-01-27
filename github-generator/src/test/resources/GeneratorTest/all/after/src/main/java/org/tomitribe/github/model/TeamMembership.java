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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("team-membership")
public class TeamMembership {

    @JsonbTypeAdapter(RoleAdapter.class)
    private Role role;

    private String state;

    private URI url;

    @JsonbTypeAdapter(RoleAdapter.class)
    @JsonbProperty("role")
    public Role getRole() {
        return this.role;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum Role {

        MEMBER("member"), MAINTAINER("maintainer");

        private final String name;

        Role(final String name) {
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

    public static class RoleAdapter extends EnumAdapter<Role> {

        public RoleAdapter() {
            super(Role.class);
        }
    }
}
