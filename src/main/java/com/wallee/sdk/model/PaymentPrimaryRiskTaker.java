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
 * The primary risk taker will have the main loss when one party of the contract does not fulfill the contractual duties.
 */
@JsonAdapter(PaymentPrimaryRiskTaker.Adapter.class)
public enum PaymentPrimaryRiskTaker {
  
  CUSTOMER("CUSTOMER"),
  
  MERCHANT("MERCHANT"),
  
  THIRD_PARTY("THIRD_PARTY");

  private String value;

  PaymentPrimaryRiskTaker(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentPrimaryRiskTaker fromValue(String text) {
    for (PaymentPrimaryRiskTaker b : PaymentPrimaryRiskTaker.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentPrimaryRiskTaker> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentPrimaryRiskTaker enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentPrimaryRiskTaker read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentPrimaryRiskTaker.fromValue(String.valueOf(value));
    }
  }
}

