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
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.
 */
@ApiModel(description = "The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.")

public class SubscriptionMetricUsageReport {
  
  @JsonProperty("consumedUnits")
  protected BigDecimal consumedUnits = null;

  
  @JsonProperty("createdByUserId")
  protected Long createdByUserId = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("metric")
  protected Long metric = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("subscription")
  protected Long subscription = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The number of resources consumed, will be charged in the next billing cycle.
   * @return consumedUnits
  **/
  @ApiModelProperty(value = "The number of resources consumed, will be charged in the next billing cycle.")
  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }

  
   /**
   * The ID of the user the usage report was created by.
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "The ID of the user the usage report was created by.")
  public Long getCreatedByUserId() {
    return createdByUserId;
  }

  
   /**
   * The date and time when the usage report was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the usage report was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * A description used to identify the usage report.
   * @return description
  **/
  @ApiModelProperty(value = "A description used to identify the usage report.")
  public String getDescription() {
    return description;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The metric that the usage report is recorded for.
   * @return metric
  **/
  @ApiModelProperty(value = "The metric that the usage report is recorded for.")
  public Long getMetric() {
    return metric;
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
   * The subscription that the usage report is recorded for.
   * @return subscription
  **/
  @ApiModelProperty(value = "The subscription that the usage report is recorded for.")
  public Long getSubscription() {
    return subscription;
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
    SubscriptionMetricUsageReport subscriptionMetricUsageReport = (SubscriptionMetricUsageReport) o;
    return Objects.equals(this.consumedUnits, subscriptionMetricUsageReport.consumedUnits) &&
        Objects.equals(this.createdByUserId, subscriptionMetricUsageReport.createdByUserId) &&
        Objects.equals(this.createdOn, subscriptionMetricUsageReport.createdOn) &&
        Objects.equals(this.description, subscriptionMetricUsageReport.description) &&
        Objects.equals(this.externalId, subscriptionMetricUsageReport.externalId) &&
        Objects.equals(this.id, subscriptionMetricUsageReport.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionMetricUsageReport.linkedSpaceId) &&
        Objects.equals(this.metric, subscriptionMetricUsageReport.metric) &&
        Objects.equals(this.plannedPurgeDate, subscriptionMetricUsageReport.plannedPurgeDate) &&
        Objects.equals(this.subscription, subscriptionMetricUsageReport.subscription) &&
        Objects.equals(this.version, subscriptionMetricUsageReport.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumedUnits, createdByUserId, createdOn, description, externalId, id, linkedSpaceId, metric, plannedPurgeDate, subscription, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMetricUsageReport {\n");
    
    sb.append("    consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

