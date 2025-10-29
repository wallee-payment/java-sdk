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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Payment processors serve as intermediaries that establish connections with third-party companies, known as payment service providers. These providers are responsible for managing the technical aspects of payment transactions, ensuring seamless and secure payment processing.
 */
@JsonPropertyOrder({
  PaymentProcessor.JSON_PROPERTY_COMPANY_NAME,
  PaymentProcessor.JSON_PROPERTY_HEADQUARTERS_LOCATION,
  PaymentProcessor.JSON_PROPERTY_LOGO_PATH,
  PaymentProcessor.JSON_PROPERTY_NAME,
  PaymentProcessor.JSON_PROPERTY_DESCRIPTION,
  PaymentProcessor.JSON_PROPERTY_ID,
  PaymentProcessor.JSON_PROPERTY_PRODUCT_NAME
})

public class PaymentProcessor {
  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private Map<String, String> companyName = new HashMap<>();

  public static final String JSON_PROPERTY_HEADQUARTERS_LOCATION = "headquartersLocation";
  private Map<String, String> headquartersLocation = new HashMap<>();

  public static final String JSON_PROPERTY_LOGO_PATH = "logoPath";
  private String logoPath;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private Map<String, String> productName = new HashMap<>();

  public PaymentProcessor() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentProcessor(
    @JsonProperty(JSON_PROPERTY_COMPANY_NAME) Map<String, String> companyName, 
    @JsonProperty(JSON_PROPERTY_HEADQUARTERS_LOCATION) Map<String, String> headquartersLocation, 
    @JsonProperty(JSON_PROPERTY_LOGO_PATH) String logoPath, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PRODUCT_NAME) Map<String, String> productName
  ) {
    this();
    this.companyName = companyName;
    this.headquartersLocation = headquartersLocation;
    this.logoPath = logoPath;
    this.name = name;
    this.description = description;
    this.id = id;
    this.productName = productName;
  }

   /**
   * The name of the company to which the processor belongs.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getCompanyName() {
    return companyName;
  }



   /**
   * Where the processor&#39;s headquarters are located.
   * @return headquartersLocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADQUARTERS_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getHeadquartersLocation() {
    return headquartersLocation;
  }



   /**
   * The path to the logo image of the processor.
   * @return logoPath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoPath() {
    return logoPath;
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
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



   /**
   * The name of the processor&#39;s product.
   * @return productName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getProductName() {
    return productName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessor paymentProcessor = (PaymentProcessor) o;
    return Objects.equals(this.companyName, paymentProcessor.companyName) &&
        Objects.equals(this.headquartersLocation, paymentProcessor.headquartersLocation) &&
        Objects.equals(this.logoPath, paymentProcessor.logoPath) &&
        Objects.equals(this.name, paymentProcessor.name) &&
        Objects.equals(this.description, paymentProcessor.description) &&
        Objects.equals(this.id, paymentProcessor.id) &&
        Objects.equals(this.productName, paymentProcessor.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, headquartersLocation, logoPath, name, description, id, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessor {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    headquartersLocation: ").append(toIndentedString(headquartersLocation)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      for (String _key : getCompanyName().keySet()) {
        try {
          joiner.add(String.format("%scompanyName%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getCompanyName().get(_key), URLEncoder.encode(String.valueOf(getCompanyName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `headquartersLocation` to the URL query string
    if (getHeadquartersLocation() != null) {
      for (String _key : getHeadquartersLocation().keySet()) {
        try {
          joiner.add(String.format("%sheadquartersLocation%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getHeadquartersLocation().get(_key), URLEncoder.encode(String.valueOf(getHeadquartersLocation().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `logoPath` to the URL query string
    if (getLogoPath() != null) {
      try {
        joiner.add(String.format("%slogoPath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoPath()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `productName` to the URL query string
    if (getProductName() != null) {
      for (String _key : getProductName().keySet()) {
        try {
          joiner.add(String.format("%sproductName%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getProductName().get(_key), URLEncoder.encode(String.valueOf(getProductName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

