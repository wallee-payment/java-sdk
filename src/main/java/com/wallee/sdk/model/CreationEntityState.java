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
@JsonAdapter(CreationEntityState.Adapter.class)
public enum CreationEntityState {
  
  CREATE("CREATE"),
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  DELETING("DELETING"),
  
  DELETED("DELETED");

  private String value;

  CreationEntityState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreationEntityState fromValue(String text) {
    for (CreationEntityState b : CreationEntityState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreationEntityState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreationEntityState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreationEntityState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreationEntityState.fromValue(String.valueOf(value));
    }
  }
}

