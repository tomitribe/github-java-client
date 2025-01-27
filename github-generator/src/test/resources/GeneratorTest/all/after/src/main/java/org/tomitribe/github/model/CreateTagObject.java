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
public class CreateTagObject {

    private String message;

    private String object;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String tag;

    private Tagger tagger;

    @JsonbTypeAdapter(TypeAdapter.class)
    private Type type;

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("object")
    public String getObject() {
        return this.object;
    }

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

    @JsonbProperty("tag")
    public String getTag() {
        return this.tag;
    }

    @JsonbProperty("tagger")
    public Tagger getTagger() {
        return this.tagger;
    }

    @JsonbTypeAdapter(TypeAdapter.class)
    @JsonbProperty("type")
    public Type getType() {
        return this.type;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("object")
    public void setObject(String object) {
        this.object = object;
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

    @JsonbProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonbProperty("tagger")
    public void setTagger(Tagger tagger) {
        this.tagger = tagger;
    }

    @JsonbProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {

        COMMIT("commit"), TREE("tree"), BLOB("blob");

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
