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
package $PACKAGE_NAME$;

import org.tomitribe.github.core.EnumAdapter;

public class ModelEnum {

    public enum $SIMPLE_CLASS_NAME$ {
        ;
        private final String name;

        $SIMPLE_CLASS_NAME$(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class $SIMPLE_CLASS_NAME$Adapter extends EnumAdapter<$SIMPLE_CLASS_NAME$> {
        public $SIMPLE_CLASS_NAME$Adapter() {
            super($SIMPLE_CLASS_NAME$.class);
        }
    }
}
