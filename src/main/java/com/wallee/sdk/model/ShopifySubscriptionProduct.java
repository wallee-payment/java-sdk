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
import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionProduct {
  
  @JsonProperty("absolutePriceAdjustment")
  protected BigDecimal absolutePriceAdjustment = null;

  
  @JsonProperty("billingDayOfMonth")
  protected Integer billingDayOfMonth = null;

  
  @JsonProperty("billingIntervalAmount")
  protected Integer billingIntervalAmount = null;

  
  @JsonProperty("billingIntervalUnit")
  protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit = null;

  
  @JsonProperty("billingWeekday")
  protected ShopifySubscriptionWeekday billingWeekday = null;

  
  @JsonProperty("fixedPrice")
  protected BigDecimal fixedPrice = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("maximalBillingCycles")
  protected Integer maximalBillingCycles = null;

  
  @JsonProperty("maximalSuspendableCycles")
  protected Integer maximalSuspendableCycles = null;

  
  @JsonProperty("minimalBillingCycles")
  protected Integer minimalBillingCycles = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("pricingOption")
  protected ShopifySubscriptionProductPricingOption pricingOption = null;

  
  @JsonProperty("productId")
  protected String productId = null;

  
  @JsonProperty("productName")
  protected String productName = null;

  
  @JsonProperty("productPrice")
  protected BigDecimal productPrice = null;

  
  @JsonProperty("productSku")
  protected String productSku = null;

  
  @JsonProperty("productVariantId")
  protected String productVariantId = null;

  
  @JsonProperty("productVariantName")
  protected String productVariantName = null;

  
  @JsonProperty("relativePriceAdjustment")
  protected BigDecimal relativePriceAdjustment = null;

  
  @JsonProperty("shippingRequired")
  protected Boolean shippingRequired = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  @JsonProperty("state")
  protected ShopifySubscriptionProductState state = null;

  
  @JsonProperty("stockCheckRequired")
  protected Boolean stockCheckRequired = null;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled = null;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed = null;

  
  @JsonProperty("terminationBillingCycles")
  protected Integer terminationBillingCycles = null;

  
  @JsonProperty("updatedAt")
  protected OffsetDateTime updatedAt = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return absolutePriceAdjustment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAbsolutePriceAdjustment() {
    return absolutePriceAdjustment;
  }

  
   /**
   * Define the day of the month on which the recurring orders should be created.
   * @return billingDayOfMonth
  **/
  @ApiModelProperty(value = "Define the day of the month on which the recurring orders should be created.")
  public Integer getBillingDayOfMonth() {
    return billingDayOfMonth;
  }

  
   /**
   * 
   * @return billingIntervalAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingIntervalAmount() {
    return billingIntervalAmount;
  }

  
   /**
   * Define how frequently recurring orders should be created.
   * @return billingIntervalUnit
  **/
  @ApiModelProperty(value = "Define how frequently recurring orders should be created.")
  public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
    return billingIntervalUnit;
  }

  
   /**
   * Define the weekday on which the recurring orders should be created.
   * @return billingWeekday
  **/
  @ApiModelProperty(value = "Define the weekday on which the recurring orders should be created.")
  public ShopifySubscriptionWeekday getBillingWeekday() {
    return billingWeekday;
  }

  
   /**
   * 
   * @return fixedPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFixedPrice() {
    return fixedPrice;
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
   * Define the maximum number of orders the subscription will run for.
   * @return maximalBillingCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription will run for.")
  public Integer getMaximalBillingCycles() {
    return maximalBillingCycles;
  }

  
   /**
   * Define the maximum number of orders the subscription can be suspended for at a time.
   * @return maximalSuspendableCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription can be suspended for at a time.")
  public Integer getMaximalSuspendableCycles() {
    return maximalSuspendableCycles;
  }

  
   /**
   * Define the minimal number of orders the subscription will run for.
   * @return minimalBillingCycles
  **/
  @ApiModelProperty(value = "Define the minimal number of orders the subscription will run for.")
  public Integer getMinimalBillingCycles() {
    return minimalBillingCycles;
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
   * @return pricingOption
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionProductPricingOption getPricingOption() {
    return pricingOption;
  }

  
   /**
   * The ID of the Shopify product that is enabled to be ordered as subscription.
   * @return productId
  **/
  @ApiModelProperty(value = "The ID of the Shopify product that is enabled to be ordered as subscription.")
  public String getProductId() {
    return productId;
  }

  
   /**
   * 
   * @return productName
  **/
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  
   /**
   * 
   * @return productPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getProductPrice() {
    return productPrice;
  }

  
   /**
   * 
   * @return productSku
  **/
  @ApiModelProperty(value = "")
  public String getProductSku() {
    return productSku;
  }

  
   /**
   * 
   * @return productVariantId
  **/
  @ApiModelProperty(value = "")
  public String getProductVariantId() {
    return productVariantId;
  }

  
   /**
   * 
   * @return productVariantName
  **/
  @ApiModelProperty(value = "")
  public String getProductVariantName() {
    return productVariantName;
  }

  
   /**
   * 
   * @return relativePriceAdjustment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRelativePriceAdjustment() {
    return relativePriceAdjustment;
  }

  
   /**
   * 
   * @return shippingRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isShippingRequired() {
    return shippingRequired;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionProductState getState() {
    return state;
  }

  
   /**
   * 
   * @return stockCheckRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isStockCheckRequired() {
    return stockCheckRequired;
  }

  
   /**
   * Define whether the order confirmation email of the Shopify shop is sent to the customer for recurring orders.
   * @return storeOrderConfirmationEmailEnabled
  **/
  @ApiModelProperty(value = "Define whether the order confirmation email of the Shopify shop is sent to the customer for recurring orders.")
  public Boolean isStoreOrderConfirmationEmailEnabled() {
    return storeOrderConfirmationEmailEnabled;
  }

  
   /**
   * Define whether the customer is allowed to suspend subscriptions.
   * @return subscriberSuspensionAllowed
  **/
  @ApiModelProperty(value = "Define whether the customer is allowed to suspend subscriptions.")
  public Boolean isSubscriberSuspensionAllowed() {
    return subscriberSuspensionAllowed;
  }

  
   /**
   * Define the number of orders the subscription will keep running for after its termination has been requested.
   * @return terminationBillingCycles
  **/
  @ApiModelProperty(value = "Define the number of orders the subscription will keep running for after its termination has been requested.")
  public Integer getTerminationBillingCycles() {
    return terminationBillingCycles;
  }

  
   /**
   * 
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
    ShopifySubscriptionProduct shopifySubscriptionProduct = (ShopifySubscriptionProduct) o;
    return Objects.equals(this.absolutePriceAdjustment, shopifySubscriptionProduct.absolutePriceAdjustment) &&
        Objects.equals(this.billingDayOfMonth, shopifySubscriptionProduct.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionProduct.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionProduct.billingIntervalUnit) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionProduct.billingWeekday) &&
        Objects.equals(this.fixedPrice, shopifySubscriptionProduct.fixedPrice) &&
        Objects.equals(this.id, shopifySubscriptionProduct.id) &&
        Objects.equals(this.linkedSpaceId, shopifySubscriptionProduct.linkedSpaceId) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionProduct.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProduct.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionProduct.minimalBillingCycles) &&
        Objects.equals(this.plannedPurgeDate, shopifySubscriptionProduct.plannedPurgeDate) &&
        Objects.equals(this.pricingOption, shopifySubscriptionProduct.pricingOption) &&
        Objects.equals(this.productId, shopifySubscriptionProduct.productId) &&
        Objects.equals(this.productName, shopifySubscriptionProduct.productName) &&
        Objects.equals(this.productPrice, shopifySubscriptionProduct.productPrice) &&
        Objects.equals(this.productSku, shopifySubscriptionProduct.productSku) &&
        Objects.equals(this.productVariantId, shopifySubscriptionProduct.productVariantId) &&
        Objects.equals(this.productVariantName, shopifySubscriptionProduct.productVariantName) &&
        Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProduct.relativePriceAdjustment) &&
        Objects.equals(this.shippingRequired, shopifySubscriptionProduct.shippingRequired) &&
        Objects.equals(this.shop, shopifySubscriptionProduct.shop) &&
        Objects.equals(this.state, shopifySubscriptionProduct.state) &&
        Objects.equals(this.stockCheckRequired, shopifySubscriptionProduct.stockCheckRequired) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionProduct.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionProduct.subscriberSuspensionAllowed) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionProduct.terminationBillingCycles) &&
        Objects.equals(this.updatedAt, shopifySubscriptionProduct.updatedAt) &&
        Objects.equals(this.version, shopifySubscriptionProduct.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolutePriceAdjustment, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, fixedPrice, id, linkedSpaceId, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, plannedPurgeDate, pricingOption, productId, productName, productPrice, productSku, productVariantId, productVariantName, relativePriceAdjustment, shippingRequired, shop, state, stockCheckRequired, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles, updatedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionProduct {\n");
    
    sb.append("    absolutePriceAdjustment: ").append(toIndentedString(absolutePriceAdjustment)).append("\n");
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    pricingOption: ").append(toIndentedString(pricingOption)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    productVariantName: ").append(toIndentedString(productVariantName)).append("\n");
    sb.append("    relativePriceAdjustment: ").append(toIndentedString(relativePriceAdjustment)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stockCheckRequired: ").append(toIndentedString(stockCheckRequired)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

