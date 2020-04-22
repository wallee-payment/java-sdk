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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.AbstractAccountUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class AccountCreate extends AbstractAccountUpdate {
  
  @JsonProperty("parentAccount")
  protected Long parentAccount = null;

  
  @JsonProperty("scope")
  protected Long scope = null;

  
  
  public AccountCreate parentAccount(Long parentAccount) {
    this.parentAccount = parentAccount;
    return this;
  }

   /**
   * The account which is responsible for administering the account.
   * @return parentAccount
  **/
  @ApiModelProperty(value = "The account which is responsible for administering the account.")
  public Long getParentAccount() {
    return parentAccount;
  }

  public void setParentAccount(Long parentAccount) {
    this.parentAccount = parentAccount;
  }

  
  public AccountCreate scope(Long scope) {
    this.scope = scope;
    return this;
  }

   /**
   * This is the scope to which the account belongs to.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "This is the scope to which the account belongs to.")
  public Long getScope() {
    return scope;
  }

  public void setScope(Long scope) {
    this.scope = scope;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreate accountCreate = (AccountCreate) o;
    return Objects.equals(this.name, accountCreate.name) &&
        Objects.equals(this.subaccountLimit, accountCreate.subaccountLimit) &&
        Objects.equals(this.parentAccount, accountCreate.parentAccount) &&
        Objects.equals(this.scope, accountCreate.scope) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subaccountLimit, parentAccount, scope, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
    sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

