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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CardAuthenticationResponse;
import com.wallee.sdk.model.CardAuthenticationVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CardholderAuthenticationCreate {
  
  @JsonProperty("authenticationIdentifier")
  protected String authenticationIdentifier = null;

  
  @JsonProperty("authenticationResponse")
  protected CardAuthenticationResponse authenticationResponse = null;

  
  @JsonProperty("authenticationValue")
  protected String authenticationValue = null;

  
  @JsonProperty("electronicCommerceIndicator")
  protected String electronicCommerceIndicator = null;

  
  @JsonProperty("version")
  protected CardAuthenticationVersion version = null;

  
  
  public CardholderAuthenticationCreate authenticationIdentifier(String authenticationIdentifier) {
    this.authenticationIdentifier = authenticationIdentifier;
    return this;
  }

   /**
   * The identifier (e.g., XID or DSTransactionID) assigned by the authentication system for tracking and verification.
   * @return authenticationIdentifier
  **/
  @ApiModelProperty(value = "The identifier (e.g., XID or DSTransactionID) assigned by the authentication system for tracking and verification.")
  public String getAuthenticationIdentifier() {
    return authenticationIdentifier;
  }

  public void setAuthenticationIdentifier(String authenticationIdentifier) {
    this.authenticationIdentifier = authenticationIdentifier;
  }

  
  public CardholderAuthenticationCreate authenticationResponse(CardAuthenticationResponse authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The result of the authentication process.
   * @return authenticationResponse
  **/
  @ApiModelProperty(required = true, value = "The result of the authentication process.")
  public CardAuthenticationResponse getAuthenticationResponse() {
    return authenticationResponse;
  }

  public void setAuthenticationResponse(CardAuthenticationResponse authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  
  public CardholderAuthenticationCreate authenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
    return this;
  }

   /**
   * The cryptographic token (CAVV/AAV) generated during the authentication process to validate the cardholder&#39;s identity.
   * @return authenticationValue
  **/
  @ApiModelProperty(value = "The cryptographic token (CAVV/AAV) generated during the authentication process to validate the cardholder's identity.")
  public String getAuthenticationValue() {
    return authenticationValue;
  }

  public void setAuthenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
  }

  
  public CardholderAuthenticationCreate electronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
    return this;
  }

   /**
   * The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.
   * @return electronicCommerceIndicator
  **/
  @ApiModelProperty(value = "The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.")
  public String getElectronicCommerceIndicator() {
    return electronicCommerceIndicator;
  }

  public void setElectronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
  }

  
  public CardholderAuthenticationCreate version(CardAuthenticationVersion version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the authentication protocol (e.g., 3D Secure 1.0 or 2.0) used for the transaction.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of the authentication protocol (e.g., 3D Secure 1.0 or 2.0) used for the transaction.")
  public CardAuthenticationVersion getVersion() {
    return version;
  }

  public void setVersion(CardAuthenticationVersion version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardholderAuthenticationCreate cardholderAuthenticationCreate = (CardholderAuthenticationCreate) o;
    return Objects.equals(this.authenticationIdentifier, cardholderAuthenticationCreate.authenticationIdentifier) &&
        Objects.equals(this.authenticationResponse, cardholderAuthenticationCreate.authenticationResponse) &&
        Objects.equals(this.authenticationValue, cardholderAuthenticationCreate.authenticationValue) &&
        Objects.equals(this.electronicCommerceIndicator, cardholderAuthenticationCreate.electronicCommerceIndicator) &&
        Objects.equals(this.version, cardholderAuthenticationCreate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationIdentifier, authenticationResponse, authenticationValue, electronicCommerceIndicator, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardholderAuthenticationCreate {\n");
    
    sb.append("    authenticationIdentifier: ").append(toIndentedString(authenticationIdentifier)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
    sb.append("    electronicCommerceIndicator: ").append(toIndentedString(electronicCommerceIndicator)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

