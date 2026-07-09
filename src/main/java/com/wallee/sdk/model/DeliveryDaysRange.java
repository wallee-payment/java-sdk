/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DeliveryDaysRange
 */
public enum DeliveryDaysRange {
  
  ZERO_DAYS("ZERO_DAYS"),
  
  ONE_TO_THREE_DAYS("ONE_TO_THREE_DAYS"),
  
  THREE_TO_FIVE_DAYS("THREE_TO_FIVE_DAYS"),
  
  FIVE_TO_TEN_DAYS("FIVE_TO_TEN_DAYS"),
  
  TEN_TO_FIFTEEN_DAYS("TEN_TO_FIFTEEN_DAYS"),
  
  FIFTEEN_TO_TWENTY_DAYS("FIFTEEN_TO_TWENTY_DAYS"),
  
  TWENTY_TO_THIRTY_DAYS("TWENTY_TO_THIRTY_DAYS"),
  
  THIRTY_TO_FORTY_DAYS("THIRTY_TO_FORTY_DAYS"),
  
  FORTY_TO_FIFTY_DAYS("FORTY_TO_FIFTY_DAYS"),
  
  FIFTY_TO_SIXTY_DAYS("FIFTY_TO_SIXTY_DAYS"),
  
  SIXTY_TO_NINETY_DAYS("SIXTY_TO_NINETY_DAYS"),
  
  OVER_NINETY_DAYS("OVER_NINETY_DAYS");

  private String value;

  DeliveryDaysRange(String value) {
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
  public static DeliveryDaysRange fromValue(String value) {
    for (DeliveryDaysRange b : DeliveryDaysRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

