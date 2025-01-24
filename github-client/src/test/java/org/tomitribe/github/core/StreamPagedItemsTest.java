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
package org.tomitribe.github.core;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.openejb.util.Join;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class StreamPagedItemsTest {

    private static URI uri;

    @BeforeClass
    public static void before() throws Exception {
        uri = MockGithub.run();
    }

    private SearchClient getClient() {
        return ClientFactory.builder()
                .accessToken("23456789dfghjklkjhgfdsdfghuiytrewertyui")
                .host(uri)
                .build()
                .getClient(SearchClient.class);
    }

    public interface SearchClient {
        @GET
        @Path("/search/repositories")
        @Paged(RepositoriesPage.class)
        Stream<Repository> searchRepositories(@QueryParam("q") final String queryString);
    }

    @Test
    public void listNames() throws Exception {

        final SearchClient client = getClient();

        final List<Repository> list = client.searchRepositories("tomee").collect(Collectors.toList());
        final List<String> actual = list.stream()
                .map(Repository::getName)
                .collect(Collectors.toList());
        assertEquals("tomee\n" +
                "docker-tomee\n" +
                "tomee-jaxrs-starter-project\n" +
                "tomee-buildpack\n" +
                "tomee-site-generator\n" +
                "tomee-jaxrs-angular-starter-project\n" +
                "tomee-tck\n" +
                "javaee7-samples\n" +
                "docker_tomee\n" +
                "tomeemaven\n" +
                "tomee-buildpack-resource-configuration\n" +
                "tomee-chatterbox\n" +
                "tomee-site\n" +
                "oscm\n" +
                "docklands\n" +
                "tomee-mongodb-starter-project\n" +
                "vaadinized-tomee-jee6-app-stub\n" +
                "heroku-buildpack-tomee\n" +
                "50-shades-of-tomee\n" +
                "tomcat_to_tomee\n" +
                "tomee-jboss-forge-plugin\n" +
                "cargo\n" +
                "tomee-mvn-installation-example\n" +
                "persistence-test\n" +
                "mongo-realm\n" +
                "tomee\n" +
                "tomee-cli\n" +
                "openshift-cartridge-tomee\n" +
                "tomee-mvn-plugin-jpa21-setup\n" +
                "site-tomee-ng\n" +
                "custom-maven-archetypes\n" +
                "wad\n" +
                "TomEE-Boot-Example\n" +
                "tomee-hibernate-jpa-test\n" +
                "tomee-dev2ops\n" +
                "jcache-tomee\n" +
                "tomee-boot\n" +
                "chef-tomee\n" +
                "tomee-maven-demo\n" +
                "docker-tomee\n" +
                "skeleton-starter-flow-cdi\n" +
                "TomEE\n" +
                "nes-controller\n" +
                "Quickstart-JSF2.3-Samples\n" +
                "MdbExample\n" +
                "hello-prometheus\n" +
                "canjs-tomee-sample\n" +
                "swagger-in-tomee\n" +
                "TomEE-JavaEE7-demo\n" +
                "tomee-issue-2143-example\n" +
                "Vagrant4SIW\n" +
                "watchedmovies\n" +
                "TomeePOM\n" +
                "tomeeDemo\n" +
                "TomeeTest\n" +
                "tomee7-example\n" +
                "TomeePolygot\n" +
                "tomee704\n" +
                "tomee2027\n" +
                "tomeeEJB\n" +
                "Tomeek26-\n" +
                "tomee1\n" +
                "TomeeAnsible\n" +
                "heroes-service\n" +
                "Tomee170\n" +
                "tomeeSkeleton\n" +
                "TomeeCDITest\n" +
                "tomee-microprofile-rest-client-demo\n" +
                "FitTrackerAppServer\n" +
                "tomee-t01\n" +
                "tomee7-plus\n" +
                "tomeeBuildPack\n" +
                "tomeeVm\n" +
                "Tomee20000\n" +
                "TomeeMdbTest\n" +
                "tomee-codi\n" +
                "TomeeEnumRest\n" +
                "TomeeDeltaEar\n" +
                "TomeeJaxrsValidation\n" +
                "tomeeeS.github.io\n" +
                "tomee16-clickstack\n" +
                "tomee7-control\n" +
                "my-tomee17-examples\n" +
                "tomee17-ejb-topics\n" +
                "TomeeMdbDebug\n" +
                "TomeeRestfulWs\n" +
                "tomee7-hibernate-archetype\n" +
                "tomeekk20.github.io\n" +
                "tomee-flyway\n" +
                "projet-C1-2018\n" +
                "TomeeBlobTest\n" +
                "tomee17-templates\n" +
                "tomee17mauro\n" +
                "nbpfcrudgen-lazytest-tomee7\n" +
                "tomee7-dev-starter\n" +
                "tomee17-mdb-topics\n" +
                "TomeeDsValidation\n" +
                "training\n" +
                "Tomeer333.github.io\n" +
                "tomee\n" +
                "tomeekk6.github.io\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "BaseTomeeApp\n" +
                "Tomee\n" +
                "Tomee\n" +
                "prova_tomee1.7.3\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "ocp-tomee7-jaxrs-po\n" +
                "tomee\n" +
                "Tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "mongotest\n" +
                "tomee\n" +
                "tomee\n" +
                "ejb31-tomeeplus172-snippets\n" +
                "tomee\n" +
                "POC-Tomee-Servlet\n" +
                "TOMEE\n" +
                "DeltaspikeEar\n" +
                "docker-image-apache-tomee\n" +
                "tomeevaadin\n" +
                "tomeemailtest\n" +
                "tomeeto\n" +
                "tomee-sample\n" +
                "apps.tomee\n" +
                "simple-singleton\n" +
                "tomee-samples\n" +
                "jta_test\n" +
                "Themes-tomee1.7.1-plus-deltaspike\n" +
                "mytestcrud-tomee1.7.2plus\n" +
                "tomee-juju\n" +
                "TomEE\n" +
                "tomee-site-pub\n" +
                "SigreRHEE\n" +
                "ntm_servers\n" +
                "tomee-sample\n" +
                "tomee-patch-plugin\n" +
                "javaee-tomee-jpa\n" +
                "todolist\n" +
                "tomee-example\n" +
                "tomee-ear\n" +
                "tomee-microprofile-config\n" +
                "tomee-microprofile-config\n" +
                "moviefun\n" +
                "tomeediy\n" +
                "openshift-tomee-rest-example\n" +
                "TomEE_Deployer_In_Ansible\n" +
                "generator-jangular\n" +
                "tomEEexample\n" +
                "tomeetest\n" +
                "tomeeaxis\n" +
                "mytest_tomee1.7.2_no-cdi\n" +
                "datasource-tomee\n" +
                "apache-tomee-plus-1.7.4\n" +
                "tomeefreezetestcase\n" +
                "tomeeherokudemo\n" +
                "tomeenfm\n" +
                "tomeetsleather\n" +
                "tomeetoo\n" +
                "tomeeapp\n" +
                "Sample\n" +
                "ASTomEE\n" +
                "tomee-spring\n" +
                "sample-tomee-heroku\n" +
                "cloud-employeeslistapp-tomee\n" +
                "tomee-war\n" +
                "tomee-eclipse-plugin\n" +
                "tomeedemo\n" +
                "tomEE\n" +
                "toMee\n" +
                "tomeeapp\n" +
                "tomeebug\n" +
                "TomEE\n" +
                "boxdata\n" +
                "tomEE\n" +
                "TomEE\n" +
                "TomEE\n" +
                "tomEE\n" +
                "tomee-hibernate\n" +
                "tomee-bluemix\n" +
                "tomee-jaxrs\n" +
                "TomEEServlets\n" +
                "tomee-camel\n" +
                "jsf-batch-example\n" +
                "clusterize\n" +
                "test-jee\n" +
                "address-manager\n" +
                "embedded_tomee\n" +
                "vagrant_tomee\n" +
                "tomee_test\n" +
                "Ignite\n" +
                "tomee-hello-jax-rs-jpa\n" +
                "tomee-sample\n" +
                "openshift-default-tomee-app\n" +
                "backend\n" +
                "tomee-test\n" +
                "tomee-plume\n" +
                "tomee-cditest\n" +
                "tomee-clickstack\n" +
                "prjTomee\n" +
                "tomee_vestige\n" +
                "tomee-build\n" +
                "tomee-jstl-test\n" +
                "tomee-boot\n" +
                "java-mp-tomtribe-tomee-maven-example\n" +
                "OEIS-Enhancer\n" +
                "CaseBook\n" +
                "test-tomee\n" +
                "tomee_hazelcast\n" +
                "Jenkins_Tomee\n" +
                "tomee-embedded\n" +
                "tomee-composition\n" +
                "tomee-tck\n" +
                "tomee-example\n" +
                "EJB_3-X-on-tomee-plus\n" +
                "tomee-charm-layer\n" +
                "MongoEclipse\n" +
                "vagrant-tomee\n" +
                "demo-tomee\n" +
                "rest-tomee\n" +
                "ToMeet\n" +
                "tomee-manual\n" +
                "TomEECDI\n" +
                "tomee-jaas\n" +
                "microprofile-tomee\n" +
                "tomee-jakarta\n" +
                "tomee-boot-xtend\n" +
                "hello_ejb\n" +
                "tomee-jsf-managedBean-and-ejb\n" +
                "TomEEArchetype\n" +
                "tomee-sample\n" +
                "GoTomeeting", Join.join("\n", actual));
    }

    @Test
    public void fullRecord() throws Exception {

        final String expectedJson = "{\n" +
                "  \"archive_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/{archive_format}{/ref}\",\n" +
                "  \"archived\":false,\n" +
                "  \"assignees_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/assignees{/user}\",\n" +
                "  \"blobs_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/git/blobs{/sha}\",\n" +
                "  \"branches_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/branches{/branch}\",\n" +
                "  \"clone_url\":\"https://github.com/EmilLubomirov/CaseBook.git\",\n" +
                "  \"collaborators_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/collaborators{/collaborator}\",\n" +
                "  \"comments_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/comments{/number}\",\n" +
                "  \"commits_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/commits{/sha}\",\n" +
                "  \"compare_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/compare/{base}...{head}\",\n" +
                "  \"contents_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/contents/{+path}\",\n" +
                "  \"contributors_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/contributors\",\n" +
                "  \"created_at\":\"2020-06-27T08:52:58Z\",\n" +
                "  \"default_branch\":\"master\",\n" +
                "  \"deployments_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/deployments\",\n" +
                "  \"description\":\"Application with Java and TomEE\",\n" +
                "  \"disabled\":false,\n" +
                "  \"downloads_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/downloads\",\n" +
                "  \"events_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/events\",\n" +
                "  \"fork\":false,\n" +
                "  \"forks\":0,\n" +
                "  \"forks_count\":0,\n" +
                "  \"forks_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/forks\",\n" +
                "  \"full_name\":\"EmilLubomirov/CaseBook\",\n" +
                "  \"git_commits_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/git/commits{/sha}\",\n" +
                "  \"git_refs_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/git/refs{/sha}\",\n" +
                "  \"git_tags_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/git/tags{/sha}\",\n" +
                "  \"git_url\":\"git://github.com/EmilLubomirov/CaseBook.git\",\n" +
                "  \"has_downloads\":true,\n" +
                "  \"has_issues\":true,\n" +
                "  \"has_pages\":false,\n" +
                "  \"has_projects\":true,\n" +
                "  \"has_wiki\":true,\n" +
                "  \"hooks_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/hooks\",\n" +
                "  \"html_url\":\"https://github.com/EmilLubomirov/CaseBook\",\n" +
                "  \"id\":275334258,\n" +
                "  \"issue_comment_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/issues/comments{/number}\",\n" +
                "  \"issue_events_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/issues/events{/number}\",\n" +
                "  \"issues_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/issues{/number}\",\n" +
                "  \"keys_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/keys{/key_id}\",\n" +
                "  \"labels_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/labels{/name}\",\n" +
                "  \"language\":\"Java\",\n" +
                "  \"languages_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/languages\",\n" +
                "  \"merges_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/merges\",\n" +
                "  \"milestones_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/milestones{/number}\",\n" +
                "  \"name\":\"CaseBook\",\n" +
                "  \"node_id\":\"MDEwOlJlcG9zaXRvcnkyNzUzMzQyNTg=\",\n" +
                "  \"notifications_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/notifications{?since,all,participating}\",\n" +
                "  \"open_issues\":0,\n" +
                "  \"open_issues_count\":0,\n" +
                "  \"owner\":{\n" +
                "    \"avatar_url\":\"https://avatars3.githubusercontent.com/u/52040772?v=4\",\n" +
                "    \"events_url\":\"https://api.github.com/users/EmilLubomirov/events{/privacy}\",\n" +
                "    \"followers_url\":\"https://api.github.com/users/EmilLubomirov/followers\",\n" +
                "    \"following_url\":\"https://api.github.com/users/EmilLubomirov/following{/other_user}\",\n" +
                "    \"gists_url\":\"https://api.github.com/users/EmilLubomirov/gists{/gist_id}\",\n" +
                "    \"gravatar_id\":\"\",\n" +
                "    \"html_url\":\"https://github.com/EmilLubomirov\",\n" +
                "    \"id\":52040772,\n" +
                "    \"login\":\"EmilLubomirov\",\n" +
                "    \"node_id\":\"MDQ6VXNlcjUyMDQwNzcy\",\n" +
                "    \"organizations_url\":\"https://api.github.com/users/EmilLubomirov/orgs\",\n" +
                "    \"received_events_url\":\"https://api.github.com/users/EmilLubomirov/received_events\",\n" +
                "    \"repos_url\":\"https://api.github.com/users/EmilLubomirov/repos\",\n" +
                "    \"site_admin\":false,\n" +
                "    \"starred_url\":\"https://api.github.com/users/EmilLubomirov/starred{/owner}{/repo}\",\n" +
                "    \"subscriptions_url\":\"https://api.github.com/users/EmilLubomirov/subscriptions\",\n" +
                "    \"type\":\"User\",\n" +
                "    \"url\":\"https://api.github.com/users/EmilLubomirov\"\n" +
                "  },\n" +
                "  \"private\":false,\n" +
                "  \"pulls_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/pulls{/number}\",\n" +
                "  \"pushed_at\":\"2020-06-27T08:58:11Z\",\n" +
                "  \"releases_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/releases{/id}\",\n" +
                "  \"score\":1.0,\n" +
                "  \"size\":44,\n" +
                "  \"ssh_url\":\"git@github.com:EmilLubomirov/CaseBook.git\",\n" +
                "  \"stargazers_count\":0,\n" +
                "  \"stargazers_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/stargazers\",\n" +
                "  \"statuses_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/statuses/{sha}\",\n" +
                "  \"subscribers_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/subscribers\",\n" +
                "  \"subscription_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/subscription\",\n" +
                "  \"svn_url\":\"https://github.com/EmilLubomirov/CaseBook\",\n" +
                "  \"tags_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/tags\",\n" +
                "  \"teams_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/teams\",\n" +
                "  \"trees_url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook/git/trees{/sha}\",\n" +
                "  \"updated_at\":\"2020-06-27T08:58:14Z\",\n" +
                "  \"url\":\"https://api.github.com/repos/EmilLubomirov/CaseBook\",\n" +
                "  \"watchers\":0,\n" +
                "  \"watchers_count\":0\n" +
                "}";

        final Repository actual = getClient().searchRepositories("q=tomee")
                .filter(repository -> repository.getName().equals("CaseBook"))
                .findFirst()
                .get();

        JsonAsserts.assertJsonb(expectedJson, actual);
    }

    /**
     * Two streams that produce overlapping results can be merged
     * into one distinct stream allowing "or" searches.
     */
    @Test
    public void searchesCanBeJoinedDistinctly() throws Exception {

        final SearchClient client = getClient();

        /*
         * Produce a stream with duplicate entries, but not duplicate instances
         */
        final List<String> actual = Stream.concat(
                        client.searchRepositories("q=tomee"),
                        client.searchRepositories("q=tomee"))
                .distinct()
                .map(Repository::getName)
                .collect(Collectors.toList());

        /*
         * Ensure the stream can be joined distinctly (no duplicates)
         */
        assertEquals("tomee\n" +
                "docker-tomee\n" +
                "tomee-jaxrs-starter-project\n" +
                "tomee-buildpack\n" +
                "tomee-site-generator\n" +
                "tomee-jaxrs-angular-starter-project\n" +
                "tomee-tck\n" +
                "javaee7-samples\n" +
                "docker_tomee\n" +
                "tomeemaven\n" +
                "tomee-buildpack-resource-configuration\n" +
                "tomee-chatterbox\n" +
                "tomee-site\n" +
                "oscm\n" +
                "docklands\n" +
                "tomee-mongodb-starter-project\n" +
                "vaadinized-tomee-jee6-app-stub\n" +
                "heroku-buildpack-tomee\n" +
                "50-shades-of-tomee\n" +
                "tomcat_to_tomee\n" +
                "tomee-jboss-forge-plugin\n" +
                "cargo\n" +
                "tomee-mvn-installation-example\n" +
                "persistence-test\n" +
                "mongo-realm\n" +
                "tomee\n" +
                "tomee-cli\n" +
                "openshift-cartridge-tomee\n" +
                "tomee-mvn-plugin-jpa21-setup\n" +
                "site-tomee-ng\n" +
                "custom-maven-archetypes\n" +
                "wad\n" +
                "TomEE-Boot-Example\n" +
                "tomee-hibernate-jpa-test\n" +
                "tomee-dev2ops\n" +
                "jcache-tomee\n" +
                "tomee-boot\n" +
                "chef-tomee\n" +
                "tomee-maven-demo\n" +
                "docker-tomee\n" +
                "skeleton-starter-flow-cdi\n" +
                "TomEE\n" +
                "nes-controller\n" +
                "Quickstart-JSF2.3-Samples\n" +
                "MdbExample\n" +
                "hello-prometheus\n" +
                "canjs-tomee-sample\n" +
                "swagger-in-tomee\n" +
                "TomEE-JavaEE7-demo\n" +
                "tomee-issue-2143-example\n" +
                "Vagrant4SIW\n" +
                "watchedmovies\n" +
                "TomeePOM\n" +
                "tomeeDemo\n" +
                "TomeeTest\n" +
                "tomee7-example\n" +
                "TomeePolygot\n" +
                "tomee704\n" +
                "tomee2027\n" +
                "tomeeEJB\n" +
                "Tomeek26-\n" +
                "tomee1\n" +
                "TomeeAnsible\n" +
                "heroes-service\n" +
                "Tomee170\n" +
                "tomeeSkeleton\n" +
                "TomeeCDITest\n" +
                "tomee-microprofile-rest-client-demo\n" +
                "FitTrackerAppServer\n" +
                "tomee-t01\n" +
                "tomee7-plus\n" +
                "tomeeBuildPack\n" +
                "tomeeVm\n" +
                "Tomee20000\n" +
                "TomeeMdbTest\n" +
                "tomee-codi\n" +
                "TomeeEnumRest\n" +
                "TomeeDeltaEar\n" +
                "TomeeJaxrsValidation\n" +
                "tomeeeS.github.io\n" +
                "tomee16-clickstack\n" +
                "tomee7-control\n" +
                "my-tomee17-examples\n" +
                "tomee17-ejb-topics\n" +
                "TomeeMdbDebug\n" +
                "TomeeRestfulWs\n" +
                "tomee7-hibernate-archetype\n" +
                "tomeekk20.github.io\n" +
                "tomee-flyway\n" +
                "projet-C1-2018\n" +
                "TomeeBlobTest\n" +
                "tomee17-templates\n" +
                "tomee17mauro\n" +
                "nbpfcrudgen-lazytest-tomee7\n" +
                "tomee7-dev-starter\n" +
                "tomee17-mdb-topics\n" +
                "TomeeDsValidation\n" +
                "training\n" +
                "Tomeer333.github.io\n" +
                "tomee\n" +
                "tomeekk6.github.io\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "BaseTomeeApp\n" +
                "Tomee\n" +
                "Tomee\n" +
                "prova_tomee1.7.3\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "ocp-tomee7-jaxrs-po\n" +
                "tomee\n" +
                "Tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "tomee\n" +
                "mongotest\n" +
                "tomee\n" +
                "tomee\n" +
                "ejb31-tomeeplus172-snippets\n" +
                "tomee\n" +
                "POC-Tomee-Servlet\n" +
                "TOMEE\n" +
                "DeltaspikeEar\n" +
                "docker-image-apache-tomee\n" +
                "tomeevaadin\n" +
                "tomeemailtest\n" +
                "tomeeto\n" +
                "tomee-sample\n" +
                "apps.tomee\n" +
                "simple-singleton\n" +
                "tomee-samples\n" +
                "jta_test\n" +
                "Themes-tomee1.7.1-plus-deltaspike\n" +
                "mytestcrud-tomee1.7.2plus\n" +
                "tomee-juju\n" +
                "TomEE\n" +
                "tomee-site-pub\n" +
                "SigreRHEE\n" +
                "ntm_servers\n" +
                "tomee-sample\n" +
                "tomee-patch-plugin\n" +
                "javaee-tomee-jpa\n" +
                "todolist\n" +
                "tomee-example\n" +
                "tomee-ear\n" +
                "tomee-microprofile-config\n" +
                "moviefun\n" +
                "tomeediy\n" +
                "openshift-tomee-rest-example\n" +
                "TomEE_Deployer_In_Ansible\n" +
                "generator-jangular\n" +
                "tomEEexample\n" +
                "tomeetest\n" +
                "tomeeaxis\n" +
                "mytest_tomee1.7.2_no-cdi\n" +
                "datasource-tomee\n" +
                "apache-tomee-plus-1.7.4\n" +
                "tomeefreezetestcase\n" +
                "tomeeherokudemo\n" +
                "tomeenfm\n" +
                "tomeetsleather\n" +
                "tomeetoo\n" +
                "tomeeapp\n" +
                "Sample\n" +
                "ASTomEE\n" +
                "tomee-spring\n" +
                "sample-tomee-heroku\n" +
                "cloud-employeeslistapp-tomee\n" +
                "tomee-war\n" +
                "tomee-eclipse-plugin\n" +
                "tomeedemo\n" +
                "tomEE\n" +
                "toMee\n" +
                "tomeeapp\n" +
                "tomeebug\n" +
                "TomEE\n" +
                "boxdata\n" +
                "tomEE\n" +
                "TomEE\n" +
                "TomEE\n" +
                "tomEE\n" +
                "tomee-hibernate\n" +
                "tomee-bluemix\n" +
                "tomee-jaxrs\n" +
                "TomEEServlets\n" +
                "tomee-camel\n" +
                "jsf-batch-example\n" +
                "clusterize\n" +
                "test-jee\n" +
                "address-manager\n" +
                "embedded_tomee\n" +
                "vagrant_tomee\n" +
                "tomee_test\n" +
                "Ignite\n" +
                "tomee-hello-jax-rs-jpa\n" +
                "tomee-sample\n" +
                "openshift-default-tomee-app\n" +
                "backend\n" +
                "tomee-test\n" +
                "tomee-plume\n" +
                "tomee-cditest\n" +
                "tomee-clickstack\n" +
                "prjTomee\n" +
                "tomee_vestige\n" +
                "tomee-build\n" +
                "tomee-jstl-test\n" +
                "tomee-boot\n" +
                "java-mp-tomtribe-tomee-maven-example\n" +
                "OEIS-Enhancer\n" +
                "CaseBook\n" +
                "test-tomee\n" +
                "tomee_hazelcast\n" +
                "Jenkins_Tomee\n" +
                "tomee-embedded\n" +
                "tomee-composition\n" +
                "tomee-tck\n" +
                "tomee-example\n" +
                "EJB_3-X-on-tomee-plus\n" +
                "tomee-charm-layer\n" +
                "MongoEclipse\n" +
                "vagrant-tomee\n" +
                "demo-tomee\n" +
                "rest-tomee\n" +
                "ToMeet\n" +
                "tomee-manual\n" +
                "TomEECDI\n" +
                "tomee-jaas\n" +
                "microprofile-tomee\n" +
                "tomee-jakarta\n" +
                "tomee-boot-xtend\n" +
                "hello_ejb\n" +
                "tomee-jsf-managedBean-and-ejb\n" +
                "TomEEArchetype\n" +
                "tomee-sample\n" +
                "GoTomeeting", Join.join("\n", actual));
    }


    @Path("/search/repositories")
    public static class MockGithub {
        @GET
        public Response page(@QueryParam("page") int page) throws IOException {

            if (page == 0) page = 1;

            final Link link = TestLinks.getLink(uri, "%s/search/repositories?q=tomee&page=%s", page, 8);

            return Response.ok()
                    .header("Link", link.asHeader())
                    .entity(read(String.format("page%s.json", page)))
                    .build();
        }

        private String read(final String name) throws IOException {
            return Resources.read(StreamPagedItemsTest.class, name);
        }

        public static URI run() throws Exception {
            return MockService.run(MockGithub.class);
        }

    }

    @Data
    @lombok.Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Repository {

        /**
         * Odd upper-case P required to get around
         * the fact that "private" is a keyword
         */
        @JsonbProperty("private")
        @SuppressWarnings("PMD.FieldNamingConventions")
        private Boolean // TODO file bug that capitol P cannot be used
                _private;

        @JsonbProperty("allow_merge_commit")
        private Boolean allowMergeCommit;

        @JsonbProperty("allow_rebase_merge")
        private Boolean allowRebaseMerge;

        @JsonbProperty("allow_squash_merge")
        private Boolean allowSquashMerge;

        @JsonbProperty("archive_url")
        private String archiveUrl;

        @JsonbProperty("archived")
        private Boolean archived;

        @JsonbProperty("assignees_url")
        private String assigneesUrl;

        @JsonbProperty("blobs_url")
        private String blobsUrl;

        @JsonbProperty("branches_url")
        private String branchesUrl;

        @JsonbProperty("clone_url")
        private String cloneUrl;

        @JsonbProperty("collaborators_url")
        private String collaboratorsUrl;

        @JsonbProperty("comments_url")
        private String commentsUrl;

        @JsonbProperty("commits_url")
        private String commitsUrl;

        @JsonbProperty("compare_url")
        private String compareUrl;

        @JsonbProperty("contents_url")
        private String contentsUrl;

        @JsonbProperty("contributors_url")
        private String contributorsUrl;

        @JsonbProperty("created_at")
        private String createdAt;

        @JsonbProperty("default_branch")
        private String defaultBranch;

        @JsonbProperty("deployments_url")
        private String deploymentsUrl;

        @JsonbProperty("description")
        private String description;

        @JsonbProperty("disabled")
        private Boolean disabled;

        @JsonbProperty("downloads_url")
        private String downloadsUrl;

        @JsonbProperty("events_url")
        private String eventsUrl;

        @JsonbProperty("fork")
        private Boolean fork;

        @JsonbProperty("forks")
        private Long forks;

        @JsonbProperty("forks_count")
        private Long forksCount;

        @JsonbProperty("forks_url")
        private String forksUrl;

        @JsonbProperty("full_name")
        private String fullName;

        @JsonbProperty("git_commits_url")
        private String gitCommitsUrl;

        @JsonbProperty("git_refs_url")
        private String gitRefsUrl;

        @JsonbProperty("git_tags_url")
        private String gitTagsUrl;

        @JsonbProperty("git_url")
        private String gitUrl;

        @JsonbProperty("has_downloads")
        private Boolean hasDownloads;

        @JsonbProperty("has_issues")
        private Boolean hasIssues;

        @JsonbProperty("has_pages")
        private Boolean hasPages;

        @JsonbProperty("has_projects")
        private Boolean hasProjects;

        @JsonbProperty("has_wiki")
        private Boolean hasWiki;

        @JsonbProperty("homepage")
        private String homepage;

        @JsonbProperty("hooks_url")
        private String hooksUrl;

        @JsonbProperty("html_url")
        private String htmlUrl;

        @JsonbProperty("id")
        private Long id;

        @JsonbProperty("is_template")
        private Boolean isTemplate;

        @JsonbProperty("issue_comment_url")
        private String issueCommentUrl;

        @JsonbProperty("issue_events_url")
        private String issueEventsUrl;

        @JsonbProperty("issues_url")
        private String issuesUrl;

        @JsonbProperty("keys_url")
        private String keysUrl;

        @JsonbProperty("labels_url")
        private String labelsUrl;

        @JsonbProperty("language")
        private String language;

        @JsonbProperty("languages_url")
        private String languagesUrl;

        @JsonbProperty("license")
        private License license;

        @JsonbProperty("master_branch")
        private String masterBranch;

        @JsonbProperty("merges_url")
        private String mergesUrl;

        @JsonbProperty("milestones_url")
        private String milestonesUrl;

        @JsonbProperty("mirror_url")
        private String mirrorUrl;

        @JsonbProperty("name")
        private String name;

        @JsonbProperty("network_count")
        private Integer networkCount;

        @JsonbProperty("node_id")
        private String nodeId;

        @JsonbProperty("notifications_url")
        private String notificationsUrl;

        @JsonbProperty("open_issues")
        private Long openIssues;

        @JsonbProperty("open_issues_count")
        private Long openIssuesCount;

        @JsonbProperty("owner")
        private Owner owner;

        @JsonbProperty("permissions")
        private Permissions permissions;

        @JsonbProperty("pulls_url")
        private String pullsUrl;

        @JsonbProperty("pushed_at")
        private String pushedAt;

        @JsonbProperty("releases_url")
        private String releasesUrl;

        @JsonbProperty("score")
        private Double score;

        @JsonbProperty("size")
        private Long size;

        @JsonbProperty("ssh_url")
        private String sshUrl;

        @JsonbProperty("stargazers")
        private Long stargazers;

        @JsonbProperty("stargazers_count")
        private Long stargazersCount;

        @JsonbProperty("stargazers_url")
        private String stargazersUrl;

        @JsonbProperty("statuses_url")
        private String statusesUrl;

        @JsonbProperty("subscribers_count")
        private Integer subscribersCount;

        @JsonbProperty("subscribers_url")
        private String subscribersUrl;

        @JsonbProperty("subscription_url")
        private String subscriptionUrl;

        @JsonbProperty("svn_url")
        private String svnUrl;

        @JsonbProperty("tags_url")
        private String tagsUrl;

        @JsonbProperty("teams_url")
        private String teamsUrl;

        @JsonbProperty("topics")
        private List<String> topics;

        @JsonbProperty("trees_url")
        private String treesUrl;

        @JsonbProperty("updated_at")
        private String updatedAt;

        @JsonbProperty("url")
        private String url;

        @JsonbProperty("watchers")
        private Long watchers;

        @JsonbProperty("watchers_count")
        private Long watchersCount;
    }

    @Data
    @lombok.Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Permissions {

        @JsonbProperty("admin")
        private Boolean admin;

        @JsonbProperty("administration")
        private String administration;

        @JsonbProperty("checks")
        private String checks;

        @JsonbProperty("contents")
        private String contents;

        @JsonbProperty("deployments")
        private String deployments;

        @JsonbProperty("issues")
        private String issues;

        @JsonbProperty("members")
        private String members;

        @JsonbProperty("metadata")
        private String metadata;

        @JsonbProperty("organization_administration")
        private String organizationAdministration;

        @JsonbProperty("organization_hooks")
        private String organizationHooks;

        @JsonbProperty("organization_plan")
        private String organizationPlan;

        @JsonbProperty("organization_projects")
        private String organizationProjects;

        @JsonbProperty("organization_user_blocking")
        private String organizationUserBlocking;

        @JsonbProperty("pages")
        private String pages;

        @JsonbProperty("pull")
        private Boolean pull;

        @JsonbProperty("pull_requests")
        private String pullRequests;

        @JsonbProperty("push")
        private Boolean push;

        @JsonbProperty("repository_hooks")
        private String repositoryHooks;

        @JsonbProperty("repository_projects")
        private String repositoryProjects;

        @JsonbProperty("statuses")
        private String statuses;

        @JsonbProperty("team_discussions")
        private String teamDiscussions;

        @JsonbProperty("vulnerability_alerts")
        private String vulnerabilityAlerts;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class License {

        @JsonbProperty("key")
        private String key;

        @JsonbProperty("name")
        private String name;

        @JsonbProperty("node_id")
        private String nodeId;

        @JsonbProperty("spdx_id")
        private String spdxId;

        @JsonbProperty("url")
        private URI url;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Owner {

        @JsonbProperty("avatar_url")
        private String avatarUrl;

        @JsonbProperty("email")
        private String email;

        @JsonbProperty("events_url")
        private String eventsUrl;

        @JsonbProperty("followers_url")
        private String followersUrl;

        @JsonbProperty("following_url")
        private String followingUrl;

        @JsonbProperty("gists_url")
        private String gistsUrl;

        @JsonbProperty("gravatar_id")
        private String gravatarId;

        @JsonbProperty("html_url")
        private String htmlUrl;

        @JsonbProperty("id")
        private Long id;

        @JsonbProperty("login")
        private String login;

        @JsonbProperty("name")
        private String name;

        @JsonbProperty("node_id")
        private String nodeId;

        @JsonbProperty("organizations_url")
        private String organizationsUrl;

        @JsonbProperty("received_events_url")
        private String receivedEventsUrl;

        @JsonbProperty("repos_url")
        private String reposUrl;

        @JsonbProperty("site_admin")
        private Boolean siteAdmin;

        @JsonbProperty("starred_url")
        private String starredUrl;

        @JsonbProperty("subscriptions_url")
        private String subscriptionsUrl;

        @JsonbProperty("type")
        private String type;

        @JsonbProperty("url")
        private String url;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RepositoriesPage {

        @JsonbProperty("incomplete_results")
        private Boolean incompleteResults;

        @JsonbProperty("items")
        private List<Repository> items;

        @JsonbProperty("total_count")
        private Long totalCount;
    }
}