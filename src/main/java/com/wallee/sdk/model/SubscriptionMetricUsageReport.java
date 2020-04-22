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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
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
   * The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle.
   * @return consumedUnits
  **/
  @ApiModelProperty(value = "The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle.")
  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }

  
   /**
   * 
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedByUserId() {
    return createdByUserId;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The metric usage report description describe the reported usage. This description may be shown to the end user.
   * @return description
  **/
  @ApiModelProperty(value = "The metric usage report description describe the reported usage. This description may be shown to the end user.")
  public String getDescription() {
    return description;
  }

  
   /**
   * The external id identifies the metric usage uniquely.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external id identifies the metric usage uniquely.")
  public String getExternalId() {
    return externalId;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The metric usage report is linked to the metric for which the usage should be recorded.
   * @return metric
  **/
  @ApiModelProperty(value = "The metric usage report is linked to the metric for which the usage should be recorded.")
  public Long getMetric() {
    return metric;
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
   * The subscription to which the usage is added to.
   * @return subscription
  **/
  @ApiModelProperty(value = "The subscription to which the usage is added to.")
  public Long getSubscription() {
    return subscription;
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

