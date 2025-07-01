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
package org.tomitribe.github.gen.openapi.normalize;

import org.tomitribe.github.gen.openapi.Method;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddSummary implements Function<OpenApi, OpenApi> {
    @Override
    public OpenApi apply(final OpenApi openApi) {

        for (final Path path : openApi.getPaths().values()) {
            for (final Method method : path.getMethods().collect(Collectors.toList())) {
                if (method.getSummary() != null) continue;
                method.setSummary(generate(method.getName(), path.getName()));
            }
        }

        return openApi;
    }


    public static String generate(final String method, final String path) {
        final List<String> parts = new ArrayList<>();
        parts.add(capitalize(method.toLowerCase()));

        for (final String segment : path.split("/")) {
            if (segment.isEmpty()) continue;

            if (segment.startsWith("{") && segment.endsWith("}")) {
                final String param = segment.substring(1, segment.length() - 1);
                parts.add("By");
                parts.add(capitalize(param));
            } else {
                parts.add(capitalize(segment));
            }
        }

        return String.join(" ", parts);
    }

    private static String capitalize(final String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

}
