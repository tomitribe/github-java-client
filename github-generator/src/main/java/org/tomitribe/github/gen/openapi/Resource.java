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
package org.tomitribe.github.gen.openapi;

import jakarta.json.bind.annotation.JsonbTransient;

import java.util.Objects;
import java.util.stream.Stream;

public interface Resource {

    @JsonbTransient
    String getName();

    Method getGet();

    Method getPut();

    Method getPost();

    Method getDelete();

    Method getTrace();

    Method getOptions();

    Method getPatch();

    @JsonbTransient
    void setName(String name);

    void setGet(Method get);

    void setPut(Method put);

    void setPost(Method post);

    void setDelete(Method delete);

    void setTrace(Method trace);

    void setOptions(Method options);

    void setPatch(Method patch);

    @JsonbTransient
    default Stream<Method> getMethods() {
        return Stream.of(
                getGet(),
                getPatch(),
                getPost(),
                getPut(),
                getDelete(),
                getTrace(),
                getOptions()
        ).filter(Objects::nonNull);
    }

    default void set(final String methodName, final Method method) {
        switch (methodName.toLowerCase()) {
            case "delete":
                setDelete(method);
                break;
            case "get":
                setGet(method);
                break;
            case "options":
                setOptions(method);
                break;
            case "patch":
                setPatch(method);
                break;
            case "post":
                setPost(method);
                break;
            case "put":
                setPut(method);
                break;
            case "trace":
                setTrace(method);
                break;
            default:
                throw new IllegalArgumentException("Unsupported method: " + methodName);
        }
    }
}
