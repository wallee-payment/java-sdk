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
 * This model holds the cardholder authentication data (e.g. 3-D Secure authentication).
 */
@ApiModel(description = "This model holds the cardholder authentication data (e.g. 3-D Secure authentication).")

public class CardholderAuthentication {
  
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

  
  
   /**
   * The authentication identifier as assigned by authentication system (e.g. XID or DSTransactionID).
   * @return authenticationIdentifier
  **/
  @ApiModelProperty(value = "The authentication identifier as assigned by authentication system (e.g. XID or DSTransactionID).")
  public String getAuthenticationIdentifier() {
    return authenticationIdentifier;
  }

  
   /**
   * 
   * @return authenticationResponse
  **/
  @ApiModelProperty(value = "")
  public CardAuthenticationResponse getAuthenticationResponse() {
    return authenticationResponse;
  }

  
   /**
   * The cardholder authentication value. Also known as Cardholder Authentication Verification Value (CAVV).
   * @return authenticationValue
  **/
  @ApiModelProperty(value = "The cardholder authentication value. Also known as Cardholder Authentication Verification Value (CAVV).")
  public String getAuthenticationValue() {
    return authenticationValue;
  }

  
   /**
   * The Electronic Commerce Indicator (ECI) value. The ECI is returned by authentication system and indicates the outcome/status of authentication.
   * @return electronicCommerceIndicator
  **/
  @ApiModelProperty(value = "The Electronic Commerce Indicator (ECI) value. The ECI is returned by authentication system and indicates the outcome/status of authentication.")
  public String getElectronicCommerceIndicator() {
    return electronicCommerceIndicator;
  }

  
   /**
   * 
   * @return version
  **/
  @ApiModelProperty(value = "")
  public CardAuthenticationVersion getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardholderAuthentication cardholderAuthentication = (CardholderAuthentication) o;
    return Objects.equals(this.authenticationIdentifier, cardholderAuthentication.authenticationIdentifier) &&
        Objects.equals(this.authenticationResponse, cardholderAuthentication.authenticationResponse) &&
        Objects.equals(this.authenticationValue, cardholderAuthentication.authenticationValue) &&
        Objects.equals(this.electronicCommerceIndicator, cardholderAuthentication.electronicCommerceIndicator) &&
        Objects.equals(this.version, cardholderAuthentication.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationIdentifier, authenticationResponse, authenticationValue, electronicCommerceIndicator, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardholderAuthentication {\n");
    
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

