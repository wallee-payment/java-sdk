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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.ShopifyRecurringOrderState;
import com.wallee.sdk.model.ShopifySubscriptionVersion;
import com.wallee.sdk.model.ShopifyTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifyRecurringOrder {
  
  @JsonProperty("billedOn")
  protected OffsetDateTime billedOn = null;

  
  @JsonProperty("checkoutToken")
  protected String checkoutToken = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("draftOrderId")
  protected String draftOrderId = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("orderId")
  protected String orderId = null;

  
  @JsonProperty("orderLegacyId")
  protected String orderLegacyId = null;

  
  @JsonProperty("orderName")
  protected String orderName = null;

  
  @JsonProperty("plannedExecutionDate")
  protected OffsetDateTime plannedExecutionDate = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("recurrenceNumber")
  protected Integer recurrenceNumber = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  @JsonProperty("startedProcessingOn")
  protected OffsetDateTime startedProcessingOn = null;

  
  @JsonProperty("state")
  protected ShopifyRecurringOrderState state = null;

  
  @JsonProperty("subscriptionVersion")
  protected ShopifySubscriptionVersion subscriptionVersion = null;

  
  @JsonProperty("transaction")
  protected ShopifyTransaction transaction = null;

  
  
   /**
   * 
   * @return billedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBilledOn() {
    return billedOn;
  }

  
   /**
   * 
   * @return checkoutToken
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutToken() {
    return checkoutToken;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return draftOrderId
  **/
  @ApiModelProperty(value = "")
  public String getDraftOrderId() {
    return draftOrderId;
  }

  
   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
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
   * @return orderLegacyId
  **/
  @ApiModelProperty(value = "")
  public String getOrderLegacyId() {
    return orderLegacyId;
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
   * 
   * @return plannedExecutionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedExecutionDate() {
    return plannedExecutionDate;
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
   * @return recurrenceNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getRecurrenceNumber() {
    return recurrenceNumber;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * 
   * @return startedProcessingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartedProcessingOn() {
    return startedProcessingOn;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public ShopifyRecurringOrderState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriptionVersion
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionVersion getSubscriptionVersion() {
    return subscriptionVersion;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public ShopifyTransaction getTransaction() {
    return transaction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifyRecurringOrder shopifyRecurringOrder = (ShopifyRecurringOrder) o;
    return Objects.equals(this.billedOn, shopifyRecurringOrder.billedOn) &&
        Objects.equals(this.checkoutToken, shopifyRecurringOrder.checkoutToken) &&
        Objects.equals(this.createdOn, shopifyRecurringOrder.createdOn) &&
        Objects.equals(this.draftOrderId, shopifyRecurringOrder.draftOrderId) &&
        Objects.equals(this.failureReason, shopifyRecurringOrder.failureReason) &&
        Objects.equals(this.id, shopifyRecurringOrder.id) &&
        Objects.equals(this.linkedSpaceId, shopifyRecurringOrder.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, shopifyRecurringOrder.linkedTransaction) &&
        Objects.equals(this.orderId, shopifyRecurringOrder.orderId) &&
        Objects.equals(this.orderLegacyId, shopifyRecurringOrder.orderLegacyId) &&
        Objects.equals(this.orderName, shopifyRecurringOrder.orderName) &&
        Objects.equals(this.plannedExecutionDate, shopifyRecurringOrder.plannedExecutionDate) &&
        Objects.equals(this.plannedPurgeDate, shopifyRecurringOrder.plannedPurgeDate) &&
        Objects.equals(this.recurrenceNumber, shopifyRecurringOrder.recurrenceNumber) &&
        Objects.equals(this.shop, shopifyRecurringOrder.shop) &&
        Objects.equals(this.startedProcessingOn, shopifyRecurringOrder.startedProcessingOn) &&
        Objects.equals(this.state, shopifyRecurringOrder.state) &&
        Objects.equals(this.subscriptionVersion, shopifyRecurringOrder.subscriptionVersion) &&
        Objects.equals(this.transaction, shopifyRecurringOrder.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billedOn, checkoutToken, createdOn, draftOrderId, failureReason, id, linkedSpaceId, linkedTransaction, orderId, orderLegacyId, orderName, plannedExecutionDate, plannedPurgeDate, recurrenceNumber, shop, startedProcessingOn, state, subscriptionVersion, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifyRecurringOrder {\n");
    
    sb.append("    billedOn: ").append(toIndentedString(billedOn)).append("\n");
    sb.append("    checkoutToken: ").append(toIndentedString(checkoutToken)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    draftOrderId: ").append(toIndentedString(draftOrderId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderLegacyId: ").append(toIndentedString(orderLegacyId)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    recurrenceNumber: ").append(toIndentedString(recurrenceNumber)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    startedProcessingOn: ").append(toIndentedString(startedProcessingOn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

