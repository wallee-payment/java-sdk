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
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionUpdateRequest
 */
@JsonPropertyOrder({
  SubscriptionUpdateRequest.JSON_PROPERTY_COMPONENT_CONFIGURATIONS,
  SubscriptionUpdateRequest.JSON_PROPERTY_PRODUCT,
  SubscriptionUpdateRequest.JSON_PROPERTY_CURRENCY,
  SubscriptionUpdateRequest.JSON_PROPERTY_RESPECT_TERMINATION_PERIOD
})

public class SubscriptionUpdateRequest {
  public static final String JSON_PROPERTY_COMPONENT_CONFIGURATIONS = "componentConfigurations";
  private Set<SubscriptionComponentReferenceConfiguration> componentConfigurations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private Long product;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_RESPECT_TERMINATION_PERIOD = "respectTerminationPeriod";
  private Boolean respectTerminationPeriod;

  public SubscriptionUpdateRequest() {
  }

  public SubscriptionUpdateRequest componentConfigurations(Set<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
    
    this.componentConfigurations = componentConfigurations;
    return this;
  }

  public SubscriptionUpdateRequest addComponentConfigurationsItem(SubscriptionComponentReferenceConfiguration componentConfigurationsItem) {
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

  public SubscriptionUpdateRequest product(Long product) {
    
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

  public SubscriptionUpdateRequest currency(String currency) {
    
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

  public SubscriptionUpdateRequest respectTerminationPeriod(Boolean respectTerminationPeriod) {
    
    this.respectTerminationPeriod = respectTerminationPeriod;
    return this;
  }

   /**
   * Whether the subscriptions&#39; termination periods should be respected.
   * @return respectTerminationPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRespectTerminationPeriod() {
    return respectTerminationPeriod;
  }


  @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRespectTerminationPeriod(Boolean respectTerminationPeriod) {
    this.respectTerminationPeriod = respectTerminationPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateRequest subscriptionUpdateRequest = (SubscriptionUpdateRequest) o;
    return Objects.equals(this.componentConfigurations, subscriptionUpdateRequest.componentConfigurations) &&
        Objects.equals(this.product, subscriptionUpdateRequest.product) &&
        Objects.equals(this.currency, subscriptionUpdateRequest.currency) &&
        Objects.equals(this.respectTerminationPeriod, subscriptionUpdateRequest.respectTerminationPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentConfigurations, product, currency, respectTerminationPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateRequest {\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    respectTerminationPeriod: ").append(toIndentedString(respectTerminationPeriod)).append("\n");
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

    // add `respectTerminationPeriod` to the URL query string
    if (getRespectTerminationPeriod() != null) {
      try {
        joiner.add(String.format("%srespectTerminationPeriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRespectTerminationPeriod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

