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

import org.junit.Test;
import org.tomitribe.github.core.JsonAsserts;
import org.tomitribe.github.gen.code.endpoint.Endpoint;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.Files;
import org.tomitribe.util.IO;
import org.tomitribe.util.JarLocation;
import org.tomitribe.util.dir.Dir;
import org.tomitribe.util.dir.Name;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;

public class EndpointGeneratorTest {


    @Test
    public void complete() throws Exception {
        final Scenario scenario = Scenario.get("complete");

        final OpenApi openApi = scenario.getOpenApi();

        final EndpointGenerator endpointGenerator = new EndpointGenerator();
        final List<Endpoint> endpoints = endpointGenerator.build(openApi);

        JsonAsserts.assertJsonb(scenario.expected(), endpoints);
    }

    public interface Scenario extends Dir {
        @Name("openapi.json")
        File openapiJson();

        @Name("expected.json")
        File expectedJson();

        default String expected() {
            try {
                return IO.slurp(expectedJson());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
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
            final Class<?> clazz = EndpointGeneratorTest.class;
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

            return org.tomitribe.util.dir.Dir.of(Scenario.class, tmpdir);
        }
    }

}
