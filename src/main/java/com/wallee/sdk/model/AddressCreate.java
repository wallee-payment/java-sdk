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
import com.wallee.sdk.model.Gender;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AddressCreate
 */
@JsonPropertyOrder({
  AddressCreate.JSON_PROPERTY_COUNTRY,
  AddressCreate.JSON_PROPERTY_MOBILE_PHONE_NUMBER,
  AddressCreate.JSON_PROPERTY_GENDER,
  AddressCreate.JSON_PROPERTY_ORGANIZATION_NAME,
  AddressCreate.JSON_PROPERTY_CITY,
  AddressCreate.JSON_PROPERTY_COMMERCIAL_REGISTER_NUMBER,
  AddressCreate.JSON_PROPERTY_SOCIAL_SECURITY_NUMBER,
  AddressCreate.JSON_PROPERTY_GIVEN_NAME,
  AddressCreate.JSON_PROPERTY_POSTCODE,
  AddressCreate.JSON_PROPERTY_LEGAL_ORGANIZATION_FORM,
  AddressCreate.JSON_PROPERTY_SALES_TAX_NUMBER,
  AddressCreate.JSON_PROPERTY_DATE_OF_BIRTH,
  AddressCreate.JSON_PROPERTY_DEPENDENT_LOCALITY,
  AddressCreate.JSON_PROPERTY_EMAIL_ADDRESS,
  AddressCreate.JSON_PROPERTY_PHONE_NUMBER,
  AddressCreate.JSON_PROPERTY_SORTING_CODE,
  AddressCreate.JSON_PROPERTY_STREET,
  AddressCreate.JSON_PROPERTY_FAMILY_NAME,
  AddressCreate.JSON_PROPERTY_POSTAL_STATE,
  AddressCreate.JSON_PROPERTY_SALUTATION
})
@JsonTypeName("Address.Create")

public class AddressCreate {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
  private String mobilePhoneNumber;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private Gender gender;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
  private String organizationName;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COMMERCIAL_REGISTER_NUMBER = "commercialRegisterNumber";
  private String commercialRegisterNumber;

  public static final String JSON_PROPERTY_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  private String socialSecurityNumber;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_POSTCODE = "postcode";
  private String postcode;

  public static final String JSON_PROPERTY_LEGAL_ORGANIZATION_FORM = "legalOrganizationForm";
  private Long legalOrganizationForm;

  public static final String JSON_PROPERTY_SALES_TAX_NUMBER = "salesTaxNumber";
  private String salesTaxNumber;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_DEPENDENT_LOCALITY = "dependentLocality";
  private String dependentLocality;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_SORTING_CODE = "sortingCode";
  private String sortingCode;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_POSTAL_STATE = "postalState";
  private String postalState;

  public static final String JSON_PROPERTY_SALUTATION = "salutation";
  private String salutation;

  public AddressCreate() {
  }

  public AddressCreate country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country is represented with a two-letter code (ISO 3166-1 alpha-2 standard) - for example, CH for Switzerland.
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }

  public AddressCreate mobilePhoneNumber(String mobilePhoneNumber) {
    
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * The phone number of a mobile phone.
   * @return mobilePhoneNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public AddressCreate gender(Gender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Gender getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public AddressCreate organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * The organization&#39;s name.
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationName() {
    return organizationName;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public AddressCreate city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city, town or village.
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }

  public AddressCreate commercialRegisterNumber(String commercialRegisterNumber) {
    
    this.commercialRegisterNumber = commercialRegisterNumber;
    return this;
  }

   /**
   * The commercial registration number of the organization.
   * @return commercialRegisterNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMERCIAL_REGISTER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }


  @JsonProperty(JSON_PROPERTY_COMMERCIAL_REGISTER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
  }

  public AddressCreate socialSecurityNumber(String socialSecurityNumber) {
    
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * The social security number.
   * @return socialSecurityNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }


  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public AddressCreate givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * The given or first name.
   * @return givenName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public AddressCreate postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * The postal code, also known as ZIP, postcode, etc.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostcode() {
    return postcode;
  }


  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public AddressCreate legalOrganizationForm(Long legalOrganizationForm) {
    
    this.legalOrganizationForm = legalOrganizationForm;
    return this;
  }

   /**
   * The legal form of the organization.
   * @return legalOrganizationForm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGAL_ORGANIZATION_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLegalOrganizationForm() {
    return legalOrganizationForm;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ORGANIZATION_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
  }

  public AddressCreate salesTaxNumber(String salesTaxNumber) {
    
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

   /**
   * The sales tax number of the organization.
   * @return salesTaxNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALES_TAX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }


  @JsonProperty(JSON_PROPERTY_SALES_TAX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  public AddressCreate dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public AddressCreate dependentLocality(String dependentLocality) {
    
    this.dependentLocality = dependentLocality;
    return this;
  }

   /**
   * The dependent locality which is a sub-division of the state.
   * @return dependentLocality
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDENT_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDependentLocality() {
    return dependentLocality;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDENT_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  public AddressCreate emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AddressCreate phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AddressCreate sortingCode(String sortingCode) {
    
    this.sortingCode = sortingCode;
    return this;
  }

   /**
   * The sorting code identifying the post office where the PO Box is located.
   * @return sortingCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortingCode() {
    return sortingCode;
  }


  @JsonProperty(JSON_PROPERTY_SORTING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

  public AddressCreate street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The street or PO Box.
   * @return street
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }

  public AddressCreate familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * The family or last name.
   * @return familyName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public AddressCreate postalState(String postalState) {
    
    this.postalState = postalState;
    return this;
  }

   /**
   * The name of the region, typically a state, county, province or prefecture.
   * @return postalState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalState() {
    return postalState;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  public AddressCreate salutation(String salutation) {
    
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation e.g. Mrs, Mr, Dr.
   * @return salutation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalutation() {
    return salutation;
  }


  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCreate addressCreate = (AddressCreate) o;
    return Objects.equals(this.country, addressCreate.country) &&
        Objects.equals(this.mobilePhoneNumber, addressCreate.mobilePhoneNumber) &&
        Objects.equals(this.gender, addressCreate.gender) &&
        Objects.equals(this.organizationName, addressCreate.organizationName) &&
        Objects.equals(this.city, addressCreate.city) &&
        Objects.equals(this.commercialRegisterNumber, addressCreate.commercialRegisterNumber) &&
        Objects.equals(this.socialSecurityNumber, addressCreate.socialSecurityNumber) &&
        Objects.equals(this.givenName, addressCreate.givenName) &&
        Objects.equals(this.postcode, addressCreate.postcode) &&
        Objects.equals(this.legalOrganizationForm, addressCreate.legalOrganizationForm) &&
        Objects.equals(this.salesTaxNumber, addressCreate.salesTaxNumber) &&
        Objects.equals(this.dateOfBirth, addressCreate.dateOfBirth) &&
        Objects.equals(this.dependentLocality, addressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, addressCreate.emailAddress) &&
        Objects.equals(this.phoneNumber, addressCreate.phoneNumber) &&
        Objects.equals(this.sortingCode, addressCreate.sortingCode) &&
        Objects.equals(this.street, addressCreate.street) &&
        Objects.equals(this.familyName, addressCreate.familyName) &&
        Objects.equals(this.postalState, addressCreate.postalState) &&
        Objects.equals(this.salutation, addressCreate.salutation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, mobilePhoneNumber, gender, organizationName, city, commercialRegisterNumber, socialSecurityNumber, givenName, postcode, legalOrganizationForm, salesTaxNumber, dateOfBirth, dependentLocality, emailAddress, phoneNumber, sortingCode, street, familyName, postalState, salutation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCreate {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    legalOrganizationForm: ").append(toIndentedString(legalOrganizationForm)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      try {
        joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mobilePhoneNumber` to the URL query string
    if (getMobilePhoneNumber() != null) {
      try {
        joiner.add(String.format("%smobilePhoneNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gender` to the URL query string
    if (getGender() != null) {
      try {
        joiner.add(String.format("%sgender%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGender()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `city` to the URL query string
    if (getCity() != null) {
      try {
        joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `commercialRegisterNumber` to the URL query string
    if (getCommercialRegisterNumber() != null) {
      try {
        joiner.add(String.format("%scommercialRegisterNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCommercialRegisterNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `socialSecurityNumber` to the URL query string
    if (getSocialSecurityNumber() != null) {
      try {
        joiner.add(String.format("%ssocialSecurityNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSocialSecurityNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      try {
        joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGivenName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postcode` to the URL query string
    if (getPostcode() != null) {
      try {
        joiner.add(String.format("%spostcode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostcode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `legalOrganizationForm` to the URL query string
    if (getLegalOrganizationForm() != null) {
      try {
        joiner.add(String.format("%slegalOrganizationForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLegalOrganizationForm()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      try {
        joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dependentLocality` to the URL query string
    if (getDependentLocality() != null) {
      try {
        joiner.add(String.format("%sdependentLocality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDependentLocality()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emailAddress` to the URL query string
    if (getEmailAddress() != null) {
      try {
        joiner.add(String.format("%semailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phoneNumber` to the URL query string
    if (getPhoneNumber() != null) {
      try {
        joiner.add(String.format("%sphoneNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortingCode` to the URL query string
    if (getSortingCode() != null) {
      try {
        joiner.add(String.format("%ssortingCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortingCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `street` to the URL query string
    if (getStreet() != null) {
      try {
        joiner.add(String.format("%sstreet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStreet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      try {
        joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamilyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postalState` to the URL query string
    if (getPostalState() != null) {
      try {
        joiner.add(String.format("%spostalState%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostalState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `salutation` to the URL query string
    if (getSalutation() != null) {
      try {
        joiner.add(String.format("%ssalutation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSalutation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

