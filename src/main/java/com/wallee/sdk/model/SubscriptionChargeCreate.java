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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
public class SubscriptionChargeCreate {
  
  @SerializedName("externalId")
  protected String externalId = null;

  
  @SerializedName("failedUrl")
  protected String failedUrl = null;

  
  @SerializedName("plannedExecutionDate")
  protected OffsetDateTime plannedExecutionDate = null;

  
  @SerializedName("processingType")
  protected SubscriptionChargeProcessingType processingType = null;

  
  @SerializedName("reference")
  protected String reference = null;

  
  @SerializedName("subscription")
  protected Long subscription = null;

  
  @SerializedName("successUrl")
  protected String successUrl = null;

  
  
  public SubscriptionChargeCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
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
   * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.")
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
   * 
   * @return plannedExecutionDate
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return processingType
  **/
  @ApiModelProperty(required = true, value = "")
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
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
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
   * The field subscription indicates the subscription to which the charge belongs to.
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "The field subscription indicates the subscription to which the charge belongs to.")
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
   * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.")
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

