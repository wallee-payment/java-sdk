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
 * PaymentTerminalAddressCreate
 */
@JsonPropertyOrder({
  PaymentTerminalAddressCreate.JSON_PROPERTY_COUNTRY,
  PaymentTerminalAddressCreate.JSON_PROPERTY_MOBILE_PHONE_NUMBER,
  PaymentTerminalAddressCreate.JSON_PROPERTY_ORGANIZATION_NAME,
  PaymentTerminalAddressCreate.JSON_PROPERTY_CITY,
  PaymentTerminalAddressCreate.JSON_PROPERTY_GIVEN_NAME,
  PaymentTerminalAddressCreate.JSON_PROPERTY_POSTCODE,
  PaymentTerminalAddressCreate.JSON_PROPERTY_DEPENDENT_LOCALITY,
  PaymentTerminalAddressCreate.JSON_PROPERTY_EMAIL_ADDRESS,
  PaymentTerminalAddressCreate.JSON_PROPERTY_PHONE_NUMBER,
  PaymentTerminalAddressCreate.JSON_PROPERTY_SORTING_CODE,
  PaymentTerminalAddressCreate.JSON_PROPERTY_STREET,
  PaymentTerminalAddressCreate.JSON_PROPERTY_FAMILY_NAME,
  PaymentTerminalAddressCreate.JSON_PROPERTY_POSTAL_STATE,
  PaymentTerminalAddressCreate.JSON_PROPERTY_SALUTATION
})
@JsonTypeName("PaymentTerminalAddress.Create")

public class PaymentTerminalAddressCreate {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
  @javax.annotation.Nullable
  private String mobilePhoneNumber;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
  @javax.annotation.Nullable
  private String organizationName;

  public static final String JSON_PROPERTY_CITY = "city";
  @javax.annotation.Nullable
  private String city;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  @javax.annotation.Nullable
  private String givenName;

  public static final String JSON_PROPERTY_POSTCODE = "postcode";
  @javax.annotation.Nullable
  private String postcode;

  public static final String JSON_PROPERTY_DEPENDENT_LOCALITY = "dependentLocality";
  @javax.annotation.Nullable
  private String dependentLocality;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  @javax.annotation.Nullable
  private String emailAddress;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String JSON_PROPERTY_SORTING_CODE = "sortingCode";
  @javax.annotation.Nullable
  private String sortingCode;

  public static final String JSON_PROPERTY_STREET = "street";
  @javax.annotation.Nullable
  private String street;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  @javax.annotation.Nullable
  private String familyName;

  public static final String JSON_PROPERTY_POSTAL_STATE = "postalState";
  @javax.annotation.Nullable
  private String postalState;

  public static final String JSON_PROPERTY_SALUTATION = "salutation";
  @javax.annotation.Nullable
  private String salutation;

  public PaymentTerminalAddressCreate() {
  }

  public PaymentTerminalAddressCreate country(@javax.annotation.Nonnull String country) {
    
    this.country = country;
    return this;
  }

  /**
   * The two-letter country code (ISO 3166 format).
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }

  public PaymentTerminalAddressCreate mobilePhoneNumber(@javax.annotation.Nullable String mobilePhoneNumber) {
    
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

  /**
   * The phone number of a mobile phone.
   * @return mobilePhoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePhoneNumber(@javax.annotation.Nullable String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public PaymentTerminalAddressCreate organizationName(@javax.annotation.Nullable String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

  /**
   * The organization&#39;s name.
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

  public PaymentTerminalAddressCreate city(@javax.annotation.Nullable String city) {
    
    this.city = city;
    return this;
  }

  /**
   * The city, town or village.
   * @return city
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }

  public PaymentTerminalAddressCreate givenName(@javax.annotation.Nullable String givenName) {
    
    this.givenName = givenName;
    return this;
  }

  /**
   * The given or first name.
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenName(@javax.annotation.Nullable String givenName) {
    this.givenName = givenName;
  }

  public PaymentTerminalAddressCreate postcode(@javax.annotation.Nullable String postcode) {
    
    this.postcode = postcode;
    return this;
  }

  /**
   * The postal code, also known as ZIP, postcode, etc.
   * @return postcode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostcode() {
    return postcode;
  }


  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostcode(@javax.annotation.Nullable String postcode) {
    this.postcode = postcode;
  }

  public PaymentTerminalAddressCreate dependentLocality(@javax.annotation.Nullable String dependentLocality) {
    
    this.dependentLocality = dependentLocality;
    return this;
  }

  /**
   * The dependent locality which is a sub-division of the state.
   * @return dependentLocality
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDENT_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDependentLocality() {
    return dependentLocality;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDENT_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependentLocality(@javax.annotation.Nullable String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  public PaymentTerminalAddressCreate emailAddress(@javax.annotation.Nullable String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public PaymentTerminalAddressCreate phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PaymentTerminalAddressCreate sortingCode(@javax.annotation.Nullable String sortingCode) {
    
    this.sortingCode = sortingCode;
    return this;
  }

  /**
   * The sorting code identifying the post office where the PO Box is located.
   * @return sortingCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortingCode() {
    return sortingCode;
  }


  @JsonProperty(JSON_PROPERTY_SORTING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortingCode(@javax.annotation.Nullable String sortingCode) {
    this.sortingCode = sortingCode;
  }

  public PaymentTerminalAddressCreate street(@javax.annotation.Nullable String street) {
    
    this.street = street;
    return this;
  }

  /**
   * The street or PO Box.
   * @return street
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(@javax.annotation.Nullable String street) {
    this.street = street;
  }

  public PaymentTerminalAddressCreate familyName(@javax.annotation.Nullable String familyName) {
    
    this.familyName = familyName;
    return this;
  }

  /**
   * The family or last name.
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilyName(@javax.annotation.Nullable String familyName) {
    this.familyName = familyName;
  }

  public PaymentTerminalAddressCreate postalState(@javax.annotation.Nullable String postalState) {
    
    this.postalState = postalState;
    return this;
  }

  /**
   * The name of the region, typically a state, county, province or prefecture.
   * @return postalState
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalState() {
    return postalState;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalState(@javax.annotation.Nullable String postalState) {
    this.postalState = postalState;
  }

  public PaymentTerminalAddressCreate salutation(@javax.annotation.Nullable String salutation) {
    
    this.salutation = salutation;
    return this;
  }

  /**
   * The salutation e.g. Mrs, Mr, Dr.
   * @return salutation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalutation() {
    return salutation;
  }


  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalutation(@javax.annotation.Nullable String salutation) {
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
    PaymentTerminalAddressCreate paymentTerminalAddressCreate = (PaymentTerminalAddressCreate) o;
    return Objects.equals(this.country, paymentTerminalAddressCreate.country) &&
        Objects.equals(this.mobilePhoneNumber, paymentTerminalAddressCreate.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, paymentTerminalAddressCreate.organizationName) &&
        Objects.equals(this.city, paymentTerminalAddressCreate.city) &&
        Objects.equals(this.givenName, paymentTerminalAddressCreate.givenName) &&
        Objects.equals(this.postcode, paymentTerminalAddressCreate.postcode) &&
        Objects.equals(this.dependentLocality, paymentTerminalAddressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, paymentTerminalAddressCreate.emailAddress) &&
        Objects.equals(this.phoneNumber, paymentTerminalAddressCreate.phoneNumber) &&
        Objects.equals(this.sortingCode, paymentTerminalAddressCreate.sortingCode) &&
        Objects.equals(this.street, paymentTerminalAddressCreate.street) &&
        Objects.equals(this.familyName, paymentTerminalAddressCreate.familyName) &&
        Objects.equals(this.postalState, paymentTerminalAddressCreate.postalState) &&
        Objects.equals(this.salutation, paymentTerminalAddressCreate.salutation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, mobilePhoneNumber, organizationName, city, givenName, postcode, dependentLocality, emailAddress, phoneNumber, sortingCode, street, familyName, postalState, salutation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalAddressCreate {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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

