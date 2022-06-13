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
import com.wallee.sdk.model.AnalyticsSchemaColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The schema of a single table in Analytics.
 */
@ApiModel(description = "The schema of a single table in Analytics.")

public class AnalyticsSchemaTable {
  
  @JsonProperty("columns")
  protected List<AnalyticsSchemaColumn> columns = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("tableName")
  protected String tableName = null;

  
  
   /**
   * The schemas of all columns of this table.
   * @return columns
  **/
  @ApiModelProperty(value = "The schemas of all columns of this table.")
  public List<AnalyticsSchemaColumn> getColumns() {
    return columns;
  }

  
   /**
   * A human readable description of the entity type contained in this table.
   * @return description
  **/
  @ApiModelProperty(value = "A human readable description of the entity type contained in this table.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * The name of this table.
   * @return tableName
  **/
  @ApiModelProperty(value = "The name of this table.")
  public String getTableName() {
    return tableName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSchemaTable analyticsSchemaTable = (AnalyticsSchemaTable) o;
    return Objects.equals(this.columns, analyticsSchemaTable.columns) &&
        Objects.equals(this.description, analyticsSchemaTable.description) &&
        Objects.equals(this.tableName, analyticsSchemaTable.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, description, tableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSchemaTable {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

