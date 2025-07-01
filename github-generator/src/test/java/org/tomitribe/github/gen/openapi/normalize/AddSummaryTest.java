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

import static org.junit.Assert.*;

import org.junit.Test;

public class AddSummaryTest {

    @Test
    public void test() throws Exception {
        Normalizations.assertScenario(new AddSummary());
    }

    @Test
    public void testSimplePath() {
        assertEquals("Get Users", AddSummary.generate("GET", "/users"));
    }

    @Test
    public void testPathWithParam() {
        assertEquals("Get Users By User", AddSummary.generate("GET", "/users/{user}"));
    }

    @Test
    public void testPathWithMultipleParams() {
        assertEquals("Get Users By User Repos By Repo", AddSummary.generate("GET", "/users/{user}/repos/{repo}"));
    }

    @Test
    public void testPostPath() {
        assertEquals("Post Users By User Repos", AddSummary.generate("POST", "/users/{user}/repos"));
    }

    @Test
    public void testLeadingAndTrailingSlashes() {
        assertEquals("Get Users By User Repos", AddSummary.generate("GET", "/users/{user}/repos/"));
    }

    @Test
    public void testEmptyPath() {
        assertEquals("Get", AddSummary.generate("GET", ""));
    }

    @Test
    public void testRootPath() {
        assertEquals("Get", AddSummary.generate("GET", "/"));
    }

    @Test
    public void testComplexCase() {
        assertEquals("Put Orgs By OrgId Teams By TeamSlug Memberships By Username", AddSummary.generate("PUT", "/orgs/{orgId}/teams/{teamSlug}/memberships/{username}"));
    }

    @Test
    public void testUppercaseMethod() {
        assertEquals("Post Items", AddSummary.generate("POST", "/items"));
    }

    @Test
    public void testLowercaseMethod() {
        assertEquals("Delete Items By ItemId", AddSummary.generate("delete", "/items/{itemId}"));
    }

}