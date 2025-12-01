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
import com.wallee.sdk.model.Charge;
import com.wallee.sdk.model.ChargeFlowLevelConfiguration;
import com.wallee.sdk.model.ChargeFlowLevelState;
import com.wallee.sdk.model.Transaction;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChargeFlowLevel
 */
@JsonPropertyOrder({
  ChargeFlowLevel.JSON_PROPERTY_SYNCHRONOUS_CHARGE,
  ChargeFlowLevel.JSON_PROPERTY_CONFIGURATION,
  ChargeFlowLevel.JSON_PROPERTY_PLANNED_PURGE_DATE,
  ChargeFlowLevel.JSON_PROPERTY_CREATED_ON,
  ChargeFlowLevel.JSON_PROPERTY_VERSION,
  ChargeFlowLevel.JSON_PROPERTY_LINKED_SPACE_ID,
  ChargeFlowLevel.JSON_PROPERTY_TIMEOUT_ON,
  ChargeFlowLevel.JSON_PROPERTY_ID,
  ChargeFlowLevel.JSON_PROPERTY_STATE,
  ChargeFlowLevel.JSON_PROPERTY_ASYNCHRONOUS_CHARGE,
  ChargeFlowLevel.JSON_PROPERTY_LINKED_TRANSACTION,
  ChargeFlowLevel.JSON_PROPERTY_TOKEN_CHARGE,
  ChargeFlowLevel.JSON_PROPERTY_TRANSACTION
})

public class ChargeFlowLevel {
  public static final String JSON_PROPERTY_SYNCHRONOUS_CHARGE = "synchronousCharge";
  @javax.annotation.Nullable
  private Charge synchronousCharge;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private ChargeFlowLevelConfiguration _configuration;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  @javax.annotation.Nullable
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private ChargeFlowLevelState state;

  public static final String JSON_PROPERTY_ASYNCHRONOUS_CHARGE = "asynchronousCharge";
  @javax.annotation.Nullable
  private Charge asynchronousCharge;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_TOKEN_CHARGE = "tokenCharge";
  @javax.annotation.Nullable
  private Charge tokenCharge;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private Transaction transaction;

  public ChargeFlowLevel() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ChargeFlowLevel(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
  }

  public ChargeFlowLevel synchronousCharge(@javax.annotation.Nullable Charge synchronousCharge) {
    
    this.synchronousCharge = synchronousCharge;
    return this;
  }

  /**
   * Get synchronousCharge
   * @return synchronousCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Charge getSynchronousCharge() {
    return synchronousCharge;
  }


  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSynchronousCharge(@javax.annotation.Nullable Charge synchronousCharge) {
    this.synchronousCharge = synchronousCharge;
  }

  public ChargeFlowLevel _configuration(@javax.annotation.Nullable ChargeFlowLevelConfiguration _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeFlowLevelConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable ChargeFlowLevelConfiguration _configuration) {
    this._configuration = _configuration;
  }

  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The date and time when the charge flow level will expire.
   * @return timeoutOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ChargeFlowLevel state(@javax.annotation.Nullable ChargeFlowLevelState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeFlowLevelState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable ChargeFlowLevelState state) {
    this.state = state;
  }

  public ChargeFlowLevel asynchronousCharge(@javax.annotation.Nullable Charge asynchronousCharge) {
    
    this.asynchronousCharge = asynchronousCharge;
    return this;
  }

  /**
   * Get asynchronousCharge
   * @return asynchronousCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Charge getAsynchronousCharge() {
    return asynchronousCharge;
  }


  @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsynchronousCharge(@javax.annotation.Nullable Charge asynchronousCharge) {
    this.asynchronousCharge = asynchronousCharge;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  public ChargeFlowLevel tokenCharge(@javax.annotation.Nullable Charge tokenCharge) {
    
    this.tokenCharge = tokenCharge;
    return this;
  }

  /**
   * Get tokenCharge
   * @return tokenCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Charge getTokenCharge() {
    return tokenCharge;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenCharge(@javax.annotation.Nullable Charge tokenCharge) {
    this.tokenCharge = tokenCharge;
  }

  public ChargeFlowLevel transaction(@javax.annotation.Nullable Transaction transaction) {
    
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

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(@javax.annotation.Nullable Transaction transaction) {
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
    ChargeFlowLevel chargeFlowLevel = (ChargeFlowLevel) o;
    return Objects.equals(this.synchronousCharge, chargeFlowLevel.synchronousCharge) &&
        Objects.equals(this._configuration, chargeFlowLevel._configuration) &&
        Objects.equals(this.plannedPurgeDate, chargeFlowLevel.plannedPurgeDate) &&
        Objects.equals(this.createdOn, chargeFlowLevel.createdOn) &&
        Objects.equals(this.version, chargeFlowLevel.version) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevel.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, chargeFlowLevel.timeoutOn) &&
        Objects.equals(this.id, chargeFlowLevel.id) &&
        Objects.equals(this.state, chargeFlowLevel.state) &&
        Objects.equals(this.asynchronousCharge, chargeFlowLevel.asynchronousCharge) &&
        Objects.equals(this.linkedTransaction, chargeFlowLevel.linkedTransaction) &&
        Objects.equals(this.tokenCharge, chargeFlowLevel.tokenCharge) &&
        Objects.equals(this.transaction, chargeFlowLevel.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synchronousCharge, _configuration, plannedPurgeDate, createdOn, version, linkedSpaceId, timeoutOn, id, state, asynchronousCharge, linkedTransaction, tokenCharge, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevel {\n");
    sb.append("    synchronousCharge: ").append(toIndentedString(synchronousCharge)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    asynchronousCharge: ").append(toIndentedString(asynchronousCharge)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    tokenCharge: ").append(toIndentedString(tokenCharge)).append("\n");
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

    // add `synchronousCharge` to the URL query string
    if (getSynchronousCharge() != null) {
      joiner.add(getSynchronousCharge().toUrlQueryString(prefix + "synchronousCharge" + suffix));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeoutOn` to the URL query string
    if (getTimeoutOn() != null) {
      try {
        joiner.add(String.format("%stimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `asynchronousCharge` to the URL query string
    if (getAsynchronousCharge() != null) {
      joiner.add(getAsynchronousCharge().toUrlQueryString(prefix + "asynchronousCharge" + suffix));
    }

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenCharge` to the URL query string
    if (getTokenCharge() != null) {
      joiner.add(getTokenCharge().toUrlQueryString(prefix + "tokenCharge" + suffix));
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    return joiner.toString();
  }

}

