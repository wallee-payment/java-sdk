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

/**
 * Exception thrown when an internal SDK error occurs
 */
public class WalleeSdkException extends RuntimeException {

  private static final long serialVersionUID = 1748345776895L;

  private final String code;

  private final String message;

  /**
   * Constructor.
   *
   * @param code    SDK error code
   * @param message  exception message details
   */
  public WalleeSdkException(String code, String message) {
    super(String.format("Error code: %s. %s", code, message));
    this.code = code;
    this.message = message;
  }

  /**
   * Constructor.
   *
   * @param code    SdkExceptionErrorCodes error code
   * @param message  exception message details
   */
  public WalleeSdkException(SdkExceptionErrorCodes code, String message) {
    super(String.format("Error code: %s. %s", code, message));
    this.code = code.getCode();
    this.message = message;
  }

  /**
   * @return SDK error code
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @return SDK error message
   */
  public String getMessage() {
    return this.message;
  }

}