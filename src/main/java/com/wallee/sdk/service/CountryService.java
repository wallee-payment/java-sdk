package com.wallee.sdk.service;

import static com.wallee.sdk.ErrorCode.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.URIBuilderUtil;
import com.wallee.sdk.StringUtil;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.RestCountry;
import com.wallee.sdk.model.ServerError;


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



public class CountryService {
    private ApiClient apiClient;

    public CountryService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * All
    
    * This operation returns all countries.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @return List&lt;RestCountry&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#country-service--all">All Documentation</a>

    **/
    public List<RestCountry> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        String returnType = "List&lt;RestCountry&gt;";
        if(returnType.equals("String")){
          return (List<RestCountry>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountry>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<RestCountry>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * All
    
    * This operation returns all countries.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;RestCountry&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#country-service--all">All Documentation</a>

    **/
    public List<RestCountry> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        String returnType = "List&lt;RestCountry&gt;";
        if(returnType.equals("String")){
            return (List<RestCountry>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RestCountry>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<RestCountry>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse allForHttpResponse() throws IOException {
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/country/all");

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/country/all");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

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



    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
