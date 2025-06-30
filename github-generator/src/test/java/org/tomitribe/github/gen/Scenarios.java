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

import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.JsonAsserts;
import org.tomitribe.github.core.JsonbInstances;
import org.tomitribe.github.gen.openapi.Example;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.Files;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.tomitribe.github.gen.ProjectAsserts.assertProject;

public class Scenarios {

    private Scenarios() {
    }

    public static void assertScenario() throws IOException {
//        regenerateScenario();
        final Method test = Scenario.getTestCaller();
        assertScenario(Scenario.get(test.getName(), test.getDeclaringClass()));
    }

    private static void assertScenario(final Scenario scenario) throws IOException {

        final Project actual = Project.from(Files.tmpdir());
        final OpenApi openApi = scenario.getOpenApi();

        { // Generate the java source from the openapi.json
            generateSources(actual, openApi);
        }

        { // Assert Java Sources are as expected

            final Project expected = scenario.after();

            assertProject(expected, actual);
        }

        final List<? extends Class<?>> classList;
        { // Assert Java sources compile and Class files load
            final Dir classes = actual.target().classes();

            DirectoryCompiler.compileDirectory(actual.src().main().java().get(), classes.get());

            final ClassLoader loader = createClassLoader(classes.get());

            classList = toClassNames(classes.files(), classes.get())
                    .map(s -> {
                        try {
                            return loader.loadClass(s);
                        } catch (final ClassNotFoundException e) {
                            throw new RuntimeException(s, e);
                        }
                    })
                    .collect(Collectors.toList());
        }

        { // Assert the JSON deserialization and serialization of components
            final Map<String, ? extends Class<?>> components = classList.stream()
                    .filter(aClass -> aClass.isAnnotationPresent(ComponentId.class))
                    .collect(Collectors.toMap(
                            aClass -> {
                                final ComponentId componentId = aClass.getAnnotation(ComponentId.class);
                                return componentId.value();
                            }, // Key mapper: uses the value from getComponent
                            Function.identity()             // Value mapper: uses the ExampleReference object itself
                    ));

            if (openApi.getComponents() == null) return;
            if (openApi.getComponents().getExamples() == null) return;
            final Map<String, Example> examples = openApi.getComponents().getExamples();

            for (final Map.Entry<String, ? extends Class<?>> entry : components.entrySet()) {
                final Example example = examples.get(entry.getKey());
                if (example == null) continue;

                final Class<?> component = entry.getValue();

                final String json = JsonbInstances.get().toJson(example.getValue());
                JsonAsserts.assertJsonb(json, component);

            }
        }
    }

    private static void generateSources(final Project actual, final OpenApi openApi) {
        Generator.builder()
                .openApi(openApi)
                .project(actual)
                .generateClient(true)
                .generateModel(true)
                .clientPackage("org.tomitribe.github.client")
                .modelPackage("org.tomitribe.github.model")
                .build()
                .generate();
    }

    /**
     * Create a classloader that can load from the specified directory
     */
    private static ClassLoader createClassLoader(final File directory) {
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
    private static Stream<String> toClassNames(final Stream<File> files, final File baseDir) {
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
        final Method test = Scenario.getTestCaller();
        final Scenario scenario = Scenario.source(test.getName(), test.getDeclaringClass());

        scenario.mkdirs();
        if (!scenario.openapiJson().exists()) {
            scenario.openapiJson().createNewFile();
        }
        final Project expected = scenario.after();
        expected.mkdirs();

        // Delete the old files
        Files.remove(expected.src().get());

        // Generate new "expected" files
        generateSources(expected, scenario.getOpenApi());
    }


}
