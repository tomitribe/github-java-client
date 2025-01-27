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
@ComponentId("single-enum-in-model")
public class SingleEnumInModel {

    private String installedVersion;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    @JsonbProperty("installed_version")
    public String getInstalledVersion() {
        return this.installedVersion;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbProperty("state")
    public State getState() {
        return this.state;
    }

    @JsonbProperty("installed_version")
    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    public enum State {

        ERROR("error"),
        FAILURE("failure"),
        INACTIVE("inactive"),
        IN_PROGRESS("in_progress"),
        QUEUED("queued"),
        PENDING("pending"),
        SUCCESS("success");

        private final String name;

        State(final String name) {
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

    public static class StateAdapter extends EnumAdapter<State> {

        public StateAdapter() {
            super(State.class);
        }
    }
}
