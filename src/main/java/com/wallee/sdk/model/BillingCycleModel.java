/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.BillingCycleType;
import com.wallee.sdk.model.BillingDayCustomization;
import com.wallee.sdk.model.DisplayableDayOfWeek;
import com.wallee.sdk.model.DisplayableMonth;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BillingCycleModel
 */
@JsonPropertyOrder({
  BillingCycleModel.JSON_PROPERTY_MONTH,
  BillingCycleModel.JSON_PROPERTY_CUSTOMIZATION,
  BillingCycleModel.JSON_PROPERTY_DAY_OF_MONTH,
  BillingCycleModel.JSON_PROPERTY_WEEKLY_DAY,
  BillingCycleModel.JSON_PROPERTY_NUMBER_OF_PERIODS,
  BillingCycleModel.JSON_PROPERTY_BILLING_CYCLE_TYPE
})

public class BillingCycleModel {
  public static final String JSON_PROPERTY_MONTH = "month";
  @javax.annotation.Nullable
  private DisplayableMonth month;

  public static final String JSON_PROPERTY_CUSTOMIZATION = "customization";
  @javax.annotation.Nullable
  private BillingDayCustomization customization;

  public static final String JSON_PROPERTY_DAY_OF_MONTH = "dayOfMonth";
  @javax.annotation.Nullable
  private Integer dayOfMonth;

  public static final String JSON_PROPERTY_WEEKLY_DAY = "weeklyDay";
  @javax.annotation.Nullable
  private DisplayableDayOfWeek weeklyDay;

  public static final String JSON_PROPERTY_NUMBER_OF_PERIODS = "numberOfPeriods";
  @javax.annotation.Nonnull
  private Integer numberOfPeriods;

  public static final String JSON_PROPERTY_BILLING_CYCLE_TYPE = "billingCycleType";
  @javax.annotation.Nonnull
  private BillingCycleType billingCycleType;

  public BillingCycleModel() {
  }

  public BillingCycleModel month(@javax.annotation.Nullable DisplayableMonth month) {
    
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayableMonth getMonth() {
    return month;
  }


  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth(@javax.annotation.Nullable DisplayableMonth month) {
    this.month = month;
  }

  public BillingCycleModel customization(@javax.annotation.Nullable BillingDayCustomization customization) {
    
    this.customization = customization;
    return this;
  }

  /**
   * Get customization
   * @return customization
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingDayCustomization getCustomization() {
    return customization;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomization(@javax.annotation.Nullable BillingDayCustomization customization) {
    this.customization = customization;
  }

  public BillingCycleModel dayOfMonth(@javax.annotation.Nullable Integer dayOfMonth) {
    
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * Get dayOfMonth
   * @return dayOfMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfMonth(@javax.annotation.Nullable Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public BillingCycleModel weeklyDay(@javax.annotation.Nullable DisplayableDayOfWeek weeklyDay) {
    
    this.weeklyDay = weeklyDay;
    return this;
  }

  /**
   * Get weeklyDay
   * @return weeklyDay
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKLY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayableDayOfWeek getWeeklyDay() {
    return weeklyDay;
  }


  @JsonProperty(JSON_PROPERTY_WEEKLY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeeklyDay(@javax.annotation.Nullable DisplayableDayOfWeek weeklyDay) {
    this.weeklyDay = weeklyDay;
  }

  public BillingCycleModel numberOfPeriods(@javax.annotation.Nonnull Integer numberOfPeriods) {
    
    this.numberOfPeriods = numberOfPeriods;
    return this;
  }

  /**
   * Billing Cycle type multiplied by Number of Periods defines billing cycle duration, e.g. 3 months. Monthly types require 1-12; weekly and yearly types require 1-9 periods; and daily types require 1-30.
   * minimum: 1
   * @return numberOfPeriods
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfPeriods() {
    return numberOfPeriods;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfPeriods(@javax.annotation.Nonnull Integer numberOfPeriods) {
    this.numberOfPeriods = numberOfPeriods;
  }

  public BillingCycleModel billingCycleType(@javax.annotation.Nonnull BillingCycleType billingCycleType) {
    
    this.billingCycleType = billingCycleType;
    return this;
  }

  /**
   * Get billingCycleType
   * @return billingCycleType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BillingCycleType getBillingCycleType() {
    return billingCycleType;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillingCycleType(@javax.annotation.Nonnull BillingCycleType billingCycleType) {
    this.billingCycleType = billingCycleType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCycleModel billingCycleModel = (BillingCycleModel) o;
    return Objects.equals(this.month, billingCycleModel.month) &&
        Objects.equals(this.customization, billingCycleModel.customization) &&
        Objects.equals(this.dayOfMonth, billingCycleModel.dayOfMonth) &&
        Objects.equals(this.weeklyDay, billingCycleModel.weeklyDay) &&
        Objects.equals(this.numberOfPeriods, billingCycleModel.numberOfPeriods) &&
        Objects.equals(this.billingCycleType, billingCycleModel.billingCycleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, customization, dayOfMonth, weeklyDay, numberOfPeriods, billingCycleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCycleModel {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    weeklyDay: ").append(toIndentedString(weeklyDay)).append("\n");
    sb.append("    numberOfPeriods: ").append(toIndentedString(numberOfPeriods)).append("\n");
    sb.append("    billingCycleType: ").append(toIndentedString(billingCycleType)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `month` to the URL query string
    if (getMonth() != null) {
      try {
        joiner.add(String.format("%smonth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMonth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customization` to the URL query string
    if (getCustomization() != null) {
      try {
        joiner.add(String.format("%scustomization%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomization()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dayOfMonth` to the URL query string
    if (getDayOfMonth() != null) {
      try {
        joiner.add(String.format("%sdayOfMonth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDayOfMonth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `weeklyDay` to the URL query string
    if (getWeeklyDay() != null) {
      try {
        joiner.add(String.format("%sweeklyDay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWeeklyDay()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `numberOfPeriods` to the URL query string
    if (getNumberOfPeriods() != null) {
      try {
        joiner.add(String.format("%snumberOfPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfPeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingCycleType` to the URL query string
    if (getBillingCycleType() != null) {
      try {
        joiner.add(String.format("%sbillingCycleType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBillingCycleType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

