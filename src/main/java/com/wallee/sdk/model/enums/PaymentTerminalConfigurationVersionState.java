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


package com.wallee.sdk.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum PaymentTerminalConfigurationVersionState {

    PENDING("PENDING"),

    SCHEDULING("SCHEDULING"),

    ACTIVE("ACTIVE"),

    DELETING("DELETING"),

    DELETED("DELETED");

    private final String value;

    PaymentTerminalConfigurationVersionState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static PaymentTerminalConfigurationVersionState fromValue(String text) {
        for (PaymentTerminalConfigurationVersionState b : PaymentTerminalConfigurationVersionState.values()) {
            if (b.name().equals(text)) {
                return b;
            }
        }
        return null;
    }
}

