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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class UserSpaceRole {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("role")
  protected Long role = null;

  
  @JsonProperty("space")
  protected Long space = null;

  
  @JsonProperty("user")
  protected Long user = null;

  
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
   * 
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Long getRole() {
    return role;
  }

  
   /**
   * 
   * @return space
  **/
  @ApiModelProperty(value = "")
  public Long getSpace() {
    return space;
  }

  
   /**
   * 
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Long getUser() {
    return user;
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
    UserSpaceRole userSpaceRole = (UserSpaceRole) o;
    return Objects.equals(this.id, userSpaceRole.id) &&
        Objects.equals(this.role, userSpaceRole.role) &&
        Objects.equals(this.space, userSpaceRole.space) &&
        Objects.equals(this.user, userSpaceRole.user) &&
        Objects.equals(this.version, userSpaceRole.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, space, user, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSpaceRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

