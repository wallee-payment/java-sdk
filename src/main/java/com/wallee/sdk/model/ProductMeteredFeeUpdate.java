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
import com.wallee.sdk.model.ProductMeteredTierPricing;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProductMeteredFeeUpdate
 */
@JsonPropertyOrder({
  ProductMeteredFeeUpdate.JSON_PROPERTY_COMPONENT,
  ProductMeteredFeeUpdate.JSON_PROPERTY_TIER_PRICING,
  ProductMeteredFeeUpdate.JSON_PROPERTY_METRIC,
  ProductMeteredFeeUpdate.JSON_PROPERTY_NAME,
  ProductMeteredFeeUpdate.JSON_PROPERTY_DESCRIPTION,
  ProductMeteredFeeUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("ProductMeteredFee.Update")

public class ProductMeteredFeeUpdate {
  public static final String JSON_PROPERTY_COMPONENT = "component";
  @javax.annotation.Nullable
  private Long component;

  public static final String JSON_PROPERTY_TIER_PRICING = "tierPricing";
  @javax.annotation.Nullable
  private ProductMeteredTierPricing tierPricing;

  public static final String JSON_PROPERTY_METRIC = "metric";
  @javax.annotation.Nullable
  private Long metric;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public ProductMeteredFeeUpdate() {
  }

  public ProductMeteredFeeUpdate component(@javax.annotation.Nullable Long component) {
    
    this.component = component;
    return this;
  }

  /**
   * The product component that the fee belongs to.
   * @return component
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getComponent() {
    return component;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponent(@javax.annotation.Nullable Long component) {
    this.component = component;
  }

  public ProductMeteredFeeUpdate tierPricing(@javax.annotation.Nullable ProductMeteredTierPricing tierPricing) {
    
    this.tierPricing = tierPricing;
    return this;
  }

  /**
   * Get tierPricing
   * @return tierPricing
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIER_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductMeteredTierPricing getTierPricing() {
    return tierPricing;
  }


  @JsonProperty(JSON_PROPERTY_TIER_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTierPricing(@javax.annotation.Nullable ProductMeteredTierPricing tierPricing) {
    this.tierPricing = tierPricing;
  }

  public ProductMeteredFeeUpdate metric(@javax.annotation.Nullable Long metric) {
    
    this.metric = metric;
    return this;
  }

  /**
   * The metric used to determine the resource consumption billed to the customer.
   * @return metric
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(@javax.annotation.Nullable Long metric) {
    this.metric = metric;
  }

  public ProductMeteredFeeUpdate name(@javax.annotation.Nullable Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public ProductMeteredFeeUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

  /**
   * The localized name of the fee that is displayed to the customer.
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

  public ProductMeteredFeeUpdate description(@javax.annotation.Nullable Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public ProductMeteredFeeUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

  /**
   * The localized description of the fee that is displayed to the customer.
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

  public ProductMeteredFeeUpdate version(@javax.annotation.Nonnull Integer version) {
    
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
    ProductMeteredFeeUpdate productMeteredFeeUpdate = (ProductMeteredFeeUpdate) o;
    return Objects.equals(this.component, productMeteredFeeUpdate.component) &&
        Objects.equals(this.tierPricing, productMeteredFeeUpdate.tierPricing) &&
        Objects.equals(this.metric, productMeteredFeeUpdate.metric) &&
        Objects.equals(this.name, productMeteredFeeUpdate.name) &&
        Objects.equals(this.description, productMeteredFeeUpdate.description) &&
        Objects.equals(this.version, productMeteredFeeUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, tierPricing, metric, name, description, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredFeeUpdate {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `component` to the URL query string
    if (getComponent() != null) {
      try {
        joiner.add(String.format("%scomponent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tierPricing` to the URL query string
    if (getTierPricing() != null) {
      try {
        joiner.add(String.format("%stierPricing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTierPricing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metric` to the URL query string
    if (getMetric() != null) {
      try {
        joiner.add(String.format("%smetric%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetric()), "UTF-8").replaceAll("\\+", "%20")));
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

