// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Setting State Request.
 */
public interface IBaseDeviceComplianceSettingStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceSettingState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceComplianceSettingState> callback);

    /**
     * Gets the DeviceComplianceSettingState from the service
     *
     * @return the DeviceComplianceSettingState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceSettingState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceComplianceSettingState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceSettingState with a source
     *
     * @param sourceDeviceComplianceSettingState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceSettingState sourceDeviceComplianceSettingState, final ICallback<DeviceComplianceSettingState> callback);

    /**
     * Patches this DeviceComplianceSettingState with a source
     *
     * @param sourceDeviceComplianceSettingState the source object with updates
     * @return the updated DeviceComplianceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceSettingState patch(final DeviceComplianceSettingState sourceDeviceComplianceSettingState) throws ClientException;

    /**
     * Posts a DeviceComplianceSettingState with a new object
     *
     * @param newDeviceComplianceSettingState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceSettingState newDeviceComplianceSettingState, final ICallback<DeviceComplianceSettingState> callback);

    /**
     * Posts a DeviceComplianceSettingState with a new object
     *
     * @param newDeviceComplianceSettingState the new object to create
     * @return the created DeviceComplianceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceSettingState post(final DeviceComplianceSettingState newDeviceComplianceSettingState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceComplianceSettingStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceComplianceSettingStateRequest expand(final String value);

}

