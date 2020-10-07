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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 
 */
public enum TransactionEnvironmentSelectionStrategy {
  
  FORCE_TEST_ENVIRONMENT("FORCE_TEST_ENVIRONMENT"),
  
  FORCE_PRODUCTION_ENVIRONMENT("FORCE_PRODUCTION_ENVIRONMENT"),
  
  USE_CONFIGURATION("USE_CONFIGURATION");

  private String value;

  TransactionEnvironmentSelectionStrategy(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionEnvironmentSelectionStrategy fromValue(String text) {
    for (TransactionEnvironmentSelectionStrategy b : TransactionEnvironmentSelectionStrategy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

