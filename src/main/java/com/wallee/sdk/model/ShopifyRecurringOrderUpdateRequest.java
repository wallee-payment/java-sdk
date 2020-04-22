/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class ShopifyRecurringOrderUpdateRequest {
  
  @JsonProperty("executionDate")
  protected OffsetDateTime executionDate = null;

  
  @JsonProperty("recurringOrderId")
  protected Long recurringOrderId = null;

  
  
  public ShopifyRecurringOrderUpdateRequest executionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
    return this;
  }

   /**
   * 
   * @return executionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }

  
  public ShopifyRecurringOrderUpdateRequest recurringOrderId(Long recurringOrderId) {
    this.recurringOrderId = recurringOrderId;
    return this;
  }

   /**
   * 
   * @return recurringOrderId
  **/
  @ApiModelProperty(value = "")
  public Long getRecurringOrderId() {
    return recurringOrderId;
  }

  public void setRecurringOrderId(Long recurringOrderId) {
    this.recurringOrderId = recurringOrderId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifyRecurringOrderUpdateRequest shopifyRecurringOrderUpdateRequest = (ShopifyRecurringOrderUpdateRequest) o;
    return Objects.equals(this.executionDate, shopifyRecurringOrderUpdateRequest.executionDate) &&
        Objects.equals(this.recurringOrderId, shopifyRecurringOrderUpdateRequest.recurringOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionDate, recurringOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifyRecurringOrderUpdateRequest {\n");
    
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    recurringOrderId: ").append(toIndentedString(recurringOrderId)).append("\n");
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

