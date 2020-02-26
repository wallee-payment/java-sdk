/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.SubscriptionLedgerEntryState;
import com.wallee.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
public class SubscriptionLedgerEntry {
  
  @SerializedName("aggregatedTaxRate")
  protected BigDecimal aggregatedTaxRate = null;

  
  @SerializedName("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @SerializedName("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @SerializedName("createdBy")
  protected Long createdBy = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("externalId")
  protected String externalId = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("quantity")
  protected BigDecimal quantity = null;

  
  @SerializedName("state")
  protected SubscriptionLedgerEntryState state = null;

  
  @SerializedName("subscriptionVersion")
  protected Long subscriptionVersion = null;

  
  @SerializedName("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @SerializedName("taxes")
  protected List<Tax> taxes = null;

  
  @SerializedName("title")
  protected String title = null;

  
  @SerializedName("version")
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
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
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
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
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
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, createdBy, createdOn, externalId, id, linkedSpaceId, plannedPurgeDate, quantity, state, subscriptionVersion, taxAmount, taxes, title, version);
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

