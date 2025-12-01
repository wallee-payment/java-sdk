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
import com.wallee.sdk.model.PersistableCurrencyAmountUpdate;
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
 * ProductSetupFeeUpdate
 */
@JsonPropertyOrder({
  ProductSetupFeeUpdate.JSON_PROPERTY_COMPONENT,
  ProductSetupFeeUpdate.JSON_PROPERTY_NAME,
  ProductSetupFeeUpdate.JSON_PROPERTY_DESCRIPTION,
  ProductSetupFeeUpdate.JSON_PROPERTY_SETUP_FEE,
  ProductSetupFeeUpdate.JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT,
  ProductSetupFeeUpdate.JSON_PROPERTY_VERSION,
  ProductSetupFeeUpdate.JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT
})
@JsonTypeName("ProductSetupFee.Update")

public class ProductSetupFeeUpdate {
  public static final String JSON_PROPERTY_COMPONENT = "component";
  @javax.annotation.Nullable
  private Long component;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_SETUP_FEE = "setupFee";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmountUpdate> setupFee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT = "onDowngradeCreditedAmount";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT = "onUpgradeCreditedAmount";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount = new LinkedHashSet<>();

  public ProductSetupFeeUpdate() {
  }

  public ProductSetupFeeUpdate component(@javax.annotation.Nullable Long component) {
    
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

  public ProductSetupFeeUpdate name(@javax.annotation.Nullable Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public ProductSetupFeeUpdate putNameItem(String key, String nameItem) {
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

  public ProductSetupFeeUpdate description(@javax.annotation.Nullable Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public ProductSetupFeeUpdate putDescriptionItem(String key, String descriptionItem) {
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

  public ProductSetupFeeUpdate setupFee(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> setupFee) {
    
    this.setupFee = setupFee;
    return this;
  }

  public ProductSetupFeeUpdate addSetupFeeItem(PersistableCurrencyAmountUpdate setupFeeItem) {
    if (this.setupFee == null) {
      this.setupFee = new LinkedHashSet<>();
    }
    this.setupFee.add(setupFeeItem);
    return this;
  }

  /**
   * The amount charged to the customer once when they subscribe to a subscription.
   * @return setupFee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETUP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmountUpdate> getSetupFee() {
    return setupFee;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SETUP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetupFee(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> setupFee) {
    this.setupFee = setupFee;
  }

  public ProductSetupFeeUpdate onDowngradeCreditedAmount(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
    
    this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
    return this;
  }

  public ProductSetupFeeUpdate addOnDowngradeCreditedAmountItem(PersistableCurrencyAmountUpdate onDowngradeCreditedAmountItem) {
    if (this.onDowngradeCreditedAmount == null) {
      this.onDowngradeCreditedAmount = new LinkedHashSet<>();
    }
    this.onDowngradeCreditedAmount.add(onDowngradeCreditedAmountItem);
    return this;
  }

  /**
   * The amount charged to the customer when a subscription is downgraded.
   * @return onDowngradeCreditedAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmountUpdate> getOnDowngradeCreditedAmount() {
    return onDowngradeCreditedAmount;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ON_DOWNGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnDowngradeCreditedAmount(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
    this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
  }

  public ProductSetupFeeUpdate version(@javax.annotation.Nonnull Integer version) {
    
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

  public ProductSetupFeeUpdate onUpgradeCreditedAmount(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
    
    this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
    return this;
  }

  public ProductSetupFeeUpdate addOnUpgradeCreditedAmountItem(PersistableCurrencyAmountUpdate onUpgradeCreditedAmountItem) {
    if (this.onUpgradeCreditedAmount == null) {
      this.onUpgradeCreditedAmount = new LinkedHashSet<>();
    }
    this.onUpgradeCreditedAmount.add(onUpgradeCreditedAmountItem);
    return this;
  }

  /**
   * The amount charged to the customer when a subscription is upgraded.
   * @return onUpgradeCreditedAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmountUpdate> getOnUpgradeCreditedAmount() {
    return onUpgradeCreditedAmount;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ON_UPGRADE_CREDITED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnUpgradeCreditedAmount(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
    this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSetupFeeUpdate productSetupFeeUpdate = (ProductSetupFeeUpdate) o;
    return Objects.equals(this.component, productSetupFeeUpdate.component) &&
        Objects.equals(this.name, productSetupFeeUpdate.name) &&
        Objects.equals(this.description, productSetupFeeUpdate.description) &&
        Objects.equals(this.setupFee, productSetupFeeUpdate.setupFee) &&
        Objects.equals(this.onDowngradeCreditedAmount, productSetupFeeUpdate.onDowngradeCreditedAmount) &&
        Objects.equals(this.version, productSetupFeeUpdate.version) &&
        Objects.equals(this.onUpgradeCreditedAmount, productSetupFeeUpdate.onUpgradeCreditedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, name, description, setupFee, onDowngradeCreditedAmount, version, onUpgradeCreditedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetupFeeUpdate {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
    sb.append("    onDowngradeCreditedAmount: ").append(toIndentedString(onDowngradeCreditedAmount)).append("\n");
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

    // add `component` to the URL query string
    if (getComponent() != null) {
      try {
        joiner.add(String.format("%scomponent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponent()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `setupFee` to the URL query string
    if (getSetupFee() != null) {
      int i = 0;
      for (PersistableCurrencyAmountUpdate _item : getSetupFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssetupFee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `onDowngradeCreditedAmount` to the URL query string
    if (getOnDowngradeCreditedAmount() != null) {
      int i = 0;
      for (PersistableCurrencyAmountUpdate _item : getOnDowngradeCreditedAmount()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sonDowngradeCreditedAmount%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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
      for (PersistableCurrencyAmountUpdate _item : getOnUpgradeCreditedAmount()) {
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

