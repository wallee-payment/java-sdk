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
import com.wallee.sdk.model.FulfillmentState;
import com.wallee.sdk.model.TransactionCompletion;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Fulfillment
 */
@JsonPropertyOrder({
  Fulfillment.JSON_PROPERTY_COMPLETION,
  Fulfillment.JSON_PROPERTY_OVERRIDDEN_BY,
  Fulfillment.JSON_PROPERTY_OVERRIDE_REASON,
  Fulfillment.JSON_PROPERTY_CREATED_ON,
  Fulfillment.JSON_PROPERTY_VERSION,
  Fulfillment.JSON_PROPERTY_LINKED_SPACE_ID,
  Fulfillment.JSON_PROPERTY_CREATED_BY,
  Fulfillment.JSON_PROPERTY_FAILURE_REASON,
  Fulfillment.JSON_PROPERTY_FULFILLED_BY,
  Fulfillment.JSON_PROPERTY_IN_STORE_PICKUP,
  Fulfillment.JSON_PROPERTY_ID,
  Fulfillment.JSON_PROPERTY_STATE,
  Fulfillment.JSON_PROPERTY_LINKED_TRANSACTION,
  Fulfillment.JSON_PROPERTY_TRACKING_NUMBER,
  Fulfillment.JSON_PROPERTY_FAILED_ON,
  Fulfillment.JSON_PROPERTY_OVERRIDDEN_ON,
  Fulfillment.JSON_PROPERTY_FULFILLED_ON
})

public class Fulfillment {
  public static final String JSON_PROPERTY_COMPLETION = "completion";
  @javax.annotation.Nullable
  private TransactionCompletion completion;

  public static final String JSON_PROPERTY_OVERRIDDEN_BY = "overriddenBy";
  @javax.annotation.Nullable
  private Long overriddenBy;

  public static final String JSON_PROPERTY_OVERRIDE_REASON = "overrideReason";
  @javax.annotation.Nullable
  private String overrideReason;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  @javax.annotation.Nullable
  private String failureReason;

  public static final String JSON_PROPERTY_FULFILLED_BY = "fulfilledBy";
  @javax.annotation.Nullable
  private Long fulfilledBy;

  public static final String JSON_PROPERTY_IN_STORE_PICKUP = "inStorePickup";
  @javax.annotation.Nullable
  private Boolean inStorePickup;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private FulfillmentState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  @javax.annotation.Nullable
  private String trackingNumber;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  @javax.annotation.Nullable
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_OVERRIDDEN_ON = "overriddenOn";
  @javax.annotation.Nullable
  private OffsetDateTime overriddenOn;

  public static final String JSON_PROPERTY_FULFILLED_ON = "fulfilledOn";
  @javax.annotation.Nullable
  private OffsetDateTime fulfilledOn;

  public Fulfillment() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Fulfillment(
    @JsonProperty(JSON_PROPERTY_OVERRIDDEN_BY) Long overriddenBy, 
    @JsonProperty(JSON_PROPERTY_OVERRIDE_REASON) String overrideReason, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_FAILURE_REASON) String failureReason, 
    @JsonProperty(JSON_PROPERTY_FULFILLED_BY) Long fulfilledBy, 
    @JsonProperty(JSON_PROPERTY_IN_STORE_PICKUP) Boolean inStorePickup, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER) String trackingNumber, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_OVERRIDDEN_ON) OffsetDateTime overriddenOn, 
    @JsonProperty(JSON_PROPERTY_FULFILLED_ON) OffsetDateTime fulfilledOn
  ) {
    this();
    this.overriddenBy = overriddenBy;
    this.overrideReason = overrideReason;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.createdBy = createdBy;
    this.failureReason = failureReason;
    this.fulfilledBy = fulfilledBy;
    this.inStorePickup = inStorePickup;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.trackingNumber = trackingNumber;
    this.failedOn = failedOn;
    this.overriddenOn = overriddenOn;
    this.fulfilledOn = fulfilledOn;
  }

  public Fulfillment completion(@javax.annotation.Nullable TransactionCompletion completion) {
    
    this.completion = completion;
    return this;
  }

  /**
   * Get completion
   * @return completion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletion getCompletion() {
    return completion;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(@javax.annotation.Nullable TransactionCompletion completion) {
    this.completion = completion;
  }

  /**
   * Get overriddenBy
   * @return overriddenBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDDEN_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOverriddenBy() {
    return overriddenBy;
  }



  /**
   * Get overrideReason
   * @return overrideReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverrideReason() {
    return overrideReason;
  }



  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureReason() {
    return failureReason;
  }



  /**
   * Get fulfilledBy
   * @return fulfilledBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULFILLED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFulfilledBy() {
    return fulfilledBy;
  }



  /**
   * Get inStorePickup
   * @return inStorePickup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_STORE_PICKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInStorePickup() {
    return inStorePickup;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public Fulfillment state(@javax.annotation.Nullable FulfillmentState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FulfillmentState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable FulfillmentState state) {
    this.state = state;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  /**
   * Get trackingNumber
   * @return trackingNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingNumber() {
    return trackingNumber;
  }



  /**
   * Get failedOn
   * @return failedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  /**
   * Get overriddenOn
   * @return overriddenOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDDEN_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOverriddenOn() {
    return overriddenOn;
  }



  /**
   * Get fulfilledOn
   * @return fulfilledOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULFILLED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFulfilledOn() {
    return fulfilledOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fulfillment fulfillment = (Fulfillment) o;
    return Objects.equals(this.completion, fulfillment.completion) &&
        Objects.equals(this.overriddenBy, fulfillment.overriddenBy) &&
        Objects.equals(this.overrideReason, fulfillment.overrideReason) &&
        Objects.equals(this.createdOn, fulfillment.createdOn) &&
        Objects.equals(this.version, fulfillment.version) &&
        Objects.equals(this.linkedSpaceId, fulfillment.linkedSpaceId) &&
        Objects.equals(this.createdBy, fulfillment.createdBy) &&
        Objects.equals(this.failureReason, fulfillment.failureReason) &&
        Objects.equals(this.fulfilledBy, fulfillment.fulfilledBy) &&
        Objects.equals(this.inStorePickup, fulfillment.inStorePickup) &&
        Objects.equals(this.id, fulfillment.id) &&
        Objects.equals(this.state, fulfillment.state) &&
        Objects.equals(this.linkedTransaction, fulfillment.linkedTransaction) &&
        Objects.equals(this.trackingNumber, fulfillment.trackingNumber) &&
        Objects.equals(this.failedOn, fulfillment.failedOn) &&
        Objects.equals(this.overriddenOn, fulfillment.overriddenOn) &&
        Objects.equals(this.fulfilledOn, fulfillment.fulfilledOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completion, overriddenBy, overrideReason, createdOn, version, linkedSpaceId, createdBy, failureReason, fulfilledBy, inStorePickup, id, state, linkedTransaction, trackingNumber, failedOn, overriddenOn, fulfilledOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fulfillment {\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    overriddenBy: ").append(toIndentedString(overriddenBy)).append("\n");
    sb.append("    overrideReason: ").append(toIndentedString(overrideReason)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    fulfilledBy: ").append(toIndentedString(fulfilledBy)).append("\n");
    sb.append("    inStorePickup: ").append(toIndentedString(inStorePickup)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    overriddenOn: ").append(toIndentedString(overriddenOn)).append("\n");
    sb.append("    fulfilledOn: ").append(toIndentedString(fulfilledOn)).append("\n");
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

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      joiner.add(getCompletion().toUrlQueryString(prefix + "completion" + suffix));
    }

    // add `overriddenBy` to the URL query string
    if (getOverriddenBy() != null) {
      try {
        joiner.add(String.format("%soverriddenBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverriddenBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `overrideReason` to the URL query string
    if (getOverrideReason() != null) {
      try {
        joiner.add(String.format("%soverrideReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverrideReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      try {
        joiner.add(String.format("%sfailureReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailureReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fulfilledBy` to the URL query string
    if (getFulfilledBy() != null) {
      try {
        joiner.add(String.format("%sfulfilledBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFulfilledBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inStorePickup` to the URL query string
    if (getInStorePickup() != null) {
      try {
        joiner.add(String.format("%sinStorePickup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInStorePickup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trackingNumber` to the URL query string
    if (getTrackingNumber() != null) {
      try {
        joiner.add(String.format("%strackingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackingNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `overriddenOn` to the URL query string
    if (getOverriddenOn() != null) {
      try {
        joiner.add(String.format("%soverriddenOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverriddenOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fulfilledOn` to the URL query string
    if (getFulfilledOn() != null) {
      try {
        joiner.add(String.format("%sfulfilledOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFulfilledOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

