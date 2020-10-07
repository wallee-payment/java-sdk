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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionSuspension {
  
  @JsonProperty("createdBy")
  protected Long createdBy;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("endedBy")
  protected Long endedBy;

  
  @JsonProperty("endedOn")
  protected OffsetDateTime endedOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("initiator")
  protected ShopifySubscriptionSuspensionInitiator initiator;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("plannedEndDate")
  protected OffsetDateTime plannedEndDate;

  
  @JsonProperty("shop")
  protected Long shop;

  
  @JsonProperty("state")
  protected ShopifySubscriptionSuspensionState state;

  
  @JsonProperty("subscription")
  protected ShopifySubscription subscription;

  
  @JsonProperty("type")
  protected ShopifySubscriptionSuspensionType type;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
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
   * @return endedBy
  **/
  @ApiModelProperty(value = "")
  public Long getEndedBy() {
    return endedBy;
  }

  
   /**
   * 
   * @return endedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndedOn() {
    return endedOn;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionSuspensionInitiator getInitiator() {
    return initiator;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return plannedEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
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
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionSuspensionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscription getSubscription() {
    return subscription;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionSuspensionType getType() {
    return type;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    ShopifySubscriptionSuspension shopifySubscriptionSuspension = (ShopifySubscriptionSuspension) o;
    return Objects.equals(this.createdBy, shopifySubscriptionSuspension.createdBy) &&
        Objects.equals(this.createdOn, shopifySubscriptionSuspension.createdOn) &&
        Objects.equals(this.endedBy, shopifySubscriptionSuspension.endedBy) &&
        Objects.equals(this.endedOn, shopifySubscriptionSuspension.endedOn) &&
        Objects.equals(this.id, shopifySubscriptionSuspension.id) && this.initiator
      == shopifySubscriptionSuspension.initiator &&
        Objects.equals(this.linkedSpaceId, shopifySubscriptionSuspension.linkedSpaceId) &&
        Objects.equals(this.plannedEndDate, shopifySubscriptionSuspension.plannedEndDate) &&
        Objects.equals(this.shop, shopifySubscriptionSuspension.shop) && this.state
      == shopifySubscriptionSuspension.state &&
        Objects.equals(this.subscription, shopifySubscriptionSuspension.subscription) && this.type
      == shopifySubscriptionSuspension.type &&
        Objects.equals(this.version, shopifySubscriptionSuspension.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, endedBy, endedOn, id, initiator, linkedSpaceId, plannedEndDate, shop, state, subscription, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionSuspension {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    endedBy: ").append(toIndentedString(endedBy)).append("\n");
    sb.append("    endedOn: ").append(toIndentedString(endedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

