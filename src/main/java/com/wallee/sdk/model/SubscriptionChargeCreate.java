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
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
@ApiModel(description = "The subscription charge represents a single charge carried out for a particular subscription.")

public class SubscriptionChargeCreate {
  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failedUrl")
  protected String failedUrl = null;

  
  @JsonProperty("plannedExecutionDate")
  protected OffsetDateTime plannedExecutionDate = null;

  
  @JsonProperty("processingType")
  protected SubscriptionChargeProcessingType processingType = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("subscription")
  protected Long subscription = null;

  
  @JsonProperty("successUrl")
  protected String successUrl = null;

  
  
  public SubscriptionChargeCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public SubscriptionChargeCreate failedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
    return this;
  }

   /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they canceled or failed to authenticated their payment.")
  public String getFailedUrl() {
    return failedUrl;
  }

  public void setFailedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
  }

  
  public SubscriptionChargeCreate plannedExecutionDate(OffsetDateTime plannedExecutionDate) {
    this.plannedExecutionDate = plannedExecutionDate;
    return this;
  }

   /**
   * The date and time when the execution of the charge is planned.
   * @return plannedExecutionDate
  **/
  @ApiModelProperty(value = "The date and time when the execution of the charge is planned.")
  public OffsetDateTime getPlannedExecutionDate() {
    return plannedExecutionDate;
  }

  public void setPlannedExecutionDate(OffsetDateTime plannedExecutionDate) {
    this.plannedExecutionDate = plannedExecutionDate;
  }

  
  public SubscriptionChargeCreate processingType(SubscriptionChargeProcessingType processingType) {
    this.processingType = processingType;
    return this;
  }

   /**
   * The processing type specifies how the charge is to be processed.
   * @return processingType
  **/
  @ApiModelProperty(required = true, value = "The processing type specifies how the charge is to be processed.")
  public SubscriptionChargeProcessingType getProcessingType() {
    return processingType;
  }

  public void setProcessingType(SubscriptionChargeProcessingType processingType) {
    this.processingType = processingType;
  }

  
  public SubscriptionChargeCreate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The merchant&#39;s reference used to identify the charge.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the charge.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  
  public SubscriptionChargeCreate subscription(Long subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * The subscription that the charge belongs to.
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "The subscription that the charge belongs to.")
  public Long getSubscription() {
    return subscription;
  }

  public void setSubscription(Long subscription) {
    this.subscription = subscription;
  }

  
  public SubscriptionChargeCreate successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they successfully authenticated their payment.")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionChargeCreate subscriptionChargeCreate = (SubscriptionChargeCreate) o;
    return Objects.equals(this.externalId, subscriptionChargeCreate.externalId) &&
        Objects.equals(this.failedUrl, subscriptionChargeCreate.failedUrl) &&
        Objects.equals(this.plannedExecutionDate, subscriptionChargeCreate.plannedExecutionDate) &&
        Objects.equals(this.processingType, subscriptionChargeCreate.processingType) &&
        Objects.equals(this.reference, subscriptionChargeCreate.reference) &&
        Objects.equals(this.subscription, subscriptionChargeCreate.subscription) &&
        Objects.equals(this.successUrl, subscriptionChargeCreate.successUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, failedUrl, plannedExecutionDate, processingType, reference, subscription, successUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionChargeCreate {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
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

