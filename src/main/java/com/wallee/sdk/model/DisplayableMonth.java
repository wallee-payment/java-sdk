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
import io.swagger.annotations.ApiModel;
import java.util.*;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 
 */
public enum DisplayableMonth {
  
  JANUARY("JANUARY"),
  
  FEBRUARY("FEBRUARY"),
  
  MARCH("MARCH"),
  
  APRIL("APRIL"),
  
  MAY("MAY"),
  
  JUNE("JUNE"),
  
  JULY("JULY"),
  
  AUGUST("AUGUST"),
  
  SEPTEMBER("SEPTEMBER"),
  
  OCTOBER("OCTOBER"),
  
  NOVEMBER("NOVEMBER"),
  
  DECEMBER("DECEMBER");

  private String value;

  DisplayableMonth(String value) {
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
  public static DisplayableMonth fromValue(String text) {
    for (DisplayableMonth b : DisplayableMonth.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

