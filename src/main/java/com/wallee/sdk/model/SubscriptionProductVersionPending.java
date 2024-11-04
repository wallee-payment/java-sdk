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
import com.wallee.sdk.model.SubscriptionProductVersionState;
import com.wallee.sdk.model.TaxCalculation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductVersionPending {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("billingCycle")
  protected String billingCycle = null;

  
  @JsonProperty("comment")
  protected String comment = null;

  
  @JsonProperty("defaultCurrency")
  protected String defaultCurrency = null;

  
  @JsonProperty("enabledCurrencies")
  protected List<String> enabledCurrencies = null;

  
  @JsonProperty("minimalNumberOfPeriods")
  protected Integer minimalNumberOfPeriods = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("numberOfNoticePeriods")
  protected Integer numberOfNoticePeriods = null;

  
  @JsonProperty("product")
  protected Long product = null;

  
  @JsonProperty("state")
  protected SubscriptionProductVersionState state = null;

  
  @JsonProperty("taxCalculation")
  protected TaxCalculation taxCalculation = null;

  
  
  public SubscriptionProductVersionPending id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public SubscriptionProductVersionPending version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public SubscriptionProductVersionPending billingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * The recurring period of time, typically monthly or annually, for which a subscriber is charged.
   * @return billingCycle
  **/
  @ApiModelProperty(value = "The recurring period of time, typically monthly or annually, for which a subscriber is charged.")
  public String getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }

  
  public SubscriptionProductVersionPending comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A comment that describes the product version and why it was created. It is not disclosed to the subscriber.
   * @return comment
  **/
  @ApiModelProperty(value = "A comment that describes the product version and why it was created. It is not disclosed to the subscriber.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  
  public SubscriptionProductVersionPending defaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * The three-letter code (ISO 4217 format) of the product version&#39;s default currency.
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "The three-letter code (ISO 4217 format) of the product version's default currency.")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  
  public SubscriptionProductVersionPending enabledCurrencies(List<String> enabledCurrencies) {
    this.enabledCurrencies = enabledCurrencies;
    return this;
  }

  public SubscriptionProductVersionPending addEnabledCurrenciesItem(String enabledCurrenciesItem) {
    if (this.enabledCurrencies == null) {
      this.enabledCurrencies = new ArrayList<>();
    }
    this.enabledCurrencies.add(enabledCurrenciesItem);
    return this;
  }

   /**
   * The three-letter codes (ISO 4217 format) of the currencies that the product version supports.
   * @return enabledCurrencies
  **/
  @ApiModelProperty(value = "The three-letter codes (ISO 4217 format) of the currencies that the product version supports.")
  public List<String> getEnabledCurrencies() {
    return enabledCurrencies;
  }

  public void setEnabledCurrencies(List<String> enabledCurrencies) {
    this.enabledCurrencies = enabledCurrencies;
  }

  
  public SubscriptionProductVersionPending minimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
    this.minimalNumberOfPeriods = minimalNumberOfPeriods;
    return this;
  }

   /**
   * The minimum number of periods the subscription will run before it can be terminated.
   * @return minimalNumberOfPeriods
  **/
  @ApiModelProperty(value = "The minimum number of periods the subscription will run before it can be terminated.")
  public Integer getMinimalNumberOfPeriods() {
    return minimalNumberOfPeriods;
  }

  public void setMinimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
    this.minimalNumberOfPeriods = minimalNumberOfPeriods;
  }

  
  public SubscriptionProductVersionPending name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public SubscriptionProductVersionPending putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the product that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the product that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public SubscriptionProductVersionPending numberOfNoticePeriods(Integer numberOfNoticePeriods) {
    this.numberOfNoticePeriods = numberOfNoticePeriods;
    return this;
  }

   /**
   * The number of periods the subscription will keep running after its termination was requested.
   * @return numberOfNoticePeriods
  **/
  @ApiModelProperty(value = "The number of periods the subscription will keep running after its termination was requested.")
  public Integer getNumberOfNoticePeriods() {
    return numberOfNoticePeriods;
  }

  public void setNumberOfNoticePeriods(Integer numberOfNoticePeriods) {
    this.numberOfNoticePeriods = numberOfNoticePeriods;
  }

  
  public SubscriptionProductVersionPending product(Long product) {
    this.product = product;
    return this;
  }

   /**
   * The product that the version belongs to.
   * @return product
  **/
  @ApiModelProperty(value = "The product that the version belongs to.")
  public Long getProduct() {
    return product;
  }

  public void setProduct(Long product) {
    this.product = product;
  }

  
  public SubscriptionProductVersionPending state(SubscriptionProductVersionState state) {
    this.state = state;
    return this;
  }

   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionProductVersionState getState() {
    return state;
  }

  public void setState(SubscriptionProductVersionState state) {
    this.state = state;
  }

  
  public SubscriptionProductVersionPending taxCalculation(TaxCalculation taxCalculation) {
    this.taxCalculation = taxCalculation;
    return this;
  }

   /**
   * The way taxes are calculated for fees.
   * @return taxCalculation
  **/
  @ApiModelProperty(value = "The way taxes are calculated for fees.")
  public TaxCalculation getTaxCalculation() {
    return taxCalculation;
  }

  public void setTaxCalculation(TaxCalculation taxCalculation) {
    this.taxCalculation = taxCalculation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductVersionPending subscriptionProductVersionPending = (SubscriptionProductVersionPending) o;
    return Objects.equals(this.id, subscriptionProductVersionPending.id) &&
        Objects.equals(this.version, subscriptionProductVersionPending.version) &&
        Objects.equals(this.billingCycle, subscriptionProductVersionPending.billingCycle) &&
        Objects.equals(this.comment, subscriptionProductVersionPending.comment) &&
        Objects.equals(this.defaultCurrency, subscriptionProductVersionPending.defaultCurrency) &&
        Objects.equals(this.enabledCurrencies, subscriptionProductVersionPending.enabledCurrencies) &&
        Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersionPending.minimalNumberOfPeriods) &&
        Objects.equals(this.name, subscriptionProductVersionPending.name) &&
        Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersionPending.numberOfNoticePeriods) &&
        Objects.equals(this.product, subscriptionProductVersionPending.product) &&
        Objects.equals(this.state, subscriptionProductVersionPending.state) &&
        Objects.equals(this.taxCalculation, subscriptionProductVersionPending.taxCalculation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, billingCycle, comment, defaultCurrency, enabledCurrencies, minimalNumberOfPeriods, name, numberOfNoticePeriods, product, state, taxCalculation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersionPending {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
    sb.append("    minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxCalculation: ").append(toIndentedString(taxCalculation)).append("\n");
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

