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
import com.wallee.sdk.model.ShopifySubscriptionVersionItemPriceStrategy;
import com.wallee.sdk.model.ShopifyTaxLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionVersionItem {
  
  @JsonProperty("priceIncludingTax")
  protected BigDecimal priceIncludingTax = null;

  
  @JsonProperty("priceStrategy")
  protected ShopifySubscriptionVersionItemPriceStrategy priceStrategy = null;

  
  @JsonProperty("product")
  protected Long product = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("taxLines")
  protected List<ShopifyTaxLine> taxLines = null;

  
  
   /**
   * 
   * @return priceIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPriceIncludingTax() {
    return priceIncludingTax;
  }

  
   /**
   * 
   * @return priceStrategy
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionVersionItemPriceStrategy getPriceStrategy() {
    return priceStrategy;
  }

  
   /**
   * 
   * @return product
  **/
  @ApiModelProperty(value = "")
  public Long getProduct() {
    return product;
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
   * @return taxLines
  **/
  @ApiModelProperty(value = "")
  public List<ShopifyTaxLine> getTaxLines() {
    return taxLines;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionVersionItem shopifySubscriptionVersionItem = (ShopifySubscriptionVersionItem) o;
    return Objects.equals(this.priceIncludingTax, shopifySubscriptionVersionItem.priceIncludingTax) &&
        Objects.equals(this.priceStrategy, shopifySubscriptionVersionItem.priceStrategy) &&
        Objects.equals(this.product, shopifySubscriptionVersionItem.product) &&
        Objects.equals(this.quantity, shopifySubscriptionVersionItem.quantity) &&
        Objects.equals(this.taxLines, shopifySubscriptionVersionItem.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceIncludingTax, priceStrategy, product, quantity, taxLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionVersionItem {\n");
    
    sb.append("    priceIncludingTax: ").append(toIndentedString(priceIncludingTax)).append("\n");
    sb.append("    priceStrategy: ").append(toIndentedString(priceStrategy)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taxLines: ").append(toIndentedString(taxLines)).append("\n");
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

