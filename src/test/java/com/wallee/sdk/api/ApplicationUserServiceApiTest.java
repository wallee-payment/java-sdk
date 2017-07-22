/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.api;

import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.ApplicationUserCreateWithMacKey;
import com.wallee.sdk.model.ApplicationUserCreate;
import com.wallee.sdk.model.ApplicationUser;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.ApplicationUserUpdate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationUserServiceApi
 */
public class ApplicationUserServiceApiTest {

    private final ApplicationUserServiceApi api = new ApplicationUserServiceApi();

    
    /**
     * Count
     *
     * Counts the number of items in the database as restricted by the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countTest() throws ApiException {
        EntityQueryFilter filter = null;
        // Long response = api.count(filter);

        // TODO: test validations
    }
    
    /**
     * Create
     *
     * Creates the application user with the given properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        ApplicationUserCreate entity = null;
        // ApplicationUserCreateWithMacKey response = api.create(entity);

        // TODO: test validations
    }
    
    /**
     * Delete
     *
     * Deletes the entity with the given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long id = null;
        // api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Read
     *
     * Reads the entity with the given &#39;id&#39; and returns it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTest() throws ApiException {
        Long id = null;
        // ApplicationUser response = api.read(id);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * Searches for the entities as specified by the given query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        EntityQuery query = null;
        // List<ApplicationUser> response = api.search(query);

        // TODO: test validations
    }
    
    /**
     * Update
     *
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        ApplicationUserUpdate entity = null;
        // ApplicationUser response = api.update(entity);

        // TODO: test validations
    }
    
}
