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

public class ProductPeriodFee {
  
  @JsonProperty("component")
  protected SubscriptionProductComponent component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("ledgerEntryTitle")
  protected Map<String, String> ledgerEntryTitle = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("numberOfFreeTrialPeriods")
  protected Integer numberOfFreeTrialPeriods = null;

  
  @JsonProperty("periodFee")
  protected List<PersistableCurrencyAmount> periodFee = null;

  
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
   * The localized title that be used on ledger entries and invoices.
   * @return ledgerEntryTitle
  **/
  @ApiModelProperty(value = "The localized title that be used on ledger entries and invoices.")
  public Map<String, String> getLedgerEntryTitle() {
    return ledgerEntryTitle;
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
   * The number of subscription billing cycles that count as a trial phase and during which no fees are charged.
   * @return numberOfFreeTrialPeriods
  **/
  @ApiModelProperty(value = "The number of subscription billing cycles that count as a trial phase and during which no fees are charged.")
  public Integer getNumberOfFreeTrialPeriods() {
    return numberOfFreeTrialPeriods;
  }

  
   /**
   * The amount charged to the customer for each billing cycle during the term of a subscription.
   * @return periodFee
  **/
  @ApiModelProperty(value = "The amount charged to the customer for each billing cycle during the term of a subscription.")
  public List<PersistableCurrencyAmount> getPeriodFee() {
    return periodFee;
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
    ProductPeriodFee productPeriodFee = (ProductPeriodFee) o;
    return Objects.equals(this.component, productPeriodFee.component) &&
        Objects.equals(this.description, productPeriodFee.description) &&
        Objects.equals(this.id, productPeriodFee.id) &&
        Objects.equals(this.ledgerEntryTitle, productPeriodFee.ledgerEntryTitle) &&
        Objects.equals(this.linkedSpaceId, productPeriodFee.linkedSpaceId) &&
        Objects.equals(this.name, productPeriodFee.name) &&
        Objects.equals(this.numberOfFreeTrialPeriods, productPeriodFee.numberOfFreeTrialPeriods) &&
        Objects.equals(this.periodFee, productPeriodFee.periodFee) &&
        Objects.equals(this.type, productPeriodFee.type) &&
        Objects.equals(this.version, productPeriodFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, description, id, ledgerEntryTitle, linkedSpaceId, name, numberOfFreeTrialPeriods, periodFee, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPeriodFee {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ledgerEntryTitle: ").append(toIndentedString(ledgerEntryTitle)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfFreeTrialPeriods: ").append(toIndentedString(numberOfFreeTrialPeriods)).append("\n");
    sb.append("    periodFee: ").append(toIndentedString(periodFee)).append("\n");
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

