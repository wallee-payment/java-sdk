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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.ChargeAttemptProjection;
import com.wallee.sdk.model.TransactionProjection;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChargeAttemptLookupResult
 */
@JsonPropertyOrder({
  ChargeAttemptLookupResult.JSON_PROPERTY_SUCCESSFUL_CHARGE_ATTEMPT,
  ChargeAttemptLookupResult.JSON_PROPERTY_TRANSACTION
})

public class ChargeAttemptLookupResult {
  public static final String JSON_PROPERTY_SUCCESSFUL_CHARGE_ATTEMPT = "successfulChargeAttempt";
  @javax.annotation.Nullable
  private ChargeAttemptProjection successfulChargeAttempt;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private TransactionProjection transaction;

  public ChargeAttemptLookupResult() {
  }

  public ChargeAttemptLookupResult successfulChargeAttempt(@javax.annotation.Nullable ChargeAttemptProjection successfulChargeAttempt) {
    
    this.successfulChargeAttempt = successfulChargeAttempt;
    return this;
  }

  /**
   * Get successfulChargeAttempt
   * @return successfulChargeAttempt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_CHARGE_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptProjection getSuccessfulChargeAttempt() {
    return successfulChargeAttempt;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_CHARGE_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulChargeAttempt(@javax.annotation.Nullable ChargeAttemptProjection successfulChargeAttempt) {
    this.successfulChargeAttempt = successfulChargeAttempt;
  }

  public ChargeAttemptLookupResult transaction(@javax.annotation.Nullable TransactionProjection transaction) {
    
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionProjection getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(@javax.annotation.Nullable TransactionProjection transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAttemptLookupResult chargeAttemptLookupResult = (ChargeAttemptLookupResult) o;
    return Objects.equals(this.successfulChargeAttempt, chargeAttemptLookupResult.successfulChargeAttempt) &&
        Objects.equals(this.transaction, chargeAttemptLookupResult.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulChargeAttempt, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAttemptLookupResult {\n");
    sb.append("    successfulChargeAttempt: ").append(toIndentedString(successfulChargeAttempt)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `successfulChargeAttempt` to the URL query string
    if (getSuccessfulChargeAttempt() != null) {
      joiner.add(getSuccessfulChargeAttempt().toUrlQueryString(prefix + "successfulChargeAttempt" + suffix));
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    return joiner.toString();
  }

}

