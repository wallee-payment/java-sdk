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
import com.wallee.sdk.model.BillingCycleType;
import com.wallee.sdk.model.BillingDayCustomization;
import com.wallee.sdk.model.DisplayableDayOfWeek;
import com.wallee.sdk.model.DisplayableMonth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class BillingCycleModel {
  
  @JsonProperty("billingCycleType")
  protected BillingCycleType billingCycleType = null;

  
  @JsonProperty("customization")
  protected BillingDayCustomization customization = null;

  
  @JsonProperty("dayOfMonth")
  protected Integer dayOfMonth = null;

  
  @JsonProperty("month")
  protected DisplayableMonth month = null;

  
  @JsonProperty("numberOfPeriods")
  protected Integer numberOfPeriods = null;

  
  @JsonProperty("weeklyDay")
  protected DisplayableDayOfWeek weeklyDay = null;

  
  
  public BillingCycleModel billingCycleType(BillingCycleType billingCycleType) {
    this.billingCycleType = billingCycleType;
    return this;
  }

   /**
   * 
   * @return billingCycleType
  **/
  @ApiModelProperty(required = true, value = "")
  public BillingCycleType getBillingCycleType() {
    return billingCycleType;
  }

  public void setBillingCycleType(BillingCycleType billingCycleType) {
    this.billingCycleType = billingCycleType;
  }

  
  public BillingCycleModel customization(BillingDayCustomization customization) {
    this.customization = customization;
    return this;
  }

   /**
   * 
   * @return customization
  **/
  @ApiModelProperty(value = "")
  public BillingDayCustomization getCustomization() {
    return customization;
  }

  public void setCustomization(BillingDayCustomization customization) {
    this.customization = customization;
  }

  
  public BillingCycleModel dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * 
   * @return dayOfMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  
  public BillingCycleModel month(DisplayableMonth month) {
    this.month = month;
    return this;
  }

   /**
   * 
   * @return month
  **/
  @ApiModelProperty(value = "")
  public DisplayableMonth getMonth() {
    return month;
  }

  public void setMonth(DisplayableMonth month) {
    this.month = month;
  }

  
  public BillingCycleModel numberOfPeriods(Integer numberOfPeriods) {
    this.numberOfPeriods = numberOfPeriods;
    return this;
  }

   /**
   * Billing Cycle type multiplied by Number of Periods defines billing cycle duration, e.g. 3 months. Monthly types require 1-12; weekly and yearly types require 1-9 periods; and daily types require 1-30.
   * @return numberOfPeriods
  **/
  @ApiModelProperty(required = true, value = "Billing Cycle type multiplied by Number of Periods defines billing cycle duration, e.g. 3 months. Monthly types require 1-12; weekly and yearly types require 1-9 periods; and daily types require 1-30.")
  public Integer getNumberOfPeriods() {
    return numberOfPeriods;
  }

  public void setNumberOfPeriods(Integer numberOfPeriods) {
    this.numberOfPeriods = numberOfPeriods;
  }

  
  public BillingCycleModel weeklyDay(DisplayableDayOfWeek weeklyDay) {
    this.weeklyDay = weeklyDay;
    return this;
  }

   /**
   * 
   * @return weeklyDay
  **/
  @ApiModelProperty(value = "")
  public DisplayableDayOfWeek getWeeklyDay() {
    return weeklyDay;
  }

  public void setWeeklyDay(DisplayableDayOfWeek weeklyDay) {
    this.weeklyDay = weeklyDay;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCycleModel billingCycleModel = (BillingCycleModel) o;
    return Objects.equals(this.billingCycleType, billingCycleModel.billingCycleType) &&
        Objects.equals(this.customization, billingCycleModel.customization) &&
        Objects.equals(this.dayOfMonth, billingCycleModel.dayOfMonth) &&
        Objects.equals(this.month, billingCycleModel.month) &&
        Objects.equals(this.numberOfPeriods, billingCycleModel.numberOfPeriods) &&
        Objects.equals(this.weeklyDay, billingCycleModel.weeklyDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycleType, customization, dayOfMonth, month, numberOfPeriods, weeklyDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCycleModel {\n");
    
    sb.append("    billingCycleType: ").append(toIndentedString(billingCycleType)).append("\n");
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    numberOfPeriods: ").append(toIndentedString(numberOfPeriods)).append("\n");
    sb.append("    weeklyDay: ").append(toIndentedString(weeklyDay)).append("\n");
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

