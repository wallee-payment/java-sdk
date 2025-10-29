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
import com.wallee.sdk.model.Space;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The confirmation response provides details about the installation of the web app.
 */
@JsonPropertyOrder({
  WebAppConfirmationResponse.JSON_PROPERTY_ACCESS_TOKEN,
  WebAppConfirmationResponse.JSON_PROPERTY_SCOPE,
  WebAppConfirmationResponse.JSON_PROPERTY_STATE,
  WebAppConfirmationResponse.JSON_PROPERTY_TOKEN_TYPE,
  WebAppConfirmationResponse.JSON_PROPERTY_SPACE
})

public class WebAppConfirmationResponse {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private String accessToken;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "token_type";
  private String tokenType;

  public static final String JSON_PROPERTY_SPACE = "space";
  private Space space;

  public WebAppConfirmationResponse() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public WebAppConfirmationResponse(
    @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN) String accessToken, 
    @JsonProperty(JSON_PROPERTY_SCOPE) String scope, 
    @JsonProperty(JSON_PROPERTY_STATE) String state, 
    @JsonProperty(JSON_PROPERTY_TOKEN_TYPE) String tokenType
  ) {
    this();
    this.accessToken = accessToken;
    this.scope = scope;
    this.state = state;
    this.tokenType = tokenType;
  }

   /**
   * The access code granting permissions to the web service API according to the OAuth standard.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }



   /**
   * The list of the permissions granted to the web app within the space.
   * @return scope
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }



   /**
   * The state parameter that was provided in the authorization request.
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }



   /**
   * The type of the access token that determines the authentication mechanism to use for accessing the web service API.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenType() {
    return tokenType;
  }



  public WebAppConfirmationResponse space(Space space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Space getSpace() {
    return space;
  }


  @JsonProperty(JSON_PROPERTY_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpace(Space space) {
    this.space = space;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAppConfirmationResponse webAppConfirmationResponse = (WebAppConfirmationResponse) o;
    return Objects.equals(this.accessToken, webAppConfirmationResponse.accessToken) &&
        Objects.equals(this.scope, webAppConfirmationResponse.scope) &&
        Objects.equals(this.state, webAppConfirmationResponse.state) &&
        Objects.equals(this.tokenType, webAppConfirmationResponse.tokenType) &&
        Objects.equals(this.space, webAppConfirmationResponse.space);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, scope, state, tokenType, space);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAppConfirmationResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
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

    // add `access_token` to the URL query string
    if (getAccessToken() != null) {
      try {
        joiner.add(String.format("%saccess_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `token_type` to the URL query string
    if (getTokenType() != null) {
      try {
        joiner.add(String.format("%stoken_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `space` to the URL query string
    if (getSpace() != null) {
      joiner.add(getSpace().toUrlQueryString(prefix + "space" + suffix));
    }

    return joiner.toString();
  }

}

