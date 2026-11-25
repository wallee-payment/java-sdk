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
import com.wallee.sdk.model.MerchantApplicationState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The result of submitting a merchant application.
 */
@JsonPropertyOrder({
  MerchantApplicationSubmittedDto.JSON_PROPERTY_APPLICATION_STATE,
  MerchantApplicationSubmittedDto.JSON_PROPERTY_PAYMENT_FACILITATOR_ORGANIZATION_ID,
  MerchantApplicationSubmittedDto.JSON_PROPERTY_MERCHANT_APPLICATION_ID
})

public class MerchantApplicationSubmittedDto {
  public static final String JSON_PROPERTY_APPLICATION_STATE = "applicationState";
  @javax.annotation.Nullable
  private MerchantApplicationState applicationState;

  public static final String JSON_PROPERTY_PAYMENT_FACILITATOR_ORGANIZATION_ID = "paymentFacilitatorOrganizationId";
  @javax.annotation.Nullable
  private Long paymentFacilitatorOrganizationId;

  public static final String JSON_PROPERTY_MERCHANT_APPLICATION_ID = "merchantApplicationId";
  @javax.annotation.Nullable
  private Long merchantApplicationId;

  public MerchantApplicationSubmittedDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public MerchantApplicationSubmittedDto(
    @JsonProperty(JSON_PROPERTY_PAYMENT_FACILITATOR_ORGANIZATION_ID) Long paymentFacilitatorOrganizationId, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_APPLICATION_ID) Long merchantApplicationId
  ) {
    this();
    this.paymentFacilitatorOrganizationId = paymentFacilitatorOrganizationId;
    this.merchantApplicationId = merchantApplicationId;
  }

  public MerchantApplicationSubmittedDto applicationState(@javax.annotation.Nullable MerchantApplicationState applicationState) {
    
    this.applicationState = applicationState;
    return this;
  }

  /**
   * Get applicationState
   * @return applicationState
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantApplicationState getApplicationState() {
    return applicationState;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationState(@javax.annotation.Nullable MerchantApplicationState applicationState) {
    this.applicationState = applicationState;
  }

  /**
   * The ID of the organization created by submitting the application.
   * @return paymentFacilitatorOrganizationId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_FACILITATOR_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaymentFacilitatorOrganizationId() {
    return paymentFacilitatorOrganizationId;
  }



  /**
   * The ID of the submitted merchant application.
   * @return merchantApplicationId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMerchantApplicationId() {
    return merchantApplicationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantApplicationSubmittedDto merchantApplicationSubmittedDto = (MerchantApplicationSubmittedDto) o;
    return Objects.equals(this.applicationState, merchantApplicationSubmittedDto.applicationState) &&
        Objects.equals(this.paymentFacilitatorOrganizationId, merchantApplicationSubmittedDto.paymentFacilitatorOrganizationId) &&
        Objects.equals(this.merchantApplicationId, merchantApplicationSubmittedDto.merchantApplicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationState, paymentFacilitatorOrganizationId, merchantApplicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantApplicationSubmittedDto {\n");
    sb.append("    applicationState: ").append(toIndentedString(applicationState)).append("\n");
    sb.append("    paymentFacilitatorOrganizationId: ").append(toIndentedString(paymentFacilitatorOrganizationId)).append("\n");
    sb.append("    merchantApplicationId: ").append(toIndentedString(merchantApplicationId)).append("\n");
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

    // add `applicationState` to the URL query string
    if (getApplicationState() != null) {
      try {
        joiner.add(String.format("%sapplicationState%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApplicationState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentFacilitatorOrganizationId` to the URL query string
    if (getPaymentFacilitatorOrganizationId() != null) {
      try {
        joiner.add(String.format("%spaymentFacilitatorOrganizationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentFacilitatorOrganizationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantApplicationId` to the URL query string
    if (getMerchantApplicationId() != null) {
      try {
        joiner.add(String.format("%smerchantApplicationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantApplicationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

