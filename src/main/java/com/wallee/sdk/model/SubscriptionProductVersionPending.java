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
import com.wallee.sdk.model.SubscriptionProductVersionState;
import com.wallee.sdk.model.TaxCalculation;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionProductVersionPending
 */
@JsonPropertyOrder({
  SubscriptionProductVersionPending.JSON_PROPERTY_ENABLED_CURRENCIES,
  SubscriptionProductVersionPending.JSON_PROPERTY_PRODUCT,
  SubscriptionProductVersionPending.JSON_PROPERTY_TAX_CALCULATION,
  SubscriptionProductVersionPending.JSON_PROPERTY_BILLING_CYCLE,
  SubscriptionProductVersionPending.JSON_PROPERTY_DEFAULT_CURRENCY,
  SubscriptionProductVersionPending.JSON_PROPERTY_NAME,
  SubscriptionProductVersionPending.JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS,
  SubscriptionProductVersionPending.JSON_PROPERTY_COMMENT,
  SubscriptionProductVersionPending.JSON_PROPERTY_STATE,
  SubscriptionProductVersionPending.JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS,
  SubscriptionProductVersionPending.JSON_PROPERTY_VERSION
})
@JsonTypeName("SubscriptionProductVersion.Pending")

public class SubscriptionProductVersionPending {
  public static final String JSON_PROPERTY_ENABLED_CURRENCIES = "enabledCurrencies";
  @javax.annotation.Nullable
  private Set<String> enabledCurrencies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  @javax.annotation.Nullable
  private Long product;

  public static final String JSON_PROPERTY_TAX_CALCULATION = "taxCalculation";
  @javax.annotation.Nullable
  private TaxCalculation taxCalculation;

  public static final String JSON_PROPERTY_BILLING_CYCLE = "billingCycle";
  @javax.annotation.Nullable
  private String billingCycle;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "defaultCurrency";
  @javax.annotation.Nullable
  private String defaultCurrency;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS = "minimalNumberOfPeriods";
  @javax.annotation.Nullable
  private Integer minimalNumberOfPeriods;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private String comment;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private SubscriptionProductVersionState state;

  public static final String JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS = "numberOfNoticePeriods";
  @javax.annotation.Nullable
  private Integer numberOfNoticePeriods;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public SubscriptionProductVersionPending() {
  }

  public SubscriptionProductVersionPending enabledCurrencies(@javax.annotation.Nullable Set<String> enabledCurrencies) {
    
    this.enabledCurrencies = enabledCurrencies;
    return this;
  }

  public SubscriptionProductVersionPending addEnabledCurrenciesItem(String enabledCurrenciesItem) {
    if (this.enabledCurrencies == null) {
      this.enabledCurrencies = new LinkedHashSet<>();
    }
    this.enabledCurrencies.add(enabledCurrenciesItem);
    return this;
  }

  /**
   * The three-letter codes (ISO 4217 format) of the currencies that the product version supports.
   * @return enabledCurrencies
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getEnabledCurrencies() {
    return enabledCurrencies;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENABLED_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledCurrencies(@javax.annotation.Nullable Set<String> enabledCurrencies) {
    this.enabledCurrencies = enabledCurrencies;
  }

  public SubscriptionProductVersionPending product(@javax.annotation.Nullable Long product) {
    
    this.product = product;
    return this;
  }

  /**
   * The product that the version belongs to.
   * @return product
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(@javax.annotation.Nullable Long product) {
    this.product = product;
  }

  public SubscriptionProductVersionPending taxCalculation(@javax.annotation.Nullable TaxCalculation taxCalculation) {
    
    this.taxCalculation = taxCalculation;
    return this;
  }

  /**
   * Get taxCalculation
   * @return taxCalculation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxCalculation getTaxCalculation() {
    return taxCalculation;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCalculation(@javax.annotation.Nullable TaxCalculation taxCalculation) {
    this.taxCalculation = taxCalculation;
  }

  public SubscriptionProductVersionPending billingCycle(@javax.annotation.Nullable String billingCycle) {
    
    this.billingCycle = billingCycle;
    return this;
  }

  /**
   * The recurring period of time, typically monthly or annually, for which a subscriber is charged.
   * @return billingCycle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCycle() {
    return billingCycle;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCycle(@javax.annotation.Nullable String billingCycle) {
    this.billingCycle = billingCycle;
  }

  public SubscriptionProductVersionPending defaultCurrency(@javax.annotation.Nullable String defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  /**
   * The three-letter code (ISO 4217 format) of the product version&#39;s default currency.
   * @return defaultCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrency() {
    return defaultCurrency;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrency(@javax.annotation.Nullable String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public SubscriptionProductVersionPending name(@javax.annotation.Nullable Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public SubscriptionProductVersionPending putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

  /**
   * The localized name of the product that is displayed to the customer.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable Map<String, String> name) {
    this.name = name;
  }

  public SubscriptionProductVersionPending minimalNumberOfPeriods(@javax.annotation.Nullable Integer minimalNumberOfPeriods) {
    
    this.minimalNumberOfPeriods = minimalNumberOfPeriods;
    return this;
  }

  /**
   * The minimum number of periods the subscription will run before it can be terminated.
   * @return minimalNumberOfPeriods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimalNumberOfPeriods() {
    return minimalNumberOfPeriods;
  }


  @JsonProperty(JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimalNumberOfPeriods(@javax.annotation.Nullable Integer minimalNumberOfPeriods) {
    this.minimalNumberOfPeriods = minimalNumberOfPeriods;
  }

  public SubscriptionProductVersionPending comment(@javax.annotation.Nullable String comment) {
    
    this.comment = comment;
    return this;
  }

  /**
   * A comment that describes the product version and why it was created. It is not disclosed to the subscriber.
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }

  public SubscriptionProductVersionPending state(@javax.annotation.Nullable SubscriptionProductVersionState state) {
    
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

  public SubscriptionProductVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable SubscriptionProductVersionState state) {
    this.state = state;
  }

  public SubscriptionProductVersionPending numberOfNoticePeriods(@javax.annotation.Nullable Integer numberOfNoticePeriods) {
    
    this.numberOfNoticePeriods = numberOfNoticePeriods;
    return this;
  }

  /**
   * The number of periods the subscription will keep running after its termination was requested.
   * @return numberOfNoticePeriods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfNoticePeriods() {
    return numberOfNoticePeriods;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfNoticePeriods(@javax.annotation.Nullable Integer numberOfNoticePeriods) {
    this.numberOfNoticePeriods = numberOfNoticePeriods;
  }

  public SubscriptionProductVersionPending version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
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
    SubscriptionProductVersionPending subscriptionProductVersionPending = (SubscriptionProductVersionPending) o;
    return Objects.equals(this.enabledCurrencies, subscriptionProductVersionPending.enabledCurrencies) &&
        Objects.equals(this.product, subscriptionProductVersionPending.product) &&
        Objects.equals(this.taxCalculation, subscriptionProductVersionPending.taxCalculation) &&
        Objects.equals(this.billingCycle, subscriptionProductVersionPending.billingCycle) &&
        Objects.equals(this.defaultCurrency, subscriptionProductVersionPending.defaultCurrency) &&
        Objects.equals(this.name, subscriptionProductVersionPending.name) &&
        Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersionPending.minimalNumberOfPeriods) &&
        Objects.equals(this.comment, subscriptionProductVersionPending.comment) &&
        Objects.equals(this.state, subscriptionProductVersionPending.state) &&
        Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersionPending.numberOfNoticePeriods) &&
        Objects.equals(this.version, subscriptionProductVersionPending.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledCurrencies, product, taxCalculation, billingCycle, defaultCurrency, name, minimalNumberOfPeriods, comment, state, numberOfNoticePeriods, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersionPending {\n");
    sb.append("    enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    taxCalculation: ").append(toIndentedString(taxCalculation)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
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

    // add `enabledCurrencies` to the URL query string
    if (getEnabledCurrencies() != null) {
      int i = 0;
      for (String _item : getEnabledCurrencies()) {
        try {
          joiner.add(String.format("%senabledCurrencies%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
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

    // add `taxCalculation` to the URL query string
    if (getTaxCalculation() != null) {
      try {
        joiner.add(String.format("%staxCalculation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxCalculation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingCycle` to the URL query string
    if (getBillingCycle() != null) {
      try {
        joiner.add(String.format("%sbillingCycle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBillingCycle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultCurrency` to the URL query string
    if (getDefaultCurrency() != null) {
      try {
        joiner.add(String.format("%sdefaultCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      for (String _key : getName().keySet()) {
        try {
          joiner.add(String.format("%sname%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getName().get(_key), URLEncoder.encode(String.valueOf(getName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `minimalNumberOfPeriods` to the URL query string
    if (getMinimalNumberOfPeriods() != null) {
      try {
        joiner.add(String.format("%sminimalNumberOfPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinimalNumberOfPeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `numberOfNoticePeriods` to the URL query string
    if (getNumberOfNoticePeriods() != null) {
      try {
        joiner.add(String.format("%snumberOfNoticePeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfNoticePeriods()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

