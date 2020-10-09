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
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionChangeRequest;
import com.wallee.sdk.model.SubscriptionCharge;
import com.wallee.sdk.model.SubscriptionCreateRequest;
import com.wallee.sdk.model.SubscriptionVersion;
import com.wallee.sdk.model.TransactionInvoice;


public class SubscriptionService {
    private ApiClient apiClient;

    public SubscriptionService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * apply changes
     * This operation allows to apply changes on a subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param request
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--apply-changes">apply changes Documentation</a>
     **/
    public SubscriptionVersion applyChanges(Long spaceId, SubscriptionChangeRequest request) throws IOException {
        HttpResponse response = applyChangesForHttpResponse(spaceId, request);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    /**
     * apply changes
     * This operation allows to apply changes on a subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param request
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--apply-changes">apply changes Documentation</a>
     **/
    public SubscriptionVersion applyChanges(Long spaceId, SubscriptionChangeRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = applyChangesForHttpResponse(spaceId, request, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    public HttpResponse applyChangesForHttpResponse(Long spaceId, SubscriptionChangeRequest request) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "applyChanges");
        ServiceUtils.checkParam(request == null, "request", "applyChanges");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/applyChanges")
                .queryParam("spaceId", spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse applyChangesForHttpResponse(Long spaceId, InputStream request, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "applyChanges");
        ServiceUtils.checkParam(request == null, "request", "applyChanges");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/applyChanges")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(request, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse applyChangesForHttpResponse(Long spaceId, SubscriptionChangeRequest request, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "applyChanges");
        ServiceUtils.checkParam(request == null, "request", "applyChanges");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/applyChanges");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--count">Count Documentation</a>
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/subscription/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/subscription/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/subscription/count");
    }


    /**
     * Create
     * The create operation creates a new subscription and a corresponding subscription version.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param createRequest
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--create">Create Documentation</a>
     **/
    public SubscriptionVersion create(Long spaceId, SubscriptionCreateRequest createRequest) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, createRequest);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    /**
     * Create
     * The create operation creates a new subscription and a corresponding subscription version.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param createRequest
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--create">Create Documentation</a>
     **/
    public SubscriptionVersion create(Long spaceId, SubscriptionCreateRequest createRequest, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, createRequest, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionCreateRequest createRequest) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "create");
        ServiceUtils.checkParam(createRequest == null, "createRequest", "create");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/create")
                .queryParam("spaceId", spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(createRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createForHttpResponse(Long spaceId, InputStream createRequest, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "create");
        ServiceUtils.checkParam(createRequest == null, "createRequest", "create");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/create")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(createRequest, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionCreateRequest createRequest, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "create");
        ServiceUtils.checkParam(createRequest == null, "createRequest", "create");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(createRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * initialize
     * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId The provided subscription id will be used to lookup the subscription which should be initialized.
     * @return SubscriptionCharge
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--initialize">initialize Documentation</a>
     **/
    public SubscriptionCharge initialize(Long spaceId, Long subscriptionId) throws IOException {
        HttpResponse response = initializeForHttpResponse(spaceId, subscriptionId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionCharge>(){});
    }

    /**
     * initialize
     * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId The provided subscription id will be used to lookup the subscription which should be initialized.
     * @param params         Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionCharge
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--initialize">initialize Documentation</a>
     **/
    public SubscriptionCharge initialize(Long spaceId, Long subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = initializeForHttpResponse(spaceId, subscriptionId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionCharge>(){});
    }

    public HttpResponse initializeForHttpResponse(Long spaceId, Long subscriptionId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "initialize");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "initialize");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/initialize")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse initializeForHttpResponse(Long spaceId, Long subscriptionId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "initialize");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "initialize");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/initialize");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * initializeSubscriberPresent
     * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId
     * @param successUrl     The subscriber will be redirected to the success URL when the transaction is successful.
     * @param failedUrl      The subscriber will be redirected to the fail URL when the transaction fails.
     * @return SubscriptionCharge
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--initialize-subscriber-present">initializeSubscriberPresent Documentation</a>
     **/
    public SubscriptionCharge initializeSubscriberPresent(Long spaceId, Long subscriptionId, String successUrl, String failedUrl) throws IOException {
        HttpResponse response = initializeSubscriberPresentForHttpResponse(spaceId, subscriptionId, successUrl, failedUrl);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionCharge>(){});
    }

    /**
     * initializeSubscriberPresent
     * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId
     * @param params         Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionCharge
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--initialize-subscriber-present">initializeSubscriberPresent Documentation</a>
     **/
    public SubscriptionCharge initializeSubscriberPresent(Long spaceId, Long subscriptionId, Map<String, Object> params) throws IOException {
        HttpResponse response = initializeSubscriberPresentForHttpResponse(spaceId, subscriptionId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionCharge>(){});
    }

    public HttpResponse initializeSubscriberPresentForHttpResponse(Long spaceId, Long subscriptionId, String successUrl, String failedUrl) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "initializeSubscriberPresent");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "initializeSubscriberPresent");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/initializeSubscriberPresent")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId);
        if (successUrl != null) uriBuilder = uriBuilder.queryParam("successUrl", successUrl);
        if (failedUrl != null) uriBuilder = uriBuilder.queryParam("failedUrl", failedUrl);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse initializeSubscriberPresentForHttpResponse(Long spaceId, Long subscriptionId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "initializeSubscriberPresent");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "initializeSubscriberPresent");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/initializeSubscriberPresent");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);

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
     * @param id      The id of the subscription which should be returned.
     * @return Subscription
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--read">Read Documentation</a>
     **/
    public Subscription read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Subscription>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the subscription which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Subscription
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--read">Read Documentation</a>
     **/
    public Subscription read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Subscription>(){});
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/subscription/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/subscription/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the subscriptions which are returned by the search.
     * @return List&lt;Subscription&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--search">Search Documentation</a>
     **/
    public List<Subscription> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<Subscription>>(){});
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the subscriptions which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;Subscription&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--search">Search Documentation</a>
     **/
    public List<Subscription> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<Subscription>>(){});
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


    /**
     * Search Subscription Invoices
     * This operation allows to search for subscription invoices.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId The id of the subscription for which the invoices should be searched for.
     * @param query          The query restricts the invoices which are returned by the search.
     * @return List&lt;TransactionInvoice&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--search-subscription-invoices">Search Subscription Invoices Documentation</a>
     **/
    public List<TransactionInvoice> searchSubscriptionInvoices(Long spaceId, Long subscriptionId, EntityQuery query) throws IOException {
        HttpResponse response = searchSubscriptionInvoicesForHttpResponse(spaceId, subscriptionId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoice>>(){});
    }

    /**
     * Search Subscription Invoices
     * This operation allows to search for subscription invoices.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId The id of the subscription for which the invoices should be searched for.
     * @param query          The query restricts the invoices which are returned by the search.
     * @param params         Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;TransactionInvoice&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--search-subscription-invoices">Search Subscription Invoices Documentation</a>
     **/
    public List<TransactionInvoice> searchSubscriptionInvoices(Long spaceId, Long subscriptionId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchSubscriptionInvoicesForHttpResponse(spaceId, subscriptionId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<TransactionInvoice>>(){});
    }

    public HttpResponse searchSubscriptionInvoicesForHttpResponse(Long spaceId, Long subscriptionId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(query == null, "query", "searchSubscriptionInvoices");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/searchSubscriptionInvoices")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchSubscriptionInvoicesForHttpResponse(Long spaceId, Long subscriptionId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(query == null, "query", "searchSubscriptionInvoices");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/searchSubscriptionInvoices")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchSubscriptionInvoicesForHttpResponse(Long spaceId, Long subscriptionId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "searchSubscriptionInvoices");
        ServiceUtils.checkParam(query == null, "query", "searchSubscriptionInvoices");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/searchSubscriptionInvoices");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


    /**
     * terminate
     * This operation allows to terminate a subscription.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The subscription id identifies the subscription which should be terminated.
     * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--terminate">terminate Documentation</a>
     **/
    public void terminate(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        terminateForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod);
    }

    /**
     * terminate
     * This operation allows to terminate a subscription.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The subscription id identifies the subscription which should be terminated.
     * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @param params                   Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--terminate">terminate Documentation</a>
     **/
    public void terminate(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        terminateForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod, params);
    }

    public HttpResponse terminateForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "terminate");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "terminate");
        ServiceUtils.checkParam(respectTerminationPeriod == null, "respectTerminationPeriod", "terminate");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/terminate")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId)
                .queryParam("respectTerminationPeriod", respectTerminationPeriod);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse terminateForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "terminate");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "terminate");
        ServiceUtils.checkParam(respectTerminationPeriod == null, "respectTerminationPeriod", "terminate");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/terminate");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);
        // Add the required query param 'respectTerminationPeriod' to the map of query params
        allParams.put("respectTerminationPeriod", respectTerminationPeriod);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * update product version
     * The update product version operation updates the product version of the subscription to the latest active product version.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The subscription id identifies the subscription which should be updated to the latest version.
     * @param respectTerminationPeriod The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--update-product-version">update product version Documentation</a>
     **/
    public SubscriptionVersion updateProductVersion(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        HttpResponse response = updateProductVersionForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    /**
     * update product version
     * The update product version operation updates the product version of the subscription to the latest active product version.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The subscription id identifies the subscription which should be updated to the latest version.
     * @param respectTerminationPeriod The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @param params                   Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-service--update-product-version">update product version Documentation</a>
     **/
    public SubscriptionVersion updateProductVersion(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        HttpResponse response = updateProductVersionForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionVersion>(){});
    }

    public HttpResponse updateProductVersionForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "updateProductVersion");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "updateProductVersion");
        ServiceUtils.checkParam(respectTerminationPeriod == null, "respectTerminationPeriod", "updateProductVersion");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/updateProductVersion")
                .queryParam("spaceId", spaceId)
                .queryParam("subscriptionId", subscriptionId)
                .queryParam("respectTerminationPeriod", respectTerminationPeriod);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateProductVersionForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "updateProductVersion");
        ServiceUtils.checkParam(subscriptionId == null, "subscriptionId", "updateProductVersion");
        ServiceUtils.checkParam(respectTerminationPeriod == null, "respectTerminationPeriod", "updateProductVersion");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription/updateProductVersion");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);
        // Add the required query param 'respectTerminationPeriod' to the map of query params
        allParams.put("respectTerminationPeriod", respectTerminationPeriod);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
