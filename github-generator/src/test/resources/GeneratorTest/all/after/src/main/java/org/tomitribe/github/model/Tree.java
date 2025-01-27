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
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tree {

    private String content;

    @JsonbTypeAdapter(ModeAdapter.class)
    private Mode mode;

    private String path;

    private String sha;

    private Integer size;

    @JsonbTypeAdapter(TypeAdapter.class)
    private Type type;

    private URI url;

    @JsonbProperty("content")
    public String getContent() {
        return this.content;
    }

    @JsonbProperty("mode")
    public String getMode() {
        return this.mode;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("size")
    public Integer getSize() {
        return this.size;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonbProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum Mode {

        _100644("100644"), _100755("100755"), _040000("040000"), _160000("160000"), _120000("120000");

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

    public enum Type {

        BLOB("blob"), TREE("tree"), COMMIT("commit");

        private final String name;

        Type(final String name) {
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

    public static class TypeAdapter extends EnumAdapter<Type> {

        public TypeAdapter() {
            super(Type.class);
        }
    }
}
