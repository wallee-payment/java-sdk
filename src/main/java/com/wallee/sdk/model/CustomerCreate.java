/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "")

public class CustomerCreate extends AbstractCustomerActive implements CreateableEntity {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerCreate customerCreate = (CustomerCreate) o;
        return Objects.equals(this.customerId, customerCreate.customerId) &&
                Objects.equals(this.emailAddress, customerCreate.emailAddress) &&
                Objects.equals(this.familyName, customerCreate.familyName) &&
                Objects.equals(this.givenName, customerCreate.givenName) &&
                Objects.equals(this.language, customerCreate.language) &&
                Objects.equals(this.metaData, customerCreate.metaData) &&
                Objects.equals(this.preferredCurrency, customerCreate.preferredCurrency) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, emailAddress, familyName, givenName, language, metaData, preferredCurrency, super.hashCode());
    }


    @Override
    public String toString() {
      return "class CustomerCreate { \n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) +  " \n" +
            "    familyName: " + toIndentedString(familyName) + " \n" +
            "    givenName: " + toIndentedString(givenName) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    metaData: " + toIndentedString(metaData) + "\n" +
            "    preferredCurrency: " + toIndentedString(preferredCurrency) + "\n" +
            "}";
      }


}

