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
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.
 */
@ApiModel(description = "The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.")

public class SubscriptionMetricUsageReportCreate {
  
  @JsonProperty("consumedUnits")
  protected BigDecimal consumedUnits = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("metric")
  protected Long metric = null;

  
  @JsonProperty("subscription")
  protected Long subscription = null;

  
  
  public SubscriptionMetricUsageReportCreate consumedUnits(BigDecimal consumedUnits) {
    this.consumedUnits = consumedUnits;
    return this;
  }

   /**
   * The number of resources consumed, will be charged in the next billing cycle.
   * @return consumedUnits
  **/
  @ApiModelProperty(required = true, value = "The number of resources consumed, will be charged in the next billing cycle.")
  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }

  public void setConsumedUnits(BigDecimal consumedUnits) {
    this.consumedUnits = consumedUnits;
  }

  
  public SubscriptionMetricUsageReportCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description used to identify the usage report.
   * @return description
  **/
  @ApiModelProperty(value = "A description used to identify the usage report.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public SubscriptionMetricUsageReportCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public SubscriptionMetricUsageReportCreate metric(Long metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The metric that the usage report is recorded for.
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "The metric that the usage report is recorded for.")
  public Long getMetric() {
    return metric;
  }

  public void setMetric(Long metric) {
    this.metric = metric;
  }

  
  public SubscriptionMetricUsageReportCreate subscription(Long subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * The subscription that the usage report is recorded for.
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "The subscription that the usage report is recorded for.")
  public Long getSubscription() {
    return subscription;
  }

  public void setSubscription(Long subscription) {
    this.subscription = subscription;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionMetricUsageReportCreate subscriptionMetricUsageReportCreate = (SubscriptionMetricUsageReportCreate) o;
    return Objects.equals(this.consumedUnits, subscriptionMetricUsageReportCreate.consumedUnits) &&
        Objects.equals(this.description, subscriptionMetricUsageReportCreate.description) &&
        Objects.equals(this.externalId, subscriptionMetricUsageReportCreate.externalId) &&
        Objects.equals(this.metric, subscriptionMetricUsageReportCreate.metric) &&
        Objects.equals(this.subscription, subscriptionMetricUsageReportCreate.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumedUnits, description, externalId, metric, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMetricUsageReportCreate {\n");
    
    sb.append("    consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

