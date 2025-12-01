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

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.model.TransactionState;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

import static com.wallee.sdk.service.TestConstants.MOCK_CARD_DATA;
import static com.wallee.sdk.service.TestConstants.SPACE_ID;
import static com.wallee.sdk.service.TestUtils.getApiClient;
import static com.wallee.sdk.service.TestUtils.getTransactionCreatePayload;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Transaction completions service tests
 */
public class TransactionCompletionServiceTest {
  public static final Set<String> EMPTY_EXPAND = Collections.emptySet();
  public static TransactionsService transactionsService;
  public static TransactionCompletionsService transactionCompletionsService;

  @BeforeAll
  static void setUp() {
    ApiClient apiClient = getApiClient();
    transactionsService = new TransactionsService(apiClient);
    transactionCompletionsService = new TransactionCompletionsService(apiClient);
  }

  /**
   * Transaction completion read should return valid data.
   * Ids of transaction linked to Transaction completion and initial transaction should match.
   */
  @Test
  public void readShouldReturnCompletedTransactionData() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    assertEquals(TransactionState.FULFILL, processedTransaction.getState(), "State must be FULFILL");

    TransactionCompletion transactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction readTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(transactionCompletion.getLinkedTransaction(), readTransaction.getId(), "Transaction ids must match");
  }

  private Transaction create(TransactionCreate transactionCreate) throws ApiException {
    return transactionsService.postPaymentTransactions(SPACE_ID, transactionCreate, EMPTY_EXPAND);
  }
}
