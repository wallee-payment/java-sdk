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

public class ProductPeriodFeeUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("component")
  protected Long component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("ledgerEntryTitle")
  protected Map<String, String> ledgerEntryTitle = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("numberOfFreeTrialPeriods")
  protected Integer numberOfFreeTrialPeriods = null;

  
  @JsonProperty("periodFee")
  protected List<PersistableCurrencyAmountUpdate> periodFee = null;

  
  
  public ProductPeriodFeeUpdate id(Long id) {
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

  
  public ProductPeriodFeeUpdate version(Long version) {
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

  
  public ProductPeriodFeeUpdate component(Long component) {
    this.component = component;
    return this;
  }

   /**
   * 
   * @return component
  **/
  @ApiModelProperty(value = "")
  public Long getComponent() {
    return component;
  }

  public void setComponent(Long component) {
    this.component = component;
  }

  
  public ProductPeriodFeeUpdate description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public ProductPeriodFeeUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
   * @return description
  **/
  @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  
  public ProductPeriodFeeUpdate ledgerEntryTitle(Map<String, String> ledgerEntryTitle) {
    this.ledgerEntryTitle = ledgerEntryTitle;
    return this;
  }

  public ProductPeriodFeeUpdate putLedgerEntryTitleItem(String key, String ledgerEntryTitleItem) {
    if (this.ledgerEntryTitle == null) {
      this.ledgerEntryTitle = new HashMap<>();
    }
    this.ledgerEntryTitle.put(key, ledgerEntryTitleItem);
    return this;
  }

   /**
   * The ledger entry title will be used for the title in the ledger entry and in the invoice.
   * @return ledgerEntryTitle
  **/
  @ApiModelProperty(value = "The ledger entry title will be used for the title in the ledger entry and in the invoice.")
  public Map<String, String> getLedgerEntryTitle() {
    return ledgerEntryTitle;
  }

  public void setLedgerEntryTitle(Map<String, String> ledgerEntryTitle) {
    this.ledgerEntryTitle = ledgerEntryTitle;
  }

  
  public ProductPeriodFeeUpdate name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public ProductPeriodFeeUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The name of the fee should describe for the subscriber in few words for what the fee is for.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public ProductPeriodFeeUpdate numberOfFreeTrialPeriods(Integer numberOfFreeTrialPeriods) {
    this.numberOfFreeTrialPeriods = numberOfFreeTrialPeriods;
    return this;
  }

   /**
   * The number of free trial periods specify how many periods are free of charge at the begining of the subscription.
   * @return numberOfFreeTrialPeriods
  **/
  @ApiModelProperty(value = "The number of free trial periods specify how many periods are free of charge at the begining of the subscription.")
  public Integer getNumberOfFreeTrialPeriods() {
    return numberOfFreeTrialPeriods;
  }

  public void setNumberOfFreeTrialPeriods(Integer numberOfFreeTrialPeriods) {
    this.numberOfFreeTrialPeriods = numberOfFreeTrialPeriods;
  }

  
  public ProductPeriodFeeUpdate periodFee(List<PersistableCurrencyAmountUpdate> periodFee) {
    this.periodFee = periodFee;
    return this;
  }

  public ProductPeriodFeeUpdate addPeriodFeeItem(PersistableCurrencyAmountUpdate periodFeeItem) {
    if (this.periodFee == null) {
      this.periodFee = new ArrayList<>();
    }
    this.periodFee.add(periodFeeItem);
    return this;
  }

   /**
   * The period fee is charged for every period of the subscription except for those periods which are trial periods.
   * @return periodFee
  **/
  @ApiModelProperty(value = "The period fee is charged for every period of the subscription except for those periods which are trial periods.")
  public List<PersistableCurrencyAmountUpdate> getPeriodFee() {
    return periodFee;
  }

  public void setPeriodFee(List<PersistableCurrencyAmountUpdate> periodFee) {
    this.periodFee = periodFee;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPeriodFeeUpdate productPeriodFeeUpdate = (ProductPeriodFeeUpdate) o;
    return Objects.equals(this.id, productPeriodFeeUpdate.id) &&
        Objects.equals(this.version, productPeriodFeeUpdate.version) &&
        Objects.equals(this.component, productPeriodFeeUpdate.component) &&
        Objects.equals(this.description, productPeriodFeeUpdate.description) &&
        Objects.equals(this.ledgerEntryTitle, productPeriodFeeUpdate.ledgerEntryTitle) &&
        Objects.equals(this.name, productPeriodFeeUpdate.name) &&
        Objects.equals(this.numberOfFreeTrialPeriods, productPeriodFeeUpdate.numberOfFreeTrialPeriods) &&
        Objects.equals(this.periodFee, productPeriodFeeUpdate.periodFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, component, description, ledgerEntryTitle, name, numberOfFreeTrialPeriods, periodFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPeriodFeeUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ledgerEntryTitle: ").append(toIndentedString(ledgerEntryTitle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfFreeTrialPeriods: ").append(toIndentedString(numberOfFreeTrialPeriods)).append("\n");
    sb.append("    periodFee: ").append(toIndentedString(periodFee)).append("\n");
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

