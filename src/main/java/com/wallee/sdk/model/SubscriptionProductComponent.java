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
import com.wallee.sdk.model.SubscriptionProductComponentGroup;
import com.wallee.sdk.model.SubscriptionProductComponentReference;
import com.wallee.sdk.model.TaxClass;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionProductComponent
 */
@JsonPropertyOrder({
  SubscriptionProductComponent.JSON_PROPERTY_TAX_CLASS,
  SubscriptionProductComponent.JSON_PROPERTY_DESCRIPTION,
  SubscriptionProductComponent.JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT,
  SubscriptionProductComponent.JSON_PROPERTY_MAXIMAL_QUANTITY,
  SubscriptionProductComponent.JSON_PROPERTY_VERSION,
  SubscriptionProductComponent.JSON_PROPERTY_MINIMAL_QUANTITY,
  SubscriptionProductComponent.JSON_PROPERTY_REFERENCE,
  SubscriptionProductComponent.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionProductComponent.JSON_PROPERTY_QUANTITY_STEP,
  SubscriptionProductComponent.JSON_PROPERTY_SORT_ORDER,
  SubscriptionProductComponent.JSON_PROPERTY_COMPONENT_GROUP,
  SubscriptionProductComponent.JSON_PROPERTY_NAME,
  SubscriptionProductComponent.JSON_PROPERTY_ID,
  SubscriptionProductComponent.JSON_PROPERTY_DEFAULT_COMPONENT
})

public class SubscriptionProductComponent {
  public static final String JSON_PROPERTY_TAX_CLASS = "taxClass";
  private TaxClass taxClass;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT = "componentChangeWeight";
  private Integer componentChangeWeight;

  public static final String JSON_PROPERTY_MAXIMAL_QUANTITY = "maximalQuantity";
  private BigDecimal maximalQuantity;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_MINIMAL_QUANTITY = "minimalQuantity";
  private BigDecimal minimalQuantity;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private SubscriptionProductComponentReference reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_QUANTITY_STEP = "quantityStep";
  private BigDecimal quantityStep;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private Integer sortOrder;

  public static final String JSON_PROPERTY_COMPONENT_GROUP = "componentGroup";
  private SubscriptionProductComponentGroup componentGroup;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DEFAULT_COMPONENT = "defaultComponent";
  private Boolean defaultComponent;

  public SubscriptionProductComponent() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionProductComponent(
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT) Integer componentChangeWeight, 
    @JsonProperty(JSON_PROPERTY_MAXIMAL_QUANTITY) BigDecimal maximalQuantity, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_MINIMAL_QUANTITY) BigDecimal minimalQuantity, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_QUANTITY_STEP) BigDecimal quantityStep, 
    @JsonProperty(JSON_PROPERTY_SORT_ORDER) Integer sortOrder, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_COMPONENT) Boolean defaultComponent
  ) {
    this();
    this.description = description;
    this.componentChangeWeight = componentChangeWeight;
    this.maximalQuantity = maximalQuantity;
    this.version = version;
    this.minimalQuantity = minimalQuantity;
    this.linkedSpaceId = linkedSpaceId;
    this.quantityStep = quantityStep;
    this.sortOrder = sortOrder;
    this.name = name;
    this.id = id;
    this.defaultComponent = defaultComponent;
  }

  public SubscriptionProductComponent taxClass(TaxClass taxClass) {
    
    this.taxClass = taxClass;
    return this;
  }

   /**
   * Get taxClass
   * @return taxClass
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxClass getTaxClass() {
    return taxClass;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxClass(TaxClass taxClass) {
    this.taxClass = taxClass;
  }

   /**
   * The localized description of the component that is displayed to the customer.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



   /**
   * If switching from a component with a lower tier to a component with a higher one, this is considered an upgrade and a fee may be applied.
   * @return componentChangeWeight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_CHANGE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComponentChangeWeight() {
    return componentChangeWeight;
  }



   /**
   * A maximum of the defined quantity can be selected for this component.
   * @return maximalQuantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaximalQuantity() {
    return maximalQuantity;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * A minimum of the defined quantity must be selected for this component.
   * @return minimalQuantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMinimalQuantity() {
    return minimalQuantity;
  }



  public SubscriptionProductComponent reference(SubscriptionProductComponentReference reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductComponentReference getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(SubscriptionProductComponentReference reference) {
    this.reference = reference;
  }

   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



   /**
   * The quantity step determines the interval in which the quantity can be increased.
   * @return quantityStep
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantityStep() {
    return quantityStep;
  }



   /**
   * When listing components, they can be sorted by this number.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }



  public SubscriptionProductComponent componentGroup(SubscriptionProductComponentGroup componentGroup) {
    
    this.componentGroup = componentGroup;
    return this;
  }

   /**
   * Get componentGroup
   * @return componentGroup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductComponentGroup getComponentGroup() {
    return componentGroup;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentGroup(SubscriptionProductComponentGroup componentGroup) {
    this.componentGroup = componentGroup;
  }

   /**
   * The localized name of the component that is displayed to the customer.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
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
   * Whether this is the default component in its group and preselected.
   * @return defaultComponent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultComponent() {
    return defaultComponent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductComponent subscriptionProductComponent = (SubscriptionProductComponent) o;
    return Objects.equals(this.taxClass, subscriptionProductComponent.taxClass) &&
        Objects.equals(this.description, subscriptionProductComponent.description) &&
        Objects.equals(this.componentChangeWeight, subscriptionProductComponent.componentChangeWeight) &&
        Objects.equals(this.maximalQuantity, subscriptionProductComponent.maximalQuantity) &&
        Objects.equals(this.version, subscriptionProductComponent.version) &&
        Objects.equals(this.minimalQuantity, subscriptionProductComponent.minimalQuantity) &&
        Objects.equals(this.reference, subscriptionProductComponent.reference) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductComponent.linkedSpaceId) &&
        Objects.equals(this.quantityStep, subscriptionProductComponent.quantityStep) &&
        Objects.equals(this.sortOrder, subscriptionProductComponent.sortOrder) &&
        Objects.equals(this.componentGroup, subscriptionProductComponent.componentGroup) &&
        Objects.equals(this.name, subscriptionProductComponent.name) &&
        Objects.equals(this.id, subscriptionProductComponent.id) &&
        Objects.equals(this.defaultComponent, subscriptionProductComponent.defaultComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxClass, description, componentChangeWeight, maximalQuantity, version, minimalQuantity, reference, linkedSpaceId, quantityStep, sortOrder, componentGroup, name, id, defaultComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponent {\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
    sb.append("    maximalQuantity: ").append(toIndentedString(maximalQuantity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    quantityStep: ").append(toIndentedString(quantityStep)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
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

    // add `taxClass` to the URL query string
    if (getTaxClass() != null) {
      joiner.add(getTaxClass().toUrlQueryString(prefix + "taxClass" + suffix));
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

    // add `maximalQuantity` to the URL query string
    if (getMaximalQuantity() != null) {
      try {
        joiner.add(String.format("%smaximalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `minimalQuantity` to the URL query string
    if (getMinimalQuantity() != null) {
      try {
        joiner.add(String.format("%sminimalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinimalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reference` to the URL query string
    if (getReference() != null) {
      joiner.add(getReference().toUrlQueryString(prefix + "reference" + suffix));
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
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
      joiner.add(getComponentGroup().toUrlQueryString(prefix + "componentGroup" + suffix));
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

