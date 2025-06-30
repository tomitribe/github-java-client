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

import org.junit.Test;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.Files;
import org.tomitribe.util.IO;
import org.tomitribe.util.JarLocation;
import org.tomitribe.util.dir.Dir;
import org.tomitribe.util.dir.Name;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public interface Scenario extends org.tomitribe.util.dir.Dir {
    /**
     * Reports the caller method as a {@link java.lang.reflect.Method}.
     * Only returns a method if it belongs to a class ending with "Test"
     * and is annotated with {@link org.junit.Test}.
     *
     * @return the {@link java.lang.reflect.Method} of the test case being invoked
     * @throws IllegalStateException if no matching test case is found in the call stack
     */
    static Method getTestCaller() {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        for (final StackTraceElement element : stackTrace) {
            try {
                final Class<?> clazz = Class.forName(element.getClassName());

                // Skip classes that don't end with "Test"
                if (!clazz.getSimpleName().endsWith("Test")) {
                    continue;
                }

                final Method method = Arrays.stream(clazz.getDeclaredMethods())
                        .filter(m -> m.getName().equals(element.getMethodName()))
                        .filter(m -> m.isAnnotationPresent(Test.class))
                        .findFirst()
                        .orElse(null);

                if (method != null) {
                    return method;
                }
            } catch (final ClassNotFoundException ignored) {
                // Continue to the next element
            }
        }

        throw new IllegalStateException("No JUnit test case found in the call stack.");
    }

    @Name("openapi.json")
    File openapiJson();

    default OpenApi getOpenApi() {
        try {
            return OpenApi.parse(IO.slurp(openapiJson()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    Project before();

    Project after();

    static Scenario get(final String testName, final Class<?> clazz) {
        final Dir source = dir(testName, clazz);
        final File tmpdir = Files.tmpdir();

        try {
            IO.copyDirectory(source.dir(), tmpdir);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return org.tomitribe.util.dir.Dir.of(Scenario.class, tmpdir);
    }

    static Dir dir(final String testName, final Class<?> clazz) {
        final File testClasses = JarLocation.jarLocation(clazz);
        final File target = testClasses.getParentFile();
        final File module = target.getParentFile();
        final Project project = Project.from(module);
        return project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);
    }

    static Scenario source(final String testName, final Class<?> clazz) {
        final File testClasses = JarLocation.jarLocation(clazz);
        final File target = testClasses.getParentFile();
        final File module = target.getParentFile();
        final Project project = Project.from(module);
        final org.tomitribe.util.dir.Dir source = project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);

        return Dir.of(Scenario.class, source.get());
    }
}
