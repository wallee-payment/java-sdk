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


package com.wallee.sdk.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  @JsonCreator
  public static SubscriptionChargeState fromValue(String text) {
    for (SubscriptionChargeState b : SubscriptionChargeState.values()) {
      if (b.name().equals(text)) {
        return b;
      }
    }
    return null;
  }
}

