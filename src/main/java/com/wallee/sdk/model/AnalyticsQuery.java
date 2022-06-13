/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * Represents a query to be submitted for execution in Analytics.
 */
@ApiModel(description = "Represents a query to be submitted for execution in Analytics.")

public class AnalyticsQuery {
  
  @JsonProperty("accountId")
  protected Long accountId = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("maxCacheAge")
  protected Integer maxCacheAge = null;

  
  @JsonProperty("queryString")
  protected String queryString = null;

  
  @JsonProperty("scannedDataLimit")
  protected BigDecimal scannedDataLimit = null;

  
  @JsonProperty("spaceIds")
  protected List<Long> spaceIds = null;

  
  
  public AnalyticsQuery accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The mandatory ID of an account in which the query shall be executed. Must be a valid account ID greater than 0.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The mandatory ID of an account in which the query shall be executed. Must be a valid account ID greater than 0.")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  
  public AnalyticsQuery externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client generated nonce which uniquely identifies the query to be executed. Subsequent submissions with the same external ID will not re-execute the query but instead return the existing execution with that ID. Either the External ID or a Maximal Cache Age greater than 0 must be specified. If both are specified the External ID will have precedence and the Maximal Cache Age will be ignored.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which uniquely identifies the query to be executed. Subsequent submissions with the same external ID will not re-execute the query but instead return the existing execution with that ID. Either the External ID or a Maximal Cache Age greater than 0 must be specified. If both are specified the External ID will have precedence and the Maximal Cache Age will be ignored.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public AnalyticsQuery maxCacheAge(Integer maxCacheAge) {
    this.maxCacheAge = maxCacheAge;
    return this;
  }

   /**
   * The maximal age in minutes of cached query executions to return. If an equivalent query execution with the same Query String, Account ID and Spaces parameters not older than the specified age is already available that execution will be returned instead of a newly started execution. Set to 0 or null (and set a unique, previously unused External ID) to force a new query execution irrespective of previous executions. Either the External ID or a Cache Duration greater than 0 must be specified. If both are specified, the External ID will be preferred (and the Maximal Cache Age ignored).
   * @return maxCacheAge
  **/
  @ApiModelProperty(value = "The maximal age in minutes of cached query executions to return. If an equivalent query execution with the same Query String, Account ID and Spaces parameters not older than the specified age is already available that execution will be returned instead of a newly started execution. Set to 0 or null (and set a unique, previously unused External ID) to force a new query execution irrespective of previous executions. Either the External ID or a Cache Duration greater than 0 must be specified. If both are specified, the External ID will be preferred (and the Maximal Cache Age ignored).")
  public Integer getMaxCacheAge() {
    return maxCacheAge;
  }

  public void setMaxCacheAge(Integer maxCacheAge) {
    this.maxCacheAge = maxCacheAge;
  }

  
  public AnalyticsQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

   /**
   * The SQL statement which is being submitted for execution. Must be a valid PrestoDB/Athena SQL statement.
   * @return queryString
  **/
  @ApiModelProperty(value = "The SQL statement which is being submitted for execution. Must be a valid PrestoDB/Athena SQL statement.")
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  
  public AnalyticsQuery scannedDataLimit(BigDecimal scannedDataLimit) {
    this.scannedDataLimit = scannedDataLimit;
    return this;
  }

   /**
   * The maximal amount of scanned data that this query is allowed to scan. After this limit is reached query will be canceled by the system. 
   * @return scannedDataLimit
  **/
  @ApiModelProperty(value = "The maximal amount of scanned data that this query is allowed to scan. After this limit is reached query will be canceled by the system. ")
  public BigDecimal getScannedDataLimit() {
    return scannedDataLimit;
  }

  public void setScannedDataLimit(BigDecimal scannedDataLimit) {
    this.scannedDataLimit = scannedDataLimit;
  }

  
  public AnalyticsQuery spaceIds(List<Long> spaceIds) {
    this.spaceIds = spaceIds;
    return this;
  }

  public AnalyticsQuery addSpaceIdsItem(Long spaceIdsItem) {
    if (this.spaceIds == null) {
      this.spaceIds = new ArrayList<>();
    }
    this.spaceIds.add(spaceIdsItem);
    return this;
  }

   /**
   * The IDs of the spaces in which the query shall be executed. At most 5 space IDs may be specified. All specified spaces must be owned by the account specified by the accountId property. The spaces property may be missing or empty to query all spaces of the specified account.
   * @return spaceIds
  **/
  @ApiModelProperty(value = "The IDs of the spaces in which the query shall be executed. At most 5 space IDs may be specified. All specified spaces must be owned by the account specified by the accountId property. The spaces property may be missing or empty to query all spaces of the specified account.")
  public List<Long> getSpaceIds() {
    return spaceIds;
  }

  public void setSpaceIds(List<Long> spaceIds) {
    this.spaceIds = spaceIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQuery analyticsQuery = (AnalyticsQuery) o;
    return Objects.equals(this.accountId, analyticsQuery.accountId) &&
        Objects.equals(this.externalId, analyticsQuery.externalId) &&
        Objects.equals(this.maxCacheAge, analyticsQuery.maxCacheAge) &&
        Objects.equals(this.queryString, analyticsQuery.queryString) &&
        Objects.equals(this.scannedDataLimit, analyticsQuery.scannedDataLimit) &&
        Objects.equals(this.spaceIds, analyticsQuery.spaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, maxCacheAge, queryString, scannedDataLimit, spaceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQuery {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    maxCacheAge: ").append(toIndentedString(maxCacheAge)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    scannedDataLimit: ").append(toIndentedString(scannedDataLimit)).append("\n");
    sb.append("    spaceIds: ").append(toIndentedString(spaceIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

