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
import com.wallee.sdk.model.ShopifyTransactionState;
import com.wallee.sdk.model.ShopifyV1Integration;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifyTransaction extends TransactionAwareEntity {
  
  @JsonProperty("checkoutId")
  protected String checkoutId = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("integration")
  protected ShopifyV1Integration integration = null;

  
  @JsonProperty("orderId")
  protected String orderId = null;

  
  @JsonProperty("orderName")
  protected String orderName = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected ShopifyTransactionState state = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return checkoutId
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutId() {
    return checkoutId;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return integration
  **/
  @ApiModelProperty(value = "")
  public ShopifyV1Integration getIntegration() {
    return integration;
  }

  
   /**
   * 
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  
   /**
   * 
   * @return orderName
  **/
  @ApiModelProperty(value = "")
  public String getOrderName() {
    return orderName;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifyTransactionState getState() {
    return state;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifyTransaction shopifyTransaction = (ShopifyTransaction) o;
    return Objects.equals(this.id, shopifyTransaction.id) &&
        Objects.equals(this.linkedSpaceId, shopifyTransaction.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, shopifyTransaction.linkedTransaction) &&
        Objects.equals(this.checkoutId, shopifyTransaction.checkoutId) &&
        Objects.equals(this.createdOn, shopifyTransaction.createdOn) &&
        Objects.equals(this.integration, shopifyTransaction.integration) &&
        Objects.equals(this.orderId, shopifyTransaction.orderId) &&
        Objects.equals(this.orderName, shopifyTransaction.orderName) &&
        Objects.equals(this.plannedPurgeDate, shopifyTransaction.plannedPurgeDate) &&
        Objects.equals(this.state, shopifyTransaction.state) &&
        Objects.equals(this.transaction, shopifyTransaction.transaction) &&
        Objects.equals(this.version, shopifyTransaction.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, checkoutId, createdOn, integration, orderId, orderName, plannedPurgeDate, state, transaction, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifyTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

