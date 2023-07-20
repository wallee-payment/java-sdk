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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddress;
import com.wallee.sdk.model.TenantDatabase;
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

public class Space {
  
  @JsonProperty("account")
  protected Account account = null;

  
  @JsonProperty("active")
  protected Boolean active = null;

  
  @JsonProperty("activeOrRestrictedActive")
  protected Boolean activeOrRestrictedActive = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("database")
  protected TenantDatabase database = null;

  
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

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("postalAddress")
  protected SpaceAddress postalAddress = null;

  
  @JsonProperty("primaryCurrency")
  protected String primaryCurrency = null;

  
  @JsonProperty("requestLimit")
  protected Long requestLimit = null;

  
  @JsonProperty("restrictedActive")
  protected Boolean restrictedActive = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("technicalContactAddresses")
  protected List<String> technicalContactAddresses = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The account that the space belongs to.
   * @return account
  **/
  @ApiModelProperty(value = "The account that the space belongs to.")
  public Account getAccount() {
    return account;
  }

  
   /**
   * Whether this space and all its parent accounts are active.
   * @return active
  **/
  @ApiModelProperty(value = "Whether this space and all its parent accounts are active.")
  public Boolean isActive() {
    return active;
  }

  
   /**
   * Whether this space and all its parent accounts are active or restricted active.
   * @return activeOrRestrictedActive
  **/
  @ApiModelProperty(value = "Whether this space and all its parent accounts are active or restricted active.")
  public Boolean isActiveOrRestrictedActive() {
    return activeOrRestrictedActive;
  }

  
   /**
   * The ID of the user the space was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the space was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the space was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the space was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The database the space is connected to and that holds the space&#39;s data.
   * @return database
  **/
  @ApiModelProperty(value = "The database the space is connected to and that holds the space's data.")
  public TenantDatabase getDatabase() {
    return database;
  }

  
   /**
   * The ID of the user the space was deleted by.
   * @return deletedBy
  **/
  @ApiModelProperty(value = "The ID of the user the space was deleted by.")
  public Long getDeletedBy() {
    return deletedBy;
  }

  
   /**
   * The date and time when the space was deleted.
   * @return deletedOn
  **/
  @ApiModelProperty(value = "The date and time when the space was deleted.")
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
   * The name used to identify the space.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the space.")
  public String getName() {
    return name;
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
   * The address that is used in communication with clients for example in emails, documents, etc.
   * @return postalAddress
  **/
  @ApiModelProperty(value = "The address that is used in communication with clients for example in emails, documents, etc.")
  public SpaceAddress getPostalAddress() {
    return postalAddress;
  }

  
   /**
   * The currency that is used to display aggregated amounts in the space.
   * @return primaryCurrency
  **/
  @ApiModelProperty(value = "The currency that is used to display aggregated amounts in the space.")
  public String getPrimaryCurrency() {
    return primaryCurrency;
  }

  
   /**
   * The maximum number of API requests that are accepted within two minutes. This limit can only be changed with special privileges.
   * @return requestLimit
  **/
  @ApiModelProperty(value = "The maximum number of API requests that are accepted within two minutes. This limit can only be changed with special privileges.")
  public Long getRequestLimit() {
    return requestLimit;
  }

  
   /**
   * Whether this space and all its parent accounts are active or restricted active. There is least one parent account that is restricted active.
   * @return restrictedActive
  **/
  @ApiModelProperty(value = "Whether this space and all its parent accounts are active or restricted active. There is least one parent account that is restricted active.")
  public Boolean isRestrictedActive() {
    return restrictedActive;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The email address that will receive messages about technical issues and errors that occur in the space.
   * @return technicalContactAddresses
  **/
  @ApiModelProperty(value = "The email address that will receive messages about technical issues and errors that occur in the space.")
  public List<String> getTechnicalContactAddresses() {
    return technicalContactAddresses;
  }

  
   /**
   * The time zone that is used to schedule and run background processes. This does not affect the formatting of dates in the user interface.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone that is used to schedule and run background processes. This does not affect the formatting of dates in the user interface.")
  public String getTimeZone() {
    return timeZone;
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
    Space space = (Space) o;
    return Objects.equals(this.account, space.account) &&
        Objects.equals(this.active, space.active) &&
        Objects.equals(this.activeOrRestrictedActive, space.activeOrRestrictedActive) &&
        Objects.equals(this.createdBy, space.createdBy) &&
        Objects.equals(this.createdOn, space.createdOn) &&
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
        Objects.equals(this.restrictedActive, space.restrictedActive) &&
        Objects.equals(this.state, space.state) &&
        Objects.equals(this.technicalContactAddresses, space.technicalContactAddresses) &&
        Objects.equals(this.timeZone, space.timeZone) &&
        Objects.equals(this.version, space.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, active, activeOrRestrictedActive, createdBy, createdOn, database, deletedBy, deletedOn, id, lastModifiedDate, name, plannedPurgeDate, postalAddress, primaryCurrency, requestLimit, restrictedActive, state, technicalContactAddresses, timeZone, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Space {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

