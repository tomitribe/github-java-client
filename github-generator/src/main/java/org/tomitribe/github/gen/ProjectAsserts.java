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

import org.tomitribe.util.IO;
import org.tomitribe.util.Join;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ProjectAsserts {
    private ProjectAsserts() {
    }

    public static void assertProject(final Project expected, final Project actual) throws IOException {

        final String expectedPaths = Join.join("\n", expected.paths().collect(Collectors.toList()));
        final String actualPaths = Join.join("\n", actual.paths().collect(Collectors.toList()));
        assertEquals(expectedPaths, actualPaths);

        final List<String> paths = expected.paths().collect(Collectors.toList());
        for (final String path : paths) {
//            sync(expected, actual, path);
            final String expectedContent = IO.slurp(expected.file(path));
            final String actualContent = IO.slurp(actual.file(path));

            assertEquals(path, expectedContent, actualContent);
        }
    }

    /**
     * Convenience method to sync the generated results back to the expected results.
     * Without this you have to copy each file one-by-one which would take forever.
     * Once run, make sure to carefully review the git diff before committing and
     * do not forget to uncomment the call to this method.
     */
    private static void sync(final Project expected, final Project actual, final String path) throws IOException {
        /*
         * Update the copy in the target directory
         */
        IO.copy(actual.file(path), expected.file(path));

        /*
         * Update the copy in the source for future runs
         */
        final String sourcePath = expected.get().getAbsolutePath().replace("/target/test-classes/", "/src/test/resources/");
        final Project sources = Project.from(new File(sourcePath));
        IO.copy(actual.file(path), sources.file(path));

    }
}
