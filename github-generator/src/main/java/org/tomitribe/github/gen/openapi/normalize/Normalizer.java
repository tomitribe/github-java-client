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
package org.tomitribe.github.gen.openapi.normalize;

import lombok.Builder;
import org.tomitribe.github.gen.openapi.OpenApi;

import java.util.function.Function;

@Builder(builderClassName = "Builder")
public class Normalizer implements Function<OpenApi, OpenApi> {

    private final Filter webhooks;
    private final Filter paths;
    private final Filter categories;
    private final Filter subcategories;
    private final Filter operationId;

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi == null) return null;
        return Function.<OpenApi>identity()
                .andThen(new FilterPaths(paths))
                .andThen(new FilterWebhooks(webhooks))
                .andThen(new FilterCategory(categories))
                .andThen(new FilterSubcategory(subcategories))
                .andThen(new FilterOperationId(operationId))
                .andThen(new AddSummary())
                .andThen(new AddCategory())
                .andThen(new InlineParameterRefs())
                .andThen(new GraduateEnumsFromParameters())
                .andThen(new PruneUnusedSchema())
                .andThen(new PruneEmptyComponents())
                .apply(openApi);
    }
}
