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
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionProductComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ProductSetupFee {
  
  @JsonProperty("component")
  protected SubscriptionProductComponent component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("onDowngradeCreditedAmount")
  protected List<PersistableCurrencyAmount> onDowngradeCreditedAmount = null;

  
  @JsonProperty("onUpgradeCreditedAmount")
  protected List<PersistableCurrencyAmount> onUpgradeCreditedAmount = null;

  
  @JsonProperty("setupFee")
  protected List<PersistableCurrencyAmount> setupFee = null;

  
  @JsonProperty("type")
  protected ProductFeeType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The product component that the fee belongs to.
   * @return component
  **/
  @ApiModelProperty(value = "The product component that the fee belongs to.")
  public SubscriptionProductComponent getComponent() {
    return component;
  }

  
   /**
   * The localized description of the fee that is displayed to the customer.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the fee that is displayed to the customer.")
  public Map<String, String> getDescription() {
    return description;
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
   * The localized name of the fee that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the fee that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * The amount charged to the customer when a subscription is downgraded.
   * @return onDowngradeCreditedAmount
  **/
  @ApiModelProperty(value = "The amount charged to the customer when a subscription is downgraded.")
  public List<PersistableCurrencyAmount> getOnDowngradeCreditedAmount() {
    return onDowngradeCreditedAmount;
  }

  
   /**
   * The amount charged to the customer when a subscription is upgraded.
   * @return onUpgradeCreditedAmount
  **/
  @ApiModelProperty(value = "The amount charged to the customer when a subscription is upgraded.")
  public List<PersistableCurrencyAmount> getOnUpgradeCreditedAmount() {
    return onUpgradeCreditedAmount;
  }

  
   /**
   * The amount charged to the customer once when they subscribe to a subscription.
   * @return setupFee
  **/
  @ApiModelProperty(value = "The amount charged to the customer once when they subscribe to a subscription.")
  public List<PersistableCurrencyAmount> getSetupFee() {
    return setupFee;
  }

  
   /**
   * The type of the fee.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the fee.")
  public ProductFeeType getType() {
    return type;
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
    ProductSetupFee productSetupFee = (ProductSetupFee) o;
    return Objects.equals(this.component, productSetupFee.component) &&
        Objects.equals(this.description, productSetupFee.description) &&
        Objects.equals(this.id, productSetupFee.id) &&
        Objects.equals(this.linkedSpaceId, productSetupFee.linkedSpaceId) &&
        Objects.equals(this.name, productSetupFee.name) &&
        Objects.equals(this.onDowngradeCreditedAmount, productSetupFee.onDowngradeCreditedAmount) &&
        Objects.equals(this.onUpgradeCreditedAmount, productSetupFee.onUpgradeCreditedAmount) &&
        Objects.equals(this.setupFee, productSetupFee.setupFee) &&
        Objects.equals(this.type, productSetupFee.type) &&
        Objects.equals(this.version, productSetupFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, description, id, linkedSpaceId, name, onDowngradeCreditedAmount, onUpgradeCreditedAmount, setupFee, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetupFee {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onDowngradeCreditedAmount: ").append(toIndentedString(onDowngradeCreditedAmount)).append("\n");
    sb.append("    onUpgradeCreditedAmount: ").append(toIndentedString(onUpgradeCreditedAmount)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
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

