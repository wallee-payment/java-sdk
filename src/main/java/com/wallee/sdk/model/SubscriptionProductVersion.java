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
import com.wallee.sdk.model.BillingCycleModel;
import com.wallee.sdk.model.SubscriptionProduct;
import com.wallee.sdk.model.SubscriptionProductVersionState;
import com.wallee.sdk.model.TaxCalculation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
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

public class SubscriptionProductVersion {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("billingCycle")
  protected String billingCycle = null;

  
  @JsonProperty("billingCycleModel")
  protected BillingCycleModel billingCycleModel = null;

  
  @JsonProperty("comment")
  protected String comment = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("defaultCurrency")
  protected String defaultCurrency = null;

  
  @JsonProperty("enabledCurrencies")
  protected List<String> enabledCurrencies = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("incrementNumber")
  protected Integer incrementNumber = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("minimalNumberOfPeriods")
  protected Integer minimalNumberOfPeriods = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("numberOfNoticePeriods")
  protected Integer numberOfNoticePeriods = null;

  
  @JsonProperty("obsoletedOn")
  protected OffsetDateTime obsoletedOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("product")
  protected SubscriptionProduct product = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("retiringFinishedOn")
  protected OffsetDateTime retiringFinishedOn = null;

  
  @JsonProperty("retiringStartedOn")
  protected OffsetDateTime retiringStartedOn = null;

  
  @JsonProperty("state")
  protected SubscriptionProductVersionState state = null;

  
  @JsonProperty("taxCalculation")
  protected TaxCalculation taxCalculation = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the product version was activated.
   * @return activatedOn
  **/
  @ApiModelProperty(value = "The date and time when the product version was activated.")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The recurring period of time, typically monthly or annually, for which a subscriber is charged.
   * @return billingCycle
  **/
  @ApiModelProperty(value = "The recurring period of time, typically monthly or annually, for which a subscriber is charged.")
  public String getBillingCycle() {
    return billingCycle;
  }

  
   /**
   * 
   * @return billingCycleModel
  **/
  @ApiModelProperty(value = "")
  public BillingCycleModel getBillingCycleModel() {
    return billingCycleModel;
  }

  
   /**
   * A comment that describes the product version and why it was created. It is not disclosed to the subscriber.
   * @return comment
  **/
  @ApiModelProperty(value = "A comment that describes the product version and why it was created. It is not disclosed to the subscriber.")
  public String getComment() {
    return comment;
  }

  
   /**
   * The date and time when the product version was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the product version was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The three-letter code (ISO 4217 format) of the product version&#39;s default currency.
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "The three-letter code (ISO 4217 format) of the product version's default currency.")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  
   /**
   * The three-letter codes (ISO 4217 format) of the currencies that the product version supports.
   * @return enabledCurrencies
  **/
  @ApiModelProperty(value = "The three-letter codes (ISO 4217 format) of the currencies that the product version supports.")
  public List<String> getEnabledCurrencies() {
    return enabledCurrencies;
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
   * Whenever a new version of a product is created, the number is increased and assigned.
   * @return incrementNumber
  **/
  @ApiModelProperty(value = "Whenever a new version of a product is created, the number is increased and assigned.")
  public Integer getIncrementNumber() {
    return incrementNumber;
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
   * The minimum number of periods the subscription will run before it can be terminated.
   * @return minimalNumberOfPeriods
  **/
  @ApiModelProperty(value = "The minimum number of periods the subscription will run before it can be terminated.")
  public Integer getMinimalNumberOfPeriods() {
    return minimalNumberOfPeriods;
  }

  
   /**
   * The localized name of the product that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the product that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * The number of periods the subscription will keep running after its termination was requested.
   * @return numberOfNoticePeriods
  **/
  @ApiModelProperty(value = "The number of periods the subscription will keep running after its termination was requested.")
  public Integer getNumberOfNoticePeriods() {
    return numberOfNoticePeriods;
  }

  
   /**
   * The date and time when the product version was made obsolete.
   * @return obsoletedOn
  **/
  @ApiModelProperty(value = "The date and time when the product version was made obsolete.")
  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
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
   * The product that the version belongs to.
   * @return product
  **/
  @ApiModelProperty(value = "The product that the version belongs to.")
  public SubscriptionProduct getProduct() {
    return product;
  }

  
   /**
   * The reference used to identify the product version.
   * @return reference
  **/
  @ApiModelProperty(value = "The reference used to identify the product version.")
  public String getReference() {
    return reference;
  }

  
   /**
   * The date and time when the product version was retired.
   * @return retiringFinishedOn
  **/
  @ApiModelProperty(value = "The date and time when the product version was retired.")
  public OffsetDateTime getRetiringFinishedOn() {
    return retiringFinishedOn;
  }

  
   /**
   * The date and time when the product version&#39;s retirement was started.
   * @return retiringStartedOn
  **/
  @ApiModelProperty(value = "The date and time when the product version's retirement was started.")
  public OffsetDateTime getRetiringStartedOn() {
    return retiringStartedOn;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionProductVersionState getState() {
    return state;
  }

  
   /**
   * The way taxes are calculated for fees.
   * @return taxCalculation
  **/
  @ApiModelProperty(value = "The way taxes are calculated for fees.")
  public TaxCalculation getTaxCalculation() {
    return taxCalculation;
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
    SubscriptionProductVersion subscriptionProductVersion = (SubscriptionProductVersion) o;
    return Objects.equals(this.activatedOn, subscriptionProductVersion.activatedOn) &&
        Objects.equals(this.billingCycle, subscriptionProductVersion.billingCycle) &&
        Objects.equals(this.billingCycleModel, subscriptionProductVersion.billingCycleModel) &&
        Objects.equals(this.comment, subscriptionProductVersion.comment) &&
        Objects.equals(this.createdOn, subscriptionProductVersion.createdOn) &&
        Objects.equals(this.defaultCurrency, subscriptionProductVersion.defaultCurrency) &&
        Objects.equals(this.enabledCurrencies, subscriptionProductVersion.enabledCurrencies) &&
        Objects.equals(this.id, subscriptionProductVersion.id) &&
        Objects.equals(this.incrementNumber, subscriptionProductVersion.incrementNumber) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductVersion.linkedSpaceId) &&
        Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersion.minimalNumberOfPeriods) &&
        Objects.equals(this.name, subscriptionProductVersion.name) &&
        Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersion.numberOfNoticePeriods) &&
        Objects.equals(this.obsoletedOn, subscriptionProductVersion.obsoletedOn) &&
        Objects.equals(this.plannedPurgeDate, subscriptionProductVersion.plannedPurgeDate) &&
        Objects.equals(this.product, subscriptionProductVersion.product) &&
        Objects.equals(this.reference, subscriptionProductVersion.reference) &&
        Objects.equals(this.retiringFinishedOn, subscriptionProductVersion.retiringFinishedOn) &&
        Objects.equals(this.retiringStartedOn, subscriptionProductVersion.retiringStartedOn) &&
        Objects.equals(this.state, subscriptionProductVersion.state) &&
        Objects.equals(this.taxCalculation, subscriptionProductVersion.taxCalculation) &&
        Objects.equals(this.version, subscriptionProductVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, billingCycle, billingCycleModel, comment, createdOn, defaultCurrency, enabledCurrencies, id, incrementNumber, linkedSpaceId, minimalNumberOfPeriods, name, numberOfNoticePeriods, obsoletedOn, plannedPurgeDate, product, reference, retiringFinishedOn, retiringStartedOn, state, taxCalculation, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersion {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    billingCycleModel: ").append(toIndentedString(billingCycleModel)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incrementNumber: ").append(toIndentedString(incrementNumber)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
    sb.append("    obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    retiringFinishedOn: ").append(toIndentedString(retiringFinishedOn)).append("\n");
    sb.append("    retiringStartedOn: ").append(toIndentedString(retiringStartedOn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxCalculation: ").append(toIndentedString(taxCalculation)).append("\n");
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

