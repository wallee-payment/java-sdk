package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityExportRequest;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.HumanUser;
import com.wallee.sdk.model.HumanUserCreate;
import com.wallee.sdk.model.HumanUserUpdate;
import com.wallee.sdk.model.ServerError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class HumanUserService {
    private ApiClient apiClient;

    public HumanUserService(ApiClient apiClient) {
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
    * @param filter The filter which restricts the entities which are used to calculate the count.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(filter);
        String returnType = "Long";
        if(returnType.equals("String")){
          return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Count
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, params);
        String returnType = "Long";
        if(returnType.equals("String")){
            return (Long) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Long>() {};
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/count");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse countForHttpResponse(java.io.InputStream filter, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/count");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = filter == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, filter);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/count");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param entity The human user object with the properties which should be created.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--create">Create Documentation</a>

    **/
    public HumanUser create(HumanUserCreate entity) throws IOException {
        HttpResponse response = createForHttpResponse(entity);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
          return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param entity The human user object with the properties which should be created.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--create">Create Documentation</a>

    **/
    public HumanUser create(HumanUserCreate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(entity, params);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
            return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createForHttpResponse(HumanUserCreate entity) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/create");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createForHttpResponse(java.io.InputStream entity, String mediaType) throws IOException {
          // verify the required parameter 'entity' is set
              if (entity == null) {
              throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/create");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = entity == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createForHttpResponse(HumanUserCreate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling create");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/create");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete
    * Deletes the entity with the given id.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id 
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--delete">Delete Documentation</a>

    **/
    public void delete(Long id) throws IOException {
        deleteForHttpResponse(id);
    }

  /**
    * Delete
    * Deletes the entity with the given id.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--delete">Delete Documentation</a>

    **/
    public void delete(Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(id, params);
    }

    public HttpResponse deleteForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/delete");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse deleteForHttpResponse(java.io.InputStream id, String mediaType) throws IOException {
          // verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/delete");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = id == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, id);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse deleteForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling delete");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/delete");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Export
    * Exports the human users into a CSV file. The file will contain the properties defined in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param request The request controls the entries which are exported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--export">Export Documentation</a>

    **/
    public byte[] export(EntityExportRequest request) throws IOException {
        HttpResponse response = exportForHttpResponse(request);
        String returnType = "byte[]";
        if(returnType.equals("String")){
          return (byte[]) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<byte[]>() {};
        return (byte[])apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Export
    * Exports the human users into a CSV file. The file will contain the properties defined in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param request The request controls the entries which are exported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--export">Export Documentation</a>

    **/
    public byte[] export(EntityExportRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = exportForHttpResponse(request, params);
        String returnType = "byte[]";
        if(returnType.equals("String")){
            return (byte[]) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<byte[]>() {};
        return (byte[])apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportForHttpResponse(EntityExportRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/export");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse exportForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/export");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse exportForHttpResponse(EntityExportRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/export");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of the human user which should be returned.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--read">Read Documentation</a>

    **/
    public HumanUser read(Long id) throws IOException {
        HttpResponse response = readForHttpResponse(id);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
          return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of the human user which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--read">Read Documentation</a>

    **/
    public HumanUser read(Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(id, params);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
            return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/read");
        if (id != null) {
            String key = "id";
            Object value = id;
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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse readForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param query The query restricts the human users which are returned by the search.
    * @return List&lt;HumanUser&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--search">Search Documentation</a>

    **/
    public List<HumanUser> search(EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(query);
        String returnType = "List&lt;HumanUser&gt;";
        if(returnType.equals("String")){
          return (List<HumanUser>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<HumanUser>>() {};
        return (List<HumanUser>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param query The query restricts the human users which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;HumanUser&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--search">Search Documentation</a>

    **/
    public List<HumanUser> search(EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(query, params);
        String returnType = "List&lt;HumanUser&gt;";
        if(returnType.equals("String")){
            return (List<HumanUser>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<HumanUser>>() {};
        return (List<HumanUser>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(EntityQuery query) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/search");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse searchForHttpResponse(java.io.InputStream query, String mediaType) throws IOException {
          // verify the required parameter 'query' is set
              if (query == null) {
              throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/search");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = query == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse searchForHttpResponse(EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/search");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param entity The object with all the properties which should be updated. The id and the version are required properties.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--update">Update Documentation</a>

    **/
    public HumanUser update(HumanUserUpdate entity) throws IOException {
        HttpResponse response = updateForHttpResponse(entity);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
          return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param entity The object with all the properties which should be updated. The id and the version are required properties.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HumanUser
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#human-user-service--update">Update Documentation</a>

    **/
    public HumanUser update(HumanUserUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(entity, params);
        String returnType = "HumanUser";
        if(returnType.equals("String")){
            return (HumanUser) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<HumanUser>() {};
        return (HumanUser)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateForHttpResponse(HumanUserUpdate entity) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/update");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse updateForHttpResponse(java.io.InputStream entity, String mediaType) throws IOException {
          // verify the required parameter 'entity' is set
              if (entity == null) {
              throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/update");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = entity == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse updateForHttpResponse(HumanUserUpdate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/human-user/update");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
