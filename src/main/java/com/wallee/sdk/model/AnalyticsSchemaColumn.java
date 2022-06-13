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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * Meta information about a column within a table.
 */
@ApiModel(description = "Meta information about a column within a table.")

public class AnalyticsSchemaColumn {
  
  @JsonProperty("aliasName")
  protected String aliasName = null;

  
  @JsonProperty("columnName")
  protected String columnName = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("precision")
  protected Integer precision = null;

  
  @JsonProperty("referencedTable")
  protected String referencedTable = null;

  
  @JsonProperty("scale")
  protected Integer scale = null;

  
  @JsonProperty("tableName")
  protected String tableName = null;

  
  @JsonProperty("type")
  protected String type = null;

  
  
   /**
   * The name of the alias defined for the column in the query or null if none is defined.
   * @return aliasName
  **/
  @ApiModelProperty(value = "The name of the alias defined for the column in the query or null if none is defined.")
  public String getAliasName() {
    return aliasName;
  }

  
   /**
   * The name of the column in the table or null if this is a synthetic column which is the result of some SQL expression.
   * @return columnName
  **/
  @ApiModelProperty(value = "The name of the column in the table or null if this is a synthetic column which is the result of some SQL expression.")
  public String getColumnName() {
    return columnName;
  }

  
   /**
   * A human readable description of the property contained in this column or null if this is a synthetic column which is the result of some SQL expression.
   * @return description
  **/
  @ApiModelProperty(value = "A human readable description of the property contained in this column or null if this is a synthetic column which is the result of some SQL expression.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * The precision (maximal number of digits) for decimal data types, otherwise 0.
   * @return precision
  **/
  @ApiModelProperty(value = "The precision (maximal number of digits) for decimal data types, otherwise 0.")
  public Integer getPrecision() {
    return precision;
  }

  
   /**
   * The name of the referenced table if this column represents a foreign-key relation to the IDs of another table, otherwise null.
   * @return referencedTable
  **/
  @ApiModelProperty(value = "The name of the referenced table if this column represents a foreign-key relation to the IDs of another table, otherwise null.")
  public String getReferencedTable() {
    return referencedTable;
  }

  
   /**
   * The scale (maximal number number of digits in the fractional part) in case of a decimal data type, otherwise 0.
   * @return scale
  **/
  @ApiModelProperty(value = "The scale (maximal number number of digits in the fractional part) in case of a decimal data type, otherwise 0.")
  public Integer getScale() {
    return scale;
  }

  
   /**
   * The name of the table which defines this column.
   * @return tableName
  **/
  @ApiModelProperty(value = "The name of the table which defines this column.")
  public String getTableName() {
    return tableName;
  }

  
   /**
   * The ORC data type of the column value.
   * @return type
  **/
  @ApiModelProperty(value = "The ORC data type of the column value.")
  public String getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSchemaColumn analyticsSchemaColumn = (AnalyticsSchemaColumn) o;
    return Objects.equals(this.aliasName, analyticsSchemaColumn.aliasName) &&
        Objects.equals(this.columnName, analyticsSchemaColumn.columnName) &&
        Objects.equals(this.description, analyticsSchemaColumn.description) &&
        Objects.equals(this.precision, analyticsSchemaColumn.precision) &&
        Objects.equals(this.referencedTable, analyticsSchemaColumn.referencedTable) &&
        Objects.equals(this.scale, analyticsSchemaColumn.scale) &&
        Objects.equals(this.tableName, analyticsSchemaColumn.tableName) &&
        Objects.equals(this.type, analyticsSchemaColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, columnName, description, precision, referencedTable, scale, tableName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSchemaColumn {\n");
    
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    referencedTable: ").append(toIndentedString(referencedTable)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

