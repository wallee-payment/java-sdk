# SubscriptionLedgerEntryServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionLedgerEntryServiceApi.md#count) | **POST** /subscription-ledger-entry/count | Count
[**create**](SubscriptionLedgerEntryServiceApi.md#create) | **POST** /subscription-ledger-entry/create | Create
[**read**](SubscriptionLedgerEntryServiceApi.md#read) | **GET** /subscription-ledger-entry/read | Read
[**search**](SubscriptionLedgerEntryServiceApi.md#search) | **POST** /subscription-ledger-entry/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionLedgerEntryServiceApi;


SubscriptionLedgerEntryServiceApi apiInstance = new SubscriptionLedgerEntryServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionLedgerEntryServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **filter** | [**EntityQueryFilter**](EntityQueryFilter.md)| The filter which restricts the entities which are used to calculate the count. | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="create"></a>
# **create**
> SubscriptionLedgerEntry create(spaceId, entry)

Create

The create operation creates a new subscription ledger entry.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionLedgerEntryServiceApi;


SubscriptionLedgerEntryServiceApi apiInstance = new SubscriptionLedgerEntryServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionLedgerEntryCreate entry = new SubscriptionLedgerEntryCreate(); // SubscriptionLedgerEntryCreate | 
try {
    SubscriptionLedgerEntry result = apiInstance.create(spaceId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionLedgerEntryServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entry** | [**SubscriptionLedgerEntryCreate**](SubscriptionLedgerEntryCreate.md)|  |

### Return type

[**SubscriptionLedgerEntry**](SubscriptionLedgerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionLedgerEntry read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionLedgerEntryServiceApi;


SubscriptionLedgerEntryServiceApi apiInstance = new SubscriptionLedgerEntryServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the subscription charge which should be returned.
try {
    SubscriptionLedgerEntry result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionLedgerEntryServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the subscription charge which should be returned. |

### Return type

[**SubscriptionLedgerEntry**](SubscriptionLedgerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionLedgerEntry&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionLedgerEntryServiceApi;


SubscriptionLedgerEntryServiceApi apiInstance = new SubscriptionLedgerEntryServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the subscription charges which are returned by the search.
try {
    List<SubscriptionLedgerEntry> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionLedgerEntryServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the subscription charges which are returned by the search. |

### Return type

[**List&lt;SubscriptionLedgerEntry&gt;**](SubscriptionLedgerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

