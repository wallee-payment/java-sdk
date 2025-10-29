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
 * SubscriptionProductComponentGroupUpdate
 */
@JsonPropertyOrder({
  SubscriptionProductComponentGroupUpdate.JSON_PROPERTY_PRODUCT_VERSION,
  SubscriptionProductComponentGroupUpdate.JSON_PROPERTY_SORT_ORDER,
  SubscriptionProductComponentGroupUpdate.JSON_PROPERTY_NAME,
  SubscriptionProductComponentGroupUpdate.JSON_PROPERTY_OPTIONAL,
  SubscriptionProductComponentGroupUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("SubscriptionProductComponentGroup.Update")

public class SubscriptionProductComponentGroupUpdate {
  public static final String JSON_PROPERTY_PRODUCT_VERSION = "productVersion";
  private Long productVersion;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_OPTIONAL = "optional";
  private Boolean optional;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SubscriptionProductComponentGroupUpdate() {
  }

  public SubscriptionProductComponentGroupUpdate productVersion(Long productVersion) {
    
    this.productVersion = productVersion;
    return this;
  }

   /**
   * The product version that the component group belongs to.
   * @return productVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProductVersion() {
    return productVersion;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductVersion(Long productVersion) {
    this.productVersion = productVersion;
  }

  public SubscriptionProductComponentGroupUpdate sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing component groups, they can be sorted by this number.
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

  public SubscriptionProductComponentGroupUpdate name(Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public SubscriptionProductComponentGroupUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the component group that is displayed to the customer.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Map<String, String> name) {
    this.name = name;
  }

  public SubscriptionProductComponentGroupUpdate optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Whether the component group is optional, i.e. the customer does not have to select any component.
   * @return optional
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOptional() {
    return optional;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public SubscriptionProductComponentGroupUpdate version(Integer version) {
    
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
    SubscriptionProductComponentGroupUpdate subscriptionProductComponentGroupUpdate = (SubscriptionProductComponentGroupUpdate) o;
    return Objects.equals(this.productVersion, subscriptionProductComponentGroupUpdate.productVersion) &&
        Objects.equals(this.sortOrder, subscriptionProductComponentGroupUpdate.sortOrder) &&
        Objects.equals(this.name, subscriptionProductComponentGroupUpdate.name) &&
        Objects.equals(this.optional, subscriptionProductComponentGroupUpdate.optional) &&
        Objects.equals(this.version, subscriptionProductComponentGroupUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVersion, sortOrder, name, optional, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponentGroupUpdate {\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

    // add `productVersion` to the URL query string
    if (getProductVersion() != null) {
      try {
        joiner.add(String.format("%sproductVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductVersion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `optional` to the URL query string
    if (getOptional() != null) {
      try {
        joiner.add(String.format("%soptional%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOptional()), "UTF-8").replaceAll("\\+", "%20")));
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

