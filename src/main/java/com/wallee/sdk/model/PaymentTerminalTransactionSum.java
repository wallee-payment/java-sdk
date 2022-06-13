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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminalTransactionSum {
  
  @JsonProperty("brand")
  protected String brand = null;

  
  @JsonProperty("dccTipAmount")
  protected BigDecimal dccTipAmount = null;

  
  @JsonProperty("dccTransactionAmount")
  protected BigDecimal dccTransactionAmount = null;

  
  @JsonProperty("dccTransactionCount")
  protected Integer dccTransactionCount = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("product")
  protected String product = null;

  
  @JsonProperty("transactionAmount")
  protected BigDecimal transactionAmount = null;

  
  @JsonProperty("transactionCount")
  protected Integer transactionCount = null;

  
  @JsonProperty("transactionCurrency")
  protected String transactionCurrency = null;

  
  @JsonProperty("transactionTipAmount")
  protected BigDecimal transactionTipAmount = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  
   /**
   * 
   * @return dccTipAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDccTipAmount() {
    return dccTipAmount;
  }

  
   /**
   * 
   * @return dccTransactionAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDccTransactionAmount() {
    return dccTransactionAmount;
  }

  
   /**
   * 
   * @return dccTransactionCount
  **/
  @ApiModelProperty(value = "")
  public Integer getDccTransactionCount() {
    return dccTransactionCount;
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
   * 
   * @return product
  **/
  @ApiModelProperty(value = "")
  public String getProduct() {
    return product;
  }

  
   /**
   * 
   * @return transactionAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }

  
   /**
   * 
   * @return transactionCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTransactionCount() {
    return transactionCount;
  }

  
   /**
   * 
   * @return transactionCurrency
  **/
  @ApiModelProperty(value = "")
  public String getTransactionCurrency() {
    return transactionCurrency;
  }

  
   /**
   * 
   * @return transactionTipAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTransactionTipAmount() {
    return transactionTipAmount;
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
    PaymentTerminalTransactionSum paymentTerminalTransactionSum = (PaymentTerminalTransactionSum) o;
    return Objects.equals(this.brand, paymentTerminalTransactionSum.brand) &&
        Objects.equals(this.dccTipAmount, paymentTerminalTransactionSum.dccTipAmount) &&
        Objects.equals(this.dccTransactionAmount, paymentTerminalTransactionSum.dccTransactionAmount) &&
        Objects.equals(this.dccTransactionCount, paymentTerminalTransactionSum.dccTransactionCount) &&
        Objects.equals(this.id, paymentTerminalTransactionSum.id) &&
        Objects.equals(this.product, paymentTerminalTransactionSum.product) &&
        Objects.equals(this.transactionAmount, paymentTerminalTransactionSum.transactionAmount) &&
        Objects.equals(this.transactionCount, paymentTerminalTransactionSum.transactionCount) &&
        Objects.equals(this.transactionCurrency, paymentTerminalTransactionSum.transactionCurrency) &&
        Objects.equals(this.transactionTipAmount, paymentTerminalTransactionSum.transactionTipAmount) &&
        Objects.equals(this.version, paymentTerminalTransactionSum.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, dccTipAmount, dccTransactionAmount, dccTransactionCount, id, product, transactionAmount, transactionCount, transactionCurrency, transactionTipAmount, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSum {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    dccTipAmount: ").append(toIndentedString(dccTipAmount)).append("\n");
    sb.append("    dccTransactionAmount: ").append(toIndentedString(dccTransactionAmount)).append("\n");
    sb.append("    dccTransactionCount: ").append(toIndentedString(dccTransactionCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
    sb.append("    transactionTipAmount: ").append(toIndentedString(transactionTipAmount)).append("\n");
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

