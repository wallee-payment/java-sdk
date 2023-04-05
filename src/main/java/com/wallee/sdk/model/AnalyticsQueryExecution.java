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
import com.wallee.sdk.model.AnalyticsQueryExecutionState;
import com.wallee.sdk.model.FailureReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * Represents the execution of a query which has been submitted to Analytics.
 */
@ApiModel(description = "Represents the execution of a query which has been submitted to Analytics.")

public class AnalyticsQueryExecution {
  
  @JsonProperty("account")
  protected Long account = null;

  
  @JsonProperty("errorMessage")
  protected String errorMessage = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("processingEndTime")
  protected OffsetDateTime processingEndTime = null;

  
  @JsonProperty("processingStartTime")
  protected OffsetDateTime processingStartTime = null;

  
  @JsonProperty("queryString")
  protected String queryString = null;

  
  @JsonProperty("scannedDataInGb")
  protected BigDecimal scannedDataInGb = null;

  
  @JsonProperty("scannedDataLimit")
  protected BigDecimal scannedDataLimit = null;

  
  @JsonProperty("spaces")
  protected List<Long> spaces = null;

  
  @JsonProperty("state")
  protected AnalyticsQueryExecutionState state = null;

  
  
   /**
   * The account in which the query has been executed.
   * @return account
  **/
  @ApiModelProperty(value = "The account in which the query has been executed.")
  public Long getAccount() {
    return account;
  }

  
   /**
   * The error message if and only if the query has failed, otherwise null.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "The error message if and only if the query has failed, otherwise null.")
  public String getErrorMessage() {
    return errorMessage;
  }

  
   /**
   * The External ID of the query if one had been specified; otherwise null.
   * @return externalId
  **/
  @ApiModelProperty(value = "The External ID of the query if one had been specified; otherwise null.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * The reason of the failure if and only if the query has failed, otherwise null.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason of the failure if and only if the query has failed, otherwise null.")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The time at which processing of the query has finished (either successfully or by failure or by cancelation). Will be null if the query execution has not finished yet.
   * @return processingEndTime
  **/
  @ApiModelProperty(value = "The time at which processing of the query has finished (either successfully or by failure or by cancelation). Will be null if the query execution has not finished yet.")
  public OffsetDateTime getProcessingEndTime() {
    return processingEndTime;
  }

  
   /**
   * The time at which processing of the query has started (never null).
   * @return processingStartTime
  **/
  @ApiModelProperty(value = "The time at which processing of the query has started (never null).")
  public OffsetDateTime getProcessingStartTime() {
    return processingStartTime;
  }

  
   /**
   * The SQL statement which has been submitted for execution.
   * @return queryString
  **/
  @ApiModelProperty(value = "The SQL statement which has been submitted for execution.")
  public String getQueryString() {
    return queryString;
  }

  
   /**
   * The amount of data scanned while processing the query (in GB). (Note that this amount may increase over time while the query is still being processed and not finished yet.)
   * @return scannedDataInGb
  **/
  @ApiModelProperty(value = "The amount of data scanned while processing the query (in GB). (Note that this amount may increase over time while the query is still being processed and not finished yet.)")
  public BigDecimal getScannedDataInGb() {
    return scannedDataInGb;
  }

  
   /**
   * The maximal amount of scanned data that this query is allowed to scan. After this limit is reached query will be canceled by the system. 
   * @return scannedDataLimit
  **/
  @ApiModelProperty(value = "The maximal amount of scanned data that this query is allowed to scan. After this limit is reached query will be canceled by the system. ")
  public BigDecimal getScannedDataLimit() {
    return scannedDataLimit;
  }

  
   /**
   * The spaces in which the query has been executed. May be empty if all spaces of the specified account have been queried.
   * @return spaces
  **/
  @ApiModelProperty(value = "The spaces in which the query has been executed. May be empty if all spaces of the specified account have been queried.")
  public List<Long> getSpaces() {
    return spaces;
  }

  
   /**
   * The current state of the query execution.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the query execution.")
  public AnalyticsQueryExecutionState getState() {
    return state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryExecution analyticsQueryExecution = (AnalyticsQueryExecution) o;
    return Objects.equals(this.account, analyticsQueryExecution.account) &&
        Objects.equals(this.errorMessage, analyticsQueryExecution.errorMessage) &&
        Objects.equals(this.externalId, analyticsQueryExecution.externalId) &&
        Objects.equals(this.failureReason, analyticsQueryExecution.failureReason) &&
        Objects.equals(this.id, analyticsQueryExecution.id) &&
        Objects.equals(this.processingEndTime, analyticsQueryExecution.processingEndTime) &&
        Objects.equals(this.processingStartTime, analyticsQueryExecution.processingStartTime) &&
        Objects.equals(this.queryString, analyticsQueryExecution.queryString) &&
        Objects.equals(this.scannedDataInGb, analyticsQueryExecution.scannedDataInGb) &&
        Objects.equals(this.scannedDataLimit, analyticsQueryExecution.scannedDataLimit) &&
        Objects.equals(this.spaces, analyticsQueryExecution.spaces) &&
        Objects.equals(this.state, analyticsQueryExecution.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, errorMessage, externalId, failureReason, id, processingEndTime, processingStartTime, queryString, scannedDataInGb, scannedDataLimit, spaces, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryExecution {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processingEndTime: ").append(toIndentedString(processingEndTime)).append("\n");
    sb.append("    processingStartTime: ").append(toIndentedString(processingStartTime)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    scannedDataInGb: ").append(toIndentedString(scannedDataInGb)).append("\n");
    sb.append("    scannedDataLimit: ").append(toIndentedString(scannedDataLimit)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

