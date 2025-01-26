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
import org.tomitribe.util.Files;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.tomitribe.github.gen.ProjectAsserts.assertProject;

public class Scenarios {

    private Scenarios() {

    }



    /**
     * Reports the caller method as a {@link java.lang.reflect.Method}.
     * Only returns a method if it belongs to a class ending with "Test"
     * and is annotated with {@link org.junit.Test}.
     *
     * @return the {@link java.lang.reflect.Method} of the test case being invoked
     * @throws IllegalStateException if no matching test case is found in the call stack
     */
    public static Method getTestCaller() {
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

    public static void assertScenario() throws IOException {
        final Method test = getTestCaller();
        assertScenario(test.getName(), test.getDeclaringClass());
    }

    public static void assertScenario(final String name, final Class<?> clazz) throws IOException {
        assertScenario(Scenario.get(name, clazz));
    }

    public static void assertScenario(final Scenario scenario) throws IOException {

        final Project actual = Project.from(Files.tmpdir());

        Generator.builder()
                .openApi(scenario.getOpenApi())
                .project(actual)
                .generateClient(true)
                .generateModel(true)
                .clientPackage("org.tomitribe.github.client")
                .modelPackage("org.tomitribe.github.model")
                .build()
                .generate();

        final Project expected = scenario.after();

        assertProject(expected, actual);

        final Dir classes = actual.target().classes();

        DirectoryCompiler.compileDirectory(actual.src().main().java().get(), classes.get());

        final ClassLoader loader = createChildClassLoader(classes.get());

        final List<? extends Class<?>> classList = toClassNames(classes.files(), classes.get())
                .map(s -> {
                    try {
                        return loader.loadClass(s);
                    } catch (final ClassNotFoundException e) {
                        throw new RuntimeException(s, e);
                    }
                })
                .collect(Collectors.toList());

        for (final Class<?> aClass : classList) {
            System.out.println(aClass);
        }
    }

    public static ClassLoader createChildClassLoader(final File directory) {
        if (directory == null || !directory.isDirectory()) {
            throw new IllegalArgumentException("Provided file must be a valid directory.");
        }

        try {
            final URL directoryUrl = directory.toURI().toURL();
            final ClassLoader parentClassLoader = Thread.currentThread().getContextClassLoader();

            return new URLClassLoader(new URL[]{directoryUrl}, parentClassLoader);
        } catch (final MalformedURLException e) {
            throw new IllegalArgumentException("Failed to create a URL from the provided directory.", e);
        }
    }

    /**
     * Converts a Stream of File objects to fully qualified class names.
     *
     * @param files   the Stream of File objects
     * @param baseDir the root directory containing the class files
     * @return a Stream of fully qualified class names
     * @throws IllegalArgumentException if baseDir is null or not a directory
     */
    public static Stream<String> toClassNames(final Stream<File> files, final File baseDir) {
        if (baseDir == null || !baseDir.isDirectory()) {
            throw new IllegalArgumentException("baseDir must be a valid directory.");
        }

        final String basePath = baseDir.getAbsolutePath() + File.separator;

        return files
                .filter(file -> file.isFile() && file.getName().endsWith(".class"))
                .map(file -> {
                    final String filePath = file.getAbsolutePath();
                    if (!filePath.startsWith(basePath)) {
                        throw new IllegalArgumentException("File is not under the specified base directory: " + filePath);
                    }
                    final String relativePath = filePath.substring(basePath.length());
                    return relativePath
                            .replace(File.separatorChar, '.')
                            .replaceAll("\\.class$", ""); // Remove .class extension
                });
    }

    public static void regenerateScenario() throws IOException {
        final Method test = getTestCaller();
        regenerateScenario(Scenario.source(test.getName(), test.getDeclaringClass()));
    }

    private static void regenerateScenario(final Scenario scenario) throws IOException {
        final Project expected = scenario.after();

        // Delete the old files
        Files.remove(expected.src().get());

        // Generate new "expected" files
        Generator.builder()
                .openApi(scenario.getOpenApi())
                .project(expected)
                .generateClient(true)
                .generateModel(true)
                .clientPackage("org.tomitribe.github.client")
                .modelPackage("org.tomitribe.github.model")
                .build()
                .generate();
    }
}
