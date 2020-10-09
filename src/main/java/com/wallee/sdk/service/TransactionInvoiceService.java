package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TransactionInvoice;
import com.wallee.sdk.model.TransactionInvoiceReplacement;


public class TransactionInvoiceService {
    private ApiClient apiClient;

    public TransactionInvoiceService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/transaction-invoice/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/transaction-invoice/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/transaction-invoice/count");
    }


    /**
     * getInvoiceDocument
     * Returns the PDF document for the transaction invoice with given id.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice to get the document for.
     * @return RenderedDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedDocument>(){});
    }

    /**
     * getInvoiceDocument
     * Returns the PDF document for the transaction invoice with given id.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice to get the document for.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return RenderedDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>
     **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedDocument>(){});
    }

    public HttpResponse getInvoiceDocumentForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "getInvoiceDocument");
        ServiceUtils.checkParam(id == null, "id", "getInvoiceDocument");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocument")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getInvoiceDocumentForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "getInvoiceDocument");
        ServiceUtils.checkParam(id == null, "id", "getInvoiceDocument");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocument");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * getInvoiceDocumentWithTargetMediaType
     * Returns the PDF document for the transaction invoice with given id and target media type id.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id                The id of the transaction invoice to get the document for.
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for.
     * @return RenderedDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     **/
    public RenderedDocument getInvoiceDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId) throws IOException {
        HttpResponse response = getInvoiceDocumentWithTargetMediaTypeForHttpResponse(spaceId, id, targetMediaTypeId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedDocument>(){});
    }

    /**
     * getInvoiceDocumentWithTargetMediaType
     * Returns the PDF document for the transaction invoice with given id and target media type id.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id                The id of the transaction invoice to get the document for.
     * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for.
     * @param params            Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return RenderedDocument
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>
     **/
    public RenderedDocument getInvoiceDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId, Map<String, Object> params) throws IOException {
        HttpResponse response = getInvoiceDocumentWithTargetMediaTypeForHttpResponse(spaceId, id, targetMediaTypeId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedDocument>(){});
    }

    public HttpResponse getInvoiceDocumentWithTargetMediaTypeForHttpResponse(Long spaceId, Long id, Long targetMediaTypeId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "getInvoiceDocumentWithTargetMediaType");
        ServiceUtils.checkParam(id == null, "id", "getInvoiceDocumentWithTargetMediaType");
        ServiceUtils.checkParam(targetMediaTypeId == null, "targetMediaTypeId", "getInvoiceDocumentWithTargetMediaType");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocumentWithTargetMediaType")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id)
                .queryParam("targetMediaTypeId", targetMediaTypeId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getInvoiceDocumentWithTargetMediaTypeForHttpResponse(Long spaceId, Long id, Long targetMediaTypeId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "getInvoiceDocumentWithTargetMediaType");
        ServiceUtils.checkParam(id == null, "id", "getInvoiceDocumentWithTargetMediaType");
        ServiceUtils.checkParam(targetMediaTypeId == null, "targetMediaTypeId", "getInvoiceDocumentWithTargetMediaType");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocumentWithTargetMediaType");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);
        // Add the required query param 'targetMediaTypeId' to the map of query params
        allParams.put("targetMediaTypeId", targetMediaTypeId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * isReplacementPossible
     * Returns whether the transaction invoice with the given id can be replaced.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The invoice which should be checked if a replacement is possible.
     * @return Boolean
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     **/
    public Boolean isReplacementPossible(Long spaceId, Long id) throws IOException {
        HttpResponse response = isReplacementPossibleForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Boolean>(){});
    }

    /**
     * isReplacementPossible
     * Returns whether the transaction invoice with the given id can be replaced.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The invoice which should be checked if a replacement is possible.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Boolean
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>
     **/
    public Boolean isReplacementPossible(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = isReplacementPossibleForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Boolean>(){});
    }

    public HttpResponse isReplacementPossibleForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "isReplacementPossible");
        ServiceUtils.checkParam(id == null, "id", "isReplacementPossible");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/isReplacementPossible")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse isReplacementPossibleForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "isReplacementPossible");
        ServiceUtils.checkParam(id == null, "id", "isReplacementPossible");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/isReplacementPossible");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * Mark as Derecognized
     * Marks the transaction invoice with the given id as derecognized.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice which should be marked as derecognized.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     **/
    public TransactionInvoice markAsDerecognized(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsDerecognizedForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    /**
     * Mark as Derecognized
     * Marks the transaction invoice with the given id as derecognized.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice which should be marked as derecognized.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>
     **/
    public TransactionInvoice markAsDerecognized(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsDerecognizedForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    public HttpResponse markAsDerecognizedForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsDerecognized");
        ServiceUtils.checkParam(id == null, "id", "markAsDerecognized");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsDerecognized")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsDerecognizedForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsDerecognized");
        ServiceUtils.checkParam(id == null, "id", "markAsDerecognized");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsDerecognized");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
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
     * Mark as Paid
     * Marks the transaction invoice with the given id as paid.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice which should be marked as paid.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     **/
    public TransactionInvoice markAsPaid(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsPaidForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    /**
     * Mark as Paid
     * Marks the transaction invoice with the given id as paid.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoice which should be marked as paid.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>
     **/
    public TransactionInvoice markAsPaid(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsPaidForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    public HttpResponse markAsPaidForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsPaid");
        ServiceUtils.checkParam(id == null, "id", "markAsPaid");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsPaid")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsPaidForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsPaid");
        ServiceUtils.checkParam(id == null, "id", "markAsPaid");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsPaid");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
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
     * @param id      The id of the transaction invoices which should be returned.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     **/
    public TransactionInvoice read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction invoices which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>
     **/
    public TransactionInvoice read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/transaction-invoice/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/transaction-invoice/read");
    }


    /**
     * replace
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id          The id of the transaction invoices which should be replaced.
     * @param replacement
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     **/
    public TransactionInvoice replace(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws IOException {
        HttpResponse response = replaceForHttpResponse(spaceId, id, replacement);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    /**
     * replace
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id          The id of the transaction invoices which should be replaced.
     * @param replacement
     * @param params      Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return TransactionInvoice
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>
     **/
    public TransactionInvoice replace(Long spaceId, Long id, TransactionInvoiceReplacement replacement, Map<String, Object> params) throws IOException {
        HttpResponse response = replaceForHttpResponse(spaceId, id, replacement, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<TransactionInvoice>(){});
    }

    public HttpResponse replaceForHttpResponse(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "replace");
        ServiceUtils.checkParam(id == null, "id", "replace");
        ServiceUtils.checkParam(replacement == null, "replacement", "replace");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(replacement);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse replaceForHttpResponse(Long spaceId, Long id, InputStream replacement, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "replace");
        ServiceUtils.checkParam(id == null, "id", "replace");
        ServiceUtils.checkParam(replacement == null, "replacement", "replace");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        return ServiceUtils.getHttpResponse(replacement, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse replaceForHttpResponse(Long spaceId, Long id, TransactionInvoiceReplacement replacement, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "replace");
        ServiceUtils.checkParam(id == null, "id", "replace");
        ServiceUtils.checkParam(replacement == null, "replacement", "replace");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(replacement);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the transaction invoices which are returned by the search.
     * @return List&lt;TransactionInvoice&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     **/
    public List<TransactionInvoice> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoice>>(){});
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the transaction invoices which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;TransactionInvoice&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>
     **/
    public List<TransactionInvoice> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoice>>(){});
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


}
