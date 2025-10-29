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

import static com.wallee.sdk.service.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.WebhookListener;
import com.wallee.sdk.model.WebhookListenerCreate;
import com.wallee.sdk.model.WebhookListenerSearchResponse;
import com.wallee.sdk.model.WebhookURLSearchResponse;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * API tests for WebhookListeners
 */
class WebhookListenersTest {

  private WebhookListenersService webhookListenersService;
  private WebhookUrlsService webhookUrlsService;

  @BeforeEach
  void beforeEach() {
    // Singleton (single) instance for ApiClient. See more: {@link TestUtils}
    ApiClient apiClient = com.wallee.sdk.service.TestUtils.getApiClient();
    webhookListenersService = new WebhookListenersService(apiClient);
    webhookUrlsService = new WebhookUrlsService(apiClient);
  }

  /**
   * Creates and deletes webhook listener
   */
  @Test
  void testPostAndDeleteWebhookListener() throws ApiException {
    WebhookURLSearchResponse urls = webhookUrlsService.getWebhooksUrlsSearch(SPACE_ID, Collections.emptySet(), 1, 0, "id:DESC", "name:\"Webhook Test URL Listener\" AND state:INACTIVE");

    assertNotNull(urls.getData());
    assertEquals(1, urls.getData().size(), "1 webhook url expected");

    assertNotNull(urls.getData().getFirst().getId());
    WebhookListener webhookListener = webhookListenersService.postWebhooksListeners(SPACE_ID, getWebhookListenerCreate(urls.getData().getFirst().getId()), Collections.emptySet());

    assertEquals(CreationEntityState.INACTIVE, webhookListener.getState(), "Webhook listener state should be INACTIVE");
    assertEquals(SPACE_ID, webhookListener.getLinkedSpaceId(), "Test space id and webhook linked space id should match");
    assertNotNull(webhookListener.getUrl());
    assertNotNull(webhookListener.getUrl().getId());
    assertEquals(urls.getData().getFirst().getId(), webhookListener.getUrl().getId(), "Webhook url ids should match");

    webhookListenersService.deleteWebhooksListenersId(webhookListener.getId(), SPACE_ID);

    WebhookListener deletedWebhook = webhookListenersService.getWebhooksListenersId(webhookListener.getId(), SPACE_ID, Collections.emptySet());

    assertEquals(CreationEntityState.DELETED, deletedWebhook.getState(), "Deleted webhook listener state should be DELETED");
  }

  /**
   * Search webhook listeners without default timeout (default: 25 sec.)
   */
  @Test
  void getWebhooksListenersSearchWithoutCustomTimeoutTest() throws ApiException {
    Set<String> expand = Stream.of("url", "group").collect(Collectors.toSet());
    Integer limit = 1;
    Integer offset = 0;
    String order = "id:DESC";
    String query = "name:Test AND state:INACTIVE";
    WebhookListenerSearchResponse response = webhookListenersService.getWebhooksListenersSearch(SPACE_ID, expand, limit, offset, order, query);

    assertEquals(25, webhookListenersService.getApiClient().getRequestTimeout(), "The default request timeout should match");
    assertNotNull(response.getData(), "The webhook listeners data is not null.");
    assertEquals(1, response.getData().size(), "The webhook listeners list size should be 1.");
    response.getData().forEach(webhookListener -> {
      assertEquals("Test", webhookListener.getName(), "Name should match.");
      assertEquals(SPACE_ID, webhookListener.getLinkedSpaceId(), "Space Id should match.");
    });
  }

  /**
   * Search webhook listeners with custom timeout: 36 sec.
   */
  @Test
  void getWebhooksListenersSearchWithCustomTimeoutTest() throws ApiException {
    /*
     * ApiClient.new() creates independent instances and is not considered static.
     * With the new instance of ApiClient the timeout can be set not via modifying
     * the global shared state but only for that specific instance of {@link ApiClient}.
     */
    ApiClient apiClientWithCustomTimeout = new ApiClient(APPLICATION_USER_ID, AUTHENTICATION_KEY);
    WebhookListenersService webhookListenersServiceWithCustomTimeout = new WebhookListenersService(apiClientWithCustomTimeout);
    apiClientWithCustomTimeout.setRequestTimeout(36);

    Set<String> expand = Stream.of("url", "group").collect(Collectors.toSet());
    Integer limit = 1;
    Integer offset = 0;
    String order = "id:DESC";
    String query = "name:Test AND state:INACTIVE";
    WebhookListenerSearchResponse response = webhookListenersServiceWithCustomTimeout.getWebhooksListenersSearch(SPACE_ID, expand, limit, offset, order, query);

    assertEquals(36, webhookListenersServiceWithCustomTimeout.getApiClient().getRequestTimeout(), "The default request timeout should match");
    assertNotNull(response.getData(), "The webhook listeners data is not null.");
    assertEquals(1, response.getData().size(), "The webhook listeners list size should be 1.");
    response.getData().forEach(webhookListener -> {
      assertEquals("Test", webhookListener.getName(), "Name should match.");
      assertEquals(SPACE_ID, webhookListener.getLinkedSpaceId(), "Space Id should match.");
    });
  }

  private WebhookListenerCreate getWebhookListenerCreate(long webhookUrlId) {
    WebhookListenerCreate wlc = new WebhookListenerCreate();
    String testName = "Typescript UnitTest Webhook Listener";
    wlc.name(testName);
    wlc.setState(CreationEntityState.INACTIVE);
    long testEntityId = 1472041829003L;
    wlc.entity(testEntityId);
    wlc.setUrl(webhookUrlId);

    return wlc;
  }
}
