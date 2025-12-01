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
 * ProductPeriodFeeUpdate
 */
@JsonPropertyOrder({
  ProductPeriodFeeUpdate.JSON_PROPERTY_PERIOD_FEE,
  ProductPeriodFeeUpdate.JSON_PROPERTY_COMPONENT,
  ProductPeriodFeeUpdate.JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS,
  ProductPeriodFeeUpdate.JSON_PROPERTY_NAME,
  ProductPeriodFeeUpdate.JSON_PROPERTY_DESCRIPTION,
  ProductPeriodFeeUpdate.JSON_PROPERTY_VERSION,
  ProductPeriodFeeUpdate.JSON_PROPERTY_LEDGER_ENTRY_TITLE
})
@JsonTypeName("ProductPeriodFee.Update")

public class ProductPeriodFeeUpdate {
  public static final String JSON_PROPERTY_PERIOD_FEE = "periodFee";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmountUpdate> periodFee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_COMPONENT = "component";
  @javax.annotation.Nullable
  private Long component;

  public static final String JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS = "numberOfFreeTrialPeriods";
  @javax.annotation.Nullable
  private Integer numberOfFreeTrialPeriods;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_LEDGER_ENTRY_TITLE = "ledgerEntryTitle";
  @javax.annotation.Nullable
  private Map<String, String> ledgerEntryTitle = new HashMap<>();

  public ProductPeriodFeeUpdate() {
  }

  public ProductPeriodFeeUpdate periodFee(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> periodFee) {
    
    this.periodFee = periodFee;
    return this;
  }

  public ProductPeriodFeeUpdate addPeriodFeeItem(PersistableCurrencyAmountUpdate periodFeeItem) {
    if (this.periodFee == null) {
      this.periodFee = new LinkedHashSet<>();
    }
    this.periodFee.add(periodFeeItem);
    return this;
  }

  /**
   * The amount charged to the customer for each billing cycle during the term of a subscription.
   * @return periodFee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmountUpdate> getPeriodFee() {
    return periodFee;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PERIOD_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodFee(@javax.annotation.Nullable Set<PersistableCurrencyAmountUpdate> periodFee) {
    this.periodFee = periodFee;
  }

  public ProductPeriodFeeUpdate component(@javax.annotation.Nullable Long component) {
    
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

  public ProductPeriodFeeUpdate numberOfFreeTrialPeriods(@javax.annotation.Nullable Integer numberOfFreeTrialPeriods) {
    
    this.numberOfFreeTrialPeriods = numberOfFreeTrialPeriods;
    return this;
  }

  /**
   * The number of subscription billing cycles that count as a trial phase and during which no fees are charged.
   * @return numberOfFreeTrialPeriods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfFreeTrialPeriods() {
    return numberOfFreeTrialPeriods;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfFreeTrialPeriods(@javax.annotation.Nullable Integer numberOfFreeTrialPeriods) {
    this.numberOfFreeTrialPeriods = numberOfFreeTrialPeriods;
  }

  public ProductPeriodFeeUpdate name(@javax.annotation.Nullable Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public ProductPeriodFeeUpdate putNameItem(String key, String nameItem) {
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

  public ProductPeriodFeeUpdate description(@javax.annotation.Nullable Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public ProductPeriodFeeUpdate putDescriptionItem(String key, String descriptionItem) {
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

  public ProductPeriodFeeUpdate version(@javax.annotation.Nonnull Integer version) {
    
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

  public ProductPeriodFeeUpdate ledgerEntryTitle(@javax.annotation.Nullable Map<String, String> ledgerEntryTitle) {
    
    this.ledgerEntryTitle = ledgerEntryTitle;
    return this;
  }

  public ProductPeriodFeeUpdate putLedgerEntryTitleItem(String key, String ledgerEntryTitleItem) {
    if (this.ledgerEntryTitle == null) {
      this.ledgerEntryTitle = new HashMap<>();
    }
    this.ledgerEntryTitle.put(key, ledgerEntryTitleItem);
    return this;
  }

  /**
   * The localized title that be used on ledger entries and invoices.
   * @return ledgerEntryTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEDGER_ENTRY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getLedgerEntryTitle() {
    return ledgerEntryTitle;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_ENTRY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLedgerEntryTitle(@javax.annotation.Nullable Map<String, String> ledgerEntryTitle) {
    this.ledgerEntryTitle = ledgerEntryTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPeriodFeeUpdate productPeriodFeeUpdate = (ProductPeriodFeeUpdate) o;
    return Objects.equals(this.periodFee, productPeriodFeeUpdate.periodFee) &&
        Objects.equals(this.component, productPeriodFeeUpdate.component) &&
        Objects.equals(this.numberOfFreeTrialPeriods, productPeriodFeeUpdate.numberOfFreeTrialPeriods) &&
        Objects.equals(this.name, productPeriodFeeUpdate.name) &&
        Objects.equals(this.description, productPeriodFeeUpdate.description) &&
        Objects.equals(this.version, productPeriodFeeUpdate.version) &&
        Objects.equals(this.ledgerEntryTitle, productPeriodFeeUpdate.ledgerEntryTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodFee, component, numberOfFreeTrialPeriods, name, description, version, ledgerEntryTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPeriodFeeUpdate {\n");
    sb.append("    periodFee: ").append(toIndentedString(periodFee)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    numberOfFreeTrialPeriods: ").append(toIndentedString(numberOfFreeTrialPeriods)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ledgerEntryTitle: ").append(toIndentedString(ledgerEntryTitle)).append("\n");
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

    // add `periodFee` to the URL query string
    if (getPeriodFee() != null) {
      int i = 0;
      for (PersistableCurrencyAmountUpdate _item : getPeriodFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%speriodFee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `component` to the URL query string
    if (getComponent() != null) {
      try {
        joiner.add(String.format("%scomponent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `numberOfFreeTrialPeriods` to the URL query string
    if (getNumberOfFreeTrialPeriods() != null) {
      try {
        joiner.add(String.format("%snumberOfFreeTrialPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfFreeTrialPeriods()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `ledgerEntryTitle` to the URL query string
    if (getLedgerEntryTitle() != null) {
      for (String _key : getLedgerEntryTitle().keySet()) {
        try {
          joiner.add(String.format("%sledgerEntryTitle%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getLedgerEntryTitle().get(_key), URLEncoder.encode(String.valueOf(getLedgerEntryTitle().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

