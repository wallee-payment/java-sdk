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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.OneClickPaymentMode;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentMethodConfigurationActive
 */
@JsonPropertyOrder({
  PaymentMethodConfigurationActive.JSON_PROPERTY_IMAGE_RESOURCE_PATH,
  PaymentMethodConfigurationActive.JSON_PROPERTY_SORT_ORDER,
  PaymentMethodConfigurationActive.JSON_PROPERTY_NAME,
  PaymentMethodConfigurationActive.JSON_PROPERTY_DESCRIPTION,
  PaymentMethodConfigurationActive.JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE,
  PaymentMethodConfigurationActive.JSON_PROPERTY_TITLE,
  PaymentMethodConfigurationActive.JSON_PROPERTY_VERSION,
  PaymentMethodConfigurationActive.JSON_PROPERTY_STATE
})
@JsonTypeName("PaymentMethodConfiguration.Active")

public class PaymentMethodConfigurationActive {
  public static final String JSON_PROPERTY_IMAGE_RESOURCE_PATH = "imageResourcePath";
  private String imageResourcePath;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE = "oneClickPaymentMode";
  private OneClickPaymentMode oneClickPaymentMode;

  public static final String JSON_PROPERTY_TITLE = "title";
  private Map<String, String> title = new HashMap<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public PaymentMethodConfigurationActive() {
  }

  public PaymentMethodConfigurationActive imageResourcePath(String imageResourcePath) {
    
    this.imageResourcePath = imageResourcePath;
    return this;
  }

   /**
   * The resource path to a custom image for the payment method, displayed to the customer for visual identification.
   * @return imageResourcePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageResourcePath() {
    return imageResourcePath;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageResourcePath(String imageResourcePath) {
    this.imageResourcePath = imageResourcePath;
  }

  public PaymentMethodConfigurationActive sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing payment methods, they can be sorted by this number.
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

  public PaymentMethodConfigurationActive name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the payment method configuration.
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

  public PaymentMethodConfigurationActive description(Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public PaymentMethodConfigurationActive putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * A customer-facing custom description for the payment method.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  public PaymentMethodConfigurationActive oneClickPaymentMode(OneClickPaymentMode oneClickPaymentMode) {
    
    this.oneClickPaymentMode = oneClickPaymentMode;
    return this;
  }

   /**
   * Get oneClickPaymentMode
   * @return oneClickPaymentMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneClickPaymentMode getOneClickPaymentMode() {
    return oneClickPaymentMode;
  }


  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneClickPaymentMode(OneClickPaymentMode oneClickPaymentMode) {
    this.oneClickPaymentMode = oneClickPaymentMode;
  }

  public PaymentMethodConfigurationActive title(Map<String, String> title) {
    
    this.title = title;
    return this;
  }

  public PaymentMethodConfigurationActive putTitleItem(String key, String titleItem) {
    if (this.title == null) {
      this.title = new HashMap<>();
    }
    this.title.put(key, titleItem);
    return this;
  }

   /**
   * A customer-facing custom title for the payment method.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(Map<String, String> title) {
    this.title = title;
  }

  public PaymentMethodConfigurationActive version(Integer version) {
    
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

  public PaymentMethodConfigurationActive state(CreationEntityState state) {
    
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

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(CreationEntityState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodConfigurationActive paymentMethodConfigurationActive = (PaymentMethodConfigurationActive) o;
    return Objects.equals(this.imageResourcePath, paymentMethodConfigurationActive.imageResourcePath) &&
        Objects.equals(this.sortOrder, paymentMethodConfigurationActive.sortOrder) &&
        Objects.equals(this.name, paymentMethodConfigurationActive.name) &&
        Objects.equals(this.description, paymentMethodConfigurationActive.description) &&
        Objects.equals(this.oneClickPaymentMode, paymentMethodConfigurationActive.oneClickPaymentMode) &&
        Objects.equals(this.title, paymentMethodConfigurationActive.title) &&
        Objects.equals(this.version, paymentMethodConfigurationActive.version) &&
        Objects.equals(this.state, paymentMethodConfigurationActive.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageResourcePath, sortOrder, name, description, oneClickPaymentMode, title, version, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodConfigurationActive {\n");
    sb.append("    imageResourcePath: ").append(toIndentedString(imageResourcePath)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oneClickPaymentMode: ").append(toIndentedString(oneClickPaymentMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `imageResourcePath` to the URL query string
    if (getImageResourcePath() != null) {
      try {
        joiner.add(String.format("%simageResourcePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageResourcePath()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `oneClickPaymentMode` to the URL query string
    if (getOneClickPaymentMode() != null) {
      try {
        joiner.add(String.format("%soneClickPaymentMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOneClickPaymentMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      for (String _key : getTitle().keySet()) {
        try {
          joiner.add(String.format("%stitle%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getTitle().get(_key), URLEncoder.encode(String.valueOf(getTitle().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

