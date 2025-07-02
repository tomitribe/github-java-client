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

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;
import org.tomitribe.github.core.StringBooleanAdapter;
import org.tomitribe.github.gen.ClassDefinition;
import org.tomitribe.github.gen.EnumDefinition;
import org.tomitribe.github.gen.Package;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.EnumClazz;
import org.tomitribe.github.gen.code.model.Field;
import org.tomitribe.github.gen.code.model.Name;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.tomitribe.github.gen.code.model.Name.BOOLEAN;
import static org.tomitribe.github.gen.code.model.Name.DATE;
import static org.tomitribe.github.gen.code.model.Name.OBJECT;
import static org.tomitribe.github.gen.code.model.Name.STRING_BOOLEAN;

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

    public void addFields(final Clazz clazz, final ClassDefinition definition) {
        final List<String> enums = definition.selectEnums()
                .map(NodeWithSimpleName::getNameAsString)
                .collect(Collectors.toList());

        final Map<String, FieldDeclaration> fields = definition.mapFields();
        for (final Field field : clazz.getFields()) {
            final FieldDeclaration fieldDeclaration;
            final Name type = field.getType().equals(STRING_BOOLEAN) ? BOOLEAN : field.getType();

            if (fields.containsKey(field.getName())) {
                fieldDeclaration = fields.get(field.getName());
            } else {
                fieldDeclaration = definition.getClazz().addField(type.getSimpleName(), field.getName(), Modifier.Keyword.PRIVATE);
            }

            final VariableDeclarator variable = fieldDeclaration.getVariable(0);
            if (field.isCollection()) {

                variable.setType(String.format("List<%s>", type.getSimpleName()));

            } else if (field.isMap()) {

                variable.setType(String.format("Map<String, %s>", type.getSimpleName()));

            } else {
                if (OBJECT.equals(type)) {
                    /*
                     * If Clazz says the type is Object and the source already has a type,
                     * just use what ever type the source has and do not override it
                     */
                    if (variable.getType() == null) {
                        variable.setType(type.getSimpleName());
                    }
                } else {
                    variable.setType(type.getSimpleName());
                }
            }

            switch (field.getIn()) {
                case BODY: {
//                    definition.addAnnotation(fieldDeclaration, String.format("@JsonbProperty(\"%s\")", field.getJsonName()));
                    break;
                }
                case PATH: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@PathParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(PathParam.class);
                    break;
                }
                case QUERY: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@QueryParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(QueryParam.class);
                    break;
                }
                case HEADER: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@HeaderParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(HeaderParam.class);
                    break;
                }
                default:
                    throw new UnsupportedOperationException(field.getIn().name());
            }

            /*
             * TODO: Does not work for Enums declared externally
             */
            if (enums.contains(type.getSimpleName())) {
                definition.addAnnotation(fieldDeclaration, String.format("@JsonbTypeAdapter(%sAdapter.class)", type));
                definition.addImport(JsonbTypeAdapter.class);
            }

            if (DATE.equals(type)) {
                addAdapter(definition, fieldDeclaration, DateAdapter.class);
            }

            if (field.getType().equals(STRING_BOOLEAN)) {
                addAdapter(definition, fieldDeclaration, StringBooleanAdapter.class);
            }
        }
    }

    private static void addAdapter(final ClassDefinition definition, final FieldDeclaration fieldDeclaration, final Class<?> adapterClass) {
        definition.addAnnotation(fieldDeclaration, String.format("@JsonbTypeAdapter(%s.class)", adapterClass.getSimpleName()));
        definition.addImport(adapterClass);
        definition.addImport(JsonbTypeAdapter.class);
    }

}
