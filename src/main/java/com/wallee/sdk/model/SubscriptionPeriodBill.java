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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.SubscriptionPeriodBillState;
import com.wallee.sdk.model.SubscriptionVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SubscriptionPeriodBill {
  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("effectivePeriodEndDate")
  protected OffsetDateTime effectivePeriodEndDate = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("language")
  protected String language = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("periodStartDate")
  protected OffsetDateTime periodStartDate = null;

  
  @SerializedName("plannedPeriodEndDate")
  protected OffsetDateTime plannedPeriodEndDate = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("state")
  protected SubscriptionPeriodBillState state = null;

  
  @SerializedName("subscriptionVersion")
  protected SubscriptionVersion subscriptionVersion = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return effectivePeriodEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectivePeriodEndDate() {
    return effectivePeriodEndDate;
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
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return periodStartDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }

  
   /**
   * 
   * @return plannedPeriodEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedPeriodEndDate() {
    return plannedPeriodEndDate;
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
  public SubscriptionPeriodBillState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriptionVersion
  **/
  @ApiModelProperty(value = "")
  public SubscriptionVersion getSubscriptionVersion() {
    return subscriptionVersion;
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
    SubscriptionPeriodBill subscriptionPeriodBill = (SubscriptionPeriodBill) o;
    return Objects.equals(this.createdOn, subscriptionPeriodBill.createdOn) &&
        Objects.equals(this.effectivePeriodEndDate, subscriptionPeriodBill.effectivePeriodEndDate) &&
        Objects.equals(this.id, subscriptionPeriodBill.id) &&
        Objects.equals(this.language, subscriptionPeriodBill.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionPeriodBill.linkedSpaceId) &&
        Objects.equals(this.periodStartDate, subscriptionPeriodBill.periodStartDate) &&
        Objects.equals(this.plannedPeriodEndDate, subscriptionPeriodBill.plannedPeriodEndDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionPeriodBill.plannedPurgeDate) &&
        Objects.equals(this.state, subscriptionPeriodBill.state) &&
        Objects.equals(this.subscriptionVersion, subscriptionPeriodBill.subscriptionVersion) &&
        Objects.equals(this.version, subscriptionPeriodBill.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, effectivePeriodEndDate, id, language, linkedSpaceId, periodStartDate, plannedPeriodEndDate, plannedPurgeDate, state, subscriptionVersion, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPeriodBill {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    effectivePeriodEndDate: ").append(toIndentedString(effectivePeriodEndDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    plannedPeriodEndDate: ").append(toIndentedString(plannedPeriodEndDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
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

