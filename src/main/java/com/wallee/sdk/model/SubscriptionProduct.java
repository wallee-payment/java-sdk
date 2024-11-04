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
import com.wallee.sdk.model.SubscriptionProductState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")

public class SubscriptionProduct {
  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<Long> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("failedPaymentSuspensionPeriod")
  protected String failedPaymentSuspensionPeriod = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("productLocked")
  protected Boolean productLocked = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("spaceId")
  protected Long spaceId = null;

  
  @JsonProperty("state")
  protected SubscriptionProductState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.")
  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * The period after which a subscription that has been suspended due to a failed payment is terminated.
   * @return failedPaymentSuspensionPeriod
  **/
  @ApiModelProperty(value = "The period after which a subscription that has been suspended due to a failed payment is terminated.")
  public String getFailedPaymentSuspensionPeriod() {
    return failedPaymentSuspensionPeriod;
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
   * The name used to identify the product.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the product.")
  public String getName() {
    return name;
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
   * Whether subscriptions can be switched to or from this product, or whether they are locked in.
   * @return productLocked
  **/
  @ApiModelProperty(value = "Whether subscriptions can be switched to or from this product, or whether they are locked in.")
  public Boolean isProductLocked() {
    return productLocked;
  }

  
   /**
   * The merchant&#39;s reference used to identify the product, e.g. the SKU.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the product, e.g. the SKU.")
  public String getReference() {
    return reference;
  }

  
   /**
   * When listing products, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing products, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return spaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getSpaceId() {
    return spaceId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionProductState getState() {
    return state;
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
    SubscriptionProduct subscriptionProduct = (SubscriptionProduct) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProduct.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProduct.failedPaymentSuspensionPeriod) &&
        Objects.equals(this.id, subscriptionProduct.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProduct.linkedSpaceId) &&
        Objects.equals(this.name, subscriptionProduct.name) &&
        Objects.equals(this.plannedPurgeDate, subscriptionProduct.plannedPurgeDate) &&
        Objects.equals(this.productLocked, subscriptionProduct.productLocked) &&
        Objects.equals(this.reference, subscriptionProduct.reference) &&
        Objects.equals(this.sortOrder, subscriptionProduct.sortOrder) &&
        Objects.equals(this.spaceId, subscriptionProduct.spaceId) &&
        Objects.equals(this.state, subscriptionProduct.state) &&
        Objects.equals(this.version, subscriptionProduct.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, id, linkedSpaceId, name, plannedPurgeDate, productLocked, reference, sortOrder, spaceId, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProduct {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    productLocked: ").append(toIndentedString(productLocked)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

