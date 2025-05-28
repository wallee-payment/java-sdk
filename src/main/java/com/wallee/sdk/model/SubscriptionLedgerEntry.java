/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionLedgerEntryState;
import com.wallee.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@ApiModel(description = "The subscription ledger entry represents a single change on the subscription balance.")

public class SubscriptionLedgerEntry {
  
  @JsonProperty("aggregatedTaxRate")
  protected BigDecimal aggregatedTaxRate = null;

  
  @JsonProperty("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("componentReferenceName")
  protected String componentReferenceName = null;

  
  @JsonProperty("componentReferenceSku")
  protected String componentReferenceSku = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("discountIncludingTax")
  protected BigDecimal discountIncludingTax = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("feeType")
  protected ProductFeeType feeType = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("proRataCalculated")
  protected Boolean proRataCalculated = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("state")
  protected SubscriptionLedgerEntryState state = null;

  
  @JsonProperty("subscriptionMetricId")
  protected Long subscriptionMetricId = null;

  
  @JsonProperty("subscriptionVersion")
  protected Long subscriptionVersion = null;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("taxes")
  protected List<Tax> taxes = null;

  
  @JsonProperty("title")
  protected String title = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The total tax rate applied to the ledger entry, calculated from the rates of all tax lines.
   * @return aggregatedTaxRate
  **/
  @ApiModelProperty(value = "The total tax rate applied to the ledger entry, calculated from the rates of all tax lines.")
  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }

  
   /**
   * The leger entry&#39;s amount with discounts applied, excluding taxes.
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "The leger entry's amount with discounts applied, excluding taxes.")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * The leger entry&#39;s amount with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "The leger entry's amount with discounts applied, including taxes.")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  
   /**
   * 
   * @return componentReferenceName
  **/
  @ApiModelProperty(value = "")
  public String getComponentReferenceName() {
    return componentReferenceName;
  }

  
   /**
   * 
   * @return componentReferenceSku
  **/
  @ApiModelProperty(value = "")
  public String getComponentReferenceSku() {
    return componentReferenceSku;
  }

  
   /**
   * The ID of the user the ledger entry was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the ledger entry was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The discount allocated to the ledger entry, including taxes.
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "The discount allocated to the ledger entry, including taxes.")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * 
   * @return feeType
  **/
  @ApiModelProperty(value = "")
  public ProductFeeType getFeeType() {
    return feeType;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return proRataCalculated
  **/
  @ApiModelProperty(value = "")
  public Boolean isProRataCalculated() {
    return proRataCalculated;
  }

  
   /**
   * The number of items that were consumed.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items that were consumed.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionLedgerEntryState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriptionMetricId
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionMetricId() {
    return subscriptionMetricId;
  }

  
   /**
   * The subscription version that the ledger entry belongs to.
   * @return subscriptionVersion
  **/
  @ApiModelProperty(value = "The subscription version that the ledger entry belongs to.")
  public Long getSubscriptionVersion() {
    return subscriptionVersion;
  }

  
   /**
   * The sum of all taxes applied to the ledger entry.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The sum of all taxes applied to the ledger entry.")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * A set of tax lines, each of which specifies a tax applied to the ledger entry.
   * @return taxes
  **/
  @ApiModelProperty(value = "A set of tax lines, each of which specifies a tax applied to the ledger entry.")
  public List<Tax> getTaxes() {
    return taxes;
  }

  
   /**
   * The title that indicates what the ledger entry is about.
   * @return title
  **/
  @ApiModelProperty(value = "The title that indicates what the ledger entry is about.")
  public String getTitle() {
    return title;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionLedgerEntry subscriptionLedgerEntry = (SubscriptionLedgerEntry) o;
    return Objects.equals(this.aggregatedTaxRate, subscriptionLedgerEntry.aggregatedTaxRate) &&
        Objects.equals(this.amountExcludingTax, subscriptionLedgerEntry.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, subscriptionLedgerEntry.amountIncludingTax) &&
        Objects.equals(this.componentReferenceName, subscriptionLedgerEntry.componentReferenceName) &&
        Objects.equals(this.componentReferenceSku, subscriptionLedgerEntry.componentReferenceSku) &&
        Objects.equals(this.createdBy, subscriptionLedgerEntry.createdBy) &&
        Objects.equals(this.createdOn, subscriptionLedgerEntry.createdOn) &&
        Objects.equals(this.discountIncludingTax, subscriptionLedgerEntry.discountIncludingTax) &&
        Objects.equals(this.externalId, subscriptionLedgerEntry.externalId) &&
        Objects.equals(this.feeType, subscriptionLedgerEntry.feeType) &&
        Objects.equals(this.id, subscriptionLedgerEntry.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionLedgerEntry.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscriptionLedgerEntry.plannedPurgeDate) &&
        Objects.equals(this.proRataCalculated, subscriptionLedgerEntry.proRataCalculated) &&
        Objects.equals(this.quantity, subscriptionLedgerEntry.quantity) &&
        Objects.equals(this.state, subscriptionLedgerEntry.state) &&
        Objects.equals(this.subscriptionMetricId, subscriptionLedgerEntry.subscriptionMetricId) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntry.subscriptionVersion) &&
        Objects.equals(this.taxAmount, subscriptionLedgerEntry.taxAmount) &&
        Objects.equals(this.taxes, subscriptionLedgerEntry.taxes) &&
        Objects.equals(this.title, subscriptionLedgerEntry.title) &&
        Objects.equals(this.version, subscriptionLedgerEntry.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, componentReferenceName, componentReferenceSku, createdBy, createdOn, discountIncludingTax, externalId, feeType, id, linkedSpaceId, plannedPurgeDate, proRataCalculated, quantity, state, subscriptionMetricId, subscriptionVersion, taxAmount, taxes, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntry {\n");
    
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    componentReferenceName: ").append(toIndentedString(componentReferenceName)).append("\n");
    sb.append("    componentReferenceSku: ").append(toIndentedString(componentReferenceSku)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    proRataCalculated: ").append(toIndentedString(proRataCalculated)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionMetricId: ").append(toIndentedString(subscriptionMetricId)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

