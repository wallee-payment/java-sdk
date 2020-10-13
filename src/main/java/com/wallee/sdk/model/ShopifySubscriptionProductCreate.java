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
import com.wallee.sdk.model.AbstractShopifySubscriptionProductUpdate;
import com.wallee.sdk.model.ShopifySubscriptionBillingIntervalUnit;
import com.wallee.sdk.model.ShopifySubscriptionProductPricingOption;
import com.wallee.sdk.model.ShopifySubscriptionWeekday;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionProductCreate extends AbstractShopifySubscriptionProductUpdate {
  
  @JsonProperty("productId")
  protected String productId = null;

  
  @JsonProperty("productVariantId")
  protected String productVariantId = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  
  public ShopifySubscriptionProductCreate productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the Shopify product that is enabled to be ordered as subscription.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The ID of the Shopify product that is enabled to be ordered as subscription.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public ShopifySubscriptionProductCreate productVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
    return this;
  }

   /**
   * 
   * @return productVariantId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  
  public ShopifySubscriptionProductCreate shop(Long shop) {
    this.shop = shop;
    return this;
  }

   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getShop() {
    return shop;
  }

  public void setShop(Long shop) {
    this.shop = shop;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionProductCreate shopifySubscriptionProductCreate = (ShopifySubscriptionProductCreate) o;
    return Objects.equals(this.productId, shopifySubscriptionProductCreate.productId) &&
        Objects.equals(this.productVariantId, shopifySubscriptionProductCreate.productVariantId) &&
        Objects.equals(this.shop, shopifySubscriptionProductCreate.shop) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productVariantId, shop, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionProductCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
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

