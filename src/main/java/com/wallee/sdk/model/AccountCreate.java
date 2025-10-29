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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AccountCreate
 */
@JsonPropertyOrder({
  AccountCreate.JSON_PROPERTY_NAME,
  AccountCreate.JSON_PROPERTY_SUBACCOUNT_LIMIT,
  AccountCreate.JSON_PROPERTY_SCOPE,
  AccountCreate.JSON_PROPERTY_PARENT_ACCOUNT
})
@JsonTypeName("Account.Create")

public class AccountCreate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBACCOUNT_LIMIT = "subaccountLimit";
  private Long subaccountLimit;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Long scope;

  public static final String JSON_PROPERTY_PARENT_ACCOUNT = "parentAccount";
  private Long parentAccount;

  public AccountCreate() {
  }

  public AccountCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the account.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public AccountCreate subaccountLimit(Long subaccountLimit) {
    
    this.subaccountLimit = subaccountLimit;
    return this;
  }

   /**
   * The number of sub-accounts that can be created within this account.
   * @return subaccountLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBACCOUNT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubaccountLimit() {
    return subaccountLimit;
  }


  @JsonProperty(JSON_PROPERTY_SUBACCOUNT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubaccountLimit(Long subaccountLimit) {
    this.subaccountLimit = subaccountLimit;
  }

  public AccountCreate scope(Long scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope that the account belongs to.
   * @return scope
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScope(Long scope) {
    this.scope = scope;
  }

  public AccountCreate parentAccount(Long parentAccount) {
    
    this.parentAccount = parentAccount;
    return this;
  }

   /**
   * The parent account responsible for administering this account.
   * @return parentAccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParentAccount() {
    return parentAccount;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentAccount(Long parentAccount) {
    this.parentAccount = parentAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreate accountCreate = (AccountCreate) o;
    return Objects.equals(this.name, accountCreate.name) &&
        Objects.equals(this.subaccountLimit, accountCreate.subaccountLimit) &&
        Objects.equals(this.scope, accountCreate.scope) &&
        Objects.equals(this.parentAccount, accountCreate.parentAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subaccountLimit, scope, parentAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subaccountLimit` to the URL query string
    if (getSubaccountLimit() != null) {
      try {
        joiner.add(String.format("%ssubaccountLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubaccountLimit()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `parentAccount` to the URL query string
    if (getParentAccount() != null) {
      try {
        joiner.add(String.format("%sparentAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

