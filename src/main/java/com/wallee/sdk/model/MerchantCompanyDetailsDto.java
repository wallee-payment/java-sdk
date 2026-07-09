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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.LegalForm;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantCompanyDetailsDto
 */
@JsonPropertyOrder({
  MerchantCompanyDetailsDto.JSON_PROPERTY_BUSINESS_SECTOR,
  MerchantCompanyDetailsDto.JSON_PROPERTY_EXTRACT,
  MerchantCompanyDetailsDto.JSON_PROPERTY_INCORPORATION_YEAR,
  MerchantCompanyDetailsDto.JSON_PROPERTY_ORGANIZATION_NAME,
  MerchantCompanyDetailsDto.JSON_PROPERTY_BUSINESS_DESCRIPTION,
  MerchantCompanyDetailsDto.JSON_PROPERTY_SALES_TAX_NUMBER,
  MerchantCompanyDetailsDto.JSON_PROPERTY_BUSINESS_IDENTIFICATION_NUMBER,
  MerchantCompanyDetailsDto.JSON_PROPERTY_INCORPORATION_ADDRESS,
  MerchantCompanyDetailsDto.JSON_PROPERTY_LEGAL_FORM
})

public class MerchantCompanyDetailsDto {
  public static final String JSON_PROPERTY_BUSINESS_SECTOR = "businessSector";
  @javax.annotation.Nullable
  private String businessSector;

  public static final String JSON_PROPERTY_EXTRACT = "extract";
  @javax.annotation.Nullable
  private String extract;

  public static final String JSON_PROPERTY_INCORPORATION_YEAR = "incorporationYear";
  @javax.annotation.Nullable
  private String incorporationYear;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
  @javax.annotation.Nullable
  private String organizationName;

  public static final String JSON_PROPERTY_BUSINESS_DESCRIPTION = "businessDescription";
  @javax.annotation.Nullable
  private String businessDescription;

  public static final String JSON_PROPERTY_SALES_TAX_NUMBER = "salesTaxNumber";
  @javax.annotation.Nullable
  private String salesTaxNumber;

  public static final String JSON_PROPERTY_BUSINESS_IDENTIFICATION_NUMBER = "businessIdentificationNumber";
  @javax.annotation.Nullable
  private String businessIdentificationNumber;

  public static final String JSON_PROPERTY_INCORPORATION_ADDRESS = "incorporationAddress";
  @javax.annotation.Nullable
  private Address incorporationAddress;

  public static final String JSON_PROPERTY_LEGAL_FORM = "legalForm";
  @javax.annotation.Nullable
  private LegalForm legalForm;

  public MerchantCompanyDetailsDto() {
  }

  public MerchantCompanyDetailsDto businessSector(@javax.annotation.Nullable String businessSector) {
    
    this.businessSector = businessSector;
    return this;
  }

  /**
   * The business sector code or category of the merchant.
   * @return businessSector
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_SECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessSector() {
    return businessSector;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_SECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessSector(@javax.annotation.Nullable String businessSector) {
    this.businessSector = businessSector;
  }

  public MerchantCompanyDetailsDto extract(@javax.annotation.Nullable String extract) {
    
    this.extract = extract;
    return this;
  }

  /**
   * The commercial register extract or reference.
   * @return extract
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtract() {
    return extract;
  }


  @JsonProperty(JSON_PROPERTY_EXTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtract(@javax.annotation.Nullable String extract) {
    this.extract = extract;
  }

  public MerchantCompanyDetailsDto incorporationYear(@javax.annotation.Nullable String incorporationYear) {
    
    this.incorporationYear = incorporationYear;
    return this;
  }

  /**
   * The year in which the merchant company was incorporated.
   * @return incorporationYear
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCORPORATION_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIncorporationYear() {
    return incorporationYear;
  }


  @JsonProperty(JSON_PROPERTY_INCORPORATION_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncorporationYear(@javax.annotation.Nullable String incorporationYear) {
    this.incorporationYear = incorporationYear;
  }

  public MerchantCompanyDetailsDto organizationName(@javax.annotation.Nullable String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

  /**
   * The registered legal name of the merchant company.
   * @return organizationName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationName() {
    return organizationName;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationName(@javax.annotation.Nullable String organizationName) {
    this.organizationName = organizationName;
  }

  public MerchantCompanyDetailsDto businessDescription(@javax.annotation.Nullable String businessDescription) {
    
    this.businessDescription = businessDescription;
    return this;
  }

  /**
   * A short description of the merchant&#39;s business activity.
   * @return businessDescription
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessDescription() {
    return businessDescription;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessDescription(@javax.annotation.Nullable String businessDescription) {
    this.businessDescription = businessDescription;
  }

  public MerchantCompanyDetailsDto salesTaxNumber(@javax.annotation.Nullable String salesTaxNumber) {
    
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

  /**
   * The sales tax or VAT number of the merchant company.
   * @return salesTaxNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALES_TAX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }


  @JsonProperty(JSON_PROPERTY_SALES_TAX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesTaxNumber(@javax.annotation.Nullable String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  public MerchantCompanyDetailsDto businessIdentificationNumber(@javax.annotation.Nullable String businessIdentificationNumber) {
    
    this.businessIdentificationNumber = businessIdentificationNumber;
    return this;
  }

  /**
   * The official business identification number of the merchant company.
   * @return businessIdentificationNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIdentificationNumber() {
    return businessIdentificationNumber;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessIdentificationNumber(@javax.annotation.Nullable String businessIdentificationNumber) {
    this.businessIdentificationNumber = businessIdentificationNumber;
  }

  public MerchantCompanyDetailsDto incorporationAddress(@javax.annotation.Nullable Address incorporationAddress) {
    
    this.incorporationAddress = incorporationAddress;
    return this;
  }

  /**
   * Get incorporationAddress
   * @return incorporationAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCORPORATION_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getIncorporationAddress() {
    return incorporationAddress;
  }


  @JsonProperty(JSON_PROPERTY_INCORPORATION_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncorporationAddress(@javax.annotation.Nullable Address incorporationAddress) {
    this.incorporationAddress = incorporationAddress;
  }

  public MerchantCompanyDetailsDto legalForm(@javax.annotation.Nullable LegalForm legalForm) {
    
    this.legalForm = legalForm;
    return this;
  }

  /**
   * Get legalForm
   * @return legalForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGAL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegalForm getLegalForm() {
    return legalForm;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalForm(@javax.annotation.Nullable LegalForm legalForm) {
    this.legalForm = legalForm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCompanyDetailsDto merchantCompanyDetailsDto = (MerchantCompanyDetailsDto) o;
    return Objects.equals(this.businessSector, merchantCompanyDetailsDto.businessSector) &&
        Objects.equals(this.extract, merchantCompanyDetailsDto.extract) &&
        Objects.equals(this.incorporationYear, merchantCompanyDetailsDto.incorporationYear) &&
        Objects.equals(this.organizationName, merchantCompanyDetailsDto.organizationName) &&
        Objects.equals(this.businessDescription, merchantCompanyDetailsDto.businessDescription) &&
        Objects.equals(this.salesTaxNumber, merchantCompanyDetailsDto.salesTaxNumber) &&
        Objects.equals(this.businessIdentificationNumber, merchantCompanyDetailsDto.businessIdentificationNumber) &&
        Objects.equals(this.incorporationAddress, merchantCompanyDetailsDto.incorporationAddress) &&
        Objects.equals(this.legalForm, merchantCompanyDetailsDto.legalForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessSector, extract, incorporationYear, organizationName, businessDescription, salesTaxNumber, businessIdentificationNumber, incorporationAddress, legalForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCompanyDetailsDto {\n");
    sb.append("    businessSector: ").append(toIndentedString(businessSector)).append("\n");
    sb.append("    extract: ").append(toIndentedString(extract)).append("\n");
    sb.append("    incorporationYear: ").append(toIndentedString(incorporationYear)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    businessDescription: ").append(toIndentedString(businessDescription)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
    sb.append("    businessIdentificationNumber: ").append(toIndentedString(businessIdentificationNumber)).append("\n");
    sb.append("    incorporationAddress: ").append(toIndentedString(incorporationAddress)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
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

    // add `businessSector` to the URL query string
    if (getBusinessSector() != null) {
      try {
        joiner.add(String.format("%sbusinessSector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessSector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `extract` to the URL query string
    if (getExtract() != null) {
      try {
        joiner.add(String.format("%sextract%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExtract()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `incorporationYear` to the URL query string
    if (getIncorporationYear() != null) {
      try {
        joiner.add(String.format("%sincorporationYear%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIncorporationYear()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `organizationName` to the URL query string
    if (getOrganizationName() != null) {
      try {
        joiner.add(String.format("%sorganizationName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganizationName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `businessDescription` to the URL query string
    if (getBusinessDescription() != null) {
      try {
        joiner.add(String.format("%sbusinessDescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `salesTaxNumber` to the URL query string
    if (getSalesTaxNumber() != null) {
      try {
        joiner.add(String.format("%ssalesTaxNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSalesTaxNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `businessIdentificationNumber` to the URL query string
    if (getBusinessIdentificationNumber() != null) {
      try {
        joiner.add(String.format("%sbusinessIdentificationNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessIdentificationNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `incorporationAddress` to the URL query string
    if (getIncorporationAddress() != null) {
      joiner.add(getIncorporationAddress().toUrlQueryString(prefix + "incorporationAddress" + suffix));
    }

    // add `legalForm` to the URL query string
    if (getLegalForm() != null) {
      try {
        joiner.add(String.format("%slegalForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLegalForm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

