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
@JsonAdapter(SubscriptionChargeState.Adapter.class)
public enum SubscriptionChargeState {
  
  SCHEDULED("SCHEDULED"),
  
  DISCARDED("DISCARDED"),
  
  PROCESSING("PROCESSING"),
  
  SUCCESSFUL("SUCCESSFUL"),
  
  FAILED("FAILED");

  private String value;

  SubscriptionChargeState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionChargeState fromValue(String text) {
    for (SubscriptionChargeState b : SubscriptionChargeState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubscriptionChargeState> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionChargeState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionChargeState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionChargeState.fromValue(String.valueOf(value));
    }
  }
}

