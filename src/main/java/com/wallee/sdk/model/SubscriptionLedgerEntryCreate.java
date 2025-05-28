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
import com.wallee.sdk.model.TaxCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@ApiModel(description = "The subscription ledger entry represents a single change on the subscription balance.")

public class SubscriptionLedgerEntryCreate {
  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("componentReferenceName")
  protected String componentReferenceName = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("subscriptionMetricId")
  protected Long subscriptionMetricId = null;

  
  @JsonProperty("subscriptionVersion")
  protected Long subscriptionVersion = null;

  
  @JsonProperty("taxes")
  protected List<TaxCreate> taxes = null;

  
  @JsonProperty("title")
  protected String title = null;

  
  
  public SubscriptionLedgerEntryCreate amountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * The leger entry&#39;s amount with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(required = true, value = "The leger entry's amount with discounts applied, including taxes.")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  public void setAmountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }

  
  public SubscriptionLedgerEntryCreate componentReferenceName(String componentReferenceName) {
    this.componentReferenceName = componentReferenceName;
    return this;
  }

   /**
   * 
   * @return componentReferenceName
  **/
  @ApiModelProperty(value = "")
  public String getComponentReferenceName() {
    return componentReferenceName;
  }

  public void setComponentReferenceName(String componentReferenceName) {
    this.componentReferenceName = componentReferenceName;
  }

  
  public SubscriptionLedgerEntryCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
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
   * The number of items that were consumed.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of items that were consumed.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  
  public SubscriptionLedgerEntryCreate subscriptionMetricId(Long subscriptionMetricId) {
    this.subscriptionMetricId = subscriptionMetricId;
    return this;
  }

   /**
   * 
   * @return subscriptionMetricId
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionMetricId() {
    return subscriptionMetricId;
  }

  public void setSubscriptionMetricId(Long subscriptionMetricId) {
    this.subscriptionMetricId = subscriptionMetricId;
  }

  
  public SubscriptionLedgerEntryCreate subscriptionVersion(Long subscriptionVersion) {
    this.subscriptionVersion = subscriptionVersion;
    return this;
  }

   /**
   * The subscription version that the ledger entry belongs to.
   * @return subscriptionVersion
  **/
  @ApiModelProperty(required = true, value = "The subscription version that the ledger entry belongs to.")
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
   * A set of tax lines, each of which specifies a tax applied to the ledger entry.
   * @return taxes
  **/
  @ApiModelProperty(value = "A set of tax lines, each of which specifies a tax applied to the ledger entry.")
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
   * The title that indicates what the ledger entry is about.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title that indicates what the ledger entry is about.")
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
        Objects.equals(this.componentReferenceName, subscriptionLedgerEntryCreate.componentReferenceName) &&
        Objects.equals(this.externalId, subscriptionLedgerEntryCreate.externalId) &&
        Objects.equals(this.quantity, subscriptionLedgerEntryCreate.quantity) &&
        Objects.equals(this.subscriptionMetricId, subscriptionLedgerEntryCreate.subscriptionMetricId) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntryCreate.subscriptionVersion) &&
        Objects.equals(this.taxes, subscriptionLedgerEntryCreate.taxes) &&
        Objects.equals(this.title, subscriptionLedgerEntryCreate.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountIncludingTax, componentReferenceName, externalId, quantity, subscriptionMetricId, subscriptionVersion, taxes, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntryCreate {\n");
    
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    componentReferenceName: ").append(toIndentedString(componentReferenceName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionMetricId: ").append(toIndentedString(subscriptionMetricId)).append("\n");
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

