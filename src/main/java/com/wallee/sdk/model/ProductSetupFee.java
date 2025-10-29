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
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionProductComponent;
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
 * ProductSetupFee
 */
@JsonPropertyOrder({
  ProductSetupFee.JSON_PROPERTY_LINKED_SPACE_ID,
  ProductSetupFee.JSON_PROPERTY_COMPONENT,
  ProductSetupFee.JSON_PROPERTY_NAME,
  ProductSetupFee.JSON_PROPERTY_DESCRIPTION,
  ProductSetupFee.JSON_PROPERTY_SETUP_FEE,
  ProductSetupFee.JSON_PROPERTY_ID,
  ProductSetupFee.JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT,
  ProductSetupFee.JSON_PROPERTY_TYPE,
  ProductSetupFee.JSON_PROPERTY_VERSION,
  ProductSetupFee.JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT
})

public class ProductSetupFee {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_COMPONENT = "component";
  private SubscriptionProductComponent component;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_SETUP_FEE = "setupFee";
  private Set<PersistableCurrencyAmount> setupFee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT = "onDowngradeCreditedAmount";
  private Set<PersistableCurrencyAmount> onDowngradeCreditedAmount = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductFeeType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT = "onUpgradeCreditedAmount";
  private Set<PersistableCurrencyAmount> onUpgradeCreditedAmount = new LinkedHashSet<>();

  public ProductSetupFee() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public ProductSetupFee(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_SETUP_FEE) Set<PersistableCurrencyAmount> setupFee, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT) Set<PersistableCurrencyAmount> onDowngradeCreditedAmount, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT) Set<PersistableCurrencyAmount> onUpgradeCreditedAmount
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.name = name;
    this.description = description;
    this.setupFee = setupFee;
    this.id = id;
    this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
    this.version = version;
    this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
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



  public ProductSetupFee component(SubscriptionProductComponent component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductComponent getComponent() {
    return component;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponent(SubscriptionProductComponent component) {
    this.component = component;
  }

   /**
   * The localized name of the fee that is displayed to the customer.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



   /**
   * The localized description of the fee that is displayed to the customer.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



   /**
   * The amount charged to the customer once when they subscribe to a subscription.
   * @return setupFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETUP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmount> getSetupFee() {
    return setupFee;
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
   * The amount charged to the customer when a subscription is downgraded.
   * @return onDowngradeCreditedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmount> getOnDowngradeCreditedAmount() {
    return onDowngradeCreditedAmount;
  }



  public ProductSetupFee type(ProductFeeType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFeeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ProductFeeType type) {
    this.type = type;
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
   * The amount charged to the customer when a subscription is upgraded.
   * @return onUpgradeCreditedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmount> getOnUpgradeCreditedAmount() {
    return onUpgradeCreditedAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSetupFee productSetupFee = (ProductSetupFee) o;
    return Objects.equals(this.linkedSpaceId, productSetupFee.linkedSpaceId) &&
        Objects.equals(this.component, productSetupFee.component) &&
        Objects.equals(this.name, productSetupFee.name) &&
        Objects.equals(this.description, productSetupFee.description) &&
        Objects.equals(this.setupFee, productSetupFee.setupFee) &&
        Objects.equals(this.id, productSetupFee.id) &&
        Objects.equals(this.onDowngradeCreditedAmount, productSetupFee.onDowngradeCreditedAmount) &&
        Objects.equals(this.type, productSetupFee.type) &&
        Objects.equals(this.version, productSetupFee.version) &&
        Objects.equals(this.onUpgradeCreditedAmount, productSetupFee.onUpgradeCreditedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, component, name, description, setupFee, id, onDowngradeCreditedAmount, type, version, onUpgradeCreditedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetupFee {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onDowngradeCreditedAmount: ").append(toIndentedString(onDowngradeCreditedAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    onUpgradeCreditedAmount: ").append(toIndentedString(onUpgradeCreditedAmount)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `component` to the URL query string
    if (getComponent() != null) {
      joiner.add(getComponent().toUrlQueryString(prefix + "component" + suffix));
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

    // add `setupFee` to the URL query string
    if (getSetupFee() != null) {
      int i = 0;
      for (PersistableCurrencyAmount _item : getSetupFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssetupFee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `onDowngradeCreditedAmount` to the URL query string
    if (getOnDowngradeCreditedAmount() != null) {
      int i = 0;
      for (PersistableCurrencyAmount _item : getOnDowngradeCreditedAmount()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sonDowngradeCreditedAmount%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `onUpgradeCreditedAmount` to the URL query string
    if (getOnUpgradeCreditedAmount() != null) {
      int i = 0;
      for (PersistableCurrencyAmount _item : getOnUpgradeCreditedAmount()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sonUpgradeCreditedAmount%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

