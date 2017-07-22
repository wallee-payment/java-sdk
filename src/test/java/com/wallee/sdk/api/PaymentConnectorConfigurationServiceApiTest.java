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
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.EntityQuery;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentConnectorConfigurationServiceApi
 */
public class PaymentConnectorConfigurationServiceApiTest {

    private final PaymentConnectorConfigurationServiceApi api = new PaymentConnectorConfigurationServiceApi();

    
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
        Long spaceId = null;
        EntityQueryFilter filter = null;
        // Long response = api.count(spaceId, filter);

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
        Long spaceId = null;
        Long id = null;
        // PaymentConnectorConfiguration response = api.read(spaceId, id);

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
        Long spaceId = null;
        EntityQuery query = null;
        // List<PaymentConnectorConfiguration> response = api.search(spaceId, query);

        // TODO: test validations
    }
    
}
