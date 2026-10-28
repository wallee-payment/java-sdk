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

import java.math.BigDecimal;
import com.wallee.sdk.model.InvoiceReconciliationRecordInvoiceLink;
import com.wallee.sdk.model.InvoiceReconciliationRecordInvoiceLinkListResponse;
import com.wallee.sdk.model.InvoiceReconciliationRecordInvoiceLinkSearchResponse;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class InvoiceReconciliationRecordInvoiceLinksService extends BaseApi {

  public InvoiceReconciliationRecordInvoiceLinksService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * List all invoice reconciliation record invoice links
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return InvoiceReconciliationRecordInvoiceLinkListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinks">List all invoice reconciliation record invoice links Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLinkListResponse getPaymentInvoiceReconciliationRecordInvoiceLinks(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentInvoiceReconciliationRecordInvoiceLinks(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all invoice reconciliation record invoice links
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceReconciliationRecordInvoiceLinkListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinks">List all invoice reconciliation record invoice links Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLinkListResponse getPaymentInvoiceReconciliationRecordInvoiceLinks(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentInvoiceReconciliationRecordInvoiceLinks");
    }
    
    // create path and map variables
    String localVarPath = "/payment/invoice-reconciliation-record-invoice-links";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("after", after));
    localVarQueryParams.addAll(apiClient.parameterToPair("before", before));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<InvoiceReconciliationRecordInvoiceLinkListResponse> localVarReturnType = new TypeReference<InvoiceReconciliationRecordInvoiceLinkListResponse>() {};
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

  /**
   * Retrieve an invoice reconciliation record invoice link
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return InvoiceReconciliationRecordInvoiceLink
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinksId">Retrieve an invoice reconciliation record invoice link Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLink getPaymentInvoiceReconciliationRecordInvoiceLinksId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentInvoiceReconciliationRecordInvoiceLinksId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve an invoice reconciliation record invoice link
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceReconciliationRecordInvoiceLink
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinksId">Retrieve an invoice reconciliation record invoice link Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLink getPaymentInvoiceReconciliationRecordInvoiceLinksId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentInvoiceReconciliationRecordInvoiceLinksId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentInvoiceReconciliationRecordInvoiceLinksId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/invoice-reconciliation-record-invoice-links/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<InvoiceReconciliationRecordInvoiceLink> localVarReturnType = new TypeReference<InvoiceReconciliationRecordInvoiceLink>() {};
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

  /**
   * Search invoice reconciliation record invoice links
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return InvoiceReconciliationRecordInvoiceLinkSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinksSearch">Search invoice reconciliation record invoice links Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLinkSearchResponse getPaymentInvoiceReconciliationRecordInvoiceLinksSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentInvoiceReconciliationRecordInvoiceLinksSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search invoice reconciliation record invoice links
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceReconciliationRecordInvoiceLinkSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentInvoiceReconciliationRecordInvoiceLinksSearch">Search invoice reconciliation record invoice links Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLinkSearchResponse getPaymentInvoiceReconciliationRecordInvoiceLinksSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentInvoiceReconciliationRecordInvoiceLinksSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/invoice-reconciliation-record-invoice-links/search";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
    localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<InvoiceReconciliationRecordInvoiceLinkSearchResponse> localVarReturnType = new TypeReference<InvoiceReconciliationRecordInvoiceLinkSearchResponse>() {};
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

  /**
   * Link an invoice
   * Links the invoice reconciliation record with the provided invoice completion.
   
   * @param recordId The ID of the invoice reconciliation record which should be linked. (required)
   * @param completionId The ID of the completion which should be linked. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param amount The amount of the invoice reconciliation record linked completion. When omitted the amount is calculated. (optional)
   * @param expand  (optional)
   * @return InvoiceReconciliationRecordInvoiceLink
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentInvoiceReconciliationRecordInvoiceLinks">Link an invoice Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLink postPaymentInvoiceReconciliationRecordInvoiceLinks(@javax.annotation.Nonnull Long recordId, @javax.annotation.Nonnull Long completionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable BigDecimal amount, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentInvoiceReconciliationRecordInvoiceLinks(recordId, completionId, space, amount, expand, Collections.emptyMap());
  }


  /**
   * Link an invoice
   * Links the invoice reconciliation record with the provided invoice completion.
   
   * @param recordId The ID of the invoice reconciliation record which should be linked. (required)
   * @param completionId The ID of the completion which should be linked. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param amount The amount of the invoice reconciliation record linked completion. When omitted the amount is calculated. (optional)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceReconciliationRecordInvoiceLink
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentInvoiceReconciliationRecordInvoiceLinks">Link an invoice Documentation</a>
   */
  public InvoiceReconciliationRecordInvoiceLink postPaymentInvoiceReconciliationRecordInvoiceLinks(@javax.annotation.Nonnull Long recordId, @javax.annotation.Nonnull Long completionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable BigDecimal amount, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling postPaymentInvoiceReconciliationRecordInvoiceLinks");
    }
    
    // verify the required parameter 'completionId' is set
    if (completionId == null) {
      throw new ApiException(400, "Missing the required parameter 'completionId' when calling postPaymentInvoiceReconciliationRecordInvoiceLinks");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentInvoiceReconciliationRecordInvoiceLinks");
    }
    
    // create path and map variables
    String localVarPath = "/payment/invoice-reconciliation-record-invoice-links";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("recordId", recordId));
    localVarQueryParams.addAll(apiClient.parameterToPair("completionId", completionId));
    localVarQueryParams.addAll(apiClient.parameterToPair("amount", amount));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<InvoiceReconciliationRecordInvoiceLink> localVarReturnType = new TypeReference<InvoiceReconciliationRecordInvoiceLink>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Unlink an invoice
   * Unlinks the invoice reconciliation record from the provided invoice completion.
   
   * @param recordId The ID of the invoice reconciliation record which should be unlinked. (required)
   * @param completionId The ID of the completion which should be unlinked. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink">Unlink an invoice Documentation</a>
   */
  public void postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink(@javax.annotation.Nonnull Long recordId, @javax.annotation.Nonnull Long completionId, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink(recordId, completionId, space, Collections.emptyMap());
  }


  /**
   * Unlink an invoice
   * Unlinks the invoice reconciliation record from the provided invoice completion.
   
   * @param recordId The ID of the invoice reconciliation record which should be unlinked. (required)
   * @param completionId The ID of the completion which should be unlinked. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink">Unlink an invoice Documentation</a>
   */
  public void postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink(@javax.annotation.Nonnull Long recordId, @javax.annotation.Nonnull Long completionId, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink");
    }
    
    // verify the required parameter 'completionId' is set
    if (completionId == null) {
      throw new ApiException(400, "Missing the required parameter 'completionId' when calling postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentInvoiceReconciliationRecordInvoiceLinksUnlink");
    }
    
    // create path and map variables
    String localVarPath = "/payment/invoice-reconciliation-record-invoice-links/unlink";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("recordId", recordId));
    localVarQueryParams.addAll(apiClient.parameterToPair("completionId", completionId));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

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
        requestTimeout,
        null
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

}
