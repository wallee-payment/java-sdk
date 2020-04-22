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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.SubscriptionSuspension;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:20:41.240+02:00")
public class SubscriptionSuspensionRunning extends SubscriptionSuspension {
  
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuspensionRunning subscriptionSuspensionRunning = (SubscriptionSuspensionRunning) o;
    return Objects.equals(this.createdOn, subscriptionSuspensionRunning.createdOn) &&
        Objects.equals(this.effectiveEndDate, subscriptionSuspensionRunning.effectiveEndDate) &&
        Objects.equals(this.endAction, subscriptionSuspensionRunning.endAction) &&
        Objects.equals(this.id, subscriptionSuspensionRunning.id) &&
        Objects.equals(this.language, subscriptionSuspensionRunning.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionSuspensionRunning.linkedSpaceId) &&
        Objects.equals(this.note, subscriptionSuspensionRunning.note) &&
        Objects.equals(this.periodBill, subscriptionSuspensionRunning.periodBill) &&
        Objects.equals(this.plannedEndDate, subscriptionSuspensionRunning.plannedEndDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionSuspensionRunning.plannedPurgeDate) &&
        Objects.equals(this.reason, subscriptionSuspensionRunning.reason) &&
        Objects.equals(this.state, subscriptionSuspensionRunning.state) &&
        Objects.equals(this.subscription, subscriptionSuspensionRunning.subscription) &&
        Objects.equals(this.version, subscriptionSuspensionRunning.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, effectiveEndDate, endAction, id, language, linkedSpaceId, note, periodBill, plannedEndDate, plannedPurgeDate, reason, state, subscription, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuspensionRunning {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    endAction: ").append(toIndentedString(endAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    periodBill: ").append(toIndentedString(periodBill)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

