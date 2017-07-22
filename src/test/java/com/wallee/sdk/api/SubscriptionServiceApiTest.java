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
import com.wallee.sdk.model.SubscriptionChangeRequest;
import com.wallee.sdk.model.SubscriptionVersion;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.SubscriptionCreateRequest;
import com.wallee.sdk.model.SubscriptionCharge;
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.EntityQuery;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionServiceApi
 */
public class SubscriptionServiceApiTest {

    private final SubscriptionServiceApi api = new SubscriptionServiceApi();

    
    /**
     * apply changes
     *
     * This operation allows to apply changes on a subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applyChangesTest() throws ApiException {
        Long spaceId = null;
        SubscriptionChangeRequest request = null;
        // SubscriptionVersion response = api.applyChanges(spaceId, request);

        // TODO: test validations
    }
    
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
     * Create
     *
     * The create operation creates a new subscription and a corresponding subscription version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Long spaceId = null;
        SubscriptionCreateRequest createRequest = null;
        // SubscriptionVersion response = api.create(spaceId, createRequest);

        // TODO: test validations
    }
    
    /**
     * initialize
     *
     * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeTest() throws ApiException {
        Long spaceId = null;
        Long subscriptionId = null;
        // SubscriptionCharge response = api.initialize(spaceId, subscriptionId);

        // TODO: test validations
    }
    
    /**
     * initializeSubscriberPresent
     *
     * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSubscriberPresentTest() throws ApiException {
        Long spaceId = null;
        Long subscriptionId = null;
        String successUrl = null;
        String failedUrl = null;
        // SubscriptionCharge response = api.initializeSubscriberPresent(spaceId, subscriptionId, successUrl, failedUrl);

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
        // Subscription response = api.read(spaceId, id);

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
        // List<Subscription> response = api.search(spaceId, query);

        // TODO: test validations
    }
    
    /**
     * terminate
     *
     * This operation allows to terminate a subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateTest() throws ApiException {
        Long spaceId = null;
        Long subscriptionId = null;
        Boolean respectTerminationPeriod = null;
        // api.terminate(spaceId, subscriptionId, respectTerminationPeriod);

        // TODO: test validations
    }
    
    /**
     * update product version
     *
     * The update product version operation updates the product version of the subscription to the latest active product version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductVersionTest() throws ApiException {
        Long spaceId = null;
        Long subscriptionId = null;
        Boolean respectTerminationPeriod = null;
        // SubscriptionVersion response = api.updateProductVersion(spaceId, subscriptionId, respectTerminationPeriod);

        // TODO: test validations
    }
    
}
