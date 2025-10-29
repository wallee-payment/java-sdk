/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.service;

import com.wallee.sdk.model.AuthenticatedCardDataCreate;
import com.wallee.sdk.model.AuthenticatedCardRequest;

public abstract class TestConstants {

  public static final long APPLICATION_USER_ID = 512;
  public static final String AUTHENTICATION_KEY = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

  public static final long SPACE_ID = 405;
  public static final long TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID = 1352;
  public static final long TEST_CUSTOMER_ID = 7311742;

  public static final AuthenticatedCardRequest MOCK_CARD_DATA =
    new AuthenticatedCardRequest()
      .cardData(
        new AuthenticatedCardDataCreate()
          .primaryAccountNumber("4111111111111111")
          .expiryDate("2026-12"))
      .paymentMethodConfiguration(TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID);

  private TestConstants() {
    throw new IllegalAccessError("Utility Test class");
  }
}
