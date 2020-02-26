/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SubscriberUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
public class SubscriberActive extends SubscriberUpdate {
  
  @SerializedName("state")
  protected CreationEntityState state = null;

  
  
  public SubscriberActive state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberActive subscriberActive = (SubscriberActive) o;
    return Objects.equals(this.id, subscriberActive.id) &&
        Objects.equals(this.version, subscriberActive.version) &&
        Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberActive.additionalAllowedPaymentMethodConfigurations) &&
        Objects.equals(this.billingAddress, subscriberActive.billingAddress) &&
        Objects.equals(this.description, subscriberActive.description) &&
        Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberActive.disallowedPaymentMethodConfigurations) &&
        Objects.equals(this.emailAddress, subscriberActive.emailAddress) &&
        Objects.equals(this.language, subscriberActive.language) &&
        Objects.equals(this.metaData, subscriberActive.metaData) &&
        Objects.equals(this.reference, subscriberActive.reference) &&
        Objects.equals(this.shippingAddress, subscriberActive.shippingAddress) &&
        Objects.equals(this.state, subscriberActive.state) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, metaData, reference, shippingAddress, state, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberActive {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

