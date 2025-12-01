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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionProductComponentUpdate
 */
@JsonPropertyOrder({
  SubscriptionProductComponentUpdate.JSON_PROPERTY_REFERENCE,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_TAX_CLASS,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_QUANTITY_STEP,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_SORT_ORDER,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_COMPONENT_GROUP,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_NAME,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_DESCRIPTION,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_VERSION,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_MAXIMAL_QUANTITY,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_DEFAULT_COMPONENT,
  SubscriptionProductComponentUpdate.JSON_PROPERTY_MINIMAL_QUANTITY
})
@JsonTypeName("SubscriptionProductComponent.Update")

public class SubscriptionProductComponentUpdate {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private Long reference;

  public static final String JSON_PROPERTY_TAX_CLASS = "taxClass";
  @javax.annotation.Nullable
  private Long taxClass;

  public static final String JSON_PROPERTY_QUANTITY_STEP = "quantityStep";
  @javax.annotation.Nullable
  private BigDecimal quantityStep;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable
  private Integer sortOrder;

  public static final String JSON_PROPERTY_COMPONENT_GROUP = "componentGroup";
  @javax.annotation.Nullable
  private Long componentGroup;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT = "componentChangeWeight";
  @javax.annotation.Nullable
  private Integer componentChangeWeight;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_MAXIMAL_QUANTITY = "maximalQuantity";
  @javax.annotation.Nullable
  private BigDecimal maximalQuantity;

  public static final String JSON_PROPERTY_DEFAULT_COMPONENT = "defaultComponent";
  @javax.annotation.Nullable
  private Boolean defaultComponent;

  public static final String JSON_PROPERTY_MINIMAL_QUANTITY = "minimalQuantity";
  @javax.annotation.Nullable
  private BigDecimal minimalQuantity;

  public SubscriptionProductComponentUpdate() {
  }

  public SubscriptionProductComponentUpdate reference(@javax.annotation.Nullable Long reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * The reference is used to link components across different product versions.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(@javax.annotation.Nullable Long reference) {
    this.reference = reference;
  }

  public SubscriptionProductComponentUpdate taxClass(@javax.annotation.Nullable Long taxClass) {
    
    this.taxClass = taxClass;
    return this;
  }

  /**
   * The tax class to be applied to fees.
   * @return taxClass
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTaxClass() {
    return taxClass;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxClass(@javax.annotation.Nullable Long taxClass) {
    this.taxClass = taxClass;
  }

  public SubscriptionProductComponentUpdate quantityStep(@javax.annotation.Nullable BigDecimal quantityStep) {
    
    this.quantityStep = quantityStep;
    return this;
  }

  /**
   * The quantity step determines the interval in which the quantity can be increased.
   * @return quantityStep
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantityStep() {
    return quantityStep;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantityStep(@javax.annotation.Nullable BigDecimal quantityStep) {
    this.quantityStep = quantityStep;
  }

  public SubscriptionProductComponentUpdate sortOrder(@javax.annotation.Nullable Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * When listing components, they can be sorted by this number.
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

  public SubscriptionProductComponentUpdate componentGroup(@javax.annotation.Nullable Long componentGroup) {
    
    this.componentGroup = componentGroup;
    return this;
  }

  /**
   * The group that the component belongs to.
   * @return componentGroup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getComponentGroup() {
    return componentGroup;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentGroup(@javax.annotation.Nullable Long componentGroup) {
    this.componentGroup = componentGroup;
  }

  public SubscriptionProductComponentUpdate name(@javax.annotation.Nullable Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public SubscriptionProductComponentUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

  /**
   * The localized name of the component that is displayed to the customer.
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

  public SubscriptionProductComponentUpdate description(@javax.annotation.Nullable Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public SubscriptionProductComponentUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

  /**
   * The localized description of the component that is displayed to the customer.
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

  public SubscriptionProductComponentUpdate componentChangeWeight(@javax.annotation.Nullable Integer componentChangeWeight) {
    
    this.componentChangeWeight = componentChangeWeight;
    return this;
  }

  /**
   * If switching from a component with a lower tier to a component with a higher one, this is considered an upgrade and a fee may be applied.
   * @return componentChangeWeight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComponentChangeWeight() {
    return componentChangeWeight;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentChangeWeight(@javax.annotation.Nullable Integer componentChangeWeight) {
    this.componentChangeWeight = componentChangeWeight;
  }

  public SubscriptionProductComponentUpdate version(@javax.annotation.Nonnull Integer version) {
    
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

  public SubscriptionProductComponentUpdate maximalQuantity(@javax.annotation.Nullable BigDecimal maximalQuantity) {
    
    this.maximalQuantity = maximalQuantity;
    return this;
  }

  /**
   * A maximum of the defined quantity can be selected for this component.
   * @return maximalQuantity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaximalQuantity() {
    return maximalQuantity;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximalQuantity(@javax.annotation.Nullable BigDecimal maximalQuantity) {
    this.maximalQuantity = maximalQuantity;
  }

  public SubscriptionProductComponentUpdate defaultComponent(@javax.annotation.Nullable Boolean defaultComponent) {
    
    this.defaultComponent = defaultComponent;
    return this;
  }

  /**
   * Whether this is the default component in its group and preselected.
   * @return defaultComponent
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultComponent() {
    return defaultComponent;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultComponent(@javax.annotation.Nullable Boolean defaultComponent) {
    this.defaultComponent = defaultComponent;
  }

  public SubscriptionProductComponentUpdate minimalQuantity(@javax.annotation.Nullable BigDecimal minimalQuantity) {
    
    this.minimalQuantity = minimalQuantity;
    return this;
  }

  /**
   * A minimum of the defined quantity must be selected for this component.
   * @return minimalQuantity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMinimalQuantity() {
    return minimalQuantity;
  }


  @JsonProperty(JSON_PROPERTY_MINIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimalQuantity(@javax.annotation.Nullable BigDecimal minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductComponentUpdate subscriptionProductComponentUpdate = (SubscriptionProductComponentUpdate) o;
    return Objects.equals(this.reference, subscriptionProductComponentUpdate.reference) &&
        Objects.equals(this.taxClass, subscriptionProductComponentUpdate.taxClass) &&
        Objects.equals(this.quantityStep, subscriptionProductComponentUpdate.quantityStep) &&
        Objects.equals(this.sortOrder, subscriptionProductComponentUpdate.sortOrder) &&
        Objects.equals(this.componentGroup, subscriptionProductComponentUpdate.componentGroup) &&
        Objects.equals(this.name, subscriptionProductComponentUpdate.name) &&
        Objects.equals(this.description, subscriptionProductComponentUpdate.description) &&
        Objects.equals(this.componentChangeWeight, subscriptionProductComponentUpdate.componentChangeWeight) &&
        Objects.equals(this.version, subscriptionProductComponentUpdate.version) &&
        Objects.equals(this.maximalQuantity, subscriptionProductComponentUpdate.maximalQuantity) &&
        Objects.equals(this.defaultComponent, subscriptionProductComponentUpdate.defaultComponent) &&
        Objects.equals(this.minimalQuantity, subscriptionProductComponentUpdate.minimalQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, taxClass, quantityStep, sortOrder, componentGroup, name, description, componentChangeWeight, version, maximalQuantity, defaultComponent, minimalQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponentUpdate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    quantityStep: ").append(toIndentedString(quantityStep)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maximalQuantity: ").append(toIndentedString(maximalQuantity)).append("\n");
    sb.append("    defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxClass` to the URL query string
    if (getTaxClass() != null) {
      try {
        joiner.add(String.format("%staxClass%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxClass()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantityStep` to the URL query string
    if (getQuantityStep() != null) {
      try {
        joiner.add(String.format("%squantityStep%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantityStep()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `componentGroup` to the URL query string
    if (getComponentGroup() != null) {
      try {
        joiner.add(String.format("%scomponentGroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponentGroup()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `componentChangeWeight` to the URL query string
    if (getComponentChangeWeight() != null) {
      try {
        joiner.add(String.format("%scomponentChangeWeight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponentChangeWeight()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `maximalQuantity` to the URL query string
    if (getMaximalQuantity() != null) {
      try {
        joiner.add(String.format("%smaximalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultComponent` to the URL query string
    if (getDefaultComponent() != null) {
      try {
        joiner.add(String.format("%sdefaultComponent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultComponent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `minimalQuantity` to the URL query string
    if (getMinimalQuantity() != null) {
      try {
        joiner.add(String.format("%sminimalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinimalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

