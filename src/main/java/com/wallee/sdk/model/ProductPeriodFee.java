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
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionProductComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
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
  protected DatabaseTranslatedString description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("ledgerEntryTitle")
  protected DatabaseTranslatedString ledgerEntryTitle = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected DatabaseTranslatedString name = null;

  
  @JsonProperty("numberOfFreeTrialPeriods")
  protected Integer numberOfFreeTrialPeriods = null;

  
  @JsonProperty("periodFee")
  protected List<PersistableCurrencyAmount> periodFee = null;

  
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
   * The ledger entry title will be used for the title in the ledger entry and in the invoice.
   * @return ledgerEntryTitle
  **/
  @ApiModelProperty(value = "The ledger entry title will be used for the title in the ledger entry and in the invoice.")
  public DatabaseTranslatedString getLedgerEntryTitle() {
    return ledgerEntryTitle;
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
   * The number of free trial periods specify how many periods are free of charge at the begining of the subscription.
   * @return numberOfFreeTrialPeriods
  **/
  @ApiModelProperty(value = "The number of free trial periods specify how many periods are free of charge at the begining of the subscription.")
  public Integer getNumberOfFreeTrialPeriods() {
    return numberOfFreeTrialPeriods;
  }

  
   /**
   * The period fee is charged for every period of the subscription except for those periods which are trial periods.
   * @return periodFee
  **/
  @ApiModelProperty(value = "The period fee is charged for every period of the subscription except for those periods which are trial periods.")
  public List<PersistableCurrencyAmount> getPeriodFee() {
    return periodFee;
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

