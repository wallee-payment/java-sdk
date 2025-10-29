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
 * PaymentMethodBrand
 */
@JsonPropertyOrder({
  PaymentMethodBrand.JSON_PROPERTY_GRAY_IMAGE_PATH,
  PaymentMethodBrand.JSON_PROPERTY_IMAGE_PATH,
  PaymentMethodBrand.JSON_PROPERTY_NAME,
  PaymentMethodBrand.JSON_PROPERTY_DESCRIPTION,
  PaymentMethodBrand.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentMethodBrand.JSON_PROPERTY_ID
})

public class PaymentMethodBrand {
  public static final String JSON_PROPERTY_GRAY_IMAGE_PATH = "grayImagePath";
  private String grayImagePath;

  public static final String JSON_PROPERTY_IMAGE_PATH = "imagePath";
  private String imagePath;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private Long paymentMethod;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public PaymentMethodBrand() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentMethodBrand(
    @JsonProperty(JSON_PROPERTY_GRAY_IMAGE_PATH) String grayImagePath, 
    @JsonProperty(JSON_PROPERTY_IMAGE_PATH) String imagePath, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD) Long paymentMethod, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.grayImagePath = grayImagePath;
    this.imagePath = imagePath;
    this.name = name;
    this.description = description;
    this.paymentMethod = paymentMethod;
    this.id = id;
  }

   /**
   * The path to the payment method brand&#39;s grayscale image.
   * @return grayImagePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAY_IMAGE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrayImagePath() {
    return grayImagePath;
  }



   /**
   * The path to the payment method brand&#39;s image.
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
   * The payment method that the brand belongs to.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaymentMethod() {
    return paymentMethod;
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
    PaymentMethodBrand paymentMethodBrand = (PaymentMethodBrand) o;
    return Objects.equals(this.grayImagePath, paymentMethodBrand.grayImagePath) &&
        Objects.equals(this.imagePath, paymentMethodBrand.imagePath) &&
        Objects.equals(this.name, paymentMethodBrand.name) &&
        Objects.equals(this.description, paymentMethodBrand.description) &&
        Objects.equals(this.paymentMethod, paymentMethodBrand.paymentMethod) &&
        Objects.equals(this.id, paymentMethodBrand.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grayImagePath, imagePath, name, description, paymentMethod, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBrand {\n");
    sb.append("    grayImagePath: ").append(toIndentedString(grayImagePath)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `grayImagePath` to the URL query string
    if (getGrayImagePath() != null) {
      try {
        joiner.add(String.format("%sgrayImagePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGrayImagePath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      try {
        joiner.add(String.format("%spaymentMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethod()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

