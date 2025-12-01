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
 * ProductPeriodFee
 */
@JsonPropertyOrder({
  ProductPeriodFee.JSON_PROPERTY_PERIOD_FEE,
  ProductPeriodFee.JSON_PROPERTY_LINKED_SPACE_ID,
  ProductPeriodFee.JSON_PROPERTY_COMPONENT,
  ProductPeriodFee.JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS,
  ProductPeriodFee.JSON_PROPERTY_NAME,
  ProductPeriodFee.JSON_PROPERTY_DESCRIPTION,
  ProductPeriodFee.JSON_PROPERTY_ID,
  ProductPeriodFee.JSON_PROPERTY_TYPE,
  ProductPeriodFee.JSON_PROPERTY_VERSION,
  ProductPeriodFee.JSON_PROPERTY_LEDGER_ENTRY_TITLE
})

public class ProductPeriodFee {
  public static final String JSON_PROPERTY_PERIOD_FEE = "periodFee";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmount> periodFee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_COMPONENT = "component";
  @javax.annotation.Nullable
  private SubscriptionProductComponent component;

  public static final String JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS = "numberOfFreeTrialPeriods";
  @javax.annotation.Nullable
  private Integer numberOfFreeTrialPeriods;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ProductFeeType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LEDGER_ENTRY_TITLE = "ledgerEntryTitle";
  @javax.annotation.Nullable
  private Map<String, String> ledgerEntryTitle = new HashMap<>();

  public ProductPeriodFee() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ProductPeriodFee(
    @JsonProperty(JSON_PROPERTY_PERIOD_FEE) Set<PersistableCurrencyAmount> periodFee, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_FREE_TRIAL_PERIODS) Integer numberOfFreeTrialPeriods, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LEDGER_ENTRY_TITLE) Map<String, String> ledgerEntryTitle
  ) {
    this();
    this.periodFee = periodFee;
    this.linkedSpaceId = linkedSpaceId;
    this.numberOfFreeTrialPeriods = numberOfFreeTrialPeriods;
    this.name = name;
    this.description = description;
    this.id = id;
    this.version = version;
    this.ledgerEntryTitle = ledgerEntryTitle;
  }

  /**
   * The amount charged to the customer for each billing cycle during the term of a subscription.
   * @return periodFee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmount> getPeriodFee() {
    return periodFee;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public ProductPeriodFee component(@javax.annotation.Nullable SubscriptionProductComponent component) {
    
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductComponent getComponent() {
    return component;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponent(@javax.annotation.Nullable SubscriptionProductComponent component) {
    this.component = component;
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



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ProductPeriodFee type(@javax.annotation.Nullable ProductFeeType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFeeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ProductFeeType type) {
    this.type = type;
  }

  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPeriodFee productPeriodFee = (ProductPeriodFee) o;
    return Objects.equals(this.periodFee, productPeriodFee.periodFee) &&
        Objects.equals(this.linkedSpaceId, productPeriodFee.linkedSpaceId) &&
        Objects.equals(this.component, productPeriodFee.component) &&
        Objects.equals(this.numberOfFreeTrialPeriods, productPeriodFee.numberOfFreeTrialPeriods) &&
        Objects.equals(this.name, productPeriodFee.name) &&
        Objects.equals(this.description, productPeriodFee.description) &&
        Objects.equals(this.id, productPeriodFee.id) &&
        Objects.equals(this.type, productPeriodFee.type) &&
        Objects.equals(this.version, productPeriodFee.version) &&
        Objects.equals(this.ledgerEntryTitle, productPeriodFee.ledgerEntryTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodFee, linkedSpaceId, component, numberOfFreeTrialPeriods, name, description, id, type, version, ledgerEntryTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPeriodFee {\n");
    sb.append("    periodFee: ").append(toIndentedString(periodFee)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    numberOfFreeTrialPeriods: ").append(toIndentedString(numberOfFreeTrialPeriods)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
      for (PersistableCurrencyAmount _item : getPeriodFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%speriodFee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `component` to the URL query string
    if (getComponent() != null) {
      joiner.add(getComponent().toUrlQueryString(prefix + "component" + suffix));
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

