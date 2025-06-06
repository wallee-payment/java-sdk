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
import com.wallee.sdk.model.AbstractSpaceUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SpaceCreate extends AbstractSpaceUpdate {
  
  @JsonProperty("account")
  protected Long account = null;

  
  @JsonProperty("database")
  protected Long database = null;

  
  
  public SpaceCreate account(Long account) {
    this.account = account;
    return this;
  }

   /**
   * The account that the space belongs to.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The account that the space belongs to.")
  public Long getAccount() {
    return account;
  }

  public void setAccount(Long account) {
    this.account = account;
  }

  
  public SpaceCreate database(Long database) {
    this.database = database;
    return this;
  }

   /**
   * The database the space is connected to and that holds the space&#39;s data.
   * @return database
  **/
  @ApiModelProperty(value = "The database the space is connected to and that holds the space's data.")
  public Long getDatabase() {
    return database;
  }

  public void setDatabase(Long database) {
    this.database = database;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceCreate spaceCreate = (SpaceCreate) o;
    return Objects.equals(this.lastModifiedDate, spaceCreate.lastModifiedDate) &&
        Objects.equals(this.name, spaceCreate.name) &&
        Objects.equals(this.postalAddress, spaceCreate.postalAddress) &&
        Objects.equals(this.primaryCurrency, spaceCreate.primaryCurrency) &&
        Objects.equals(this.requestLimit, spaceCreate.requestLimit) &&
        Objects.equals(this.state, spaceCreate.state) &&
        Objects.equals(this.technicalContactAddresses, spaceCreate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, spaceCreate.timeZone) &&
        Objects.equals(this.account, spaceCreate.account) &&
        Objects.equals(this.database, spaceCreate.database) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDate, name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone, account, database, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
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

