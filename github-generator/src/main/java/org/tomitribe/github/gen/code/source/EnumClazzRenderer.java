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

import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import org.tomitribe.github.core.EnumAdapter;
import org.tomitribe.github.gen.EnumDefinition;
import org.tomitribe.github.gen.Package;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.model.EnumClazz;

import java.util.logging.Logger;

public class EnumClazzRenderer {

    static final Logger LOGGER = Logger.getLogger(EnumClazzRenderer.class.getSimpleName());

    private final Project project;
    private final String packageName;
    private final Template template;

    public EnumClazzRenderer(final Project project, final String packageName) {
        this.project = project;
        this.packageName = packageName;
        this.template = Template.builder()
                .templateName("Enum")
                .packageName(packageName)
                .build();
    }

    public void render(final EnumClazz clazz) {
        if (clazz.getName() == null) {
            LOGGER.warning("Class has no name: " + clazz);
            return;
        }
        final String className = clazz.getName().getSimpleName();
        final Package aPackage = project.src().main().java().packageName(packageName);

        LOGGER.info(String.format("Generating class '%s'", clazz.getName()));

        final EnumDefinition definition = template.parseEnum(className);

        definition.addImport(JsonbTypeAdapter.class);
        definition.addImport(EnumAdapter.class);

        for (final String value : clazz.getValues()) {
            final String constant = EnumClazz.asConstant(value);

            // Some github enums have dashes such as "long-running"
            // We need a version that is safe to be used as the constant

            final EnumConstantDeclaration constantDeclaration = new EnumConstantDeclaration(constant);
            constantDeclaration.addArgument(new StringLiteralExpr(value));
            definition.addEntry(constantDeclaration);
        }


        aPackage.write(className + ".java", definition.clean().toString());
    }

}
