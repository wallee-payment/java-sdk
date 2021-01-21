package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.WebAppConfirmationRequest;
import com.wallee.sdk.model.WebAppConfirmationResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class WebAppService {
    private ApiClient apiClient;

    public WebAppService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Check Installation
    * This operation returns true when the app is installed in given space. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This parameter identifies the space which should be checked if the web app is installed.
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--check-installation">Check Installation Documentation</a>

    **/
    public Boolean checkInstallation(Long spaceId) throws IOException {
        HttpResponse response = checkInstallationForHttpResponse(spaceId);
        String returnType = "Boolean";
        if(returnType.equals("String")){
          return (Boolean) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return (Boolean)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check Installation
    * This operation returns true when the app is installed in given space. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This parameter identifies the space which should be checked if the web app is installed.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--check-installation">Check Installation Documentation</a>

    **/
    public Boolean checkInstallation(Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = checkInstallationForHttpResponse(spaceId, params);
        String returnType = "Boolean";
        if(returnType.equals("String")){
            return (Boolean) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return (Boolean)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse checkInstallationForHttpResponse(Long spaceId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling checkInstallation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/check-installation");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

    public HttpResponse checkInstallationForHttpResponse(Long spaceId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling checkInstallation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/check-installation");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Confirm
    * This operation confirms the app installation. This method has to be invoked after the user returns to the web app. The request of the user will contain the code as a request parameter. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param request 
    * @return WebAppConfirmationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--confirm">Confirm Documentation</a>

    **/
    public WebAppConfirmationResponse confirm(WebAppConfirmationRequest request) throws IOException {
        HttpResponse response = confirmForHttpResponse(request);
        String returnType = "WebAppConfirmationResponse";
        if(returnType.equals("String")){
          return (WebAppConfirmationResponse) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<WebAppConfirmationResponse>() {};
        return (WebAppConfirmationResponse)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Confirm
    * This operation confirms the app installation. This method has to be invoked after the user returns to the web app. The request of the user will contain the code as a request parameter. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param request 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return WebAppConfirmationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--confirm">Confirm Documentation</a>

    **/
    public WebAppConfirmationResponse confirm(WebAppConfirmationRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = confirmForHttpResponse(request, params);
        String returnType = "WebAppConfirmationResponse";
        if(returnType.equals("String")){
            return (WebAppConfirmationResponse) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<WebAppConfirmationResponse>() {};
        return (WebAppConfirmationResponse)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse confirmForHttpResponse(WebAppConfirmationRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling confirm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/confirm");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse confirmForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling confirm");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/confirm");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse confirmForHttpResponse(WebAppConfirmationRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling confirm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/confirm");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Uninstall
    * This operation uninstalls the web app from the provided space. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This parameter identifies the space within which the web app should be uninstalled.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--uninstall">Uninstall Documentation</a>

    **/
    public void uninstall(Long spaceId) throws IOException {
        uninstallForHttpResponse(spaceId);
    }

  /**
    * Uninstall
    * This operation uninstalls the web app from the provided space. The web app is implied by the client ID resp. user ID that is been used to invoke this operation.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This parameter identifies the space within which the web app should be uninstalled.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#web-app-service--uninstall">Uninstall Documentation</a>

    **/
    public void uninstall(Long spaceId, Map<String, Object> params) throws IOException {
        uninstallForHttpResponse(spaceId, params);
    }

    public HttpResponse uninstallForHttpResponse(Long spaceId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling uninstall");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/uninstall");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

    public HttpResponse uninstallForHttpResponse(Long spaceId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling uninstall");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/web-app/uninstall");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

}
