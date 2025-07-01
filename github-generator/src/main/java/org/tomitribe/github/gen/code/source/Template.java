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

import lombok.Builder;
import org.tomitribe.github.gen.ClassDefinition;
import org.tomitribe.util.IO;

import java.io.IOException;
import java.io.UncheckedIOException;

@Builder(builderClassName = "Builder")
public class Template {

    private final String templateName;
    private final String packageName;


    public Template(final String templateName, final String packageName) {
        this.templateName = templateName;
        this.packageName = packageName;
    }

    public ClassDefinition define(final String simpleClassName) {
        final String content = classTemplate(simpleClassName);
        final ClassDefinition definition;
        try {
            definition = ClassDefinition.parse(content);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        if (definition.getClazz() == null) throw new IllegalStateException("Parsed clazz is null");
        return definition;
    }

    private String readTemplate(final String templateName) {
        final ClassLoader loader = this.getClass().getClassLoader();
        final String content;
        try {
            content = IO.slurp(loader.getResource("gen/templates/" + templateName + ".java"));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return content;
    }

    private String classTemplate(final String simpleClassName) {
        return readTemplate(templateName)
                .replace("$PACKAGE_NAME$", packageName)
                .replace("$SIMPLE_CLASS_NAME$", simpleClassName);
    }
}
