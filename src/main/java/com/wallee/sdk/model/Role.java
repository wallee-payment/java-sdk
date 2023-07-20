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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.Permission;
import com.wallee.sdk.model.RoleState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Role {
  
  @JsonProperty("account")
  protected Account account = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("permissions")
  protected List<Permission> permissions = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected RoleState state = null;

  
  @JsonProperty("twoFactorRequired")
  protected Boolean twoFactorRequired = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The account the role belongs to. The role can only be assigned within this account.
   * @return account
  **/
  @ApiModelProperty(value = "The account the role belongs to. The role can only be assigned within this account.")
  public Account getAccount() {
    return account;
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
   * The name used to identify the role.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the role.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * The permissions granted to users with this role.
   * @return permissions
  **/
  @ApiModelProperty(value = "The permissions granted to users with this role.")
  public List<Permission> getPermissions() {
    return permissions;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public RoleState getState() {
    return state;
  }

  
   /**
   * Whether users with this role are required to use two-factor authentication.
   * @return twoFactorRequired
  **/
  @ApiModelProperty(value = "Whether users with this role are required to use two-factor authentication.")
  public Boolean isTwoFactorRequired() {
    return twoFactorRequired;
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
    Role role = (Role) o;
    return Objects.equals(this.account, role.account) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.permissions, role.permissions) &&
        Objects.equals(this.plannedPurgeDate, role.plannedPurgeDate) &&
        Objects.equals(this.state, role.state) &&
        Objects.equals(this.twoFactorRequired, role.twoFactorRequired) &&
        Objects.equals(this.version, role.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, id, name, permissions, plannedPurgeDate, state, twoFactorRequired, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
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

