/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.
 */
@io.swagger.annotations.ApiModel(description = "The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.")
public class SubscriptionMetricUsageReportCreate {
	@SerializedName("consumedUnits")
	private BigDecimal consumedUnits = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("metric")
	private Long metric = null;

	@SerializedName("subscription")
	private Long subscription = null;

	public SubscriptionMetricUsageReportCreate consumedUnits(BigDecimal consumedUnits) {
		this.consumedUnits = consumedUnits;
		return this;
	}

	/**
	 * The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle.
	 *
	 * @return The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle.")
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
	 * The metric usage report description describe the reported usage. This description may be shown to the end user.
	 *
	 * @return The metric usage report description describe the reported usage. This description may be shown to the end user.
	 */
	@ApiModelProperty(example = "null", value = "The metric usage report description describe the reported usage. This description may be shown to the end user.")
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
	 * The external id identifies the metric usage uniquely.
	 *
	 * @return The external id identifies the metric usage uniquely.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The external id identifies the metric usage uniquely.")
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
	 * The metric usage report is linked to the metric for which the usage should be recorded.
	 *
	 * @return The metric usage report is linked to the metric for which the usage should be recorded.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The metric usage report is linked to the metric for which the usage should be recorded.")
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
	 * The subscription to which the usage is added to.
	 *
	 * @return The subscription to which the usage is added to.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The subscription to which the usage is added to.")
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
		
		sb.append("		consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		metric: ").append(toIndentedString(metric)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

