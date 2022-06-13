package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ChargeAttempt;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.PaymentAppChargeAttemptUpdateRequest;
import com.wallee.sdk.model.PaymentAppCompletionUpdateRequest;
import com.wallee.sdk.model.PaymentAppConnector;
import com.wallee.sdk.model.PaymentAppConnectorCreationRequest;
import com.wallee.sdk.model.PaymentAppProcessor;
import com.wallee.sdk.model.PaymentAppProcessorCreationRequest;
import com.wallee.sdk.model.PaymentAppRefundUpdateRequest;
import com.wallee.sdk.model.PaymentAppVoidUpdateRequest;
import com.wallee.sdk.model.Refund;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionVoid;

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


public class PaymentWebAppService {
    private ApiClient apiClient;

    public PaymentWebAppService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Activate Processor for Production
    * This operation marks the processor to be usable within the production environment.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the processor is installed in.
    * @param externalId The external ID identifies the processor. The external ID corresponds to the ID provided during inserting of the processor.
    * @return PaymentAppProcessor
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--activate-processor-for-production">Activate Processor for Production Documentation</a>

    **/
    public PaymentAppProcessor activateProcessorForProduction(Long spaceId, String externalId) throws IOException {
        HttpResponse response = activateProcessorForProductionForHttpResponse(spaceId, externalId);
        String returnType = "PaymentAppProcessor";
        if(returnType.equals("String")){
          return (PaymentAppProcessor) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppProcessor>() {};
        return (PaymentAppProcessor)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Activate Processor for Production
    * This operation marks the processor to be usable within the production environment.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the processor is installed in.
    * @param externalId The external ID identifies the processor. The external ID corresponds to the ID provided during inserting of the processor.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PaymentAppProcessor
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--activate-processor-for-production">Activate Processor for Production Documentation</a>

    **/
    public PaymentAppProcessor activateProcessorForProduction(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        HttpResponse response = activateProcessorForProductionForHttpResponse(spaceId, externalId, params);
        String returnType = "PaymentAppProcessor";
        if(returnType.equals("String")){
            return (PaymentAppProcessor) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppProcessor>() {};
        return (PaymentAppProcessor)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse activateProcessorForProductionForHttpResponse(Long spaceId, String externalId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling activateProcessorForProduction");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling activateProcessorForProduction");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/activate-processor-for-production");
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
        }        if (externalId != null) {
            String key = "externalId";
            Object value = externalId;
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

    public HttpResponse activateProcessorForProductionForHttpResponse(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling activateProcessorForProduction");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling activateProcessorForProduction");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/activate-processor-for-production");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'externalId' to the map of query params
        allParams.put("externalId", externalId);

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

  /**
    * Delete Connector
    * This operation removes the web app payment connector from the given space.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the connector is installed in.
    * @param externalId The external ID identifies the connector. The external ID corresponds to the ID provided during inserting of the connector.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--delete-connector">Delete Connector Documentation</a>

    **/
    public void deleteConnector(Long spaceId, String externalId) throws IOException {
        deleteConnectorForHttpResponse(spaceId, externalId);
    }

  /**
    * Delete Connector
    * This operation removes the web app payment connector from the given space.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the connector is installed in.
    * @param externalId The external ID identifies the connector. The external ID corresponds to the ID provided during inserting of the connector.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--delete-connector">Delete Connector Documentation</a>

    **/
    public void deleteConnector(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        deleteConnectorForHttpResponse(spaceId, externalId, params);
    }

    public HttpResponse deleteConnectorForHttpResponse(Long spaceId, String externalId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling deleteConnector");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling deleteConnector");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/delete-connector");
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
        }        if (externalId != null) {
            String key = "externalId";
            Object value = externalId;
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

    public HttpResponse deleteConnectorForHttpResponse(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling deleteConnector");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling deleteConnector");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/delete-connector");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'externalId' to the map of query params
        allParams.put("externalId", externalId);

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

  /**
    * Delete Processor
    * This operation removes the web app payment processor and its connectors from the given space.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the processor is installed in.
    * @param externalId The external ID identifies the processor. The external ID corresponds to the ID provided during inserting of the processor.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--delete-processor">Delete Processor Documentation</a>

    **/
    public void deleteProcessor(Long spaceId, String externalId) throws IOException {
        deleteProcessorForHttpResponse(spaceId, externalId);
    }

  /**
    * Delete Processor
    * This operation removes the web app payment processor and its connectors from the given space.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space in which the processor is installed in.
    * @param externalId The external ID identifies the processor. The external ID corresponds to the ID provided during inserting of the processor.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--delete-processor">Delete Processor Documentation</a>

    **/
    public void deleteProcessor(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        deleteProcessorForHttpResponse(spaceId, externalId, params);
    }

    public HttpResponse deleteProcessorForHttpResponse(Long spaceId, String externalId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling deleteProcessor");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling deleteProcessor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/delete-processor");
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
        }        if (externalId != null) {
            String key = "externalId";
            Object value = externalId;
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

    public HttpResponse deleteProcessorForHttpResponse(Long spaceId, String externalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling deleteProcessor");
        }// verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'externalId' when calling deleteProcessor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/delete-processor");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'externalId' to the map of query params
        allParams.put("externalId", externalId);

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

  /**
    * Insert or Update Connector
    * This operation inserts or updates a web app payment connector.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space into which the connector should be inserted into.
    * @param request The connector object contains all the details required to create or update a web app connector.
    * @return PaymentAppConnector
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--insert-or-update-connector">Insert or Update Connector Documentation</a>

    **/
    public PaymentAppConnector insertOrUpdateConnector(Long spaceId, PaymentAppConnectorCreationRequest request) throws IOException {
        HttpResponse response = insertOrUpdateConnectorForHttpResponse(spaceId, request);
        String returnType = "PaymentAppConnector";
        if(returnType.equals("String")){
          return (PaymentAppConnector) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppConnector>() {};
        return (PaymentAppConnector)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert or Update Connector
    * This operation inserts or updates a web app payment connector.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space into which the connector should be inserted into.
    * @param request The connector object contains all the details required to create or update a web app connector.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PaymentAppConnector
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--insert-or-update-connector">Insert or Update Connector Documentation</a>

    **/
    public PaymentAppConnector insertOrUpdateConnector(Long spaceId, PaymentAppConnectorCreationRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = insertOrUpdateConnectorForHttpResponse(spaceId, request, params);
        String returnType = "PaymentAppConnector";
        if(returnType.equals("String")){
            return (PaymentAppConnector) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppConnector>() {};
        return (PaymentAppConnector)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse insertOrUpdateConnectorForHttpResponse(Long spaceId, PaymentAppConnectorCreationRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateConnector");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateConnector");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-connector");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse insertOrUpdateConnectorForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateConnector");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateConnector");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-connector");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse insertOrUpdateConnectorForHttpResponse(Long spaceId, PaymentAppConnectorCreationRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateConnector");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateConnector");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-connector");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Insert or Update Processor
    * This operation inserts or updates a web app payment processor.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space into which the processor should be inserted into.
    * @param request The processor object contains all the details required to create or update a web app processor.
    * @return PaymentAppProcessor
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--insert-or-update-processor">Insert or Update Processor Documentation</a>

    **/
    public PaymentAppProcessor insertOrUpdateProcessor(Long spaceId, PaymentAppProcessorCreationRequest request) throws IOException {
        HttpResponse response = insertOrUpdateProcessorForHttpResponse(spaceId, request);
        String returnType = "PaymentAppProcessor";
        if(returnType.equals("String")){
          return (PaymentAppProcessor) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppProcessor>() {};
        return (PaymentAppProcessor)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert or Update Processor
    * This operation inserts or updates a web app payment processor.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId The space ID identifies the space into which the processor should be inserted into.
    * @param request The processor object contains all the details required to create or update a web app processor.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PaymentAppProcessor
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--insert-or-update-processor">Insert or Update Processor Documentation</a>

    **/
    public PaymentAppProcessor insertOrUpdateProcessor(Long spaceId, PaymentAppProcessorCreationRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = insertOrUpdateProcessorForHttpResponse(spaceId, request, params);
        String returnType = "PaymentAppProcessor";
        if(returnType.equals("String")){
            return (PaymentAppProcessor) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<PaymentAppProcessor>() {};
        return (PaymentAppProcessor)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse insertOrUpdateProcessorForHttpResponse(Long spaceId, PaymentAppProcessorCreationRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateProcessor");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateProcessor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-processor");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse insertOrUpdateProcessorForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateProcessor");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateProcessor");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-processor");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse insertOrUpdateProcessorForHttpResponse(Long spaceId, PaymentAppProcessorCreationRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling insertOrUpdateProcessor");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling insertOrUpdateProcessor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/insert-or-update-processor");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Update Charge Attempt
    * This operation updates the state of the charge attempt. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned charge attempt corresponds to the charge attempt indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the charge attempt is located in.
    * @param request The charge attempt update request allows to update the state of a charge attempt.
    * @return ChargeAttempt
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-charge-attempt">Update Charge Attempt Documentation</a>

    **/
    public ChargeAttempt updateChargeAttempt(Long spaceId, PaymentAppChargeAttemptUpdateRequest request) throws IOException {
        HttpResponse response = updateChargeAttemptForHttpResponse(spaceId, request);
        String returnType = "ChargeAttempt";
        if(returnType.equals("String")){
          return (ChargeAttempt) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<ChargeAttempt>() {};
        return (ChargeAttempt)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update Charge Attempt
    * This operation updates the state of the charge attempt. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned charge attempt corresponds to the charge attempt indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the charge attempt is located in.
    * @param request The charge attempt update request allows to update the state of a charge attempt.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ChargeAttempt
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-charge-attempt">Update Charge Attempt Documentation</a>

    **/
    public ChargeAttempt updateChargeAttempt(Long spaceId, PaymentAppChargeAttemptUpdateRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = updateChargeAttemptForHttpResponse(spaceId, request, params);
        String returnType = "ChargeAttempt";
        if(returnType.equals("String")){
            return (ChargeAttempt) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<ChargeAttempt>() {};
        return (ChargeAttempt)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateChargeAttemptForHttpResponse(Long spaceId, PaymentAppChargeAttemptUpdateRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateChargeAttempt");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateChargeAttempt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-charge-attempt");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse updateChargeAttemptForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateChargeAttempt");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateChargeAttempt");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-charge-attempt");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse updateChargeAttemptForHttpResponse(Long spaceId, PaymentAppChargeAttemptUpdateRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateChargeAttempt");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateChargeAttempt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-charge-attempt");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Update Completion
    * This operation updates the state of the transaction completion. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned completion corresponds to the completion indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the completion is located in.
    * @param request The completion update request allows to update the state of a completion.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-completion">Update Completion Documentation</a>

    **/
    public TransactionCompletion updateCompletion(Long spaceId, PaymentAppCompletionUpdateRequest request) throws IOException {
        HttpResponse response = updateCompletionForHttpResponse(spaceId, request);
        String returnType = "TransactionCompletion";
        if(returnType.equals("String")){
          return (TransactionCompletion) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update Completion
    * This operation updates the state of the transaction completion. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned completion corresponds to the completion indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the completion is located in.
    * @param request The completion update request allows to update the state of a completion.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-completion">Update Completion Documentation</a>

    **/
    public TransactionCompletion updateCompletion(Long spaceId, PaymentAppCompletionUpdateRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = updateCompletionForHttpResponse(spaceId, request, params);
        String returnType = "TransactionCompletion";
        if(returnType.equals("String")){
            return (TransactionCompletion) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateCompletionForHttpResponse(Long spaceId, PaymentAppCompletionUpdateRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateCompletion");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateCompletion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-completion");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse updateCompletionForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateCompletion");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateCompletion");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-completion");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse updateCompletionForHttpResponse(Long spaceId, PaymentAppCompletionUpdateRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateCompletion");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateCompletion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-completion");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Update Refund
    * This operation updates the state of the refund. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned refund corresponds to the refund indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the refund is located in.
    * @param request The refund update request allows to update the state of a refund.
    * @return Refund
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-refund">Update Refund Documentation</a>

    **/
    public Refund updateRefund(Long spaceId, PaymentAppRefundUpdateRequest request) throws IOException {
        HttpResponse response = updateRefundForHttpResponse(spaceId, request);
        String returnType = "Refund";
        if(returnType.equals("String")){
          return (Refund) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Refund>() {};
        return (Refund)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update Refund
    * This operation updates the state of the refund. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned refund corresponds to the refund indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the refund is located in.
    * @param request The refund update request allows to update the state of a refund.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Refund
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-refund">Update Refund Documentation</a>

    **/
    public Refund updateRefund(Long spaceId, PaymentAppRefundUpdateRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = updateRefundForHttpResponse(spaceId, request, params);
        String returnType = "Refund";
        if(returnType.equals("String")){
            return (Refund) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Refund>() {};
        return (Refund)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateRefundForHttpResponse(Long spaceId, PaymentAppRefundUpdateRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateRefund");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateRefund");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-refund");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse updateRefundForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateRefund");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateRefund");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-refund");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse updateRefundForHttpResponse(Long spaceId, PaymentAppRefundUpdateRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateRefund");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateRefund");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-refund");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

  /**
    * Update Void
    * This operation updates the state of the transaction void. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned void corresponds to the void indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the void is located in.
    * @param request The void update request allows to update the state of a void.
    * @return TransactionVoid
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-void">Update Void Documentation</a>

    **/
    public TransactionVoid updateVoid(Long spaceId, PaymentAppVoidUpdateRequest request) throws IOException {
        HttpResponse response = updateVoidForHttpResponse(spaceId, request);
        String returnType = "TransactionVoid";
        if(returnType.equals("String")){
          return (TransactionVoid) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<TransactionVoid>() {};
        return (TransactionVoid)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update Void
    * This operation updates the state of the transaction void. This method can be invoked for transactions originally created with a processor associated with the web app that invokes this operation. The returned void corresponds to the void indicated in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId This is the ID of the space in which the void is located in.
    * @param request The void update request allows to update the state of a void.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionVoid
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-web-app-service--update-void">Update Void Documentation</a>

    **/
    public TransactionVoid updateVoid(Long spaceId, PaymentAppVoidUpdateRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = updateVoidForHttpResponse(spaceId, request, params);
        String returnType = "TransactionVoid";
        if(returnType.equals("String")){
            return (TransactionVoid) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<TransactionVoid>() {};
        return (TransactionVoid)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateVoidForHttpResponse(Long spaceId, PaymentAppVoidUpdateRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateVoid");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateVoid");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-void");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse updateVoidForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateVoid");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateVoid");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-void");
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

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse updateVoidForHttpResponse(Long spaceId, PaymentAppVoidUpdateRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateVoid");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling updateVoid");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/payment-web-app/update-void");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

}
