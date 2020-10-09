package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
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
import com.wallee.sdk.model.TransactionInvoiceComment;
import com.wallee.sdk.model.TransactionInvoiceCommentActive;
import com.wallee.sdk.model.TransactionInvoiceCommentCreate;


public class TransactionInvoiceCommentService {
    private ApiClient apiClient;

    public TransactionInvoiceCommentService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Find by invoice
     * Returns all comments of the given transaction invoice.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param invoiceId
     * @return List&lt;TransactionInvoiceComment&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--all">Find by invoice Documentation</a>
     **/
    public List<TransactionInvoiceComment> all(Long spaceId, Long invoiceId) throws IOException {
        HttpResponse response = allForHttpResponse(spaceId, invoiceId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoiceComment>>() {
        });
    }

    /**
     * Find by invoice
     * Returns all comments of the given transaction invoice.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param invoiceId
     * @param params    Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;TransactionInvoiceComment&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--all">Find by invoice Documentation</a>
     **/
    public List<TransactionInvoiceComment> all(Long spaceId, Long invoiceId, Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(spaceId, invoiceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoiceComment>>() {
        });
    }

    public HttpResponse allForHttpResponse(Long spaceId, Long invoiceId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "all");
        ServiceUtils.checkParam(invoiceId == null, "invoiceId", "all");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/all");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        String key = "invoiceId";
        uriBuilder = uriBuilder.queryParam(key, invoiceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse allForHttpResponse(Long spaceId, Long invoiceId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "all");
        ServiceUtils.checkParam(invoiceId == null, "invoiceId", "all");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/all");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'invoiceId' to the map of query params
        allParams.put("invoiceId", invoiceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Create
     * Creates the comment with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--create">Create Documentation</a>
     **/
    public TransactionInvoiceComment create(Long spaceId, TransactionInvoiceCommentCreate entity) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    /**
     * Create
     * Creates the comment with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--create">Create Documentation</a>
     **/
    public TransactionInvoiceComment create(Long spaceId, TransactionInvoiceCommentCreate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    public HttpResponse createForHttpResponse(Long spaceId, TransactionInvoiceCommentCreate entity) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, apiClient, "/transaction-invoice-comment/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, mediaType, apiClient, "/transaction-invoice-comment/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, TransactionInvoiceCommentCreate entity, Map<String, Object> params) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, params, apiClient, "/transaction-invoice-comment/create");
    }


    /**
     * Delete
     * Deletes the comment with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id) throws IOException {
        deleteForHttpResponse(spaceId, id);
    }

    /**
     * Delete
     * Deletes the comment with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(spaceId, id, params);
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, apiClient, "/transaction-invoice-comment/delete");
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, params, apiClient, "/transaction-invoice-comment/delete");
    }


    /**
     * Pin
     * Pins the comment to the top.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--pin">Pin Documentation</a>
     **/
    public void pin(Long spaceId, Long id) throws IOException {
        pinForHttpResponse(spaceId, id);
    }

    /**
     * Pin
     * Pins the comment to the top.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--pin">Pin Documentation</a>
     **/
    public void pin(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        pinForHttpResponse(spaceId, id, params);
    }

    public HttpResponse pinForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "pin");
        ServiceUtils.checkParam(id == null, "id", "pin");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/pin");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        String key = "id";
        uriBuilder = uriBuilder.queryParam(key, id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse pinForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "pin");
        ServiceUtils.checkParam(id == null, "id", "pin");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/pin");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * Read
     * Reads the comment with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--read">Read Documentation</a>
     **/
    public TransactionInvoiceComment read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    /**
     * Read
     * Reads the comment with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--read">Read Documentation</a>
     **/
    public TransactionInvoiceComment read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/transaction-invoice-comment/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/transaction-invoice-comment/read");
    }


    /**
     * Unpin
     * Unpins the comment from the top.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--unpin">Unpin Documentation</a>
     **/
    public void unpin(Long spaceId, Long id) throws IOException {
        unpinForHttpResponse(spaceId, id);
    }

    /**
     * Unpin
     * Unpins the comment from the top.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--unpin">Unpin Documentation</a>
     **/
    public void unpin(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        unpinForHttpResponse(spaceId, id, params);
    }

    public HttpResponse unpinForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "unpin");
        ServiceUtils.checkParam(id == null, "id", "unpin");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/unpin");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        String key = "id";
        uriBuilder = uriBuilder.queryParam(key, id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse unpinForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "unpin");
        ServiceUtils.checkParam(id == null, "id", "unpin");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/unpin");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * Update
     * This updates the comment with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the comment.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--update">Update Documentation</a>
     **/
    public TransactionInvoiceComment update(Long spaceId, TransactionInvoiceCommentActive entity) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    /**
     * Update
     * This updates the comment with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the comment.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoiceComment
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-comment-service--update">Update Documentation</a>
     **/
    public TransactionInvoiceComment update(Long spaceId, TransactionInvoiceCommentActive entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoiceComment>() {
        });
    }

    public HttpResponse updateForHttpResponse(Long spaceId, TransactionInvoiceCommentActive entity) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/update");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/update");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(Long spaceId, TransactionInvoiceCommentActive entity, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice-comment/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
