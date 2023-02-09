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
import com.wallee.sdk.model.BankTransaction;
import com.wallee.sdk.model.Refund;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RefundBankTransaction extends TransactionAwareEntity {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("refund")
  protected Refund refund = null;

  
  @JsonProperty("refundCurrencyAmount")
  protected BigDecimal refundCurrencyAmount = null;

  
  @JsonProperty("refundCurrencyValueAmount")
  protected BigDecimal refundCurrencyValueAmount = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return bankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * 
   * @return refund
  **/
  @ApiModelProperty(value = "")
  public Refund getRefund() {
    return refund;
  }

  
   /**
   * Specify the posting amount in the refund&#39;s currency.
   * @return refundCurrencyAmount
  **/
  @ApiModelProperty(value = "Specify the posting amount in the refund's currency.")
  public BigDecimal getRefundCurrencyAmount() {
    return refundCurrencyAmount;
  }

  
   /**
   * 
   * @return refundCurrencyValueAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRefundCurrencyValueAmount() {
    return refundCurrencyValueAmount;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
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
    RefundBankTransaction refundBankTransaction = (RefundBankTransaction) o;
    return Objects.equals(this.id, refundBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, refundBankTransaction.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, refundBankTransaction.linkedTransaction) &&
        Objects.equals(this.bankTransaction, refundBankTransaction.bankTransaction) &&
        Objects.equals(this.language, refundBankTransaction.language) &&
        Objects.equals(this.refund, refundBankTransaction.refund) &&
        Objects.equals(this.refundCurrencyAmount, refundBankTransaction.refundCurrencyAmount) &&
        Objects.equals(this.refundCurrencyValueAmount, refundBankTransaction.refundCurrencyValueAmount) &&
        Objects.equals(this.spaceViewId, refundBankTransaction.spaceViewId) &&
        Objects.equals(this.version, refundBankTransaction.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, bankTransaction, language, refund, refundCurrencyAmount, refundCurrencyValueAmount, spaceViewId, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundBankTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    refundCurrencyAmount: ").append(toIndentedString(refundCurrencyAmount)).append("\n");
    sb.append("    refundCurrencyValueAmount: ").append(toIndentedString(refundCurrencyValueAmount)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

