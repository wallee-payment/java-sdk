package com.wallee.sdk.test;

import static com.wallee.sdk.test.TestUtils.getApiClient;
import static org.junit.Assert.assertTrue;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TransactionLightboxServiceTest {
  private TransactionService transactionService;
  private TransactionLightboxService transactionLightboxService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    transactionLightboxService = apiClient.getTransactionLightboxService();
  }

  @Test
  public void shouldCreateUrlForJavascriptUsage() throws IOException {
    Transaction transaction = transactionService.create(TestConstants.SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    String url =
        transactionLightboxService.javascriptUrl(TestConstants.SPACE_ID, transaction.getId());

    assertTrue("URL must have proper format", url.contains("securityToken"));
  }
}
