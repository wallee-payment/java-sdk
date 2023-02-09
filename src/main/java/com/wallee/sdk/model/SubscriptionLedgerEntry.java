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

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("discountIncludingTax")
  protected BigDecimal discountIncludingTax = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("state")
  protected SubscriptionLedgerEntryState state = null;

  
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
   * 
   * @return aggregatedTaxRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }

  
   /**
   * 
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * 
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  
   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
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
   * @return quantity
  **/
  @ApiModelProperty(value = "")
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
   * @return subscriptionVersion
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionVersion() {
    return subscriptionVersion;
  }

  
   /**
   * 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * 
   * @return taxes
  **/
  @ApiModelProperty(value = "")
  public List<Tax> getTaxes() {
    return taxes;
  }

  
   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.createdBy, subscriptionLedgerEntry.createdBy) &&
        Objects.equals(this.createdOn, subscriptionLedgerEntry.createdOn) &&
        Objects.equals(this.discountIncludingTax, subscriptionLedgerEntry.discountIncludingTax) &&
        Objects.equals(this.externalId, subscriptionLedgerEntry.externalId) &&
        Objects.equals(this.id, subscriptionLedgerEntry.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionLedgerEntry.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscriptionLedgerEntry.plannedPurgeDate) &&
        Objects.equals(this.quantity, subscriptionLedgerEntry.quantity) &&
        Objects.equals(this.state, subscriptionLedgerEntry.state) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntry.subscriptionVersion) &&
        Objects.equals(this.taxAmount, subscriptionLedgerEntry.taxAmount) &&
        Objects.equals(this.taxes, subscriptionLedgerEntry.taxes) &&
        Objects.equals(this.title, subscriptionLedgerEntry.title) &&
        Objects.equals(this.version, subscriptionLedgerEntry.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, createdBy, createdOn, discountIncludingTax, externalId, id, linkedSpaceId, plannedPurgeDate, quantity, state, subscriptionVersion, taxAmount, taxes, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntry {\n");
    
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

