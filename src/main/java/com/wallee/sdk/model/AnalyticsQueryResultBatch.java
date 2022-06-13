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
import com.wallee.sdk.model.AnalyticsQueryExecution;
import com.wallee.sdk.model.AnalyticsSchemaColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A batch of the result of a query executed in Analytics.
 */
@ApiModel(description = "A batch of the result of a query executed in Analytics.")

public class AnalyticsQueryResultBatch {
  
  @JsonProperty("columns")
  protected List<AnalyticsSchemaColumn> columns = null;

  
  @JsonProperty("nextToken")
  protected String nextToken = null;

  
  @JsonProperty("queryExecution")
  protected AnalyticsQueryExecution queryExecution = null;

  
  @JsonProperty("rows")
  protected List<List<String>> rows = null;

  
  
   /**
   * The schemas of the columns returned by the query (in order). Will be null if the results of the query are not (yet) available.
   * @return columns
  **/
  @ApiModelProperty(value = "The schemas of the columns returned by the query (in order). Will be null if the results of the query are not (yet) available.")
  public List<AnalyticsSchemaColumn> getColumns() {
    return columns;
  }

  
   /**
   * The token to be provided to fetch the next batch of results. May be null if no more result batches are available.
   * @return nextToken
  **/
  @ApiModelProperty(value = "The token to be provided to fetch the next batch of results. May be null if no more result batches are available.")
  public String getNextToken() {
    return nextToken;
  }

  
   /**
   * The query execution which produced the result.
   * @return queryExecution
  **/
  @ApiModelProperty(value = "The query execution which produced the result.")
  public AnalyticsQueryExecution getQueryExecution() {
    return queryExecution;
  }

  
   /**
   * The rows of the result set contained in this batch where each row is a list of column values (in order of the columns specified in the query). Will be null if the results of the query are not (yet) available.
   * @return rows
  **/
  @ApiModelProperty(value = "The rows of the result set contained in this batch where each row is a list of column values (in order of the columns specified in the query). Will be null if the results of the query are not (yet) available.")
  public List<List<String>> getRows() {
    return rows;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryResultBatch analyticsQueryResultBatch = (AnalyticsQueryResultBatch) o;
    return Objects.equals(this.columns, analyticsQueryResultBatch.columns) &&
        Objects.equals(this.nextToken, analyticsQueryResultBatch.nextToken) &&
        Objects.equals(this.queryExecution, analyticsQueryResultBatch.queryExecution) &&
        Objects.equals(this.rows, analyticsQueryResultBatch.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, nextToken, queryExecution, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryResultBatch {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    queryExecution: ").append(toIndentedString(queryExecution)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

