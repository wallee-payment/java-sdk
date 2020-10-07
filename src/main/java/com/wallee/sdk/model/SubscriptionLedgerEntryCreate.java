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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@ApiModel(description = "The subscription ledger entry represents a single change on the subscription balance.")

public class SubscriptionLedgerEntryCreate {
  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax;

  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity;

  
  @JsonProperty("subscriptionVersion")
  protected Long subscriptionVersion;

  
  @JsonProperty("taxes")
  protected List<TaxCreate> taxes;

  
  @JsonProperty("title")
  protected String title;

  
  
  public SubscriptionLedgerEntryCreate amountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * 
   * @return amountIncludingTax
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  public void setAmountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }

  
  public SubscriptionLedgerEntryCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public SubscriptionLedgerEntryCreate quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  
  public SubscriptionLedgerEntryCreate subscriptionVersion(Long subscriptionVersion) {
    this.subscriptionVersion = subscriptionVersion;
    return this;
  }

   /**
   * 
   * @return subscriptionVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSubscriptionVersion() {
    return subscriptionVersion;
  }

  public void setSubscriptionVersion(Long subscriptionVersion) {
    this.subscriptionVersion = subscriptionVersion;
  }

  
  public SubscriptionLedgerEntryCreate taxes(List<TaxCreate> taxes) {
    this.taxes = taxes;
    return this;
  }

  public SubscriptionLedgerEntryCreate addTaxesItem(TaxCreate taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * 
   * @return taxes
  **/
  @ApiModelProperty(value = "")
  public List<TaxCreate> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<TaxCreate> taxes) {
    this.taxes = taxes;
  }

  
  public SubscriptionLedgerEntryCreate title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionLedgerEntryCreate subscriptionLedgerEntryCreate = (SubscriptionLedgerEntryCreate) o;
    return Objects.equals(this.amountIncludingTax, subscriptionLedgerEntryCreate.amountIncludingTax) &&
        Objects.equals(this.externalId, subscriptionLedgerEntryCreate.externalId) &&
        Objects.equals(this.quantity, subscriptionLedgerEntryCreate.quantity) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntryCreate.subscriptionVersion) &&
        Objects.equals(this.taxes, subscriptionLedgerEntryCreate.taxes) &&
        Objects.equals(this.title, subscriptionLedgerEntryCreate.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountIncludingTax, externalId, quantity, subscriptionVersion, taxes, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntryCreate {\n");
    
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

