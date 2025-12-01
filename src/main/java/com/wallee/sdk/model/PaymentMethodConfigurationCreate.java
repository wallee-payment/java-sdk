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
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.OneClickPaymentMode;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentMethodConfigurationCreate
 */
@JsonPropertyOrder({
  PaymentMethodConfigurationCreate.JSON_PROPERTY_IMAGE_RESOURCE_PATH,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_SORT_ORDER,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_NAME,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_DESCRIPTION,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_TITLE,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_DATA_COLLECTION_TYPE,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentMethodConfigurationCreate.JSON_PROPERTY_STATE
})
@JsonTypeName("PaymentMethodConfiguration.Create")

public class PaymentMethodConfigurationCreate {
  public static final String JSON_PROPERTY_IMAGE_RESOURCE_PATH = "imageResourcePath";
  @javax.annotation.Nullable
  private String imageResourcePath;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE = "oneClickPaymentMode";
  @javax.annotation.Nullable
  private OneClickPaymentMode oneClickPaymentMode;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private Map<String, String> title = new HashMap<>();

  public static final String JSON_PROPERTY_DATA_COLLECTION_TYPE = "dataCollectionType";
  @javax.annotation.Nonnull
  private DataCollectionType dataCollectionType;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  @javax.annotation.Nonnull
  private Long paymentMethod;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nonnull
  private CreationEntityState state;

  public PaymentMethodConfigurationCreate() {
  }

  public PaymentMethodConfigurationCreate imageResourcePath(@javax.annotation.Nullable String imageResourcePath) {
    
    this.imageResourcePath = imageResourcePath;
    return this;
  }

  /**
   * The resource path to a custom image for the payment method, displayed to the customer for visual identification.
   * @return imageResourcePath
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageResourcePath() {
    return imageResourcePath;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageResourcePath(@javax.annotation.Nullable String imageResourcePath) {
    this.imageResourcePath = imageResourcePath;
  }

  public PaymentMethodConfigurationCreate sortOrder(@javax.annotation.Nullable Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * When listing payment methods, they can be sorted by this number.
   * @return sortOrder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(@javax.annotation.Nullable Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public PaymentMethodConfigurationCreate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the payment method configuration.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public PaymentMethodConfigurationCreate description(@javax.annotation.Nullable Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public PaymentMethodConfigurationCreate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

  /**
   * A customer-facing custom description for the payment method.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable Map<String, String> description) {
    this.description = description;
  }

  public PaymentMethodConfigurationCreate oneClickPaymentMode(@javax.annotation.Nullable OneClickPaymentMode oneClickPaymentMode) {
    
    this.oneClickPaymentMode = oneClickPaymentMode;
    return this;
  }

  /**
   * Get oneClickPaymentMode
   * @return oneClickPaymentMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneClickPaymentMode getOneClickPaymentMode() {
    return oneClickPaymentMode;
  }


  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneClickPaymentMode(@javax.annotation.Nullable OneClickPaymentMode oneClickPaymentMode) {
    this.oneClickPaymentMode = oneClickPaymentMode;
  }

  public PaymentMethodConfigurationCreate title(@javax.annotation.Nullable Map<String, String> title) {
    
    this.title = title;
    return this;
  }

  public PaymentMethodConfigurationCreate putTitleItem(String key, String titleItem) {
    if (this.title == null) {
      this.title = new HashMap<>();
    }
    this.title.put(key, titleItem);
    return this;
  }

  /**
   * A customer-facing custom title for the payment method.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable Map<String, String> title) {
    this.title = title;
  }

  public PaymentMethodConfigurationCreate dataCollectionType(@javax.annotation.Nonnull DataCollectionType dataCollectionType) {
    
    this.dataCollectionType = dataCollectionType;
    return this;
  }

  /**
   * Get dataCollectionType
   * @return dataCollectionType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataCollectionType(@javax.annotation.Nonnull DataCollectionType dataCollectionType) {
    this.dataCollectionType = dataCollectionType;
  }

  public PaymentMethodConfigurationCreate paymentMethod(@javax.annotation.Nonnull Long paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method that the configuration is for.
   * @return paymentMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(@javax.annotation.Nonnull Long paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentMethodConfigurationCreate state(@javax.annotation.Nonnull CreationEntityState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(@javax.annotation.Nonnull CreationEntityState state) {
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
    PaymentMethodConfigurationCreate paymentMethodConfigurationCreate = (PaymentMethodConfigurationCreate) o;
    return Objects.equals(this.imageResourcePath, paymentMethodConfigurationCreate.imageResourcePath) &&
        Objects.equals(this.sortOrder, paymentMethodConfigurationCreate.sortOrder) &&
        Objects.equals(this.name, paymentMethodConfigurationCreate.name) &&
        Objects.equals(this.description, paymentMethodConfigurationCreate.description) &&
        Objects.equals(this.oneClickPaymentMode, paymentMethodConfigurationCreate.oneClickPaymentMode) &&
        Objects.equals(this.title, paymentMethodConfigurationCreate.title) &&
        Objects.equals(this.dataCollectionType, paymentMethodConfigurationCreate.dataCollectionType) &&
        Objects.equals(this.paymentMethod, paymentMethodConfigurationCreate.paymentMethod) &&
        Objects.equals(this.state, paymentMethodConfigurationCreate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageResourcePath, sortOrder, name, description, oneClickPaymentMode, title, dataCollectionType, paymentMethod, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodConfigurationCreate {\n");
    sb.append("    imageResourcePath: ").append(toIndentedString(imageResourcePath)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oneClickPaymentMode: ").append(toIndentedString(oneClickPaymentMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

    // add `dataCollectionType` to the URL query string
    if (getDataCollectionType() != null) {
      try {
        joiner.add(String.format("%sdataCollectionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataCollectionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

