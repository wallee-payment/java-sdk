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
import com.wallee.sdk.model.PaymentProcessor;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentProcessorServiceApi
 */
public class PaymentProcessorServiceApiTest {

    private final PaymentProcessorServiceApi api = new PaymentProcessorServiceApi();

    
    /**
     * All
     *
     * This operation returns all entities which are available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allTest() throws ApiException {
        // List<PaymentProcessor> response = api.all();

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
        // PaymentProcessor response = api.read(id);

        // TODO: test validations
    }
    
}
