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
import com.wallee.sdk.model.MerchantBankDetailsDto;
import com.wallee.sdk.model.MerchantCompanyDetailsDto;
import com.wallee.sdk.model.MerchantContractRevenueDto;
import com.wallee.sdk.model.MerchantEcommerceDetailsDto;
import com.wallee.sdk.model.MerchantPaymentChannelsDto;
import com.wallee.sdk.model.MerchantRelatedPersonsDto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantApplicationDataDto
 */
@JsonPropertyOrder({
  MerchantApplicationDataDto.JSON_PROPERTY_RELATED_PERSONS,
  MerchantApplicationDataDto.JSON_PROPERTY_BANK_DETAILS,
  MerchantApplicationDataDto.JSON_PROPERTY_COMPANY_DETAILS,
  MerchantApplicationDataDto.JSON_PROPERTY_PAYMENT_CHANNELS,
  MerchantApplicationDataDto.JSON_PROPERTY_CONTRACT_REVENUE,
  MerchantApplicationDataDto.JSON_PROPERTY_ECOMMERCE_DETAILS
})

public class MerchantApplicationDataDto {
  public static final String JSON_PROPERTY_RELATED_PERSONS = "relatedPersons";
  @javax.annotation.Nullable
  private MerchantRelatedPersonsDto relatedPersons;

  public static final String JSON_PROPERTY_BANK_DETAILS = "bankDetails";
  @javax.annotation.Nullable
  private MerchantBankDetailsDto bankDetails;

  public static final String JSON_PROPERTY_COMPANY_DETAILS = "companyDetails";
  @javax.annotation.Nullable
  private MerchantCompanyDetailsDto companyDetails;

  public static final String JSON_PROPERTY_PAYMENT_CHANNELS = "paymentChannels";
  @javax.annotation.Nullable
  private MerchantPaymentChannelsDto paymentChannels;

  public static final String JSON_PROPERTY_CONTRACT_REVENUE = "contractRevenue";
  @javax.annotation.Nullable
  private MerchantContractRevenueDto contractRevenue;

  public static final String JSON_PROPERTY_ECOMMERCE_DETAILS = "ecommerceDetails";
  @javax.annotation.Nullable
  private MerchantEcommerceDetailsDto ecommerceDetails;

  public MerchantApplicationDataDto() {
  }

  public MerchantApplicationDataDto relatedPersons(@javax.annotation.Nullable MerchantRelatedPersonsDto relatedPersons) {
    
    this.relatedPersons = relatedPersons;
    return this;
  }

  /**
   * Get relatedPersons
   * @return relatedPersons
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_PERSONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantRelatedPersonsDto getRelatedPersons() {
    return relatedPersons;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_PERSONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedPersons(@javax.annotation.Nullable MerchantRelatedPersonsDto relatedPersons) {
    this.relatedPersons = relatedPersons;
  }

  public MerchantApplicationDataDto bankDetails(@javax.annotation.Nullable MerchantBankDetailsDto bankDetails) {
    
    this.bankDetails = bankDetails;
    return this;
  }

  /**
   * Get bankDetails
   * @return bankDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantBankDetailsDto getBankDetails() {
    return bankDetails;
  }


  @JsonProperty(JSON_PROPERTY_BANK_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankDetails(@javax.annotation.Nullable MerchantBankDetailsDto bankDetails) {
    this.bankDetails = bankDetails;
  }

  public MerchantApplicationDataDto companyDetails(@javax.annotation.Nullable MerchantCompanyDetailsDto companyDetails) {
    
    this.companyDetails = companyDetails;
    return this;
  }

  /**
   * Get companyDetails
   * @return companyDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantCompanyDetailsDto getCompanyDetails() {
    return companyDetails;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyDetails(@javax.annotation.Nullable MerchantCompanyDetailsDto companyDetails) {
    this.companyDetails = companyDetails;
  }

  public MerchantApplicationDataDto paymentChannels(@javax.annotation.Nullable MerchantPaymentChannelsDto paymentChannels) {
    
    this.paymentChannels = paymentChannels;
    return this;
  }

  /**
   * Get paymentChannels
   * @return paymentChannels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantPaymentChannelsDto getPaymentChannels() {
    return paymentChannels;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentChannels(@javax.annotation.Nullable MerchantPaymentChannelsDto paymentChannels) {
    this.paymentChannels = paymentChannels;
  }

  public MerchantApplicationDataDto contractRevenue(@javax.annotation.Nullable MerchantContractRevenueDto contractRevenue) {
    
    this.contractRevenue = contractRevenue;
    return this;
  }

  /**
   * Get contractRevenue
   * @return contractRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantContractRevenueDto getContractRevenue() {
    return contractRevenue;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractRevenue(@javax.annotation.Nullable MerchantContractRevenueDto contractRevenue) {
    this.contractRevenue = contractRevenue;
  }

  public MerchantApplicationDataDto ecommerceDetails(@javax.annotation.Nullable MerchantEcommerceDetailsDto ecommerceDetails) {
    
    this.ecommerceDetails = ecommerceDetails;
    return this;
  }

  /**
   * Get ecommerceDetails
   * @return ecommerceDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECOMMERCE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantEcommerceDetailsDto getEcommerceDetails() {
    return ecommerceDetails;
  }


  @JsonProperty(JSON_PROPERTY_ECOMMERCE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcommerceDetails(@javax.annotation.Nullable MerchantEcommerceDetailsDto ecommerceDetails) {
    this.ecommerceDetails = ecommerceDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantApplicationDataDto merchantApplicationDataDto = (MerchantApplicationDataDto) o;
    return Objects.equals(this.relatedPersons, merchantApplicationDataDto.relatedPersons) &&
        Objects.equals(this.bankDetails, merchantApplicationDataDto.bankDetails) &&
        Objects.equals(this.companyDetails, merchantApplicationDataDto.companyDetails) &&
        Objects.equals(this.paymentChannels, merchantApplicationDataDto.paymentChannels) &&
        Objects.equals(this.contractRevenue, merchantApplicationDataDto.contractRevenue) &&
        Objects.equals(this.ecommerceDetails, merchantApplicationDataDto.ecommerceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedPersons, bankDetails, companyDetails, paymentChannels, contractRevenue, ecommerceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantApplicationDataDto {\n");
    sb.append("    relatedPersons: ").append(toIndentedString(relatedPersons)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
    sb.append("    companyDetails: ").append(toIndentedString(companyDetails)).append("\n");
    sb.append("    paymentChannels: ").append(toIndentedString(paymentChannels)).append("\n");
    sb.append("    contractRevenue: ").append(toIndentedString(contractRevenue)).append("\n");
    sb.append("    ecommerceDetails: ").append(toIndentedString(ecommerceDetails)).append("\n");
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

    // add `relatedPersons` to the URL query string
    if (getRelatedPersons() != null) {
      joiner.add(getRelatedPersons().toUrlQueryString(prefix + "relatedPersons" + suffix));
    }

    // add `bankDetails` to the URL query string
    if (getBankDetails() != null) {
      joiner.add(getBankDetails().toUrlQueryString(prefix + "bankDetails" + suffix));
    }

    // add `companyDetails` to the URL query string
    if (getCompanyDetails() != null) {
      joiner.add(getCompanyDetails().toUrlQueryString(prefix + "companyDetails" + suffix));
    }

    // add `paymentChannels` to the URL query string
    if (getPaymentChannels() != null) {
      joiner.add(getPaymentChannels().toUrlQueryString(prefix + "paymentChannels" + suffix));
    }

    // add `contractRevenue` to the URL query string
    if (getContractRevenue() != null) {
      joiner.add(getContractRevenue().toUrlQueryString(prefix + "contractRevenue" + suffix));
    }

    // add `ecommerceDetails` to the URL query string
    if (getEcommerceDetails() != null) {
      joiner.add(getEcommerceDetails().toUrlQueryString(prefix + "ecommerceDetails" + suffix));
    }

    return joiner.toString();
  }

}

