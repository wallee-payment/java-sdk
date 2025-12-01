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
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.PaymentConnectorFeature;
import com.wallee.sdk.model.PaymentMethod;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.PaymentPrimaryRiskTaker;
import com.wallee.sdk.model.PaymentProcessor;
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
 * PaymentConnector
 */
@JsonPropertyOrder({
  PaymentConnector.JSON_PROPERTY_SUPPORTED_FEATURES,
  PaymentConnector.JSON_PROPERTY_SUPPORTED_CUSTOMERS_PRESENCES,
  PaymentConnector.JSON_PROPERTY_DATA_COLLECTION_TYPE,
  PaymentConnector.JSON_PROPERTY_DEPRECATED,
  PaymentConnector.JSON_PROPERTY_PRIMARY_RISK_TAKER,
  PaymentConnector.JSON_PROPERTY_DESCRIPTION,
  PaymentConnector.JSON_PROPERTY_PAYMENT_METHOD_BRAND,
  PaymentConnector.JSON_PROPERTY_PROCESSOR,
  PaymentConnector.JSON_PROPERTY_DEPRECATION_REASON,
  PaymentConnector.JSON_PROPERTY_SUPPORTED_CURRENCIES,
  PaymentConnector.JSON_PROPERTY_NAME,
  PaymentConnector.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentConnector.JSON_PROPERTY_ID
})

public class PaymentConnector {
  public static final String JSON_PROPERTY_SUPPORTED_FEATURES = "supportedFeatures";
  @javax.annotation.Nullable
  private Set<PaymentConnectorFeature> supportedFeatures = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_SUPPORTED_CUSTOMERS_PRESENCES = "supportedCustomersPresences";
  @javax.annotation.Nullable
  private Set<CustomersPresence> supportedCustomersPresences = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_DATA_COLLECTION_TYPE = "dataCollectionType";
  @javax.annotation.Nullable
  private DataCollectionType dataCollectionType;

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  @javax.annotation.Nullable
  private Boolean deprecated;

  public static final String JSON_PROPERTY_PRIMARY_RISK_TAKER = "primaryRiskTaker";
  @javax.annotation.Nullable
  private PaymentPrimaryRiskTaker primaryRiskTaker;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_BRAND = "paymentMethodBrand";
  @javax.annotation.Nullable
  private PaymentMethodBrand paymentMethodBrand;

  public static final String JSON_PROPERTY_PROCESSOR = "processor";
  @javax.annotation.Nullable
  private PaymentProcessor processor;

  public static final String JSON_PROPERTY_DEPRECATION_REASON = "deprecationReason";
  @javax.annotation.Nullable
  private Map<String, String> deprecationReason = new HashMap<>();

  public static final String JSON_PROPERTY_SUPPORTED_CURRENCIES = "supportedCurrencies";
  @javax.annotation.Nullable
  private Set<String> supportedCurrencies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  @javax.annotation.Nullable
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public PaymentConnector() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentConnector(
    @JsonProperty(JSON_PROPERTY_SUPPORTED_FEATURES) Set<PaymentConnectorFeature> supportedFeatures, 
    @JsonProperty(JSON_PROPERTY_SUPPORTED_CUSTOMERS_PRESENCES) Set<CustomersPresence> supportedCustomersPresences, 
    @JsonProperty(JSON_PROPERTY_DEPRECATED) Boolean deprecated, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_DEPRECATION_REASON) Map<String, String> deprecationReason, 
    @JsonProperty(JSON_PROPERTY_SUPPORTED_CURRENCIES) Set<String> supportedCurrencies, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.supportedFeatures = supportedFeatures;
    this.supportedCustomersPresences = supportedCustomersPresences;
    this.deprecated = deprecated;
    this.description = description;
    this.deprecationReason = deprecationReason;
    this.supportedCurrencies = supportedCurrencies;
    this.name = name;
    this.id = id;
  }

  /**
   * The features that are supported by the connector.
   * @return supportedFeatures
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PaymentConnectorFeature> getSupportedFeatures() {
    return supportedFeatures;
  }



  /**
   * The types of customer&#39;s presence that are supported by the connector.
   * @return supportedCustomersPresences
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_CUSTOMERS_PRESENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<CustomersPresence> getSupportedCustomersPresences() {
    return supportedCustomersPresences;
  }



  public PaymentConnector dataCollectionType(@javax.annotation.Nullable DataCollectionType dataCollectionType) {
    
    this.dataCollectionType = dataCollectionType;
    return this;
  }

  /**
   * Get dataCollectionType
   * @return dataCollectionType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataCollectionType(@javax.annotation.Nullable DataCollectionType dataCollectionType) {
    this.dataCollectionType = dataCollectionType;
  }

  /**
   * Whether the object was deprecated.
   * @return deprecated
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeprecated() {
    return deprecated;
  }



  public PaymentConnector primaryRiskTaker(@javax.annotation.Nullable PaymentPrimaryRiskTaker primaryRiskTaker) {
    
    this.primaryRiskTaker = primaryRiskTaker;
    return this;
  }

  /**
   * Get primaryRiskTaker
   * @return primaryRiskTaker
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_RISK_TAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentPrimaryRiskTaker getPrimaryRiskTaker() {
    return primaryRiskTaker;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_RISK_TAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryRiskTaker(@javax.annotation.Nullable PaymentPrimaryRiskTaker primaryRiskTaker) {
    this.primaryRiskTaker = primaryRiskTaker;
  }

  /**
   * The localized description of the object.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



  public PaymentConnector paymentMethodBrand(@javax.annotation.Nullable PaymentMethodBrand paymentMethodBrand) {
    
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  /**
   * Get paymentMethodBrand
   * @return paymentMethodBrand
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodBrand(@javax.annotation.Nullable PaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public PaymentConnector processor(@javax.annotation.Nullable PaymentProcessor processor) {
    
    this.processor = processor;
    return this;
  }

  /**
   * Get processor
   * @return processor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProcessor getProcessor() {
    return processor;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessor(@javax.annotation.Nullable PaymentProcessor processor) {
    this.processor = processor;
  }

  /**
   * The deprecation reason describes why the object was deprecated.
   * @return deprecationReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDeprecationReason() {
    return deprecationReason;
  }



  /**
   * The currencies that are supported by the connector.
   * @return supportedCurrencies
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }



  /**
   * The localized name of the object.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



  public PaymentConnector paymentMethod(@javax.annotation.Nullable PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(@javax.annotation.Nullable PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnector paymentConnector = (PaymentConnector) o;
    return Objects.equals(this.supportedFeatures, paymentConnector.supportedFeatures) &&
        Objects.equals(this.supportedCustomersPresences, paymentConnector.supportedCustomersPresences) &&
        Objects.equals(this.dataCollectionType, paymentConnector.dataCollectionType) &&
        Objects.equals(this.deprecated, paymentConnector.deprecated) &&
        Objects.equals(this.primaryRiskTaker, paymentConnector.primaryRiskTaker) &&
        Objects.equals(this.description, paymentConnector.description) &&
        Objects.equals(this.paymentMethodBrand, paymentConnector.paymentMethodBrand) &&
        Objects.equals(this.processor, paymentConnector.processor) &&
        Objects.equals(this.deprecationReason, paymentConnector.deprecationReason) &&
        Objects.equals(this.supportedCurrencies, paymentConnector.supportedCurrencies) &&
        Objects.equals(this.name, paymentConnector.name) &&
        Objects.equals(this.paymentMethod, paymentConnector.paymentMethod) &&
        Objects.equals(this.id, paymentConnector.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedFeatures, supportedCustomersPresences, dataCollectionType, deprecated, primaryRiskTaker, description, paymentMethodBrand, processor, deprecationReason, supportedCurrencies, name, paymentMethod, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnector {\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    supportedCustomersPresences: ").append(toIndentedString(supportedCustomersPresences)).append("\n");
    sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    primaryRiskTaker: ").append(toIndentedString(primaryRiskTaker)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `supportedFeatures` to the URL query string
    if (getSupportedFeatures() != null) {
      int i = 0;
      for (PaymentConnectorFeature _item : getSupportedFeatures()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssupportedFeatures%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `supportedCustomersPresences` to the URL query string
    if (getSupportedCustomersPresences() != null) {
      int i = 0;
      for (CustomersPresence _item : getSupportedCustomersPresences()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%ssupportedCustomersPresences%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
        i++;
      }
    }

    // add `dataCollectionType` to the URL query string
    if (getDataCollectionType() != null) {
      try {
        joiner.add(String.format("%sdataCollectionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataCollectionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deprecated` to the URL query string
    if (getDeprecated() != null) {
      try {
        joiner.add(String.format("%sdeprecated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeprecated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primaryRiskTaker` to the URL query string
    if (getPrimaryRiskTaker() != null) {
      try {
        joiner.add(String.format("%sprimaryRiskTaker%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryRiskTaker()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      for (String _key : getDescription().keySet()) {
        try {
          joiner.add(String.format("%sdescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getDescription().get(_key), URLEncoder.encode(String.valueOf(getDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `paymentMethodBrand` to the URL query string
    if (getPaymentMethodBrand() != null) {
      joiner.add(getPaymentMethodBrand().toUrlQueryString(prefix + "paymentMethodBrand" + suffix));
    }

    // add `processor` to the URL query string
    if (getProcessor() != null) {
      joiner.add(getProcessor().toUrlQueryString(prefix + "processor" + suffix));
    }

    // add `deprecationReason` to the URL query string
    if (getDeprecationReason() != null) {
      for (String _key : getDeprecationReason().keySet()) {
        try {
          joiner.add(String.format("%sdeprecationReason%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getDeprecationReason().get(_key), URLEncoder.encode(String.valueOf(getDeprecationReason().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `supportedCurrencies` to the URL query string
    if (getSupportedCurrencies() != null) {
      int i = 0;
      for (String _item : getSupportedCurrencies()) {
        try {
          joiner.add(String.format("%ssupportedCurrencies%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
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

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(getPaymentMethod().toUrlQueryString(prefix + "paymentMethod" + suffix));
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

    return joiner.toString();
  }

}

