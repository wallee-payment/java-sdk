/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
 * Exception thrown when the Wallee SDK API call results in an invalid response.
 */
public class WalleeSdkException extends RuntimeException {

    private static final long serialVersionUID = 1675383192982547616L;

    private final ErrorCode code;

    private final String message;

	/**
	 * Constructor.
	 *
	 * @param code
	 *            the Wallee SDK error code
	 * @param message
	 *            the exception message details
	 */
    public WalleeSdkException(ErrorCode code, String message) {
        super();
        this.code = code;
        this.message = String.format("Error code: %d. %s", code.getCode(), message);
    }

    /**
	 * @return the Wallee SDK error code
	 */
	public ErrorCode getCode() {
		return this.code;
	}

	/**
	 * @return the Wallee SDK error message
	 */
	public String getMessage() {
		return this.message;
	}
    
}