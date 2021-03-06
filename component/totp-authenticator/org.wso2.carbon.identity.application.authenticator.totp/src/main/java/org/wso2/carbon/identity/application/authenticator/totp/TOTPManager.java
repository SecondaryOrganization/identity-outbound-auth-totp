/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.totp;

import org.wso2.carbon.identity.application.authenticator.totp.exception.TOTPException;


public interface TOTPManager {
    /**
     * Generate the totp key for a local user
     *
     * @param username user name
     * @return return TOTP Data transfer object
     * @throws TOTPException
     */
    public String generateTOTPKeyLocal(String username) throws TOTPException;

    /**
     * Generate the totp token for a local user
     *
     * @param username user name
     * @return totp token
     * @throws TOTPException
     */
    public String generateTOTPTokenLocal(String username) throws TOTPException;

    /**
     * Check whether totp is enabled for a given local user
     *
     * @param username user name
     * @return true or false
     * @throws TOTPException
     */
    public boolean isTOTPEnabledForLocalUser(String username) throws TOTPException;

    /**
     * is given token is valid for a local user
     *
     * @param token    token
     * @param username user name
     * @return true or false
     * @throws TOTPException
     */
    public boolean isValidTokenLocalUser(int token, String username) throws TOTPException;

    /**
     * Get the supported encoding method
     *
     * @return String value of the encoding method
     */
    public String[] getSupportedEncodingMethods();

    /**
     * Get the supported hashing method
     *
     * @return String value of the hashing method
     */
    public String[] getSupportedHashingMethods();
}
