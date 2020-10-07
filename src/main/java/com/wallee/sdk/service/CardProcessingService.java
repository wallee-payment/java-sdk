package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.json.Json;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.UnencryptedCardDataCreate;


public class CardProcessingService {
    private ApiClient apiClient;

    public CardProcessingService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Process
    * The process method will process the transaction with the given card details without using 3-D secure.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#card-processing-service--process">Process Documentation</a>

    **/
    public Transaction process(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws IOException {
        HttpResponse response = processForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData);
        String returnType = "Transaction";
      TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Process
    * The process method will process the transaction with the given card details without using 3-D secure.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#card-processing-service--process">Process Documentation</a>

    **/
    public Transaction process(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        HttpResponse response = processForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData, params);
        String returnType = "Transaction";
      TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
        }// verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
        }// verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/process");
      {
          String key = "spaceId";
          Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      {
          String key = "transactionId";
          Object value = transactionId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      String key = "paymentMethodConfigurationId";
      Object value = paymentMethodConfigurationId;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, InputStream cardData, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
              }// verify the required parameter 'transactionId' is set
              if (transactionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
              }// verify the required parameter 'paymentMethodConfigurationId' is set
              if (paymentMethodConfigurationId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
              }// verify the required parameter 'cardData' is set
              if (cardData == null) {
              throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/process");
        {
            String key = "spaceId";
            Object value = spaceId;
          uriBuilder = uriBuilder.queryParam(key, value);
        }
        {
            String key = "transactionId";
            Object value = transactionId;
          uriBuilder = uriBuilder.queryParam(key, value);
        }
        String key = "paymentMethodConfigurationId";
        Object value = paymentMethodConfigurationId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, cardData);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse processForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling process");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling process");
        }// verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling process");
        }// verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling process");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/process");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'paymentMethodConfigurationId' to the map of query params
        allParams.put("paymentMethodConfigurationId", paymentMethodConfigurationId);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Process With 3-D Secure
    * The process method will process the transaction with the given card details by eventually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#card-processing-service--process-with3-d-secure">Process With 3-D Secure Documentation</a>

    **/
    public String processWith3DSecure(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws IOException {
        HttpResponse response = processWith3DSecureForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData);
        String returnType = "String";
      return response.parseAsString();
    }

  /**
    * Process With 3-D Secure
    * The process method will process the transaction with the given card details by eventually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which should be processed.
    * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction.
    * @param cardData The card details as JSON in plain which should be used to authorize the payment.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#card-processing-service--process-with3-d-secure">Process With 3-D Secure Documentation</a>

    **/
    public String processWith3DSecure(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        HttpResponse response = processWith3DSecureForHttpResponse(spaceId, transactionId, paymentMethodConfigurationId, cardData, params);
        String returnType = "String";
      return response.parseAsString();
    }

    public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
        }// verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
        }// verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/processWith3DSecure");
      {
          String key = "spaceId";
          Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      {
          String key = "transactionId";
          Object value = transactionId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      String key = "paymentMethodConfigurationId";
      Object value = paymentMethodConfigurationId;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, InputStream cardData, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
              }// verify the required parameter 'transactionId' is set
              if (transactionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
              }// verify the required parameter 'paymentMethodConfigurationId' is set
              if (paymentMethodConfigurationId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
              }// verify the required parameter 'cardData' is set
              if (cardData == null) {
              throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/processWith3DSecure");
        {
            String key = "spaceId";
            Object value = spaceId;
          uriBuilder = uriBuilder.queryParam(key, value);
        }
        {
            String key = "transactionId";
            Object value = transactionId;
          uriBuilder = uriBuilder.queryParam(key, value);
        }
        String key = "paymentMethodConfigurationId";
        Object value = paymentMethodConfigurationId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, cardData);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse processWith3DSecureForHttpResponse(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWith3DSecure");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling processWith3DSecure");
        }// verify the required parameter 'paymentMethodConfigurationId' is set
        if (paymentMethodConfigurationId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure");
        }// verify the required parameter 'cardData' is set
        if (cardData == null) {
            throw new IllegalArgumentException("Missing the required parameter 'cardData' when calling processWith3DSecure");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/card-processing/processWith3DSecure");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'paymentMethodConfigurationId' to the map of query params
        allParams.put("paymentMethodConfigurationId", paymentMethodConfigurationId);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(cardData);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
