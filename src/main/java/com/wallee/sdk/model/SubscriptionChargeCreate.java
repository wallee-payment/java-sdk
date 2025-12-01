/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
@JsonPropertyOrder({
  SubscriptionChargeCreate.JSON_PROPERTY_REFERENCE,
  SubscriptionChargeCreate.JSON_PROPERTY_PLANNED_EXECUTION_DATE,
  SubscriptionChargeCreate.JSON_PROPERTY_PROCESSING_TYPE,
  SubscriptionChargeCreate.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionChargeCreate.JSON_PROPERTY_SUCCESS_URL,
  SubscriptionChargeCreate.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionChargeCreate.JSON_PROPERTY_FAILED_URL
})
@JsonTypeName("SubscriptionCharge.Create")

public class SubscriptionChargeCreate {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private String reference;

  public static final String JSON_PROPERTY_PLANNED_EXECUTION_DATE = "plannedExecutionDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedExecutionDate;

  public static final String JSON_PROPERTY_PROCESSING_TYPE = "processingType";
  @javax.annotation.Nonnull
  private SubscriptionChargeProcessingType processingType;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nonnull
  private String externalId;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  @javax.annotation.Nullable
  private String successUrl;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  @javax.annotation.Nonnull
  private Long subscription;

  public static final String JSON_PROPERTY_FAILED_URL = "failedUrl";
  @javax.annotation.Nullable
  private String failedUrl;

  public SubscriptionChargeCreate() {
  }

  public SubscriptionChargeCreate reference(@javax.annotation.Nullable String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the charge.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(@javax.annotation.Nullable String reference) {
    this.reference = reference;
  }

  public SubscriptionChargeCreate plannedExecutionDate(@javax.annotation.Nullable OffsetDateTime plannedExecutionDate) {
    
    this.plannedExecutionDate = plannedExecutionDate;
    return this;
  }

  /**
   * The date and time when the execution of the charge is planned.
   * @return plannedExecutionDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedExecutionDate() {
    return plannedExecutionDate;
  }


  @JsonProperty(JSON_PROPERTY_PLANNED_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlannedExecutionDate(@javax.annotation.Nullable OffsetDateTime plannedExecutionDate) {
    this.plannedExecutionDate = plannedExecutionDate;
  }

  public SubscriptionChargeCreate processingType(@javax.annotation.Nonnull SubscriptionChargeProcessingType processingType) {
    
    this.processingType = processingType;
    return this;
  }

  /**
   * Get processingType
   * @return processingType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionChargeProcessingType getProcessingType() {
    return processingType;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessingType(@javax.annotation.Nonnull SubscriptionChargeProcessingType processingType) {
    this.processingType = processingType;
  }

  public SubscriptionChargeCreate externalId(@javax.annotation.Nonnull String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }

  public SubscriptionChargeCreate successUrl(@javax.annotation.Nullable String successUrl) {
    
    this.successUrl = successUrl;
    return this;
  }

  /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessUrl(@javax.annotation.Nullable String successUrl) {
    this.successUrl = successUrl;
  }

  public SubscriptionChargeCreate subscription(@javax.annotation.Nonnull Long subscription) {
    
    this.subscription = subscription;
    return this;
  }

  /**
   * The subscription that the charge belongs to.
   * @return subscription
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscription(@javax.annotation.Nonnull Long subscription) {
    this.subscription = subscription;
  }

  public SubscriptionChargeCreate failedUrl(@javax.annotation.Nullable String failedUrl) {
    
    this.failedUrl = failedUrl;
    return this;
  }

  /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedUrl() {
    return failedUrl;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedUrl(@javax.annotation.Nullable String failedUrl) {
    this.failedUrl = failedUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionChargeCreate subscriptionChargeCreate = (SubscriptionChargeCreate) o;
    return Objects.equals(this.reference, subscriptionChargeCreate.reference) &&
        Objects.equals(this.plannedExecutionDate, subscriptionChargeCreate.plannedExecutionDate) &&
        Objects.equals(this.processingType, subscriptionChargeCreate.processingType) &&
        Objects.equals(this.externalId, subscriptionChargeCreate.externalId) &&
        Objects.equals(this.successUrl, subscriptionChargeCreate.successUrl) &&
        Objects.equals(this.subscription, subscriptionChargeCreate.subscription) &&
        Objects.equals(this.failedUrl, subscriptionChargeCreate.failedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, plannedExecutionDate, processingType, externalId, successUrl, subscription, failedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionChargeCreate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedExecutionDate` to the URL query string
    if (getPlannedExecutionDate() != null) {
      try {
        joiner.add(String.format("%splannedExecutionDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedExecutionDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processingType` to the URL query string
    if (getProcessingType() != null) {
      try {
        joiner.add(String.format("%sprocessingType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `successUrl` to the URL query string
    if (getSuccessUrl() != null) {
      try {
        joiner.add(String.format("%ssuccessUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      try {
        joiner.add(String.format("%ssubscription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedUrl` to the URL query string
    if (getFailedUrl() != null) {
      try {
        joiner.add(String.format("%sfailedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

