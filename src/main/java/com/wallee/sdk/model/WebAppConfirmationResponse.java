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
import com.wallee.sdk.model.Space;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The confirmation response provides details about the installation of the web app.
 */
@ApiModel(description = "The confirmation response provides details about the installation of the web app.")

public class WebAppConfirmationResponse {
  
  @JsonProperty("access_token")
  protected String accessToken = null;

  
  @JsonProperty("scope")
  protected String scope = null;

  
  @JsonProperty("space")
  protected Space space = null;

  
  @JsonProperty("state")
  protected String state = null;

  
  @JsonProperty("token_type")
  protected String tokenType = null;

  
  
   /**
   * The access code granting permissions to the web service API according to the OAuth standard.
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access code granting permissions to the web service API according to the OAuth standard.")
  public String getAccessToken() {
    return accessToken;
  }

  
   /**
   * The list of the permissions granted to the web app within the space.
   * @return scope
  **/
  @ApiModelProperty(value = "The list of the permissions granted to the web app within the space.")
  public String getScope() {
    return scope;
  }

  
   /**
   * The space that the web app was installed in.
   * @return space
  **/
  @ApiModelProperty(value = "The space that the web app was installed in.")
  public Space getSpace() {
    return space;
  }

  
   /**
   * The state parameter that was provided in the authorization request.
   * @return state
  **/
  @ApiModelProperty(value = "The state parameter that was provided in the authorization request.")
  public String getState() {
    return state;
  }

  
   /**
   * The type of the access token that determines the authentication mechanism to use for accessing the web service API.
   * @return tokenType
  **/
  @ApiModelProperty(value = "The type of the access token that determines the authentication mechanism to use for accessing the web service API.")
  public String getTokenType() {
    return tokenType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAppConfirmationResponse webAppConfirmationResponse = (WebAppConfirmationResponse) o;
    return Objects.equals(this.accessToken, webAppConfirmationResponse.accessToken) &&
        Objects.equals(this.scope, webAppConfirmationResponse.scope) &&
        Objects.equals(this.space, webAppConfirmationResponse.space) &&
        Objects.equals(this.state, webAppConfirmationResponse.state) &&
        Objects.equals(this.tokenType, webAppConfirmationResponse.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, scope, space, state, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAppConfirmationResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

