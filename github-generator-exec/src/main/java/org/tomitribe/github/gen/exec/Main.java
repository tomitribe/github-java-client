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
package org.tomitribe.github.gen.exec;

import org.tomitribe.github.gen.Generator;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.util.IO;
import org.tomitribe.util.JarLocation;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {

    private Main() {
    }

    public static void main(final String[] args) throws IOException {

        final URL resource = Main.class.getResource("/openapi.json");
        final String json = IO.slurp(resource);
        final OpenApi openApi = OpenApi.parse(json);

        final File testClasses = JarLocation.jarLocation(Main.class);
        final File target = testClasses.getParentFile();
        final File module = target.getParentFile();
        final File root = module.getParentFile();

        final File githubClientModule = new File(root, "github-client");
        final Project project = Project.from(githubClientModule);

        Generator.builder()
                .openApi(openApi)
                .project(project)
                .generateClient(true)
                .generateModel(true)
                .webhookPackage("org.tomitribe.github.webhook")
                .clientPackage("org.tomitribe.github.client")
                .modelPackage("org.tomitribe.github.model")
                .build()
                .generate();

    }
}
