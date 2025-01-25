/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.github.gen;

import org.junit.Ignore;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.tomitribe.github.gen.ProjectAsserts.assertProject;

public class GeneratorTest {

    @Test
    public void all() throws Exception {
        assertScenario(Scenario.get("all"));
    }

    /**
     * Use this to regenerate the expected java files for any of the test scenarios.
     */
    @Test
    @Ignore("Run this to regenerate any scenario files")
    public void regenerateScenarios() throws Exception {
        regenerateScenario(Scenario.source("all"));
    }

    private void regenerateScenario(final Scenario scenario) throws IOException {
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

    private void assertScenario(final Scenario scenario) throws IOException {

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

        final org.tomitribe.github.gen.Dir classes = actual.target().classes();

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
    public interface Scenario extends Dir {
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

        static Scenario get(final String testName) {
            final Class<?> clazz = GeneratorTest.class;
            final File testClasses = JarLocation.jarLocation(clazz);
            final File target = testClasses.getParentFile();
            final File module = target.getParentFile();
            final Project project = Project.from(module);
            final Dir source = project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);
            final File tmpdir = Files.tmpdir();

            try {
                IO.copyDirectory(source.dir(), tmpdir);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }

            return Dir.of(Scenario.class, tmpdir);
        }

        static Scenario source(final String testName) {
            final Class<?> clazz = GeneratorTest.class;
            final File testClasses = JarLocation.jarLocation(clazz);
            final File target = testClasses.getParentFile();
            final File module = target.getParentFile();
            final Project project = Project.from(module);
            final Dir source = project.src().test().resources().dir(clazz.getSimpleName()).dir(testName);

            return Dir.of(Scenario.class, source.get());
        }
    }

}
