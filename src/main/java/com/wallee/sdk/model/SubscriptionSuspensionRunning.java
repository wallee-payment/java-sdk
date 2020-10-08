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

public class SubscriptionSuspensionRunning extends SubscriptionSuspension {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionSuspensionRunning subscriptionSuspensionRunning = (SubscriptionSuspensionRunning) o;
        return Objects.equals(this.createdOn, subscriptionSuspensionRunning.createdOn) &&
                Objects.equals(this.effectiveEndDate, subscriptionSuspensionRunning.effectiveEndDate) && this.endAction
                == subscriptionSuspensionRunning.endAction &&
                Objects.equals(this.id, subscriptionSuspensionRunning.id) &&
                Objects.equals(this.language, subscriptionSuspensionRunning.language) &&
                Objects.equals(this.linkedSpaceId, subscriptionSuspensionRunning.linkedSpaceId) &&
                Objects.equals(this.note, subscriptionSuspensionRunning.note) &&
                Objects.equals(this.periodBill, subscriptionSuspensionRunning.periodBill) &&
                Objects.equals(this.plannedEndDate, subscriptionSuspensionRunning.plannedEndDate) &&
                Objects.equals(this.plannedPurgeDate, subscriptionSuspensionRunning.plannedPurgeDate) && this.reason
                == subscriptionSuspensionRunning.reason && this.state == subscriptionSuspensionRunning.state &&
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
        return "class SubscriptionSuspensionRunning { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    effectiveEndDate: " +  toIndentedString(effectiveEndDate) + " \n" +
            "    endAction: " + toIndentedString(endAction) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    note: " + toIndentedString(note) + " \n" +
            "    periodBill: " + toIndentedString(periodBill) + " \n" +
            "    plannedEndDate: " + toIndentedString(plannedEndDate) +  " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    reason: " +  toIndentedString(reason) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    subscription: " +  toIndentedString(subscription) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

