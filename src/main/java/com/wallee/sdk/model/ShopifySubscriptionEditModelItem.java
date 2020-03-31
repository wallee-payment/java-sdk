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
import com.wallee.sdk.model.ShopifySubscriptionEditModelTaxLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class ShopifySubscriptionEditModelItem {
  
  @SerializedName("priceIncludingTax")
  protected BigDecimal priceIncludingTax = null;

  
  @SerializedName("productId")
  protected Long productId = null;

  
  @SerializedName("quantity")
  protected BigDecimal quantity = null;

  
  @SerializedName("recalculatePrice")
  protected Boolean recalculatePrice = null;

  
  @SerializedName("taxLines")
  protected List<ShopifySubscriptionEditModelTaxLine> taxLines = null;

  
  
  public ShopifySubscriptionEditModelItem priceIncludingTax(BigDecimal priceIncludingTax) {
    this.priceIncludingTax = priceIncludingTax;
    return this;
  }

   /**
   * 
   * @return priceIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPriceIncludingTax() {
    return priceIncludingTax;
  }

  public void setPriceIncludingTax(BigDecimal priceIncludingTax) {
    this.priceIncludingTax = priceIncludingTax;
  }

  
  public ShopifySubscriptionEditModelItem productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  
  public ShopifySubscriptionEditModelItem quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  
  public ShopifySubscriptionEditModelItem recalculatePrice(Boolean recalculatePrice) {
    this.recalculatePrice = recalculatePrice;
    return this;
  }

   /**
   * 
   * @return recalculatePrice
  **/
  @ApiModelProperty(value = "")
  public Boolean isRecalculatePrice() {
    return recalculatePrice;
  }

  public void setRecalculatePrice(Boolean recalculatePrice) {
    this.recalculatePrice = recalculatePrice;
  }

  
  public ShopifySubscriptionEditModelItem taxLines(List<ShopifySubscriptionEditModelTaxLine> taxLines) {
    this.taxLines = taxLines;
    return this;
  }

  public ShopifySubscriptionEditModelItem addTaxLinesItem(ShopifySubscriptionEditModelTaxLine taxLinesItem) {
    if (this.taxLines == null) {
      this.taxLines = new ArrayList<>();
    }
    this.taxLines.add(taxLinesItem);
    return this;
  }

   /**
   * 
   * @return taxLines
  **/
  @ApiModelProperty(value = "")
  public List<ShopifySubscriptionEditModelTaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<ShopifySubscriptionEditModelTaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionEditModelItem shopifySubscriptionEditModelItem = (ShopifySubscriptionEditModelItem) o;
    return Objects.equals(this.priceIncludingTax, shopifySubscriptionEditModelItem.priceIncludingTax) &&
        Objects.equals(this.productId, shopifySubscriptionEditModelItem.productId) &&
        Objects.equals(this.quantity, shopifySubscriptionEditModelItem.quantity) &&
        Objects.equals(this.recalculatePrice, shopifySubscriptionEditModelItem.recalculatePrice) &&
        Objects.equals(this.taxLines, shopifySubscriptionEditModelItem.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceIncludingTax, productId, quantity, recalculatePrice, taxLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionEditModelItem {\n");
    
    sb.append("    priceIncludingTax: ").append(toIndentedString(priceIncludingTax)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recalculatePrice: ").append(toIndentedString(recalculatePrice)).append("\n");
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

