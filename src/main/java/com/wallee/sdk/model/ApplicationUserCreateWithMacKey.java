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
import com.wallee.sdk.model.ApplicationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:20:41.240+02:00")
public class ApplicationUserCreateWithMacKey extends ApplicationUser {
  
  @JsonProperty("macKey")
  protected String macKey = null;

  
  
   /**
   * 
   * @return macKey
  **/
  @ApiModelProperty(value = "")
  public String getMacKey() {
    return macKey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUserCreateWithMacKey applicationUserCreateWithMacKey = (ApplicationUserCreateWithMacKey) o;
    return Objects.equals(this.id, applicationUserCreateWithMacKey.id) &&
        Objects.equals(this.plannedPurgeDate, applicationUserCreateWithMacKey.plannedPurgeDate) &&
        Objects.equals(this.scope, applicationUserCreateWithMacKey.scope) &&
        Objects.equals(this.state, applicationUserCreateWithMacKey.state) &&
        Objects.equals(this.userType, applicationUserCreateWithMacKey.userType) &&
        Objects.equals(this.version, applicationUserCreateWithMacKey.version) &&
        Objects.equals(this.name, applicationUserCreateWithMacKey.name) &&
        Objects.equals(this.primaryAccount, applicationUserCreateWithMacKey.primaryAccount) &&
        Objects.equals(this.requestLimit, applicationUserCreateWithMacKey.requestLimit) &&
        Objects.equals(this.macKey, applicationUserCreateWithMacKey.macKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plannedPurgeDate, scope, state, userType, version, name, primaryAccount, requestLimit, macKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUserCreateWithMacKey {\n");
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
    sb.append("    macKey: ").append(toIndentedString(macKey)).append("\n");
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

