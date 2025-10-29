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

import com.wallee.sdk.model.ChargeAttempt;
import com.wallee.sdk.model.PaymentAppChargeAttemptUpdate;
import com.wallee.sdk.model.PaymentAppCompletionUpdate;
import com.wallee.sdk.model.PaymentAppConnector;
import com.wallee.sdk.model.PaymentAppConnectorDetails;
import com.wallee.sdk.model.PaymentAppConnectorDetailsCreate;
import com.wallee.sdk.model.PaymentAppProcessor;
import com.wallee.sdk.model.PaymentAppProcessorDetails;
import com.wallee.sdk.model.PaymentAppProcessorDetailsCreate;
import com.wallee.sdk.model.PaymentAppRefundUpdate;
import com.wallee.sdk.model.PaymentAppVoidUpdate;
import com.wallee.sdk.model.Refund;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionVoid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class PaymentWebAppsService extends BaseApi {

  public PaymentWebAppsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a connector
   * Permanently deletes a connector. It cannot be undone.
   
   * @param connectorExternalId The unique identifier assigned during connector&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentWebAppsConnectorsConnectorExternalId">Delete a connector Documentation</a>
   */
  public void deletePaymentWebAppsConnectorsConnectorExternalId(String connectorExternalId, Long space) throws ApiException {
    this.deletePaymentWebAppsConnectorsConnectorExternalId(connectorExternalId, space, Collections.emptyMap());
  }


  /**
   * Delete a connector
   * Permanently deletes a connector. It cannot be undone.
   
   * @param connectorExternalId The unique identifier assigned during connector&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentWebAppsConnectorsConnectorExternalId">Delete a connector Documentation</a>
   */
  public void deletePaymentWebAppsConnectorsConnectorExternalId(String connectorExternalId, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorExternalId' is set
    if (connectorExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorExternalId' when calling deletePaymentWebAppsConnectorsConnectorExternalId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentWebAppsConnectorsConnectorExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/connectors/{connectorExternalId}"
      .replaceAll("\\{" + "connectorExternalId" + "\\}", apiClient.escapeString(connectorExternalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        null,
        requestTimeout
    );
  }

  /**
   * Delete a processor
   * Permanently deletes a processor. It cannot be undone.
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentWebAppsProcessorsExternalId">Delete a processor Documentation</a>
   */
  public void deletePaymentWebAppsProcessorsExternalId(String externalId, Long space) throws ApiException {
    this.deletePaymentWebAppsProcessorsExternalId(externalId, space, Collections.emptyMap());
  }


  /**
   * Delete a processor
   * Permanently deletes a processor. It cannot be undone.
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentWebAppsProcessorsExternalId">Delete a processor Documentation</a>
   */
  public void deletePaymentWebAppsProcessorsExternalId(String externalId, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling deletePaymentWebAppsProcessorsExternalId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentWebAppsProcessorsExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/processors/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        null,
        requestTimeout
    );
  }

  /**
   * Update a charge attempt
   * Updates the state of a charge attempt for transactions created with a processor linked to the invoking web app, returning the specified charge attempt.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppChargeAttemptUpdate  (required)
   * @param expand  (optional)
   * @return ChargeAttempt
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsChargeAttemptsId">Update a charge attempt Documentation</a>
   */
  public ChargeAttempt patchPaymentWebAppsChargeAttemptsId(Long id, Long space, PaymentAppChargeAttemptUpdate paymentAppChargeAttemptUpdate, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsChargeAttemptsId(id, space, paymentAppChargeAttemptUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a charge attempt
   * Updates the state of a charge attempt for transactions created with a processor linked to the invoking web app, returning the specified charge attempt.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppChargeAttemptUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ChargeAttempt
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsChargeAttemptsId">Update a charge attempt Documentation</a>
   */
  public ChargeAttempt patchPaymentWebAppsChargeAttemptsId(Long id, Long space, PaymentAppChargeAttemptUpdate paymentAppChargeAttemptUpdate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppChargeAttemptUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentWebAppsChargeAttemptsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsChargeAttemptsId");
    }
    
    // verify the required parameter 'paymentAppChargeAttemptUpdate' is set
    if (paymentAppChargeAttemptUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppChargeAttemptUpdate' when calling patchPaymentWebAppsChargeAttemptsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/charge-attempts/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ChargeAttempt> localVarReturnType = new TypeReference<ChargeAttempt>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Update a completion
   * Updates the state of a completion for transactions created with a processor linked to the invoking web app, returning the specified completion.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppCompletionUpdate  (required)
   * @param expand  (optional)
   * @return TransactionCompletion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsCompletionsId">Update a completion Documentation</a>
   */
  public TransactionCompletion patchPaymentWebAppsCompletionsId(Long id, Long space, PaymentAppCompletionUpdate paymentAppCompletionUpdate, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsCompletionsId(id, space, paymentAppCompletionUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a completion
   * Updates the state of a completion for transactions created with a processor linked to the invoking web app, returning the specified completion.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppCompletionUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionCompletion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsCompletionsId">Update a completion Documentation</a>
   */
  public TransactionCompletion patchPaymentWebAppsCompletionsId(Long id, Long space, PaymentAppCompletionUpdate paymentAppCompletionUpdate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppCompletionUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentWebAppsCompletionsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsCompletionsId");
    }
    
    // verify the required parameter 'paymentAppCompletionUpdate' is set
    if (paymentAppCompletionUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppCompletionUpdate' when calling patchPaymentWebAppsCompletionsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/completions/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<TransactionCompletion> localVarReturnType = new TypeReference<TransactionCompletion>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Update a connector
   * 
   
   * @param connectorExternalId The unique identifier assigned during connector&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppConnectorDetails  (required)
   * @param expand  (optional)
   * @return PaymentAppConnector
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsConnectorsConnectorExternalId">Update a connector Documentation</a>
   */
  public PaymentAppConnector patchPaymentWebAppsConnectorsConnectorExternalId(String connectorExternalId, Long space, PaymentAppConnectorDetails paymentAppConnectorDetails, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsConnectorsConnectorExternalId(connectorExternalId, space, paymentAppConnectorDetails, expand, Collections.emptyMap());
  }


  /**
   * Update a connector
   * 
   
   * @param connectorExternalId The unique identifier assigned during connector&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppConnectorDetails  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentAppConnector
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsConnectorsConnectorExternalId">Update a connector Documentation</a>
   */
  public PaymentAppConnector patchPaymentWebAppsConnectorsConnectorExternalId(String connectorExternalId, Long space, PaymentAppConnectorDetails paymentAppConnectorDetails, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppConnectorDetails;
    
    // verify the required parameter 'connectorExternalId' is set
    if (connectorExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorExternalId' when calling patchPaymentWebAppsConnectorsConnectorExternalId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsConnectorsConnectorExternalId");
    }
    
    // verify the required parameter 'paymentAppConnectorDetails' is set
    if (paymentAppConnectorDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppConnectorDetails' when calling patchPaymentWebAppsConnectorsConnectorExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/connectors/{connectorExternalId}"
      .replaceAll("\\{" + "connectorExternalId" + "\\}", apiClient.escapeString(connectorExternalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentAppConnector> localVarReturnType = new TypeReference<PaymentAppConnector>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Update a processor
   * 
   
   * @param externalId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppProcessorDetails  (required)
   * @param expand  (optional)
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsProcessorsExternalId">Update a processor Documentation</a>
   */
  public PaymentAppProcessor patchPaymentWebAppsProcessorsExternalId(String externalId, Long space, PaymentAppProcessorDetails paymentAppProcessorDetails, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsProcessorsExternalId(externalId, space, paymentAppProcessorDetails, expand, Collections.emptyMap());
  }


  /**
   * Update a processor
   * 
   
   * @param externalId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppProcessorDetails  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsProcessorsExternalId">Update a processor Documentation</a>
   */
  public PaymentAppProcessor patchPaymentWebAppsProcessorsExternalId(String externalId, Long space, PaymentAppProcessorDetails paymentAppProcessorDetails, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppProcessorDetails;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling patchPaymentWebAppsProcessorsExternalId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsProcessorsExternalId");
    }
    
    // verify the required parameter 'paymentAppProcessorDetails' is set
    if (paymentAppProcessorDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppProcessorDetails' when calling patchPaymentWebAppsProcessorsExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/processors/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentAppProcessor> localVarReturnType = new TypeReference<PaymentAppProcessor>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Update a refund
   * Updates the state of a refund for transactions created with a processor linked to the invoking web app, returning the specified refund.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppRefundUpdate  (required)
   * @param expand  (optional)
   * @return Refund
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsRefundsId">Update a refund Documentation</a>
   */
  public Refund patchPaymentWebAppsRefundsId(Long id, Long space, PaymentAppRefundUpdate paymentAppRefundUpdate, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsRefundsId(id, space, paymentAppRefundUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a refund
   * Updates the state of a refund for transactions created with a processor linked to the invoking web app, returning the specified refund.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppRefundUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return Refund
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsRefundsId">Update a refund Documentation</a>
   */
  public Refund patchPaymentWebAppsRefundsId(Long id, Long space, PaymentAppRefundUpdate paymentAppRefundUpdate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppRefundUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentWebAppsRefundsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsRefundsId");
    }
    
    // verify the required parameter 'paymentAppRefundUpdate' is set
    if (paymentAppRefundUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppRefundUpdate' when calling patchPaymentWebAppsRefundsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/refunds/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<Refund> localVarReturnType = new TypeReference<Refund>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Update a void
   * Updates the state of a void for transactions created with a processor linked to the invoking web app, returning the specified void.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppVoidUpdate  (required)
   * @param expand  (optional)
   * @return TransactionVoid
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsVoidsId">Update a void Documentation</a>
   */
  public TransactionVoid patchPaymentWebAppsVoidsId(Long id, Long space, PaymentAppVoidUpdate paymentAppVoidUpdate, Set<String> expand) throws ApiException {
    return this.patchPaymentWebAppsVoidsId(id, space, paymentAppVoidUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a void
   * Updates the state of a void for transactions created with a processor linked to the invoking web app, returning the specified void.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppVoidUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionVoid
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentWebAppsVoidsId">Update a void Documentation</a>
   */
  public TransactionVoid patchPaymentWebAppsVoidsId(Long id, Long space, PaymentAppVoidUpdate paymentAppVoidUpdate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppVoidUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentWebAppsVoidsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentWebAppsVoidsId");
    }
    
    // verify the required parameter 'paymentAppVoidUpdate' is set
    if (paymentAppVoidUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppVoidUpdate' when calling patchPaymentWebAppsVoidsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/voids/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<TransactionVoid> localVarReturnType = new TypeReference<TransactionVoid>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Create a processor
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppProcessorDetailsCreate  (required)
   * @param expand  (optional)
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessors">Create a processor Documentation</a>
   */
  public PaymentAppProcessor postPaymentWebAppsProcessors(Long space, PaymentAppProcessorDetailsCreate paymentAppProcessorDetailsCreate, Set<String> expand) throws ApiException {
    return this.postPaymentWebAppsProcessors(space, paymentAppProcessorDetailsCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a processor
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppProcessorDetailsCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessors">Create a processor Documentation</a>
   */
  public PaymentAppProcessor postPaymentWebAppsProcessors(Long space, PaymentAppProcessorDetailsCreate paymentAppProcessorDetailsCreate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppProcessorDetailsCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentWebAppsProcessors");
    }
    
    // verify the required parameter 'paymentAppProcessorDetailsCreate' is set
    if (paymentAppProcessorDetailsCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppProcessorDetailsCreate' when calling postPaymentWebAppsProcessors");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/processors";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentAppProcessor> localVarReturnType = new TypeReference<PaymentAppProcessor>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Activate a processor for production
   * 
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessorsExternalIdActivateForProduction">Activate a processor for production Documentation</a>
   */
  public PaymentAppProcessor postPaymentWebAppsProcessorsExternalIdActivateForProduction(String externalId, Long space, Set<String> expand) throws ApiException {
    return this.postPaymentWebAppsProcessorsExternalIdActivateForProduction(externalId, space, expand, Collections.emptyMap());
  }


  /**
   * Activate a processor for production
   * 
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentAppProcessor
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessorsExternalIdActivateForProduction">Activate a processor for production Documentation</a>
   */
  public PaymentAppProcessor postPaymentWebAppsProcessorsExternalIdActivateForProduction(String externalId, Long space, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling postPaymentWebAppsProcessorsExternalIdActivateForProduction");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentWebAppsProcessorsExternalIdActivateForProduction");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/processors/{externalId}/activate-for-production"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentAppProcessor> localVarReturnType = new TypeReference<PaymentAppProcessor>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Create a connector
   * 
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppConnectorDetailsCreate  (required)
   * @param expand  (optional)
   * @return PaymentAppConnector
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessorsExternalIdConnectors">Create a connector Documentation</a>
   */
  public PaymentAppConnector postPaymentWebAppsProcessorsExternalIdConnectors(String externalId, Long space, PaymentAppConnectorDetailsCreate paymentAppConnectorDetailsCreate, Set<String> expand) throws ApiException {
    return this.postPaymentWebAppsProcessorsExternalIdConnectors(externalId, space, paymentAppConnectorDetailsCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a connector
   * 
   
   * @param externalId The unique identifier assigned during processor&#39;s creation. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentAppConnectorDetailsCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentAppConnector
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentWebAppsProcessorsExternalIdConnectors">Create a connector Documentation</a>
   */
  public PaymentAppConnector postPaymentWebAppsProcessorsExternalIdConnectors(String externalId, Long space, PaymentAppConnectorDetailsCreate paymentAppConnectorDetailsCreate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentAppConnectorDetailsCreate;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling postPaymentWebAppsProcessorsExternalIdConnectors");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentWebAppsProcessorsExternalIdConnectors");
    }
    
    // verify the required parameter 'paymentAppConnectorDetailsCreate' is set
    if (paymentAppConnectorDetailsCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAppConnectorDetailsCreate' when calling postPaymentWebAppsProcessorsExternalIdConnectors");
    }
    
    // create path and map variables
    String localVarPath = "/payment/web-apps/processors/{externalId}/connectors"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentAppConnector> localVarReturnType = new TypeReference<PaymentAppConnector>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarReturnType,
        requestTimeout
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
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
        returnType,
        requestTimeout
    );
  }

}
