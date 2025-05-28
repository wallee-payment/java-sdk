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
import com.wallee.sdk.model.BankAccount;
import com.wallee.sdk.model.BankAccountEnvironment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CurrencyBankAccount {
  
  @JsonProperty("bankAccount")
  protected BankAccount bankAccount = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("environment")
  protected BankAccountEnvironment environment = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The bank account this currency bank account belongs to.
   * @return bankAccount
  **/
  @ApiModelProperty(value = "The bank account this currency bank account belongs to.")
  public BankAccount getBankAccount() {
    return bankAccount;
  }

  
   /**
   * The currency associated with the bank account.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency associated with the bank account.")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * Whether the bank account operates in a test or production environment.
   * @return environment
  **/
  @ApiModelProperty(value = "Whether the bank account operates in a test or production environment.")
  public BankAccountEnvironment getEnvironment() {
    return environment;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
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
    CurrencyBankAccount currencyBankAccount = (CurrencyBankAccount) o;
    return Objects.equals(this.bankAccount, currencyBankAccount.bankAccount) &&
        Objects.equals(this.currency, currencyBankAccount.currency) &&
        Objects.equals(this.environment, currencyBankAccount.environment) &&
        Objects.equals(this.id, currencyBankAccount.id) &&
        Objects.equals(this.linkedSpaceId, currencyBankAccount.linkedSpaceId) &&
        Objects.equals(this.version, currencyBankAccount.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, currency, environment, id, linkedSpaceId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyBankAccount {\n");
    
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
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

