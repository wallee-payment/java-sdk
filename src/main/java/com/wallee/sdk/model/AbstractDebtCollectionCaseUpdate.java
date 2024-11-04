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
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.LineItemCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractDebtCollectionCaseUpdate
 */

public class AbstractDebtCollectionCaseUpdate {
  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress = null;

  
  @JsonProperty("contractDate")
  protected OffsetDateTime contractDate = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("dueDate")
  protected OffsetDateTime dueDate = null;

  
  @JsonProperty("environment")
  protected DebtCollectionEnvironment environment = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  
  public AbstractDebtCollectionCaseUpdate billingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The billing address that identifies the debtor.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The billing address that identifies the debtor.")
  public AddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public AbstractDebtCollectionCaseUpdate contractDate(OffsetDateTime contractDate) {
    this.contractDate = contractDate;
    return this;
  }

   /**
   * The date and time when the contract with the debtor was signed.
   * @return contractDate
  **/
  @ApiModelProperty(value = "The date and time when the contract with the debtor was signed.")
  public OffsetDateTime getContractDate() {
    return contractDate;
  }

  public void setContractDate(OffsetDateTime contractDate) {
    this.contractDate = contractDate;
  }

  
  public AbstractDebtCollectionCaseUpdate currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter code (ISO 4217 format) of the case&#39;s currency.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-letter code (ISO 4217 format) of the case's currency.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  public AbstractDebtCollectionCaseUpdate dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The date and time when the claim was due.
   * @return dueDate
  **/
  @ApiModelProperty(value = "The date and time when the claim was due.")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  
  public AbstractDebtCollectionCaseUpdate environment(DebtCollectionEnvironment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment in which the case is processed.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment in which the case is processed.")
  public DebtCollectionEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(DebtCollectionEnvironment environment) {
    this.environment = environment;
  }

  
  public AbstractDebtCollectionCaseUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractDebtCollectionCaseUpdate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public AbstractDebtCollectionCaseUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items that are subject of this debt collection case.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items that are subject of this debt collection case.")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public AbstractDebtCollectionCaseUpdate spaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
    return this;
  }

   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractDebtCollectionCaseUpdate abstractDebtCollectionCaseUpdate = (AbstractDebtCollectionCaseUpdate) o;
    return Objects.equals(this.billingAddress, abstractDebtCollectionCaseUpdate.billingAddress) &&
        Objects.equals(this.contractDate, abstractDebtCollectionCaseUpdate.contractDate) &&
        Objects.equals(this.currency, abstractDebtCollectionCaseUpdate.currency) &&
        Objects.equals(this.dueDate, abstractDebtCollectionCaseUpdate.dueDate) &&
        Objects.equals(this.environment, abstractDebtCollectionCaseUpdate.environment) &&
        Objects.equals(this.language, abstractDebtCollectionCaseUpdate.language) &&
        Objects.equals(this.lineItems, abstractDebtCollectionCaseUpdate.lineItems) &&
        Objects.equals(this.spaceViewId, abstractDebtCollectionCaseUpdate.spaceViewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, contractDate, currency, dueDate, environment, language, lineItems, spaceViewId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractDebtCollectionCaseUpdate {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

