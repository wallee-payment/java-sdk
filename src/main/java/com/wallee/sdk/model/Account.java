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
import com.wallee.sdk.model.AccountState;
import com.wallee.sdk.model.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Account {
  
  @JsonProperty("active")
  protected Boolean active = null;

  
  @JsonProperty("activeOrRestrictedActive")
  protected Boolean activeOrRestrictedActive = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("deletedBy")
  protected Long deletedBy = null;

  
  @JsonProperty("deletedOn")
  protected OffsetDateTime deletedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("lastModifiedDate")
  protected OffsetDateTime lastModifiedDate = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("parentAccount")
  protected Account parentAccount = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("restrictedActive")
  protected Boolean restrictedActive = null;

  
  @JsonProperty("scope")
  protected Long scope = null;

  
  @JsonProperty("state")
  protected AccountState state = null;

  
  @JsonProperty("subaccountLimit")
  protected Long subaccountLimit = null;

  
  @JsonProperty("type")
  protected AccountType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Whether this account and all its parent accounts are active.
   * @return active
  **/
  @ApiModelProperty(value = "Whether this account and all its parent accounts are active.")
  public Boolean isActive() {
    return active;
  }

  
   /**
   * Whether this account and all its parent accounts are active or restricted active.
   * @return activeOrRestrictedActive
  **/
  @ApiModelProperty(value = "Whether this account and all its parent accounts are active or restricted active.")
  public Boolean isActiveOrRestrictedActive() {
    return activeOrRestrictedActive;
  }

  
   /**
   * The ID of the user the account was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the account was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the account was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the account was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The ID of a user the account was deleted by.
   * @return deletedBy
  **/
  @ApiModelProperty(value = "The ID of a user the account was deleted by.")
  public Long getDeletedBy() {
    return deletedBy;
  }

  
   /**
   * The date and time when the account was deleted.
   * @return deletedOn
  **/
  @ApiModelProperty(value = "The date and time when the account was deleted.")
  public OffsetDateTime getDeletedOn() {
    return deletedOn;
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
   * The date and time when the object was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "The date and time when the object was last modified.")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  
   /**
   * The name used to identify the account.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the account.")
  public String getName() {
    return name;
  }

  
   /**
   * The parent account responsible for administering this account.
   * @return parentAccount
  **/
  @ApiModelProperty(value = "The parent account responsible for administering this account.")
  public Account getParentAccount() {
    return parentAccount;
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
   * Whether this account and all its parent accounts are active or restricted active. There is at least one account that is restricted active.
   * @return restrictedActive
  **/
  @ApiModelProperty(value = "Whether this account and all its parent accounts are active or restricted active. There is at least one account that is restricted active.")
  public Boolean isRestrictedActive() {
    return restrictedActive;
  }

  
   /**
   * The scope that the account belongs to.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope that the account belongs to.")
  public Long getScope() {
    return scope;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public AccountState getState() {
    return state;
  }

  
   /**
   * The number of sub-accounts that can be created within this account.
   * @return subaccountLimit
  **/
  @ApiModelProperty(value = "The number of sub-accounts that can be created within this account.")
  public Long getSubaccountLimit() {
    return subaccountLimit;
  }

  
   /**
   * The account&#39;s type which defines its role and capabilities.
   * @return type
  **/
  @ApiModelProperty(value = "The account's type which defines its role and capabilities.")
  public AccountType getType() {
    return type;
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
    Account account = (Account) o;
    return Objects.equals(this.active, account.active) &&
        Objects.equals(this.activeOrRestrictedActive, account.activeOrRestrictedActive) &&
        Objects.equals(this.createdBy, account.createdBy) &&
        Objects.equals(this.createdOn, account.createdOn) &&
        Objects.equals(this.deletedBy, account.deletedBy) &&
        Objects.equals(this.deletedOn, account.deletedOn) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.lastModifiedDate, account.lastModifiedDate) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.parentAccount, account.parentAccount) &&
        Objects.equals(this.plannedPurgeDate, account.plannedPurgeDate) &&
        Objects.equals(this.restrictedActive, account.restrictedActive) &&
        Objects.equals(this.scope, account.scope) &&
        Objects.equals(this.state, account.state) &&
        Objects.equals(this.subaccountLimit, account.subaccountLimit) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.version, account.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activeOrRestrictedActive, createdBy, createdOn, deletedBy, deletedOn, id, lastModifiedDate, name, parentAccount, plannedPurgeDate, restrictedActive, scope, state, subaccountLimit, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedOn: ").append(toIndentedString(deletedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

