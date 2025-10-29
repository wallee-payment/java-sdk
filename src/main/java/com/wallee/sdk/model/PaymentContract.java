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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.PaymentContractState;
import com.wallee.sdk.model.PaymentContractType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentContract
 */
@JsonPropertyOrder({
  PaymentContract.JSON_PROPERTY_CONTRACT_TYPE,
  PaymentContract.JSON_PROPERTY_TERMINATED_BY,
  PaymentContract.JSON_PROPERTY_EXTERNAL_ID,
  PaymentContract.JSON_PROPERTY_CREATED_ON,
  PaymentContract.JSON_PROPERTY_VERSION,
  PaymentContract.JSON_PROPERTY_TERMINATED_ON,
  PaymentContract.JSON_PROPERTY_ACTIVATED_ON,
  PaymentContract.JSON_PROPERTY_START_TERMINATING_ON,
  PaymentContract.JSON_PROPERTY_CREATED_BY,
  PaymentContract.JSON_PROPERTY_CONTRACT_IDENTIFIER,
  PaymentContract.JSON_PROPERTY_REJECTED_ON,
  PaymentContract.JSON_PROPERTY_ID,
  PaymentContract.JSON_PROPERTY_STATE,
  PaymentContract.JSON_PROPERTY_REJECTION_REASON,
  PaymentContract.JSON_PROPERTY_ACCOUNT
})

public class PaymentContract {
  public static final String JSON_PROPERTY_CONTRACT_TYPE = "contractType";
  private PaymentContractType contractType;

  public static final String JSON_PROPERTY_TERMINATED_BY = "terminatedBy";
  private Long terminatedBy;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TERMINATED_ON = "terminatedOn";
  private OffsetDateTime terminatedOn;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_START_TERMINATING_ON = "startTerminatingOn";
  private OffsetDateTime startTerminatingOn;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_CONTRACT_IDENTIFIER = "contractIdentifier";
  private String contractIdentifier;

  public static final String JSON_PROPERTY_REJECTED_ON = "rejectedOn";
  private OffsetDateTime rejectedOn;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private PaymentContractState state;

  public static final String JSON_PROPERTY_REJECTION_REASON = "rejectionReason";
  private FailureReason rejectionReason;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Long account;

  public PaymentContract() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentContract(
    @JsonProperty(JSON_PROPERTY_TERMINATED_BY) Long terminatedBy, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_TERMINATED_ON) OffsetDateTime terminatedOn, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_START_TERMINATING_ON) OffsetDateTime startTerminatingOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_CONTRACT_IDENTIFIER) String contractIdentifier, 
    @JsonProperty(JSON_PROPERTY_REJECTED_ON) OffsetDateTime rejectedOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_ACCOUNT) Long account
  ) {
    this();
    this.terminatedBy = terminatedBy;
    this.externalId = externalId;
    this.createdOn = createdOn;
    this.version = version;
    this.terminatedOn = terminatedOn;
    this.activatedOn = activatedOn;
    this.startTerminatingOn = startTerminatingOn;
    this.createdBy = createdBy;
    this.contractIdentifier = contractIdentifier;
    this.rejectedOn = rejectedOn;
    this.id = id;
    this.account = account;
  }

  public PaymentContract contractType(PaymentContractType contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentContractType getContractType() {
    return contractType;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractType(PaymentContractType contractType) {
    this.contractType = contractType;
  }

   /**
   * The ID of the user the contract was terminated by.
   * @return terminatedBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTerminatedBy() {
    return terminatedBy;
  }



   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The date and time when the contract was terminated.
   * @return terminatedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }



   /**
   * The date and time when the contract was activated.
   * @return activatedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



   /**
   * The date and time when the termination process of the contract was started.
   * @return startTerminatingOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TERMINATING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTerminatingOn() {
    return startTerminatingOn;
  }



   /**
   * The ID of the user the contract was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



   /**
   * The identifier of the contract.
   * @return contractIdentifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractIdentifier() {
    return contractIdentifier;
  }



   /**
   * The date and time when the contract was rejected.
   * @return rejectedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRejectedOn() {
    return rejectedOn;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public PaymentContract state(PaymentContractState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentContractState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(PaymentContractState state) {
    this.state = state;
  }

  public PaymentContract rejectionReason(FailureReason rejectionReason) {
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Get rejectionReason
   * @return rejectionReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getRejectionReason() {
    return rejectionReason;
  }


  @JsonProperty(JSON_PROPERTY_REJECTION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectionReason(FailureReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

   /**
   * This account that the contract belongs to.
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccount() {
    return account;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContract paymentContract = (PaymentContract) o;
    return Objects.equals(this.contractType, paymentContract.contractType) &&
        Objects.equals(this.terminatedBy, paymentContract.terminatedBy) &&
        Objects.equals(this.externalId, paymentContract.externalId) &&
        Objects.equals(this.createdOn, paymentContract.createdOn) &&
        Objects.equals(this.version, paymentContract.version) &&
        Objects.equals(this.terminatedOn, paymentContract.terminatedOn) &&
        Objects.equals(this.activatedOn, paymentContract.activatedOn) &&
        Objects.equals(this.startTerminatingOn, paymentContract.startTerminatingOn) &&
        Objects.equals(this.createdBy, paymentContract.createdBy) &&
        Objects.equals(this.contractIdentifier, paymentContract.contractIdentifier) &&
        Objects.equals(this.rejectedOn, paymentContract.rejectedOn) &&
        Objects.equals(this.id, paymentContract.id) &&
        Objects.equals(this.state, paymentContract.state) &&
        Objects.equals(this.rejectionReason, paymentContract.rejectionReason) &&
        Objects.equals(this.account, paymentContract.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractType, terminatedBy, externalId, createdOn, version, terminatedOn, activatedOn, startTerminatingOn, createdBy, contractIdentifier, rejectedOn, id, state, rejectionReason, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContract {\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    startTerminatingOn: ").append(toIndentedString(startTerminatingOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    contractIdentifier: ").append(toIndentedString(contractIdentifier)).append("\n");
    sb.append("    rejectedOn: ").append(toIndentedString(rejectedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

    // add `contractType` to the URL query string
    if (getContractType() != null) {
      joiner.add(getContractType().toUrlQueryString(prefix + "contractType" + suffix));
    }

    // add `terminatedBy` to the URL query string
    if (getTerminatedBy() != null) {
      try {
        joiner.add(String.format("%sterminatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `terminatedOn` to the URL query string
    if (getTerminatedOn() != null) {
      try {
        joiner.add(String.format("%sterminatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activatedOn` to the URL query string
    if (getActivatedOn() != null) {
      try {
        joiner.add(String.format("%sactivatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startTerminatingOn` to the URL query string
    if (getStartTerminatingOn() != null) {
      try {
        joiner.add(String.format("%sstartTerminatingOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartTerminatingOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contractIdentifier` to the URL query string
    if (getContractIdentifier() != null) {
      try {
        joiner.add(String.format("%scontractIdentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContractIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rejectedOn` to the URL query string
    if (getRejectedOn() != null) {
      try {
        joiner.add(String.format("%srejectedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRejectedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `rejectionReason` to the URL query string
    if (getRejectionReason() != null) {
      joiner.add(getRejectionReason().toUrlQueryString(prefix + "rejectionReason" + suffix));
    }

    // add `account` to the URL query string
    if (getAccount() != null) {
      try {
        joiner.add(String.format("%saccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

