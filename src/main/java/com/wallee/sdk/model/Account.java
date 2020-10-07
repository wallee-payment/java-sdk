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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.AccountState;
import com.wallee.sdk.model.enums.AccountType;

@ApiModel(description = "")

public class Account {
  
  @JsonProperty("active")
  protected Boolean active;

  
  @JsonProperty("activeOrRestrictedActive")
  protected Boolean activeOrRestrictedActive;

  
  @JsonProperty("deletedBy")
  protected Long deletedBy;

  
  @JsonProperty("deletedOn")
  protected OffsetDateTime deletedOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("lastModifiedDate")
  protected OffsetDateTime lastModifiedDate;

  
  @JsonProperty("name")
  protected String name;

  
  @JsonProperty("parentAccount")
  protected Account parentAccount;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("restrictedActive")
  protected Boolean restrictedActive;

  
  @JsonProperty("scope")
  protected Long scope;

  
  @JsonProperty("state")
  protected AccountState state;

  
  @JsonProperty("subaccountLimit")
  protected Long subaccountLimit;

  
  @JsonProperty("type")
  protected AccountType type;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * Active means that this account and all accounts in the hierarchy are active.
   * @return active
  **/
  @ApiModelProperty(value = "Active means that this account and all accounts in the hierarchy are active.")
  public Boolean isActive() {
    return active;
  }

  
   /**
   * This property is true when all accounts in the hierarchy are active or restricted active.
   * @return activeOrRestrictedActive
  **/
  @ApiModelProperty(value = "This property is true when all accounts in the hierarchy are active or restricted active.")
  public Boolean isActiveOrRestrictedActive() {
    return activeOrRestrictedActive;
  }

  
   /**
   * The ID of a user that deleted this entity.
   * @return deletedBy
  **/
  @ApiModelProperty(value = "The ID of a user that deleted this entity.")
  public Long getDeletedBy() {
    return deletedBy;
  }

  
   /**
   * The date and time when this entity was deleted.
   * @return deletedOn
  **/
  @ApiModelProperty(value = "The date and time when this entity was deleted.")
  public OffsetDateTime getDeletedOn() {
    return deletedOn;
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
   * 
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  
   /**
   * The name of the account identifies the account within the administrative interface.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the account identifies the account within the administrative interface.")
  public String getName() {
    return name;
  }

  
   /**
   * The account which is responsible for administering the account.
   * @return parentAccount
  **/
  @ApiModelProperty(value = "The account which is responsible for administering the account.")
  public Account getParentAccount() {
    return parentAccount;
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
   * Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
   * @return restrictedActive
  **/
  @ApiModelProperty(value = "Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.")
  public Boolean isRestrictedActive() {
    return restrictedActive;
  }

  
   /**
   * This is the scope to which the account belongs to.
   * @return scope
  **/
  @ApiModelProperty(value = "This is the scope to which the account belongs to.")
  public Long getScope() {
    return scope;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public AccountState getState() {
    return state;
  }

  
   /**
   * This property restricts the number of subaccounts which can be created within this account.
   * @return subaccountLimit
  **/
  @ApiModelProperty(value = "This property restricts the number of subaccounts which can be created within this account.")
  public Long getSubaccountLimit() {
    return subaccountLimit;
  }

  
   /**
   * The account type defines which role and capabilities it has.
   * @return type
  **/
  @ApiModelProperty(value = "The account type defines which role and capabilities it has.")
  public AccountType getType() {
    return type;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.active, account.active) &&
        Objects.equals(this.activeOrRestrictedActive, account.activeOrRestrictedActive) &&
        Objects.equals(this.deletedBy, account.deletedBy) &&
        Objects.equals(this.deletedOn, account.deletedOn) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.lastModifiedDate, account.lastModifiedDate) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.parentAccount, account.parentAccount) &&
        Objects.equals(this.plannedPurgeDate, account.plannedPurgeDate) &&
        Objects.equals(this.restrictedActive, account.restrictedActive) &&
        Objects.equals(this.scope, account.scope) && this.state == account.state &&
        Objects.equals(this.subaccountLimit, account.subaccountLimit) && this.type == account.type &&
        Objects.equals(this.version, account.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activeOrRestrictedActive, deletedBy, deletedOn, id, lastModifiedDate, name, parentAccount, plannedPurgeDate, restrictedActive, scope, state, subaccountLimit, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

