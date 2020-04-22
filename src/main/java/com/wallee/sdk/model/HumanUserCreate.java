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
import com.wallee.sdk.model.AbstractHumanUserUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class HumanUserCreate extends AbstractHumanUserUpdate {
  
  @JsonProperty("primaryAccount")
  protected Long primaryAccount = null;

  
  
  public HumanUserCreate primaryAccount(Long primaryAccount) {
    this.primaryAccount = primaryAccount;
    return this;
  }

   /**
   * The primary account links the user to a specific account.
   * @return primaryAccount
  **/
  @ApiModelProperty(value = "The primary account links the user to a specific account.")
  public Long getPrimaryAccount() {
    return primaryAccount;
  }

  public void setPrimaryAccount(Long primaryAccount) {
    this.primaryAccount = primaryAccount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanUserCreate humanUserCreate = (HumanUserCreate) o;
    return Objects.equals(this.emailAddress, humanUserCreate.emailAddress) &&
        Objects.equals(this.firstname, humanUserCreate.firstname) &&
        Objects.equals(this.language, humanUserCreate.language) &&
        Objects.equals(this.lastname, humanUserCreate.lastname) &&
        Objects.equals(this.mobilePhoneNumber, humanUserCreate.mobilePhoneNumber) &&
        Objects.equals(this.state, humanUserCreate.state) &&
        Objects.equals(this.timeZone, humanUserCreate.timeZone) &&
        Objects.equals(this.twoFactorEnabled, humanUserCreate.twoFactorEnabled) &&
        Objects.equals(this.primaryAccount, humanUserCreate.primaryAccount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, firstname, language, lastname, mobilePhoneNumber, state, timeZone, twoFactorEnabled, primaryAccount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanUserCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
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

