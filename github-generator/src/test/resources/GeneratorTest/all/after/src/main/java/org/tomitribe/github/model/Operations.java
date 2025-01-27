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
public class Operations {

    @JsonbTypeAdapter(OpAdapter.class)
    private Op op;

    private String path;

    private Object value;

    @JsonbTypeAdapter(OpAdapter.class)
    @JsonbProperty("op")
    public Op getOp() {
        return this.op;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("value")
    public Object getValue() {
        return this.value;
    }

    @JsonbProperty("op")
    public void setOp(Op op) {
        this.op = op;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    public enum Op {

        ADD("add"), REMOVE("remove"), REPLACE("replace");

        private final String name;

        Op(final String name) {
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

    public static class OpAdapter extends EnumAdapter<Op> {

        public OpAdapter() {
            super(Op.class);
        }
    }
}
