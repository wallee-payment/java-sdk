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
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductVersion {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("billingCycle")
  protected String billingCycle = null;

  
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
  protected DatabaseTranslatedString name = null;

  
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

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.
   * @return billingCycle
  **/
  @ApiModelProperty(value = "The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.")
  public String getBillingCycle() {
    return billingCycle;
  }

  
   /**
   * The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.
   * @return comment
  **/
  @ApiModelProperty(value = "The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.")
  public String getComment() {
    return comment;
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
   * The default currency has to be used in all fees.
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "The default currency has to be used in all fees.")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  
   /**
   * The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.
   * @return enabledCurrencies
  **/
  @ApiModelProperty(value = "The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.")
  public List<String> getEnabledCurrencies() {
    return enabledCurrencies;
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
   * The increment number represents the version number incremented whenever a new version is activated.
   * @return incrementNumber
  **/
  @ApiModelProperty(value = "The increment number represents the version number incremented whenever a new version is activated.")
  public Integer getIncrementNumber() {
    return incrementNumber;
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
   * The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.
   * @return minimalNumberOfPeriods
  **/
  @ApiModelProperty(value = "The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.")
  public Integer getMinimalNumberOfPeriods() {
    return minimalNumberOfPeriods;
  }

  
   /**
   * The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
   * @return name
  **/
  @ApiModelProperty(value = "The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.")
  public DatabaseTranslatedString getName() {
    return name;
  }

  
   /**
   * The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.
   * @return numberOfNoticePeriods
  **/
  @ApiModelProperty(value = "The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.")
  public Integer getNumberOfNoticePeriods() {
    return numberOfNoticePeriods;
  }

  
   /**
   * 
   * @return obsoletedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * Each product version is linked to a product.
   * @return product
  **/
  @ApiModelProperty(value = "Each product version is linked to a product.")
  public SubscriptionProduct getProduct() {
    return product;
  }

  
   /**
   * The product version reference helps to identify the version. The reference is generated out of the product reference.
   * @return reference
  **/
  @ApiModelProperty(value = "The product version reference helps to identify the version. The reference is generated out of the product reference.")
  public String getReference() {
    return reference;
  }

  
   /**
   * 
   * @return retiringFinishedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRetiringFinishedOn() {
    return retiringFinishedOn;
  }

  
   /**
   * 
   * @return retiringStartedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRetiringStartedOn() {
    return retiringStartedOn;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductVersionState getState() {
    return state;
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
    SubscriptionProductVersion subscriptionProductVersion = (SubscriptionProductVersion) o;
    return Objects.equals(this.activatedOn, subscriptionProductVersion.activatedOn) &&
        Objects.equals(this.billingCycle, subscriptionProductVersion.billingCycle) &&
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
        Objects.equals(this.version, subscriptionProductVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, billingCycle, comment, createdOn, defaultCurrency, enabledCurrencies, id, incrementNumber, linkedSpaceId, minimalNumberOfPeriods, name, numberOfNoticePeriods, obsoletedOn, plannedPurgeDate, product, reference, retiringFinishedOn, retiringStartedOn, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersion {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
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

