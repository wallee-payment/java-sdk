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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.LineItemType;

@ApiModel(description = "")

public class LineItemCreate extends Indentable {
  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax;

  
  @JsonProperty("attributes")
  protected Map<String, LineItemAttributeCreate> attributes;

  
  @JsonProperty("discountIncludingTax")
  protected BigDecimal discountIncludingTax;

  
  @JsonProperty("name")
  protected String name;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity;

  
  @JsonProperty("shippingRequired")
  protected Boolean shippingRequired;

  
  @JsonProperty("sku")
  protected String sku;

  
  @JsonProperty("taxes")
  protected List<TaxCreate> taxes;

  
  @JsonProperty("type")
  protected LineItemType type;

  
  @JsonProperty("uniqueId")
  protected String uniqueId;

  
  
  public LineItemCreate amountIncludingTax(BigDecimal amountIncludingTax) {
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

  
  public LineItemCreate attributes(Map<String, LineItemAttributeCreate> attributes) {
    this.attributes = attributes;
    return this;
  }

  public LineItemCreate putAttributesItem(String key, LineItemAttributeCreate attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * 
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, LineItemAttributeCreate> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, LineItemAttributeCreate> attributes) {
    this.attributes = attributes;
  }

  
  public LineItemCreate discountIncludingTax(BigDecimal discountIncludingTax) {
    this.discountIncludingTax = discountIncludingTax;
    return this;
  }

   /**
   * 
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  public void setDiscountIncludingTax(BigDecimal discountIncludingTax) {
    this.discountIncludingTax = discountIncludingTax;
  }

  
  public LineItemCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public LineItemCreate quantity(BigDecimal quantity) {
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

  
  public LineItemCreate shippingRequired(Boolean shippingRequired) {
    this.shippingRequired = shippingRequired;
    return this;
  }

   /**
   * 
   * @return shippingRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isShippingRequired() {
    return shippingRequired;
  }

  public void setShippingRequired(Boolean shippingRequired) {
    this.shippingRequired = shippingRequired;
  }

  
  public LineItemCreate sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * 
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public LineItemCreate taxes(List<TaxCreate> taxes) {
    this.taxes = taxes;
    return this;
  }

  public LineItemCreate addTaxesItem(TaxCreate taxesItem) {
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

  
  public LineItemCreate type(LineItemType type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public LineItemType getType() {
    return type;
  }

  public void setType(LineItemType type) {
    this.type = type;
  }

  
  public LineItemCreate uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * The unique id identifies the line item within the set of line items associated with the transaction.
   * @return uniqueId
  **/
  @ApiModelProperty(required = true, value = "The unique id identifies the line item within the set of line items associated with the transaction.")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemCreate lineItemCreate = (LineItemCreate) o;
    return Objects.equals(this.amountIncludingTax, lineItemCreate.amountIncludingTax) &&
        Objects.equals(this.attributes, lineItemCreate.attributes) &&
        Objects.equals(this.discountIncludingTax, lineItemCreate.discountIncludingTax) &&
        Objects.equals(this.name, lineItemCreate.name) &&
        Objects.equals(this.quantity, lineItemCreate.quantity) &&
        Objects.equals(this.shippingRequired, lineItemCreate.shippingRequired) &&
        Objects.equals(this.sku, lineItemCreate.sku) &&
        Objects.equals(this.taxes, lineItemCreate.taxes) && this.type == lineItemCreate.type &&
        Objects.equals(this.uniqueId, lineItemCreate.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountIncludingTax, attributes, discountIncludingTax, name, quantity, shippingRequired, sku, taxes, type, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemCreate {\n");
    
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

