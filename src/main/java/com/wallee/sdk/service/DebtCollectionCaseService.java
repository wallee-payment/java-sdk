package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Collection;
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
import com.wallee.sdk.model.DebtCollectionCase;
import com.wallee.sdk.model.DebtCollectionCaseCreate;
import com.wallee.sdk.model.DebtCollectionCaseDocument;
import com.wallee.sdk.model.DebtCollectionCaseUpdate;
import com.wallee.sdk.model.DebtCollectionReceipt;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;


public class DebtCollectionCaseService {
    private ApiClient apiClient;

    public DebtCollectionCaseService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add Collected Amount
     * Adds a new collected amount to the case, creating a new payment receipt.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id              The id of the debt collection case for which the amount should be added.
     * @param collectedAmount The amount that has been collected.
     * @param externalId      The unique external id of this payment receipt.
     * @return DebtCollectionReceipt
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--add-collected-amount">Add Collected Amount Documentation</a>
     **/
    public DebtCollectionReceipt addCollectedAmount(Long spaceId, Long id, BigDecimal collectedAmount, String externalId) throws IOException {
        HttpResponse response = addCollectedAmountForHttpResponse(spaceId, id, collectedAmount, externalId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionReceipt>(){});
    }

    /**
     * Add Collected Amount
     * Adds a new collected amount to the case, creating a new payment receipt.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id              The id of the debt collection case for which the amount should be added.
     * @param collectedAmount The amount that has been collected.
     * @param externalId      The unique external id of this payment receipt.
     * @param params          Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionReceipt
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--add-collected-amount">Add Collected Amount Documentation</a>
     **/
    public DebtCollectionReceipt addCollectedAmount(Long spaceId, Long id, BigDecimal collectedAmount, String externalId, Map<String, Object> params) throws IOException {
        HttpResponse response = addCollectedAmountForHttpResponse(spaceId, id, collectedAmount, externalId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionReceipt>(){});
    }

    public HttpResponse addCollectedAmountForHttpResponse(Long spaceId, Long id, BigDecimal collectedAmount, String externalId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "addCollectedAmount");
        ServiceUtils.checkParam(id == null, "id", "addCollectedAmount");
        ServiceUtils.checkParam(collectedAmount == null, "collectedAmount", "addCollectedAmount");
        ServiceUtils.checkParam(externalId == null, "externalId", "addCollectedAmount");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/addCollectedAmount")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);
        {
            String key = "collectedAmount";
            if (collectedAmount instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) collectedAmount).toArray());
            } else {
                uriBuilder = uriBuilder.queryParam(key, collectedAmount);
            }
        }
        uriBuilder = uriBuilder.queryParam("externalId", externalId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse addCollectedAmountForHttpResponse(Long spaceId, Long id, BigDecimal collectedAmount, String externalId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "addCollectedAmount");
        ServiceUtils.checkParam(id == null, "id", "addCollectedAmount");
        ServiceUtils.checkParam(collectedAmount == null, "collectedAmount", "addCollectedAmount");
        ServiceUtils.checkParam(externalId == null, "externalId", "addCollectedAmount");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/addCollectedAmount");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);
        // Add the required query param 'collectedAmount' to the map of query params
        allParams.put("collectedAmount", collectedAmount);
        // Add the required query param 'externalId' to the map of query params
        allParams.put("externalId", externalId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Attach Document
     * Attach an additional supporting document to the case.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id            The id of the debt collection case.
     * @param fileName      The file name of the document that is uploaded.
     * @param contentBase64 The BASE64 encoded contents of the document.
     * @return DebtCollectionCaseDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--attach-document">Attach Document Documentation</a>
     **/
    public DebtCollectionCaseDocument attachDocument(Long spaceId, Long id, String fileName, String contentBase64) throws IOException {
        HttpResponse response = attachDocumentForHttpResponse(spaceId, id, fileName, contentBase64);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCaseDocument>(){});
    }

    /**
     * Attach Document
     * Attach an additional supporting document to the case.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id            The id of the debt collection case.
     * @param fileName      The file name of the document that is uploaded.
     * @param contentBase64 The BASE64 encoded contents of the document.
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCaseDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--attach-document">Attach Document Documentation</a>
     **/
    public DebtCollectionCaseDocument attachDocument(Long spaceId, Long id, String fileName, String contentBase64, Map<String, Object> params) throws IOException {
        HttpResponse response = attachDocumentForHttpResponse(spaceId, id, fileName, contentBase64, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCaseDocument>(){});
    }

    public HttpResponse attachDocumentForHttpResponse(Long spaceId, Long id, String fileName, String contentBase64) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "attachDocument");
        ServiceUtils.checkParam(id == null, "id", "attachDocument");
        ServiceUtils.checkParam(fileName == null, "fileName", "attachDocument");
        ServiceUtils.checkParam(contentBase64 == null, "contentBase64", "attachDocument");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/attachDocument")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id)
                .queryParam("fileName", fileName);
        String key = "contentBase64";
        uriBuilder = uriBuilder.queryParam(key, contentBase64);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse attachDocumentForHttpResponse(Long spaceId, Long id, String fileName, String contentBase64, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "attachDocument");
        ServiceUtils.checkParam(id == null, "id", "attachDocument");
        ServiceUtils.checkParam(fileName == null, "fileName", "attachDocument");
        ServiceUtils.checkParam(contentBase64 == null, "contentBase64", "attachDocument");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/attachDocument");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);
        // Add the required query param 'fileName' to the map of query params
        allParams.put("fileName", fileName);
        // Add the required query param 'contentBase64' to the map of query params
        allParams.put("contentBase64", contentBase64);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Close
     * Closes the debt collection case, meaning no further money can be collected.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be closed.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--close">Close Documentation</a>
     **/
    public DebtCollectionCase close(Long spaceId, Long id) throws IOException {
        HttpResponse response = closeForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Close
     * Closes the debt collection case, meaning no further money can be collected.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be closed.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--close">Close Documentation</a>
     **/
    public DebtCollectionCase close(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = closeForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse closeForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "close");
        ServiceUtils.checkParam(id == null, "id", "close");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/close")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse closeForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "close");
        ServiceUtils.checkParam(id == null, "id", "close");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/close");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param filter  The filter which restricts the entities which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/debt-collection-case/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/debt-collection-case/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/debt-collection-case/count");
    }


    /**
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The debt collection case object with the properties which should be created.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--create">Create Documentation</a>
     **/
    public DebtCollectionCase create(Long spaceId, DebtCollectionCaseCreate entity) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The debt collection case object with the properties which should be created.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--create">Create Documentation</a>
     **/
    public DebtCollectionCase create(Long spaceId, DebtCollectionCaseCreate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse createForHttpResponse(Long spaceId, DebtCollectionCaseCreate entity) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, apiClient, "/debt-collection-case/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, mediaType, apiClient, "/debt-collection-case/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, DebtCollectionCaseCreate entity, Map<String, Object> params) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, params, apiClient, "/debt-collection-case/create");
    }


    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id) throws IOException {
        deleteForHttpResponse(spaceId, id);
    }

    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(spaceId, id, params);
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, apiClient, "/debt-collection-case/delete");
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, InputStream id, String mediaType) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, mediaType, apiClient, "/debt-collection-case/delete");
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, params, apiClient, "/debt-collection-case/delete");
    }


    /**
     * Documents
     * Returns all documents that are attached to a debt collection case.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case for which the attached documents are returned.
     * @return List&lt;DebtCollectionCaseDocument&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--documents">Documents Documentation</a>
     **/
    public List<DebtCollectionCaseDocument> documents(Long spaceId, Long id) throws IOException {
        HttpResponse response = documentsForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DebtCollectionCaseDocument>>(){});
    }

    /**
     * Documents
     * Returns all documents that are attached to a debt collection case.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case for which the attached documents are returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;DebtCollectionCaseDocument&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--documents">Documents Documentation</a>
     **/
    public List<DebtCollectionCaseDocument> documents(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = documentsForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DebtCollectionCaseDocument>>(){});
    }

    public HttpResponse documentsForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "documents");
        ServiceUtils.checkParam(id == null, "id", "documents");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/documents")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse documentsForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "documents");
        ServiceUtils.checkParam(id == null, "id", "documents");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/documents");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Mark Case As Prepared
     * This operation will mark a debt collection case as prepared and allow the collection process to proceed.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be marked as prepared.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--mark-as-prepared">Mark Case As Prepared Documentation</a>
     **/
    public DebtCollectionCase markAsPrepared(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsPreparedForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Mark Case As Prepared
     * This operation will mark a debt collection case as prepared and allow the collection process to proceed.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be marked as prepared.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--mark-as-prepared">Mark Case As Prepared Documentation</a>
     **/
    public DebtCollectionCase markAsPrepared(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsPreparedForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse markAsPreparedForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsPrepared");
        ServiceUtils.checkParam(id == null, "id", "markAsPrepared");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/markAsPrepared")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsPreparedForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsPrepared");
        ServiceUtils.checkParam(id == null, "id", "markAsPrepared");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/markAsPrepared");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Mark Case As Reviewed
     * This operation will mark a debt collection case as reviewed and allow the collection process to proceed.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be reviewed.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--mark-as-reviewed">Mark Case As Reviewed Documentation</a>
     **/
    public DebtCollectionCase markAsReviewed(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsReviewedForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Mark Case As Reviewed
     * This operation will mark a debt collection case as reviewed and allow the collection process to proceed.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be reviewed.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--mark-as-reviewed">Mark Case As Reviewed Documentation</a>
     **/
    public DebtCollectionCase markAsReviewed(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsReviewedForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse markAsReviewedForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsReviewed");
        ServiceUtils.checkParam(id == null, "id", "markAsReviewed");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/markAsReviewed")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsReviewedForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsReviewed");
        ServiceUtils.checkParam(id == null, "id", "markAsReviewed");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/markAsReviewed");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be returned.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--read">Read Documentation</a>
     **/
    public DebtCollectionCase read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the debt collection case which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--read">Read Documentation</a>
     **/
    public DebtCollectionCase read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/debt-collection-case/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/debt-collection-case/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the cases which are returned by the search.
     * @return List&lt;DebtCollectionCase&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--search">Search Documentation</a>
     **/
    public List<DebtCollectionCase> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DebtCollectionCase>>(){});
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the cases which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;DebtCollectionCase&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--search">Search Documentation</a>
     **/
    public List<DebtCollectionCase> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DebtCollectionCase>>(){});
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The object with all the properties which should be updated. The id and the version are required properties.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--update">Update Documentation</a>
     **/
    public DebtCollectionCase update(Long spaceId, DebtCollectionCaseUpdate entity) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The object with all the properties which should be updated. The id and the version are required properties.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DebtCollectionCase
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#debt-collection-case-service--update">Update Documentation</a>
     **/
    public DebtCollectionCase update(Long spaceId, DebtCollectionCaseUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DebtCollectionCase>(){});
    }

    public HttpResponse updateForHttpResponse(Long spaceId, DebtCollectionCaseUpdate entity) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/update")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/update")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(entity, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, DebtCollectionCaseUpdate entity, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/debt-collection-case/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
    }


}
