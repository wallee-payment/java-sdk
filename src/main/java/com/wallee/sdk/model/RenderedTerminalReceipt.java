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
import com.wallee.sdk.model.PaymentTerminalReceiptType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RenderedTerminalReceipt {
  
  @JsonProperty("data")
  protected byte[] data = null;

  
  @JsonProperty("mimeType")
  protected String mimeType = null;

  
  @JsonProperty("printed")
  protected Boolean printed = null;

  
  @JsonProperty("receiptType")
  protected PaymentTerminalReceiptType receiptType = null;

  
  
  public RenderedTerminalReceipt data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  
   /**
   * The MIME type specifies the format of the receipt document and is determined by the requested format.
   * @return mimeType
  **/
  @ApiModelProperty(value = "The MIME type specifies the format of the receipt document and is determined by the requested format.")
  public String getMimeType() {
    return mimeType;
  }

  
   /**
   * Whether the terminal&#39;s configuration mandates printing and the device has receipt printing capabilities.
   * @return printed
  **/
  @ApiModelProperty(value = "Whether the terminal's configuration mandates printing and the device has receipt printing capabilities.")
  public Boolean isPrinted() {
    return printed;
  }

  
   /**
   * The receipt type specifies the intended use and the target audience of the document.
   * @return receiptType
  **/
  @ApiModelProperty(value = "The receipt type specifies the intended use and the target audience of the document.")
  public PaymentTerminalReceiptType getReceiptType() {
    return receiptType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderedTerminalReceipt renderedTerminalReceipt = (RenderedTerminalReceipt) o;
    return Arrays.equals(this.data, renderedTerminalReceipt.data) &&
        Objects.equals(this.mimeType, renderedTerminalReceipt.mimeType) &&
        Objects.equals(this.printed, renderedTerminalReceipt.printed) &&
        Objects.equals(this.receiptType, renderedTerminalReceipt.receiptType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(data), mimeType, printed, receiptType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderedTerminalReceipt {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    receiptType: ").append(toIndentedString(receiptType)).append("\n");
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

