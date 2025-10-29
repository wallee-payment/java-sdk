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
  SubscriptionProductActive.JSON_PROPERTY_SORT_ORDER,
  SubscriptionProductActive.JSON_PROPERTY_NAME,
  SubscriptionProductActive.JSON_PROPERTY_PRODUCT_LOCKED,
  SubscriptionProductActive.JSON_PROPERTY_STATE,
  SubscriptionProductActive.JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD,
  SubscriptionProductActive.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  SubscriptionProductActive.JSON_PROPERTY_VERSION
})
@JsonTypeName("SubscriptionProduct.Active")

public class SubscriptionProductActive {
  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_LOCKED = "productLocked";
  private Boolean productLocked;

  public static final String JSON_PROPERTY_STATE = "state";
  private SubscriptionProductState state;

  public static final String JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD = "failedPaymentSuspensionPeriod";
  private String failedPaymentSuspensionPeriod;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  private List<Long> allowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SubscriptionProductActive() {
  }

  public SubscriptionProductActive sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing products, they can be sorted by this number.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public SubscriptionProductActive name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the product.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionProductActive productLocked(Boolean productLocked) {
    
    this.productLocked = productLocked;
    return this;
  }

   /**
   * Whether subscriptions can be switched to or from this product, or whether they are locked in.
   * @return productLocked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProductLocked() {
    return productLocked;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductLocked(Boolean productLocked) {
    this.productLocked = productLocked;
  }

  public SubscriptionProductActive state(SubscriptionProductState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(SubscriptionProductState state) {
    this.state = state;
  }

  public SubscriptionProductActive failedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
    
    this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
    return this;
  }

   /**
   * The period after which a subscription that has been suspended due to a failed payment is terminated.
   * @return failedPaymentSuspensionPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedPaymentSuspensionPeriod() {
    return failedPaymentSuspensionPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_PAYMENT_SUSPENSION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
    this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
  }

  public SubscriptionProductActive allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public SubscriptionProductActive addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * The payment methods that can be used to subscribe to this product. If none are selected, no restriction is applied.
   * @return allowedPaymentMethodConfigurations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  public SubscriptionProductActive version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductActive subscriptionProductActive = (SubscriptionProductActive) o;
    return Objects.equals(this.sortOrder, subscriptionProductActive.sortOrder) &&
        Objects.equals(this.name, subscriptionProductActive.name) &&
        Objects.equals(this.productLocked, subscriptionProductActive.productLocked) &&
        Objects.equals(this.state, subscriptionProductActive.state) &&
        Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProductActive.failedPaymentSuspensionPeriod) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProductActive.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.version, subscriptionProductActive.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, name, productLocked, state, failedPaymentSuspensionPeriod, allowedPaymentMethodConfigurations, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductActive {\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productLocked: ").append(toIndentedString(productLocked)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `productLocked` to the URL query string
    if (getProductLocked() != null) {
      try {
        joiner.add(String.format("%sproductLocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductLocked()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

