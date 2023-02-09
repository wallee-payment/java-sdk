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

public class PaymentTerminalDccTransactionSum {
  
  @JsonProperty("brand")
  protected String brand = null;

  
  @JsonProperty("dccAmount")
  protected BigDecimal dccAmount = null;

  
  @JsonProperty("dccCurrency")
  protected String dccCurrency = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("transactionAmount")
  protected BigDecimal transactionAmount = null;

  
  @JsonProperty("transactionCount")
  protected Integer transactionCount = null;

  
  @JsonProperty("transactionCurrency")
  protected String transactionCurrency = null;

  
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
   * @return dccAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDccAmount() {
    return dccAmount;
  }

  
   /**
   * 
   * @return dccCurrency
  **/
  @ApiModelProperty(value = "")
  public String getDccCurrency() {
    return dccCurrency;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
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
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
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
    PaymentTerminalDccTransactionSum paymentTerminalDccTransactionSum = (PaymentTerminalDccTransactionSum) o;
    return Objects.equals(this.brand, paymentTerminalDccTransactionSum.brand) &&
        Objects.equals(this.dccAmount, paymentTerminalDccTransactionSum.dccAmount) &&
        Objects.equals(this.dccCurrency, paymentTerminalDccTransactionSum.dccCurrency) &&
        Objects.equals(this.id, paymentTerminalDccTransactionSum.id) &&
        Objects.equals(this.transactionAmount, paymentTerminalDccTransactionSum.transactionAmount) &&
        Objects.equals(this.transactionCount, paymentTerminalDccTransactionSum.transactionCount) &&
        Objects.equals(this.transactionCurrency, paymentTerminalDccTransactionSum.transactionCurrency) &&
        Objects.equals(this.version, paymentTerminalDccTransactionSum.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, dccAmount, dccCurrency, id, transactionAmount, transactionCount, transactionCurrency, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalDccTransactionSum {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    dccAmount: ").append(toIndentedString(dccAmount)).append("\n");
    sb.append("    dccCurrency: ").append(toIndentedString(dccCurrency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
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

