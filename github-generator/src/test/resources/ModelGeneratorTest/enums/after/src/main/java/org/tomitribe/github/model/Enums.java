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
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Enums {

    private String context;

    @JsonbTypeAdapter(ModeAdapter.class)
    private Mode mode;

    private String text;

    @JsonbProperty("context")
    public String getContext() {
        return this.context;
    }

    @JsonbTypeAdapter(ModeAdapter.class)
    @JsonbProperty("mode")
    public Mode getMode() {
        return this.mode;
    }

    @JsonbProperty("text")
    public String getText() {
        return this.text;
    }

    @JsonbProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonbProperty("mode")
    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @JsonbProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public enum Mode {

        MARKDOWN("markdown"), GFM("gfm");

        private final String name;

        Mode(final String name) {
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

    public static class ModeAdapter extends EnumAdapter<Mode> {

        public ModeAdapter() {
            super(Mode.class);
        }
    }
}
