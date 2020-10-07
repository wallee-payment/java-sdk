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

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ProductSetupFee {
  
  @JsonProperty("component")
  protected SubscriptionProductComponent component = null;

  
  @JsonProperty("description")
  protected DatabaseTranslatedString description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected DatabaseTranslatedString name = null;

  
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
   * 
   * @return component
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductComponent getComponent() {
    return component;
  }

  
   /**
   * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
   * @return description
  **/
  @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
  public DatabaseTranslatedString getDescription() {
    return description;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name of the fee should describe for the subscriber in few words for what the fee is for.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
  public DatabaseTranslatedString getName() {
    return name;
  }

  
   /**
   * When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber.
   * @return onDowngradeCreditedAmount
  **/
  @ApiModelProperty(value = "When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber.")
  public List<PersistableCurrencyAmount> getOnDowngradeCreditedAmount() {
    return onDowngradeCreditedAmount;
  }

  
   /**
   * When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber.
   * @return onUpgradeCreditedAmount
  **/
  @ApiModelProperty(value = "When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber.")
  public List<PersistableCurrencyAmount> getOnUpgradeCreditedAmount() {
    return onUpgradeCreditedAmount;
  }

  
   /**
   * The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions.
   * @return setupFee
  **/
  @ApiModelProperty(value = "The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions.")
  public List<PersistableCurrencyAmount> getSetupFee() {
    return setupFee;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ProductFeeType getType() {
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
    ProductSetupFee productSetupFee = (ProductSetupFee) o;
    return Objects.equals(this.component, productSetupFee.component) &&
        Objects.equals(this.description, productSetupFee.description) &&
        Objects.equals(this.id, productSetupFee.id) &&
        Objects.equals(this.linkedSpaceId, productSetupFee.linkedSpaceId) &&
        Objects.equals(this.name, productSetupFee.name) &&
        Objects.equals(this.onDowngradeCreditedAmount, productSetupFee.onDowngradeCreditedAmount) &&
        Objects.equals(this.onUpgradeCreditedAmount, productSetupFee.onUpgradeCreditedAmount) &&
        Objects.equals(this.setupFee, productSetupFee.setupFee) && this.type == productSetupFee.type &&
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

