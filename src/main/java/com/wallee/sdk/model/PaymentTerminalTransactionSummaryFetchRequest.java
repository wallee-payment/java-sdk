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

public class PaymentTerminalTransactionSummaryFetchRequest {
  
  @JsonProperty("format")
  protected TerminalReceiptFormat format = null;

  
  @JsonProperty("summaryId")
  protected Long summaryId = null;

  
  @JsonProperty("width")
  protected Integer width = null;

  
  
  public PaymentTerminalTransactionSummaryFetchRequest format(TerminalReceiptFormat format) {
    this.format = format;
    return this;
  }

   /**
   * The format determines in what format the receipt will be returned in.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "The format determines in what format the receipt will be returned in.")
  public TerminalReceiptFormat getFormat() {
    return format;
  }

  public void setFormat(TerminalReceiptFormat format) {
    this.format = format;
  }

  
  public PaymentTerminalTransactionSummaryFetchRequest summaryId(Long summaryId) {
    this.summaryId = summaryId;
    return this;
  }

   /**
   * The id of the transaction summary receipt whose content should be returned.
   * @return summaryId
  **/
  @ApiModelProperty(required = true, value = "The id of the transaction summary receipt whose content should be returned.")
  public Long getSummaryId() {
    return summaryId;
  }

  public void setSummaryId(Long summaryId) {
    this.summaryId = summaryId;
  }

  
  public PaymentTerminalTransactionSummaryFetchRequest width(Integer width) {
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
    PaymentTerminalTransactionSummaryFetchRequest paymentTerminalTransactionSummaryFetchRequest = (PaymentTerminalTransactionSummaryFetchRequest) o;
    return Objects.equals(this.format, paymentTerminalTransactionSummaryFetchRequest.format) &&
        Objects.equals(this.summaryId, paymentTerminalTransactionSummaryFetchRequest.summaryId) &&
        Objects.equals(this.width, paymentTerminalTransactionSummaryFetchRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, summaryId, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSummaryFetchRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
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

