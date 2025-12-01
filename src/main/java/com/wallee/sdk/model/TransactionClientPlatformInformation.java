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
 * TransactionClientPlatformInformation
 */
@JsonPropertyOrder({
  TransactionClientPlatformInformation.JSON_PROPERTY_SPACE_ID,
  TransactionClientPlatformInformation.JSON_PROPERTY_INTEGRATION_TYPE,
  TransactionClientPlatformInformation.JSON_PROPERTY_OS_VERSION,
  TransactionClientPlatformInformation.JSON_PROPERTY_PLATFORM_TYPE,
  TransactionClientPlatformInformation.JSON_PROPERTY_SDK_VERSION,
  TransactionClientPlatformInformation.JSON_PROPERTY_ID,
  TransactionClientPlatformInformation.JSON_PROPERTY_VERSION,
  TransactionClientPlatformInformation.JSON_PROPERTY_TRANSACTION
})

public class TransactionClientPlatformInformation {
  public static final String JSON_PROPERTY_SPACE_ID = "spaceId";
  @javax.annotation.Nullable
  private Long spaceId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  @javax.annotation.Nullable
  private String integrationType;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  @javax.annotation.Nullable
  private String osVersion;

  public static final String JSON_PROPERTY_PLATFORM_TYPE = "platformType";
  @javax.annotation.Nullable
  private String platformType;

  public static final String JSON_PROPERTY_SDK_VERSION = "sdkVersion";
  @javax.annotation.Nullable
  private String sdkVersion;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private Long transaction;

  public TransactionClientPlatformInformation() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TransactionClientPlatformInformation(
    @JsonProperty(JSON_PROPERTY_SPACE_ID) Long spaceId, 
    @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE) String integrationType, 
    @JsonProperty(JSON_PROPERTY_OS_VERSION) String osVersion, 
    @JsonProperty(JSON_PROPERTY_PLATFORM_TYPE) String platformType, 
    @JsonProperty(JSON_PROPERTY_SDK_VERSION) String sdkVersion, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION) Long transaction
  ) {
    this();
    this.spaceId = spaceId;
    this.integrationType = integrationType;
    this.osVersion = osVersion;
    this.platformType = platformType;
    this.sdkVersion = sdkVersion;
    this.id = id;
    this.version = version;
    this.transaction = transaction;
  }

  /**
   * The ID of the space this object belongs to.
   * @return spaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceId() {
    return spaceId;
  }



  /**
   * The type of integration that was used to collect the payment information.
   * @return integrationType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }



  /**
   * The version of the operating system that was used to collect the payment information.
   * @return osVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }



  /**
   * The type of platform that was used to collect the payment information, e.g. Android or iOS.
   * @return platformType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatformType() {
    return platformType;
  }



  /**
   * The type of the SDK that was used to collect the payment information.
   * @return sdkVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSdkVersion() {
    return sdkVersion;
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
   * The transaction that is associated with the client platform information.
   * @return transaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTransaction() {
    return transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionClientPlatformInformation transactionClientPlatformInformation = (TransactionClientPlatformInformation) o;
    return Objects.equals(this.spaceId, transactionClientPlatformInformation.spaceId) &&
        Objects.equals(this.integrationType, transactionClientPlatformInformation.integrationType) &&
        Objects.equals(this.osVersion, transactionClientPlatformInformation.osVersion) &&
        Objects.equals(this.platformType, transactionClientPlatformInformation.platformType) &&
        Objects.equals(this.sdkVersion, transactionClientPlatformInformation.sdkVersion) &&
        Objects.equals(this.id, transactionClientPlatformInformation.id) &&
        Objects.equals(this.version, transactionClientPlatformInformation.version) &&
        Objects.equals(this.transaction, transactionClientPlatformInformation.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId, integrationType, osVersion, platformType, sdkVersion, id, version, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionClientPlatformInformation {\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `spaceId` to the URL query string
    if (getSpaceId() != null) {
      try {
        joiner.add(String.format("%sspaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `integrationType` to the URL query string
    if (getIntegrationType() != null) {
      try {
        joiner.add(String.format("%sintegrationType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntegrationType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `osVersion` to the URL query string
    if (getOsVersion() != null) {
      try {
        joiner.add(String.format("%sosVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOsVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `platformType` to the URL query string
    if (getPlatformType() != null) {
      try {
        joiner.add(String.format("%splatformType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlatformType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sdkVersion` to the URL query string
    if (getSdkVersion() != null) {
      try {
        joiner.add(String.format("%ssdkVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSdkVersion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      try {
        joiner.add(String.format("%stransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

