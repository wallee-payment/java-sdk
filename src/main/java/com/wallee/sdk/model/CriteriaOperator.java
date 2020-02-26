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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.util.*;
import java.time.OffsetDateTime;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(CriteriaOperator.Adapter.class)
public enum CriteriaOperator {
  
  CONTAINS("CONTAINS"),
  
  EQUALS("EQUALS"),
  
  EQUALS_IGNORE_CASE("EQUALS_IGNORE_CASE"),
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_OR_EQUAL("GREATER_THAN_OR_EQUAL"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_OR_EQUAL("LESS_THAN_OR_EQUAL"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  NOT_EQUALS_IGNORE_CASE("NOT_EQUALS_IGNORE_CASE"),
  
  NOT_CONTAINS("NOT_CONTAINS"),
  
  IS_NULL("IS_NULL"),
  
  IS_NOT_NULL("IS_NOT_NULL");

  private String value;

  CriteriaOperator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CriteriaOperator fromValue(String text) {
    for (CriteriaOperator b : CriteriaOperator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CriteriaOperator> {
    @Override
    public void write(final JsonWriter jsonWriter, final CriteriaOperator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CriteriaOperator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CriteriaOperator.fromValue(String.valueOf(value));
    }
  }
}

