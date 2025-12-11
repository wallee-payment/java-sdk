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
package com.wallee.sdk;

import org.apache.hc.core5.http.HttpStatus;

/**
 * ApiException Error Codes
 */
public enum ApiExceptionErrorCodes {
  /*
   * This class represents possible HTTP error codes which can be sent by the API.
   * This list corresponds to https://app-wallee.com/en-us/doc/api/web-service#_errors
   */
  BAD_REQUEST(HttpStatus.SC_BAD_REQUEST),
  UNAUTHORIZED(HttpStatus.SC_UNAUTHORIZED),
  FORBIDDEN(HttpStatus.SC_FORBIDDEN),
  NOT_FOUND(HttpStatus.SC_NOT_FOUND),
  NOT_ACCEPTABLE(HttpStatus.SC_NOT_ACCEPTABLE),
  CONFLICT(HttpStatus.SC_CONFLICT),
  PAYLOAD_TOO_LARGE(HttpStatus.SC_REQUEST_TOO_LONG),
  UNSUPPORTED_MEDIA_TYPE(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE),
  RANGE_NOT_SATISFIABLE(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE),
  UNPROCESSABLE_ENTITY(HttpStatus.SC_UNPROCESSABLE_ENTITY),
  TOO_MANY_REQUESTS(HttpStatus.SC_TOO_MANY_REQUESTS),
  INTERNAL_SERVER_ERROR(HttpStatus.SC_SERVER_ERROR);

  private final int httpCode;

  ApiExceptionErrorCodes(int httpCode) {
    this.httpCode = httpCode;
  }

  public int getHttpCode() {
    return httpCode;
  }

  public boolean matches(ApiException apiException) {
    return apiException.getCode() == this.httpCode;
  }
}