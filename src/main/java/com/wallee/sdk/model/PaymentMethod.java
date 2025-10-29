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
import com.wallee.sdk.model.DataCollectionType;
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
 * PaymentMethod
 */
@JsonPropertyOrder({
  PaymentMethod.JSON_PROPERTY_SUPPORTED_CURRENCIES,
  PaymentMethod.JSON_PROPERTY_DATA_COLLECTION_TYPES,
  PaymentMethod.JSON_PROPERTY_IMAGE_PATH,
  PaymentMethod.JSON_PROPERTY_NAME,
  PaymentMethod.JSON_PROPERTY_DESCRIPTION,
  PaymentMethod.JSON_PROPERTY_MERCHANT_DESCRIPTION,
  PaymentMethod.JSON_PROPERTY_ID
})

public class PaymentMethod {
  public static final String JSON_PROPERTY_SUPPORTED_CURRENCIES = "supportedCurrencies";
  private Set<String> supportedCurrencies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_DATA_COLLECTION_TYPES = "dataCollectionTypes";
  private Set<DataCollectionType> dataCollectionTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_IMAGE_PATH = "imagePath";
  private String imagePath;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_MERCHANT_DESCRIPTION = "merchantDescription";
  private Map<String, String> merchantDescription = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public PaymentMethod() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentMethod(
    @JsonProperty(JSON_PROPERTY_SUPPORTED_CURRENCIES) Set<String> supportedCurrencies, 
    @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPES) Set<DataCollectionType> dataCollectionTypes, 
    @JsonProperty(JSON_PROPERTY_IMAGE_PATH) String imagePath, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_DESCRIPTION) Map<String, String> merchantDescription, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.supportedCurrencies = supportedCurrencies;
    this.dataCollectionTypes = dataCollectionTypes;
    this.imagePath = imagePath;
    this.name = name;
    this.description = description;
    this.merchantDescription = merchantDescription;
    this.id = id;
  }

   /**
   * The currencies that the payment method supports.
   * @return supportedCurrencies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }



   /**
   * The data collection types that payment method supports.
   * @return dataCollectionTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<DataCollectionType> getDataCollectionTypes() {
    return dataCollectionTypes;
  }



   /**
   * The path to the payment method&#39;s image.
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImagePath() {
    return imagePath;
  }



   /**
   * The localized name of the object.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



   /**
   * The localized description of the object.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



   /**
   * A merchant-focused, localized description of the payment method, providing its purpose and details.
   * @return merchantDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMerchantDescription() {
    return merchantDescription;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
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
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.supportedCurrencies, paymentMethod.supportedCurrencies) &&
        Objects.equals(this.dataCollectionTypes, paymentMethod.dataCollectionTypes) &&
        Objects.equals(this.imagePath, paymentMethod.imagePath) &&
        Objects.equals(this.name, paymentMethod.name) &&
        Objects.equals(this.description, paymentMethod.description) &&
        Objects.equals(this.merchantDescription, paymentMethod.merchantDescription) &&
        Objects.equals(this.id, paymentMethod.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedCurrencies, dataCollectionTypes, imagePath, name, description, merchantDescription, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    dataCollectionTypes: ").append(toIndentedString(dataCollectionTypes)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    merchantDescription: ").append(toIndentedString(merchantDescription)).append("\n");
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

    // add `dataCollectionTypes` to the URL query string
    if (getDataCollectionTypes() != null) {
      int i = 0;
      for (DataCollectionType _item : getDataCollectionTypes()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%sdataCollectionTypes%s%s=%s", prefix, suffix,
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

    // add `imagePath` to the URL query string
    if (getImagePath() != null) {
      try {
        joiner.add(String.format("%simagePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImagePath()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `merchantDescription` to the URL query string
    if (getMerchantDescription() != null) {
      for (String _key : getMerchantDescription().keySet()) {
        try {
          joiner.add(String.format("%smerchantDescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMerchantDescription().get(_key), URLEncoder.encode(String.valueOf(getMerchantDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    return joiner.toString();
  }

}

