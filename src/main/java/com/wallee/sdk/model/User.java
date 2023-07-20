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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.UserType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class User {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("scope")
  protected Long scope = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("userType")
  protected UserType userType = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
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
   * The scope that the user belongs to.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope that the user belongs to.")
  public Long getScope() {
    return scope;
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
   * The user&#39;s type which defines its role and capabilities.
   * @return userType
  **/
  @ApiModelProperty(value = "The user's type which defines its role and capabilities.")
  public UserType getUserType() {
    return userType;
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.plannedPurgeDate, user.plannedPurgeDate) &&
        Objects.equals(this.scope, user.scope) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.userType, user.userType) &&
        Objects.equals(this.version, user.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plannedPurgeDate, scope, state, userType, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

