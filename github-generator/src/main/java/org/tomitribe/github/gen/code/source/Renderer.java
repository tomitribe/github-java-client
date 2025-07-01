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
package org.tomitribe.github.gen.code.source;

import lombok.Data;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.endpoint.Endpoint;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.EnumClazz;

@Data
public class Renderer {

    private final Project project;
    private final String clientPackage;
    private final String modelPackage;

    private final EndpointRenderer endpointRenderer;
    private final ClazzRenderer clazzRenderer;
    private final EnumClazzRenderer enumClazzRenderer;

    @lombok.Builder(builderClassName = "Builder")
    public Renderer(final String clientPackage, final String modelPackage, final Project project) {
        this.clientPackage = clientPackage;
        this.modelPackage = modelPackage;
        this.project = project;

        this.endpointRenderer = new EndpointRenderer(project, clientPackage, modelPackage);
        this.clazzRenderer = new ClazzRenderer(project, modelPackage);
        this.enumClazzRenderer = new EnumClazzRenderer(project, modelPackage);
    }

    public void render(final Clazz clazz) {
        if (clazz instanceof EnumClazz) {
            enumClazzRenderer.render((EnumClazz) clazz);
        } else {
            clazzRenderer.render(clazz);
        }
    }

    public void render(final Endpoint endpoint) {
        endpointRenderer.render(endpoint);
    }
}
