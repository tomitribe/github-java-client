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

import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.model.EnumClazz;

import java.util.logging.Logger;

public class EnumClazzRenderer {

    static final Logger LOGGER = Logger.getLogger(EnumClazzRenderer.class.getSimpleName());

    private final Project project;
    private final String packageName;

    public EnumClazzRenderer(final Project project, final String packageName) {
        this.project = project;
        this.packageName = packageName;
    }

    public void render(final EnumClazz clazz) {

    }
}
