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
import com.wallee.sdk.model.TerminalReceiptFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The receipt fetch request allows to retrieve the receipt documents for a terminal transaction.
 */
@ApiModel(description = "The receipt fetch request allows to retrieve the receipt documents for a terminal transaction.")

public class TerminalReceiptFetchRequest {
  
  @JsonProperty("format")
  protected TerminalReceiptFormat format = null;

  
  @JsonProperty("transaction")
  protected Long transaction = null;

  
  @JsonProperty("width")
  protected Integer width = null;

  
  
  public TerminalReceiptFetchRequest format(TerminalReceiptFormat format) {
    this.format = format;
    return this;
  }

   /**
   * The format determines in what format the receipts will be returned in.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "The format determines in what format the receipts will be returned in.")
  public TerminalReceiptFormat getFormat() {
    return format;
  }

  public void setFormat(TerminalReceiptFormat format) {
    this.format = format;
  }

  
  public TerminalReceiptFetchRequest transaction(Long transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Provide here the ID of the transaction for which the receipts should be fetched.
   * @return transaction
  **/
  @ApiModelProperty(required = true, value = "Provide here the ID of the transaction for which the receipts should be fetched.")
  public Long getTransaction() {
    return transaction;
  }

  public void setTransaction(Long transaction) {
    this.transaction = transaction;
  }

  
  public TerminalReceiptFetchRequest width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width controls how width the document will be rendered. In case of the PDF format the width is in mm. In case of the text format the width is in the number of chars per line.
   * @return width
  **/
  @ApiModelProperty(value = "The width controls how width the document will be rendered. In case of the PDF format the width is in mm. In case of the text format the width is in the number of chars per line.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalReceiptFetchRequest terminalReceiptFetchRequest = (TerminalReceiptFetchRequest) o;
    return Objects.equals(this.format, terminalReceiptFetchRequest.format) &&
        Objects.equals(this.transaction, terminalReceiptFetchRequest.transaction) &&
        Objects.equals(this.width, terminalReceiptFetchRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, transaction, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalReceiptFetchRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

