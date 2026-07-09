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
 * Gets or Sets LegalForm
 */
public enum LegalForm {
  
  SOLE_PROPRIETORSHIP("SOLE_PROPRIETORSHIP"),
  
  COOPERATIVE("COOPERATIVE"),
  
  PARTNERSHIP_LIMITED_BY_SHARES("PARTNERSHIP_LIMITED_BY_SHARES"),
  
  COMPANY_LIMITED_BY_SHARES("COMPANY_LIMITED_BY_SHARES"),
  
  LIMITED_LIABILITY_COMPANY("LIMITED_LIABILITY_COMPANY"),
  
  ASSOCIATION("ASSOCIATION"),
  
  FOUNDATION("FOUNDATION"),
  
  PUBLIC_INSTITUTION("PUBLIC_INSTITUTION"),
  
  GENERAL_PARTNERSHIP("GENERAL_PARTNERSHIP"),
  
  NON_DEFINED_LEGAL_FORM("NON_DEFINED_LEGAL_FORM"),
  
  PUBLIC_AG_CORPORATION("PUBLIC_AG_CORPORATION"),
  
  PUBLIC_LIMITED_LIABILITY_COMPANY("PUBLIC_LIMITED_LIABILITY_COMPANY"),
  
  BODY_CORPORATE("BODY_CORPORATE"),
  
  PUBLIC_COOPERATIVE("PUBLIC_COOPERATIVE"),
  
  PUBLIC_ASSOCIATION("PUBLIC_ASSOCIATION"),
  
  SPECIAL_LEGAL_FORM("SPECIAL_LEGAL_FORM"),
  
  LIMITED_PARTNERSHIP_COLLECTIVE_INVESTMENT("LIMITED_PARTNERSHIP_COLLECTIVE_INVESTMENT"),
  
  SIMPLE_PARTNERSHIP("SIMPLE_PARTNERSHIP"),
  
  INTERNATIONAL_ORGANIZATION("INTERNATIONAL_ORGANIZATION"),
  
  TRUST("TRUST"),
  
  FUND("FUND"),
  
  EUROPEAN_COMPANY("EUROPEAN_COMPANY"),
  
  LIMITED_PARTNERSHIP("LIMITED_PARTNERSHIP");

  private String value;

  LegalForm(String value) {
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
  public static LegalForm fromValue(String value) {
    for (LegalForm b : LegalForm.values()) {
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

