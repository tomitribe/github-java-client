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
package org.tomitribe.github.gen;

import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.Files;
import org.tomitribe.util.IO;
import org.tomitribe.util.JarLocation;
import org.tomitribe.util.dir.Dir;
import org.tomitribe.util.dir.Name;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

public interface Scenario extends org.tomitribe.util.dir.Dir {
    @Name("openapi.json")
    File openapiJson();

    default boolean generateModels() {
        return after().src().main().java().model().get().listFiles().length > 0;
    }

    default OpenApi getOpenApi() {
        try {
            return OpenApi.parse(IO.slurp(openapiJson()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    Project before();

    Project after();

    static Scenario get(final String testName) {
        final Class<?> clazz = EndpointRendererTest.class;
        final File testClasses = JarLocation.jarLocation(clazz);
        final File target = testClasses.getParentFile();
        final File module = target.getParentFile();
        final Project project = Project.from(module);
        final org.tomitribe.util.dir.Dir source = project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);
        final File tmpdir = Files.tmpdir();

        try {
            IO.copyDirectory(source.dir(), tmpdir);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return org.tomitribe.util.dir.Dir.of(Scenario.class, tmpdir);
    }

    static Scenario source(final String testName) {
        final Class<?> clazz = EndpointRendererTest.class;
        final File testClasses = JarLocation.jarLocation(clazz);
        final File target = testClasses.getParentFile();
        final File module = target.getParentFile();
        final Project project = Project.from(module);
        final org.tomitribe.util.dir.Dir source = project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);

        return Dir.of(Scenario.class, source.get());
    }
}
