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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The metric usage provides details about the consumption of a particular metric.
 */
@ApiModel(description = "The metric usage provides details about the consumption of a particular metric.")

public class MetricUsage {
  
  @JsonProperty("consumedUnits")
  protected BigDecimal consumedUnits = null;

  
  @JsonProperty("metricDescription")
  protected Map<String, String> metricDescription = null;

  
  @JsonProperty("metricId")
  protected Long metricId = null;

  
  @JsonProperty("metricName")
  protected Map<String, String> metricName = null;

  
  
   /**
   * The number of consumed units.
   * @return consumedUnits
  **/
  @ApiModelProperty(value = "The number of consumed units.")
  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }

  
   /**
   * The description of the consumed unit&#39;s metric.
   * @return metricDescription
  **/
  @ApiModelProperty(value = "The description of the consumed unit's metric.")
  public Map<String, String> getMetricDescription() {
    return metricDescription;
  }

  
   /**
   * The ID of the consumed units&#39; metric.
   * @return metricId
  **/
  @ApiModelProperty(value = "The ID of the consumed units' metric.")
  public Long getMetricId() {
    return metricId;
  }

  
   /**
   * The name of the consumed units&#39; metric.
   * @return metricName
  **/
  @ApiModelProperty(value = "The name of the consumed units' metric.")
  public Map<String, String> getMetricName() {
    return metricName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
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

