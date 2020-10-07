/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

/**
 * The metric usage provides details about the consumption of a particular metric.
 */
@ApiModel(description = "The metric usage provides details about the consumption of a particular metric.")

public class MetricUsage extends Indentable {

    @JsonProperty("consumedUnits")
    protected BigDecimal consumedUnits;


    @JsonProperty("metricDescription")
    protected Map<String, String> metricDescription;


    @JsonProperty("metricId")
    protected Long metricId;


    @JsonProperty("metricName")
    protected Map<String, String> metricName;


    /**
     * The consumed units provide the value of how much has been consumed of the particular metric.
     * @return consumedUnits
     **/
    @ApiModelProperty(value = "The consumed units provide the value of how much has been consumed of the particular metric.")
    public BigDecimal getConsumedUnits() {
        return consumedUnits;
    }


    /**
     * The metric description describes the metric.
     * @return metricDescription
     **/
    @ApiModelProperty(value = "The metric description describes the metric.")
    public Map<String, String> getMetricDescription() {
        return metricDescription;
    }


    /**
     * The metric ID identifies the metric for consumed units.
     * @return metricId
     **/
    @ApiModelProperty(value = "The metric ID identifies the metric for consumed units.")
    public Long getMetricId() {
        return metricId;
    }


    /**
     * The metric name defines the name of the consumed units.
     * @return metricName
     **/
    @ApiModelProperty(value = "The metric name defines the name of the consumed units.")
    public Map<String, String> getMetricName() {
        return metricName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricUsage metricUsage = (MetricUsage) o;
        return Objects.equals(this.consumedUnits, metricUsage.consumedUnits) &&
                Objects.equals(this.metricDescription, metricUsage.metricDescription) &&
                Objects.equals(this.metricId, metricUsage.metricId) &&
                Objects.equals(this.metricName, metricUsage.metricName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumedUnits, metricDescription, metricId, metricName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricUsage {\n");

        sb.append("    consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
        sb.append("    metricDescription: ").append(toIndentedString(metricDescription)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

