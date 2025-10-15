package com.wallee.sdk.service;

import static com.wallee.sdk.ErrorCode.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.URIBuilderUtil;
import com.wallee.sdk.StringUtil;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.SubscriptionLedgerEntry;
import com.wallee.sdk.model.SubscriptionLedgerEntryCreate;


import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;



public class SubscriptionLedgerEntryService {
    private ApiClient apiClient;

    public SubscriptionLedgerEntryService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * Count
    
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param filter The filter which restricts the entities which are used to calculate the count.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--count">Count Documentation</a>

    **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        String returnType = "Long";
        if(returnType.equals("String")){
          return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Count
    
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        String returnType = "Long";
        if(returnType.equals("String")){
            return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/count");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse countForHttpResponse(Long spaceId, java.io.InputStream filter, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/count");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = filter == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Create
    
    * The create operation creates a new subscription ledger entry.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entry 
    * @return SubscriptionLedgerEntry
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--create">Create Documentation</a>

    **/
    public SubscriptionLedgerEntry create(Long spaceId, SubscriptionLedgerEntryCreate entry) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entry);
        String returnType = "SubscriptionLedgerEntry";
        if(returnType.equals("String")){
          return (SubscriptionLedgerEntry) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionLedgerEntry>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionLedgerEntry)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create
    
    * The create operation creates a new subscription ledger entry.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entry 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionLedgerEntry
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--create">Create Documentation</a>

    **/
    public SubscriptionLedgerEntry create(Long spaceId, SubscriptionLedgerEntryCreate entry, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entry, params);
        String returnType = "SubscriptionLedgerEntry";
        if(returnType.equals("String")){
            return (SubscriptionLedgerEntry) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionLedgerEntry>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionLedgerEntry)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionLedgerEntryCreate entry) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entry' is set
        if (entry == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entry' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/create");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entry);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse createForHttpResponse(Long spaceId, java.io.InputStream entry, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entry' is set
        if (entry == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entry' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/create");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = entry == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entry);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionLedgerEntryCreate entry, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }
        // verify the required parameter 'entry' is set
        if (entry == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entry' when calling create");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(entry);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the subscription charge which should be returned.
    * @return SubscriptionLedgerEntry
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--read">Read Documentation</a>

    **/
    public SubscriptionLedgerEntry read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        String returnType = "SubscriptionLedgerEntry";
        if(returnType.equals("String")){
          return (SubscriptionLedgerEntry) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionLedgerEntry>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionLedgerEntry)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the subscription charge which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubscriptionLedgerEntry
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--read">Read Documentation</a>

    **/
    public SubscriptionLedgerEntry read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        String returnType = "SubscriptionLedgerEntry";
        if(returnType.equals("String")){
            return (SubscriptionLedgerEntry) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<SubscriptionLedgerEntry>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (SubscriptionLedgerEntry)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/read");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (id != null) {
            String key = "id";
            Object value = id;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Search
    
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the subscription charges which are returned by the search.
    * @return List&lt;SubscriptionLedgerEntry&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--search">Search Documentation</a>

    **/
    public List<SubscriptionLedgerEntry> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        String returnType = "List&lt;SubscriptionLedgerEntry&gt;";
        if(returnType.equals("String")){
          return (List<SubscriptionLedgerEntry>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<SubscriptionLedgerEntry>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<SubscriptionLedgerEntry>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the subscription charges which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;SubscriptionLedgerEntry&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#subscription-ledger-entry-service--search">Search Documentation</a>

    **/
    public List<SubscriptionLedgerEntry> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        String returnType = "List&lt;SubscriptionLedgerEntry&gt;";
        if(returnType.equals("String")){
            return (List<SubscriptionLedgerEntry>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<SubscriptionLedgerEntry>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<SubscriptionLedgerEntry>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/search");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, java.io.InputStream query, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/search");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = query == null ?
            apiClient.new JacksonJsonHttpContent(null) :
            new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
      }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/subscription-ledger-entry/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }



    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
