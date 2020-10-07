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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ApplicationUser extends User {
  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("primaryAccount")
  protected Account primaryAccount = null;

  
  @JsonProperty("requestLimit")
  protected Long requestLimit = null;

  
  
   /**
   * The user name is used to identify the application user in administrative interfaces.
   * @return name
  **/
  @ApiModelProperty(value = "The user name is used to identify the application user in administrative interfaces.")
  public String getName() {
    return name;
  }

  
   /**
   * The account that this user is associated with. The account owner will be able to manage this user.
   * @return primaryAccount
  **/
  @ApiModelProperty(value = "The account that this user is associated with. The account owner will be able to manage this user.")
  public Account getPrimaryAccount() {
    return primaryAccount;
  }

  
   /**
   * The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.
   * @return requestLimit
  **/
  @ApiModelProperty(value = "The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.")
  public Long getRequestLimit() {
    return requestLimit;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUser applicationUser = (ApplicationUser) o;
    return Objects.equals(this.id, applicationUser.id) &&
        Objects.equals(this.plannedPurgeDate, applicationUser.plannedPurgeDate) &&
        Objects.equals(this.scope, applicationUser.scope) &&
        Objects.equals(this.state, applicationUser.state) &&
        Objects.equals(this.userType, applicationUser.userType) &&
        Objects.equals(this.version, applicationUser.version) &&
        Objects.equals(this.name, applicationUser.name) &&
        Objects.equals(this.primaryAccount, applicationUser.primaryAccount) &&
        Objects.equals(this.requestLimit, applicationUser.requestLimit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plannedPurgeDate, scope, state, userType, version, name, primaryAccount, requestLimit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
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

