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
import com.wallee.sdk.model.InstallmentCalculatedPlan;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstallmentPlanCalculationServiceApi
 */
public class InstallmentPlanCalculationServiceApiTest {

    private final InstallmentPlanCalculationServiceApi api = new InstallmentPlanCalculationServiceApi();

    
    /**
     * Calculate Plans
     *
     * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculatePlansTest() throws ApiException {
        Long spaceId = null;
        Long transactionId = null;
        // List<InstallmentCalculatedPlan> response = api.calculatePlans(spaceId, transactionId);

        // TODO: test validations
    }
    
}
