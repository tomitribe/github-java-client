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

import org.tomitribe.github.core.JsonAsserts;
import org.tomitribe.github.gen.Scenario;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.IO;
import org.tomitribe.util.dir.Dir;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.util.function.Function;

public class Normalizations {
    public static void assertScenario(final Function<OpenApi, OpenApi> normalizer) {
        final Method test = Scenario.getTestCaller();

        { // setup the directory and template files for convenience
            try {
                final Dir dir = Scenario.dir(test.getName(), test.getDeclaringClass());
                dir.mkdirs();
                final File before = dir.file("before.json");
                if (!before.exists()) before.createNewFile();
                final File after = dir.file("after.json");
                if (!after.exists()) after.createNewFile();
            } catch (final IOException e) {
                throw new RuntimeException(e);
            }
        }

        final Scenario scenario = Scenario.get(test.getName(), test.getDeclaringClass());
        final File beforeJson = scenario.file("before.json");
        final File afterJson = scenario.file("after.json");

        final OpenApi openApi = getOpenApi(beforeJson);

        final OpenApi afterOpenApi = normalizer.apply(openApi);

        try {
            JsonAsserts.assertJsonb(IO.slurp(afterJson), afterOpenApi);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static OpenApi getOpenApi(final File file) {
        try {
            return OpenApi.parse(IO.slurp(file));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
