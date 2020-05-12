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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddressCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractSpaceUpdate
 */

public class AbstractSpaceUpdate {
  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("postalAddress")
  protected SpaceAddressCreate postalAddress = null;

  
  @JsonProperty("primaryCurrency")
  protected String primaryCurrency = null;

  
  @JsonProperty("requestLimit")
  protected Long requestLimit = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("technicalContactAddresses")
  protected List<String> technicalContactAddresses = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  
  public AbstractSpaceUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public AbstractSpaceUpdate postalAddress(SpaceAddressCreate postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

   /**
   * The address to use in communication with clients for example in email, documents etc.
   * @return postalAddress
  **/
  @ApiModelProperty(value = "The address to use in communication with clients for example in email, documents etc.")
  public SpaceAddressCreate getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(SpaceAddressCreate postalAddress) {
    this.postalAddress = postalAddress;
  }

  
  public AbstractSpaceUpdate primaryCurrency(String primaryCurrency) {
    this.primaryCurrency = primaryCurrency;
    return this;
  }

   /**
   * This is the currency that is used to display aggregated amounts in the space.
   * @return primaryCurrency
  **/
  @ApiModelProperty(value = "This is the currency that is used to display aggregated amounts in the space.")
  public String getPrimaryCurrency() {
    return primaryCurrency;
  }

  public void setPrimaryCurrency(String primaryCurrency) {
    this.primaryCurrency = primaryCurrency;
  }

  
  public AbstractSpaceUpdate requestLimit(Long requestLimit) {
    this.requestLimit = requestLimit;
    return this;
  }

   /**
   * The request limit defines the maximum number of API request accepted within 2 minutes for this space. This limit can only be changed with special privileges.
   * @return requestLimit
  **/
  @ApiModelProperty(value = "The request limit defines the maximum number of API request accepted within 2 minutes for this space. This limit can only be changed with special privileges.")
  public Long getRequestLimit() {
    return requestLimit;
  }

  public void setRequestLimit(Long requestLimit) {
    this.requestLimit = requestLimit;
  }

  
  public AbstractSpaceUpdate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  
  public AbstractSpaceUpdate technicalContactAddresses(List<String> technicalContactAddresses) {
    this.technicalContactAddresses = technicalContactAddresses;
    return this;
  }

  public AbstractSpaceUpdate addTechnicalContactAddressesItem(String technicalContactAddressesItem) {
    if (this.technicalContactAddresses == null) {
      this.technicalContactAddresses = new ArrayList<>();
    }
    this.technicalContactAddresses.add(technicalContactAddressesItem);
    return this;
  }

   /**
   * The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.
   * @return technicalContactAddresses
  **/
  @ApiModelProperty(value = "The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.")
  public List<String> getTechnicalContactAddresses() {
    return technicalContactAddresses;
  }

  public void setTechnicalContactAddresses(List<String> technicalContactAddresses) {
    this.technicalContactAddresses = technicalContactAddresses;
  }

  
  public AbstractSpaceUpdate timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractSpaceUpdate abstractSpaceUpdate = (AbstractSpaceUpdate) o;
    return Objects.equals(this.name, abstractSpaceUpdate.name) &&
        Objects.equals(this.postalAddress, abstractSpaceUpdate.postalAddress) &&
        Objects.equals(this.primaryCurrency, abstractSpaceUpdate.primaryCurrency) &&
        Objects.equals(this.requestLimit, abstractSpaceUpdate.requestLimit) &&
        Objects.equals(this.state, abstractSpaceUpdate.state) &&
        Objects.equals(this.technicalContactAddresses, abstractSpaceUpdate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, abstractSpaceUpdate.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractSpaceUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

