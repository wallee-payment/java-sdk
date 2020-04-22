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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.Permission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class Role {
  
  @JsonProperty("account")
  protected Account account = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("name")
  protected DatabaseTranslatedString name = null;

  
  @JsonProperty("permissions")
  protected List<Permission> permissions = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("twoFactorRequired")
  protected Boolean twoFactorRequired = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.
   * @return account
  **/
  @ApiModelProperty(value = "The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.")
  public Account getAccount() {
    return account;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The name of this role is used to identify the role within administrative interfaces.
   * @return name
  **/
  @ApiModelProperty(value = "The name of this role is used to identify the role within administrative interfaces.")
  public DatabaseTranslatedString getName() {
    return name;
  }

  
   /**
   * Set of permissions that are granted to this role.
   * @return permissions
  **/
  @ApiModelProperty(value = "Set of permissions that are granted to this role.")
  public List<Permission> getPermissions() {
    return permissions;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * Defines whether having been granted this role will force a user to use two-factor authentication.
   * @return twoFactorRequired
  **/
  @ApiModelProperty(value = "Defines whether having been granted this role will force a user to use two-factor authentication.")
  public Boolean isTwoFactorRequired() {
    return twoFactorRequired;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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

