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
package org.tomitribe.github.core;

import jakarta.ws.rs.client.ClientBuilder;
import lombok.Builder;
import lombok.Data;

import java.lang.reflect.Proxy;
import java.net.URI;

@Data
@Builder(builderClassName = "Builder")
public class ClientFactory {

    private final String accessToken;
    private final URI host;

    public <Client> Client getClient(final Class<Client> clientClass) {
        final jakarta.ws.rs.client.Client client = ClientBuilder.newClient()
                .register(new MessageLogger.RequestFilter())
                .register(new MessageLogger.ResponseFilter());

        final Api api = Api.builder()
                .api(host)
                .client(client)
                .handler(builder -> builder.header("authorization", "token " + accessToken))
                .build();
        return (Client) Proxy.newProxyInstance(clientClass.getClassLoader(), new Class[]{clientClass}, new ClientHandler(api));
    }

}
