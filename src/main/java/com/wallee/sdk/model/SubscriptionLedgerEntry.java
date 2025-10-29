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
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionLedgerEntryState;
import com.wallee.sdk.model.Tax;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@JsonPropertyOrder({
  SubscriptionLedgerEntry.JSON_PROPERTY_QUANTITY,
  SubscriptionLedgerEntry.JSON_PROPERTY_AMOUNT_EXCLUDING_TAX,
  SubscriptionLedgerEntry.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionLedgerEntry.JSON_PROPERTY_SUBSCRIPTION_VERSION,
  SubscriptionLedgerEntry.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionLedgerEntry.JSON_PROPERTY_TAXES,
  SubscriptionLedgerEntry.JSON_PROPERTY_FEE_TYPE,
  SubscriptionLedgerEntry.JSON_PROPERTY_TITLE,
  SubscriptionLedgerEntry.JSON_PROPERTY_CREATED_ON,
  SubscriptionLedgerEntry.JSON_PROPERTY_VERSION,
  SubscriptionLedgerEntry.JSON_PROPERTY_COMPONENT_REFERENCE_NAME,
  SubscriptionLedgerEntry.JSON_PROPERTY_SUBSCRIPTION_METRIC_ID,
  SubscriptionLedgerEntry.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionLedgerEntry.JSON_PROPERTY_PRO_RATA_CALCULATED,
  SubscriptionLedgerEntry.JSON_PROPERTY_CREATED_BY,
  SubscriptionLedgerEntry.JSON_PROPERTY_COMPONENT_REFERENCE_SKU,
  SubscriptionLedgerEntry.JSON_PROPERTY_ID,
  SubscriptionLedgerEntry.JSON_PROPERTY_STATE,
  SubscriptionLedgerEntry.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  SubscriptionLedgerEntry.JSON_PROPERTY_DISCOUNT_INCLUDING_TAX,
  SubscriptionLedgerEntry.JSON_PROPERTY_TAX_AMOUNT,
  SubscriptionLedgerEntry.JSON_PROPERTY_AGGREGATED_TAX_RATE
})

public class SubscriptionLedgerEntry {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_AMOUNT_EXCLUDING_TAX = "amountExcludingTax";
  private BigDecimal amountExcludingTax;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_SUBSCRIPTION_VERSION = "subscriptionVersion";
  private Long subscriptionVersion;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private Set<Tax> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_FEE_TYPE = "feeType";
  private ProductFeeType feeType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_COMPONENT_REFERENCE_NAME = "componentReferenceName";
  private String componentReferenceName;

  public static final String JSON_PROPERTY_SUBSCRIPTION_METRIC_ID = "subscriptionMetricId";
  private Long subscriptionMetricId;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_PRO_RATA_CALCULATED = "proRataCalculated";
  private Boolean proRataCalculated;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_COMPONENT_REFERENCE_SKU = "componentReferenceSku";
  private String componentReferenceSku;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private SubscriptionLedgerEntryState state;

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_DISCOUNT_INCLUDING_TAX = "discountIncludingTax";
  private BigDecimal discountIncludingTax;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  private BigDecimal taxAmount;

  public static final String JSON_PROPERTY_AGGREGATED_TAX_RATE = "aggregatedTaxRate";
  private BigDecimal aggregatedTaxRate;

  public SubscriptionLedgerEntry() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionLedgerEntry(
    @JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX) BigDecimal amountExcludingTax, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION) Long subscriptionVersion, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_TAXES) Set<Tax> taxes, 
    @JsonProperty(JSON_PROPERTY_TITLE) String title, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_NAME) String componentReferenceName, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_METRIC_ID) Long subscriptionMetricId, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_PRO_RATA_CALCULATED) Boolean proRataCalculated, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_SKU) String componentReferenceSku, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX) BigDecimal amountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_DISCOUNT_INCLUDING_TAX) BigDecimal discountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_TAX_AMOUNT) BigDecimal taxAmount, 
    @JsonProperty(JSON_PROPERTY_AGGREGATED_TAX_RATE) BigDecimal aggregatedTaxRate
  ) {
    this();
    this.quantity = quantity;
    this.amountExcludingTax = amountExcludingTax;
    this.plannedPurgeDate = plannedPurgeDate;
    this.subscriptionVersion = subscriptionVersion;
    this.externalId = externalId;
    this.taxes = taxes;
    this.title = title;
    this.createdOn = createdOn;
    this.version = version;
    this.componentReferenceName = componentReferenceName;
    this.subscriptionMetricId = subscriptionMetricId;
    this.linkedSpaceId = linkedSpaceId;
    this.proRataCalculated = proRataCalculated;
    this.createdBy = createdBy;
    this.componentReferenceSku = componentReferenceSku;
    this.id = id;
    this.amountIncludingTax = amountIncludingTax;
    this.discountIncludingTax = discountIncludingTax;
    this.taxAmount = taxAmount;
    this.aggregatedTaxRate = aggregatedTaxRate;
  }

   /**
   * The number of items that were consumed.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantity() {
    return quantity;
  }



   /**
   * The leger entry&#39;s amount with discounts applied, excluding taxes.
   * @return amountExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * The subscription version that the ledger entry belongs to.
   * @return subscriptionVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionVersion() {
    return subscriptionVersion;
  }



   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



   /**
   * A set of tax lines, each of which specifies a tax applied to the ledger entry.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Tax> getTaxes() {
    return taxes;
  }



  public SubscriptionLedgerEntry feeType(ProductFeeType feeType) {
    
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductFeeType getFeeType() {
    return feeType;
  }


  @JsonProperty(JSON_PROPERTY_FEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeeType(ProductFeeType feeType) {
    this.feeType = feeType;
  }

   /**
   * The title that indicates what the ledger entry is about.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * Get componentReferenceName
   * @return componentReferenceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComponentReferenceName() {
    return componentReferenceName;
  }



   /**
   * Get subscriptionMetricId
   * @return subscriptionMetricId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionMetricId() {
    return subscriptionMetricId;
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
   * Get proRataCalculated
   * @return proRataCalculated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRO_RATA_CALCULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProRataCalculated() {
    return proRataCalculated;
  }



   /**
   * The ID of the user the ledger entry was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



   /**
   * Get componentReferenceSku
   * @return componentReferenceSku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComponentReferenceSku() {
    return componentReferenceSku;
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



  public SubscriptionLedgerEntry state(SubscriptionLedgerEntryState state) {
    
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

  public SubscriptionLedgerEntryState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(SubscriptionLedgerEntryState state) {
    this.state = state;
  }

   /**
   * The leger entry&#39;s amount with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }



   /**
   * The discount allocated to the ledger entry, including taxes.
   * @return discountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }



   /**
   * The sum of all taxes applied to the ledger entry.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }



   /**
   * The total tax rate applied to the ledger entry, calculated from the rates of all tax lines.
   * @return aggregatedTaxRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATED_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionLedgerEntry subscriptionLedgerEntry = (SubscriptionLedgerEntry) o;
    return Objects.equals(this.quantity, subscriptionLedgerEntry.quantity) &&
        Objects.equals(this.amountExcludingTax, subscriptionLedgerEntry.amountExcludingTax) &&
        Objects.equals(this.plannedPurgeDate, subscriptionLedgerEntry.plannedPurgeDate) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntry.subscriptionVersion) &&
        Objects.equals(this.externalId, subscriptionLedgerEntry.externalId) &&
        Objects.equals(this.taxes, subscriptionLedgerEntry.taxes) &&
        Objects.equals(this.feeType, subscriptionLedgerEntry.feeType) &&
        Objects.equals(this.title, subscriptionLedgerEntry.title) &&
        Objects.equals(this.createdOn, subscriptionLedgerEntry.createdOn) &&
        Objects.equals(this.version, subscriptionLedgerEntry.version) &&
        Objects.equals(this.componentReferenceName, subscriptionLedgerEntry.componentReferenceName) &&
        Objects.equals(this.subscriptionMetricId, subscriptionLedgerEntry.subscriptionMetricId) &&
        Objects.equals(this.linkedSpaceId, subscriptionLedgerEntry.linkedSpaceId) &&
        Objects.equals(this.proRataCalculated, subscriptionLedgerEntry.proRataCalculated) &&
        Objects.equals(this.createdBy, subscriptionLedgerEntry.createdBy) &&
        Objects.equals(this.componentReferenceSku, subscriptionLedgerEntry.componentReferenceSku) &&
        Objects.equals(this.id, subscriptionLedgerEntry.id) &&
        Objects.equals(this.state, subscriptionLedgerEntry.state) &&
        Objects.equals(this.amountIncludingTax, subscriptionLedgerEntry.amountIncludingTax) &&
        Objects.equals(this.discountIncludingTax, subscriptionLedgerEntry.discountIncludingTax) &&
        Objects.equals(this.taxAmount, subscriptionLedgerEntry.taxAmount) &&
        Objects.equals(this.aggregatedTaxRate, subscriptionLedgerEntry.aggregatedTaxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, amountExcludingTax, plannedPurgeDate, subscriptionVersion, externalId, taxes, feeType, title, createdOn, version, componentReferenceName, subscriptionMetricId, linkedSpaceId, proRataCalculated, createdBy, componentReferenceSku, id, state, amountIncludingTax, discountIncludingTax, taxAmount, aggregatedTaxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntry {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    componentReferenceName: ").append(toIndentedString(componentReferenceName)).append("\n");
    sb.append("    subscriptionMetricId: ").append(toIndentedString(subscriptionMetricId)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    proRataCalculated: ").append(toIndentedString(proRataCalculated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    componentReferenceSku: ").append(toIndentedString(componentReferenceSku)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
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

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountExcludingTax` to the URL query string
    if (getAmountExcludingTax() != null) {
      try {
        joiner.add(String.format("%samountExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionVersion` to the URL query string
    if (getSubscriptionVersion() != null) {
      try {
        joiner.add(String.format("%ssubscriptionVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (Tax _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `feeType` to the URL query string
    if (getFeeType() != null) {
      try {
        joiner.add(String.format("%sfeeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `componentReferenceName` to the URL query string
    if (getComponentReferenceName() != null) {
      try {
        joiner.add(String.format("%scomponentReferenceName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponentReferenceName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionMetricId` to the URL query string
    if (getSubscriptionMetricId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionMetricId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionMetricId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `proRataCalculated` to the URL query string
    if (getProRataCalculated() != null) {
      try {
        joiner.add(String.format("%sproRataCalculated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProRataCalculated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `componentReferenceSku` to the URL query string
    if (getComponentReferenceSku() != null) {
      try {
        joiner.add(String.format("%scomponentReferenceSku%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponentReferenceSku()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountIncludingTax` to the URL query string
    if (getAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%samountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discountIncludingTax` to the URL query string
    if (getDiscountIncludingTax() != null) {
      try {
        joiner.add(String.format("%sdiscountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxAmount` to the URL query string
    if (getTaxAmount() != null) {
      try {
        joiner.add(String.format("%staxAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aggregatedTaxRate` to the URL query string
    if (getAggregatedTaxRate() != null) {
      try {
        joiner.add(String.format("%saggregatedTaxRate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAggregatedTaxRate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

