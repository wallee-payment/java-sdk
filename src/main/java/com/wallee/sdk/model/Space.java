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
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class Space extends Indentable {
  
  @JsonProperty("account")
  protected Account account;

  
  @JsonProperty("active")
  protected Boolean active;

  
  @JsonProperty("activeOrRestrictedActive")
  protected Boolean activeOrRestrictedActive;

  
  @JsonProperty("database")
  protected TenantDatabase database;

  
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

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("postalAddress")
  protected SpaceAddress postalAddress;

  
  @JsonProperty("primaryCurrency")
  protected String primaryCurrency;

  
  @JsonProperty("requestLimit")
  protected Long requestLimit;

  
  @JsonProperty("restrictedActive")
  protected Boolean restrictedActive;

  
  @JsonProperty("state")
  protected CreationEntityState state;

  
  @JsonProperty("technicalContactAddresses")
  protected List<String> technicalContactAddresses;

  
  @JsonProperty("timeZone")
  protected String timeZone;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The account to which the space belongs to.
   * @return account
  **/
  @ApiModelProperty(value = "The account to which the space belongs to.")
  public Account getAccount() {
    return account;
  }

  
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
   * The database in which the space&#39;s data are stored in.
   * @return database
  **/
  @ApiModelProperty(value = "The database in which the space's data are stored in.")
  public TenantDatabase getDatabase() {
    return database;
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
   * The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
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
   * The address to use in communication with clients for example in email, documents etc.
   * @return postalAddress
  **/
  @ApiModelProperty(value = "The address to use in communication with clients for example in email, documents etc.")
  public SpaceAddress getPostalAddress() {
    return postalAddress;
  }

  
   /**
   * This is the currency that is used to display aggregated amounts in the space.
   * @return primaryCurrency
  **/
  @ApiModelProperty(value = "This is the currency that is used to display aggregated amounts in the space.")
  public String getPrimaryCurrency() {
    return primaryCurrency;
  }

  
   /**
   * The request limit defines the maximum number of API request accepted within 2 minutes for this space. This limit can only be changed with special privileges.
   * @return requestLimit
  **/
  @ApiModelProperty(value = "The request limit defines the maximum number of API request accepted within 2 minutes for this space. This limit can only be changed with special privileges.")
  public Long getRequestLimit() {
    return requestLimit;
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
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.
   * @return technicalContactAddresses
  **/
  @ApiModelProperty(value = "The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.")
  public List<String> getTechnicalContactAddresses() {
    return technicalContactAddresses;
  }

  
   /**
   * The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.")
  public String getTimeZone() {
    return timeZone;
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
    Space space = (Space) o;
    return Objects.equals(this.account, space.account) &&
        Objects.equals(this.active, space.active) &&
        Objects.equals(this.activeOrRestrictedActive, space.activeOrRestrictedActive) &&
        Objects.equals(this.database, space.database) &&
        Objects.equals(this.deletedBy, space.deletedBy) &&
        Objects.equals(this.deletedOn, space.deletedOn) &&
        Objects.equals(this.id, space.id) &&
        Objects.equals(this.lastModifiedDate, space.lastModifiedDate) &&
        Objects.equals(this.name, space.name) &&
        Objects.equals(this.plannedPurgeDate, space.plannedPurgeDate) &&
        Objects.equals(this.postalAddress, space.postalAddress) &&
        Objects.equals(this.primaryCurrency, space.primaryCurrency) &&
        Objects.equals(this.requestLimit, space.requestLimit) &&
        Objects.equals(this.restrictedActive, space.restrictedActive) && this.state == space.state &&
        Objects.equals(this.technicalContactAddresses, space.technicalContactAddresses) &&
        Objects.equals(this.timeZone, space.timeZone) &&
        Objects.equals(this.version, space.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, active, activeOrRestrictedActive, database, deletedBy, deletedOn, id, lastModifiedDate, name, plannedPurgeDate, postalAddress, primaryCurrency, requestLimit, restrictedActive, state, technicalContactAddresses, timeZone, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Space {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedOn: ").append(toIndentedString(deletedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

