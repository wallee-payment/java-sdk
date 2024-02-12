package com.wallee.sdk.test;

import static com.wallee.sdk.test.TestUtils.getApiClient;
import static org.junit.Assert.assertTrue;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TransactionIframeServiceTest {
  private TransactionService transactionService;
  private TransactionIframeService transactionIframeService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    transactionIframeService = apiClient.getTransactionIframeService();
  }

  @Test
  public void shouldCreateUrlForJavascriptUsage() throws IOException {
    Transaction transaction = transactionService.create(TestConstants.SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    String url =
        transactionIframeService.javascriptUrl(TestConstants.SPACE_ID, transaction.getId());

    assertTrue("URL must have proper format", url.contains("securityToken"));
  }
}
