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

import org.tomitribe.github.gen.openapi.OpenApi;

import java.util.function.Function;

/**
 * Our final data structure that is generated into Java code is a List of Endpoint and a List Clazz
 * Our goal is to flatten the OpenApi structure to that format as much as possible.
 *
 * Par
 */
public class Normalizer {

    public static OpenApi normalize(final OpenApi openApi) {

        return Function.<OpenApi>identity()
                .andThen(new AddSummary())
                .andThen(new InlineParameterRefs())
                .andThen(new GraduateEnumsFromParameters())
                .andThen(new PruneComponents())
                .apply(openApi);
    }

}
