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
import com.wallee.sdk.model.RestCountryState;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CountryStateServiceApi
 */
public class CountryStateServiceApiTest {

    private final CountryStateServiceApi api = new CountryStateServiceApi();

    
    /**
     * All
     *
     * This operation returns all states of all countries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allTest() throws ApiException {
        // List<RestCountryState> response = api.all();

        // TODO: test validations
    }
    
    /**
     * Find by Country
     *
     * This operation returns all states for a given country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countryTest() throws ApiException {
        String code = null;
        // List<RestCountryState> response = api.country(code);

        // TODO: test validations
    }
    
}
