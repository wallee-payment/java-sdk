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

public class SubscriptionVersion {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn;

  
  @JsonProperty("billingCurrency")
  protected String billingCurrency;

  
  @JsonProperty("componentConfigurations")
  protected List<SubscriptionComponentConfiguration> componentConfigurations;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("expectedLastPeriodEnd")
  protected OffsetDateTime expectedLastPeriodEnd;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("language")
  protected String language;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate;

  
  @JsonProperty("productVersion")
  protected SubscriptionProductVersion productVersion;

  
  @JsonProperty("selectedComponents")
  protected List<SubscriptionProductComponent> selectedComponents;

  
  @JsonProperty("state")
  protected SubscriptionVersionState state;

  
  @JsonProperty("subscription")
  protected Subscription subscription;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn;

  
  @JsonProperty("terminatingOn")
  protected OffsetDateTime terminatingOn;

  
  @JsonProperty("terminationIssuedOn")
  protected OffsetDateTime terminationIssuedOn;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The subscriber is charged in the billing currency. The billing currency has to be one of the enabled currencies on the subscription product.
   * @return billingCurrency
  **/
  @ApiModelProperty(value = "The subscriber is charged in the billing currency. The billing currency has to be one of the enabled currencies on the subscription product.")
  public String getBillingCurrency() {
    return billingCurrency;
  }

  
   /**
   * 
   * @return componentConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionComponentConfiguration> getComponentConfigurations() {
    return componentConfigurations;
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
   * The expected last period end is the date on which the projected end date of the last period is. This is only a projection and as such the actual date may be different.
   * @return expectedLastPeriodEnd
  **/
  @ApiModelProperty(value = "The expected last period end is the date on which the projected end date of the last period is. This is only a projection and as such the actual date may be different.")
  public OffsetDateTime getExpectedLastPeriodEnd() {
    return expectedLastPeriodEnd;
  }

  
   /**
   * 
   * @return failedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFailedOn() {
    return failedOn;
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
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
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
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  
   /**
   * 
   * @return productVersion
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductVersion getProductVersion() {
    return productVersion;
  }

  
   /**
   * 
   * @return selectedComponents
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionProductComponent> getSelectedComponents() {
    return selectedComponents;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public SubscriptionVersionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public Subscription getSubscription() {
    return subscription;
  }

  
   /**
   * 
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }

  
   /**
   * 
   * @return terminatingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }

  
   /**
   * 
   * @return terminationIssuedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminationIssuedOn() {
    return terminationIssuedOn;
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
    SubscriptionVersion subscriptionVersion = (SubscriptionVersion) o;
    return Objects.equals(this.activatedOn, subscriptionVersion.activatedOn) &&
        Objects.equals(this.billingCurrency, subscriptionVersion.billingCurrency) &&
        Objects.equals(this.componentConfigurations, subscriptionVersion.componentConfigurations) &&
        Objects.equals(this.createdOn, subscriptionVersion.createdOn) &&
        Objects.equals(this.expectedLastPeriodEnd, subscriptionVersion.expectedLastPeriodEnd) &&
        Objects.equals(this.failedOn, subscriptionVersion.failedOn) &&
        Objects.equals(this.id, subscriptionVersion.id) &&
        Objects.equals(this.language, subscriptionVersion.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionVersion.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscriptionVersion.plannedPurgeDate) &&
        Objects.equals(this.plannedTerminationDate, subscriptionVersion.plannedTerminationDate) &&
        Objects.equals(this.productVersion, subscriptionVersion.productVersion) &&
        Objects.equals(this.selectedComponents, subscriptionVersion.selectedComponents) && this.state
      == subscriptionVersion.state &&
        Objects.equals(this.subscription, subscriptionVersion.subscription) &&
        Objects.equals(this.terminatedOn, subscriptionVersion.terminatedOn) &&
        Objects.equals(this.terminatingOn, subscriptionVersion.terminatingOn) &&
        Objects.equals(this.terminationIssuedOn, subscriptionVersion.terminationIssuedOn) &&
        Objects.equals(this.version, subscriptionVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, billingCurrency, componentConfigurations, createdOn, expectedLastPeriodEnd, failedOn, id, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, productVersion, selectedComponents, state, subscription, terminatedOn, terminatingOn, terminationIssuedOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionVersion {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expectedLastPeriodEnd: ").append(toIndentedString(expectedLastPeriodEnd)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    selectedComponents: ").append(toIndentedString(selectedComponents)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
    sb.append("    terminationIssuedOn: ").append(toIndentedString(terminationIssuedOn)).append("\n");
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

