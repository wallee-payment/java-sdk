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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class SpaceUpdate extends AbstractSpaceUpdate {
  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("version")
  protected Long version;

  
  
  public SpaceUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public SpaceUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceUpdate spaceUpdate = (SpaceUpdate) o;
    return Objects.equals(this.lastModifiedDate, spaceUpdate.lastModifiedDate) &&
        Objects.equals(this.name, spaceUpdate.name) &&
        Objects.equals(this.postalAddress, spaceUpdate.postalAddress) &&
        Objects.equals(this.primaryCurrency, spaceUpdate.primaryCurrency) &&
        Objects.equals(this.requestLimit, spaceUpdate.requestLimit) && this.state == spaceUpdate.state &&
        Objects.equals(this.technicalContactAddresses, spaceUpdate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, spaceUpdate.timeZone) &&
        Objects.equals(this.id, spaceUpdate.id) &&
        Objects.equals(this.version, spaceUpdate.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDate, name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone, id, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceUpdate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

