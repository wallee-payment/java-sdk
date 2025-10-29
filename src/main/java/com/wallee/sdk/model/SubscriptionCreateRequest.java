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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.SubscriptionComponentReferenceConfiguration;
import com.wallee.sdk.model.SubscriptionPending;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionCreateRequest
 */
@JsonPropertyOrder({
  SubscriptionCreateRequest.JSON_PROPERTY_COMPONENT_CONFIGURATIONS,
  SubscriptionCreateRequest.JSON_PROPERTY_PRODUCT,
  SubscriptionCreateRequest.JSON_PROPERTY_CURRENCY,
  SubscriptionCreateRequest.JSON_PROPERTY_SUBSCRIPTION
})

public class SubscriptionCreateRequest {
  public static final String JSON_PROPERTY_COMPONENT_CONFIGURATIONS = "componentConfigurations";
  private Set<SubscriptionComponentReferenceConfiguration> componentConfigurations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private Long product;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionPending subscription;

  public SubscriptionCreateRequest() {
  }

  public SubscriptionCreateRequest componentConfigurations(Set<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
    
    this.componentConfigurations = componentConfigurations;
    return this;
  }

  public SubscriptionCreateRequest addComponentConfigurationsItem(SubscriptionComponentReferenceConfiguration componentConfigurationsItem) {
    if (this.componentConfigurations == null) {
      this.componentConfigurations = new LinkedHashSet<>();
    }
    this.componentConfigurations.add(componentConfigurationsItem);
    return this;
  }

   /**
   * The configurations of the subscription&#39;s components.
   * @return componentConfigurations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SubscriptionComponentReferenceConfiguration> getComponentConfigurations() {
    return componentConfigurations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentConfigurations(Set<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
    this.componentConfigurations = componentConfigurations;
  }

  public SubscriptionCreateRequest product(Long product) {
    
    this.product = product;
    return this;
  }

   /**
   * The product to subscribe to.
   * @return product
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(Long product) {
    this.product = product;
  }

  public SubscriptionCreateRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter code (ISO 4217 format) of the currency used to invoice the customer. Must be one of the currencies supported by the product.
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SubscriptionCreateRequest subscription(SubscriptionPending subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionPending getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(SubscriptionPending subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCreateRequest subscriptionCreateRequest = (SubscriptionCreateRequest) o;
    return Objects.equals(this.componentConfigurations, subscriptionCreateRequest.componentConfigurations) &&
        Objects.equals(this.product, subscriptionCreateRequest.product) &&
        Objects.equals(this.currency, subscriptionCreateRequest.currency) &&
        Objects.equals(this.subscription, subscriptionCreateRequest.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentConfigurations, product, currency, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreateRequest {\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

    // add `componentConfigurations` to the URL query string
    if (getComponentConfigurations() != null) {
      int i = 0;
      for (SubscriptionComponentReferenceConfiguration _item : getComponentConfigurations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%scomponentConfigurations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `product` to the URL query string
    if (getProduct() != null) {
      try {
        joiner.add(String.format("%sproduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProduct()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      joiner.add(getSubscription().toUrlQueryString(prefix + "subscription" + suffix));
    }

    return joiner.toString();
  }

}

