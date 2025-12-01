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
import com.wallee.sdk.model.SubscriptionProductState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@JsonPropertyOrder({
  SubscriptionProduct.JSON_PROPERTY_REFERENCE,
  SubscriptionProduct.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionProduct.JSON_PROPERTY_SPACE_ID,
  SubscriptionProduct.JSON_PROPERTY_SORT_ORDER,
  SubscriptionProduct.JSON_PROPERTY_NAME,
  SubscriptionProduct.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionProduct.JSON_PROPERTY_PRODUCT_LOCKED,
  SubscriptionProduct.JSON_PROPERTY_ID,
  SubscriptionProduct.JSON_PROPERTY_STATE,
  SubscriptionProduct.JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD,
  SubscriptionProduct.JSON_PROPERTY_VERSION,
  SubscriptionProduct.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS
})

public class SubscriptionProduct {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private String reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_SPACE_ID = "spaceId";
  @javax.annotation.Nullable
  private Long spaceId;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_PRODUCT_LOCKED = "productLocked";
  @javax.annotation.Nullable
  private Boolean productLocked;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private SubscriptionProductState state;

  public static final String JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD = "failedPaymentSuspensionPeriod";
  @javax.annotation.Nullable
  private String failedPaymentSuspensionPeriod;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  @javax.annotation.Nullable
  private List<Long> allowedPaymentMethodConfigurations = new ArrayList<>();

  public SubscriptionProduct() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SubscriptionProduct(
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_SPACE_ID) Long spaceId, 
    @JsonProperty(JSON_PROPERTY_SORT_ORDER) Integer sortOrder, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_PRODUCT_LOCKED) Boolean productLocked, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD) String failedPaymentSuspensionPeriod, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS) List<Long> allowedPaymentMethodConfigurations
  ) {
    this();
    this.reference = reference;
    this.linkedSpaceId = linkedSpaceId;
    this.spaceId = spaceId;
    this.sortOrder = sortOrder;
    this.name = name;
    this.plannedPurgeDate = plannedPurgeDate;
    this.productLocked = productLocked;
    this.id = id;
    this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
    this.version = version;
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  /**
   * The merchant&#39;s reference used to identify the product, e.g. the SKU.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
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
   * The ID of the space this object belongs to.
   * @return spaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceId() {
    return spaceId;
  }



  /**
   * When listing products, they can be sorted by this number.
   * @return sortOrder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }



  /**
   * The name used to identify the product.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * Whether subscriptions can be switched to or from this product, or whether they are locked in.
   * @return productLocked
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProductLocked() {
    return productLocked;
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



  public SubscriptionProduct state(@javax.annotation.Nullable SubscriptionProductState state) {
    
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

  public SubscriptionProductState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable SubscriptionProductState state) {
    this.state = state;
  }

  /**
   * The period after which a subscription that has been suspended due to a failed payment is terminated.
   * @return failedPaymentSuspensionPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedPaymentSuspensionPeriod() {
    return failedPaymentSuspensionPeriod;
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
   * The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.
   * @return allowedPaymentMethodConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProduct subscriptionProduct = (SubscriptionProduct) o;
    return Objects.equals(this.reference, subscriptionProduct.reference) &&
        Objects.equals(this.linkedSpaceId, subscriptionProduct.linkedSpaceId) &&
        Objects.equals(this.spaceId, subscriptionProduct.spaceId) &&
        Objects.equals(this.sortOrder, subscriptionProduct.sortOrder) &&
        Objects.equals(this.name, subscriptionProduct.name) &&
        Objects.equals(this.plannedPurgeDate, subscriptionProduct.plannedPurgeDate) &&
        Objects.equals(this.productLocked, subscriptionProduct.productLocked) &&
        Objects.equals(this.id, subscriptionProduct.id) &&
        Objects.equals(this.state, subscriptionProduct.state) &&
        Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProduct.failedPaymentSuspensionPeriod) &&
        Objects.equals(this.version, subscriptionProduct.version) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProduct.allowedPaymentMethodConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, linkedSpaceId, spaceId, sortOrder, name, plannedPurgeDate, productLocked, id, state, failedPaymentSuspensionPeriod, version, allowedPaymentMethodConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProduct {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    productLocked: ").append(toIndentedString(productLocked)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spaceId` to the URL query string
    if (getSpaceId() != null) {
      try {
        joiner.add(String.format("%sspaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortOrder` to the URL query string
    if (getSortOrder() != null) {
      try {
        joiner.add(String.format("%ssortOrder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `productLocked` to the URL query string
    if (getProductLocked() != null) {
      try {
        joiner.add(String.format("%sproductLocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductLocked()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `failedPaymentSuspensionPeriod` to the URL query string
    if (getFailedPaymentSuspensionPeriod() != null) {
      try {
        joiner.add(String.format("%sfailedPaymentSuspensionPeriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedPaymentSuspensionPeriod()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `allowedPaymentMethodConfigurations` to the URL query string
    if (getAllowedPaymentMethodConfigurations() != null) {
      for (int i = 0; i < getAllowedPaymentMethodConfigurations().size(); i++) {
        try {
          joiner.add(String.format("%sallowedPaymentMethodConfigurations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAllowedPaymentMethodConfigurations().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

