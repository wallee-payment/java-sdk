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
import com.wallee.sdk.model.PersistableCurrencyAmountUpdate;
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

public class ProductSetupFeeUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("component")
  protected Long component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("onDowngradeCreditedAmount")
  protected List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount = null;

  
  @JsonProperty("onUpgradeCreditedAmount")
  protected List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount = null;

  
  @JsonProperty("setupFee")
  protected List<PersistableCurrencyAmountUpdate> setupFee = null;

  
  
  public ProductSetupFeeUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public ProductSetupFeeUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public ProductSetupFeeUpdate component(Long component) {
    this.component = component;
    return this;
  }

   /**
   * The product component that the fee belongs to.
   * @return component
  **/
  @ApiModelProperty(value = "The product component that the fee belongs to.")
  public Long getComponent() {
    return component;
  }

  public void setComponent(Long component) {
    this.component = component;
  }

  
  public ProductSetupFeeUpdate description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public ProductSetupFeeUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * The localized description of the fee that is displayed to the customer.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the fee that is displayed to the customer.")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  
  public ProductSetupFeeUpdate name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public ProductSetupFeeUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the fee that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the fee that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public ProductSetupFeeUpdate onDowngradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
    this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
    return this;
  }

  public ProductSetupFeeUpdate addOnDowngradeCreditedAmountItem(PersistableCurrencyAmountUpdate onDowngradeCreditedAmountItem) {
    if (this.onDowngradeCreditedAmount == null) {
      this.onDowngradeCreditedAmount = new ArrayList<>();
    }
    this.onDowngradeCreditedAmount.add(onDowngradeCreditedAmountItem);
    return this;
  }

   /**
   * The amount charged to the customer when a subscription is downgraded.
   * @return onDowngradeCreditedAmount
  **/
  @ApiModelProperty(value = "The amount charged to the customer when a subscription is downgraded.")
  public List<PersistableCurrencyAmountUpdate> getOnDowngradeCreditedAmount() {
    return onDowngradeCreditedAmount;
  }

  public void setOnDowngradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
    this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
  }

  
  public ProductSetupFeeUpdate onUpgradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
    this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
    return this;
  }

  public ProductSetupFeeUpdate addOnUpgradeCreditedAmountItem(PersistableCurrencyAmountUpdate onUpgradeCreditedAmountItem) {
    if (this.onUpgradeCreditedAmount == null) {
      this.onUpgradeCreditedAmount = new ArrayList<>();
    }
    this.onUpgradeCreditedAmount.add(onUpgradeCreditedAmountItem);
    return this;
  }

   /**
   * The amount charged to the customer when a subscription is upgraded.
   * @return onUpgradeCreditedAmount
  **/
  @ApiModelProperty(value = "The amount charged to the customer when a subscription is upgraded.")
  public List<PersistableCurrencyAmountUpdate> getOnUpgradeCreditedAmount() {
    return onUpgradeCreditedAmount;
  }

  public void setOnUpgradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
    this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
  }

  
  public ProductSetupFeeUpdate setupFee(List<PersistableCurrencyAmountUpdate> setupFee) {
    this.setupFee = setupFee;
    return this;
  }

  public ProductSetupFeeUpdate addSetupFeeItem(PersistableCurrencyAmountUpdate setupFeeItem) {
    if (this.setupFee == null) {
      this.setupFee = new ArrayList<>();
    }
    this.setupFee.add(setupFeeItem);
    return this;
  }

   /**
   * The amount charged to the customer once when they subscribe to a subscription.
   * @return setupFee
  **/
  @ApiModelProperty(value = "The amount charged to the customer once when they subscribe to a subscription.")
  public List<PersistableCurrencyAmountUpdate> getSetupFee() {
    return setupFee;
  }

  public void setSetupFee(List<PersistableCurrencyAmountUpdate> setupFee) {
    this.setupFee = setupFee;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSetupFeeUpdate productSetupFeeUpdate = (ProductSetupFeeUpdate) o;
    return Objects.equals(this.id, productSetupFeeUpdate.id) &&
        Objects.equals(this.version, productSetupFeeUpdate.version) &&
        Objects.equals(this.component, productSetupFeeUpdate.component) &&
        Objects.equals(this.description, productSetupFeeUpdate.description) &&
        Objects.equals(this.name, productSetupFeeUpdate.name) &&
        Objects.equals(this.onDowngradeCreditedAmount, productSetupFeeUpdate.onDowngradeCreditedAmount) &&
        Objects.equals(this.onUpgradeCreditedAmount, productSetupFeeUpdate.onUpgradeCreditedAmount) &&
        Objects.equals(this.setupFee, productSetupFeeUpdate.setupFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, component, description, name, onDowngradeCreditedAmount, onUpgradeCreditedAmount, setupFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetupFeeUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onDowngradeCreditedAmount: ").append(toIndentedString(onDowngradeCreditedAmount)).append("\n");
    sb.append("    onUpgradeCreditedAmount: ").append(toIndentedString(onUpgradeCreditedAmount)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
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

