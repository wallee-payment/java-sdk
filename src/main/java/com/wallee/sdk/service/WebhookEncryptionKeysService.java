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

import com.fasterxml.jackson.core.type.TypeReference;

import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.BaseApi;
import com.wallee.sdk.Pair;

import com.wallee.sdk.model.RestApiErrorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import java.util.concurrent.ConcurrentHashMap;
import com.wallee.sdk.util.EncryptionUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import com.wallee.sdk.WalleeSdkException;
import com.wallee.sdk.ErrorCode;


public class WebhookEncryptionKeysService extends BaseApi {
  private static final Map<String, String> cache = new ConcurrentHashMap<>();

  public WebhookEncryptionKeysService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Retrieve a webhook encryption key
   * 
   
   * @param id  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksEncryptionKeysId">Retrieve a webhook encryption key Documentation</a>
   */
  public String getWebhooksEncryptionKeysId(@javax.annotation.Nonnull String id) throws ApiException {
    return this.getWebhooksEncryptionKeysId(id, Collections.emptyMap());
  }


  /**
   * Retrieve a webhook encryption key
   * 
   
   * @param id  (required)
   * @param additionalHeaders The additional headers for this call
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksEncryptionKeysId">Retrieve a webhook encryption key Documentation</a>
   */
  public String getWebhooksEncryptionKeysId(@javax.annotation.Nonnull String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWebhooksEncryptionKeysId");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/encryption-keys/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        requestTimeout,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        requestTimeout,
        returnType
    );
  }

  /**
   * Verify webhook content
   *
   * @param signatureHeader Signature header 'X-Signature' value from the Http request
   * @param contentToVerify Raw webhook content in String format
   * @param encryptionProviderName Encryption provider name
   * @return true if webhook content body conforms with signature header
   * @throws ApiException if fails to make API call
   */
  public boolean isContentValid(
      String signatureHeader, String contentToVerify, String encryptionProviderName)
      throws ApiException {
    // Regular expression to extract algorithm, keyId, and signature from the signatureHeader
    String regex =
        "^algorithm=([a-zA-Z0-9]+),\\skeyId=([a-z0-9\\-]+),\\s{1}signature=([a-zA-Z0-9+\\/=]+)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(signatureHeader);
    if (matcher.matches()) {
      String signatureAlgorithm = matcher.group(1);
      String publicKeyId = matcher.group(2);
      String contentSignature = matcher.group(3);

      String publicKey;
      if (cache.containsKey(publicKeyId)) {
        publicKey = cache.get(publicKeyId);
      } else {
        try {
          publicKey = this.getWebhooksEncryptionKeysId(publicKeyId);
        } catch (ApiException e) {
          throw new ApiException(
              "Could not retrieve public key with ID: "
                  + publicKeyId
                  + ". Because: "
                  + e.getLocalizedMessage());
        }
        if (publicKey == null || publicKey.isEmpty()) {
          throw new WalleeSdkException(
              ErrorCode.UNKNOWN_WEBHOOK_ENCRYPTION_PUBLIC_KEY,
              "Unknown public key with ID: " + publicKeyId);
        }
        cache.put(publicKeyId, publicKey);
      }
      return EncryptionUtil.isContentValid(
          contentToVerify, contentSignature, publicKey, encryptionProviderName, signatureAlgorithm);
    } else {
      throw new WalleeSdkException(
          ErrorCode.INVALID_WEBHOOK_ENCRYPTION_HEADER_FORMAT,
          "Invalid webhook signature header. Expected format: 'algorithm=<algorithm>, keyId=<keyId>, signature=<signature>'");
    }
  }

  /**
   * Verify webhook content
   *
   * <p>Uses BouncyCastle as encryption provider.
   *
   * <p>Important: this method updates list of Security providers:
   *
   * <p><code>Security.addProvider(new BouncyCastleProvider())</code>
   *
   * @param signatureHeader Signature header 'X-Signature' value from the Http request
   * @param contentToVerify Raw webhook content in String format
   * @return true if webhook content body conforms with signature header
   * @throws ApiException if fails to make API call
   */
  public boolean isContentValid(String signatureHeader, String contentToVerify) throws ApiException {
  if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
    Security.addProvider(new BouncyCastleProvider());
  }
  return isContentValid(signatureHeader, contentToVerify, BouncyCastleProvider.PROVIDER_NAME);
  }
}
