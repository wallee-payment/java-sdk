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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class UserAccountRole {
  
  @JsonProperty("account")
  protected Long account = null;

  
  @JsonProperty("appliesOnSubAccount")
  protected Boolean appliesOnSubAccount = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("role")
  protected Long role = null;

  
  @JsonProperty("user")
  protected Long user = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The account in which the role is assigned to the user.
   * @return account
  **/
  @ApiModelProperty(value = "The account in which the role is assigned to the user.")
  public Long getAccount() {
    return account;
  }

  
   /**
   * Whether the role is assigned to the user in subaccounts only.
   * @return appliesOnSubAccount
  **/
  @ApiModelProperty(value = "Whether the role is assigned to the user in subaccounts only.")
  public Boolean isAppliesOnSubAccount() {
    return appliesOnSubAccount;
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
   * The role that is assigned to the user.
   * @return role
  **/
  @ApiModelProperty(value = "The role that is assigned to the user.")
  public Long getRole() {
    return role;
  }

  
   /**
   * The user whose role this defines.
   * @return user
  **/
  @ApiModelProperty(value = "The user whose role this defines.")
  public Long getUser() {
    return user;
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
    UserAccountRole userAccountRole = (UserAccountRole) o;
    return Objects.equals(this.account, userAccountRole.account) &&
        Objects.equals(this.appliesOnSubAccount, userAccountRole.appliesOnSubAccount) &&
        Objects.equals(this.id, userAccountRole.id) &&
        Objects.equals(this.role, userAccountRole.role) &&
        Objects.equals(this.user, userAccountRole.user) &&
        Objects.equals(this.version, userAccountRole.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, appliesOnSubAccount, id, role, user, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountRole {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    appliesOnSubAccount: ").append(toIndentedString(appliesOnSubAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

