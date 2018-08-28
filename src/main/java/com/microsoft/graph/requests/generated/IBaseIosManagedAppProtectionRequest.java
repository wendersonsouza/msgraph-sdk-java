// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Managed App Protection Request.
 */
public interface IBaseIosManagedAppProtectionRequest extends IHttpRequest {

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosManagedAppProtection> callback);

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @return the IosManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosManagedAppProtection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IosManagedAppProtection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosManagedAppProtection sourceIosManagedAppProtection, final ICallback<IosManagedAppProtection> callback);

    /**
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @return the updated IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosManagedAppProtection patch(final IosManagedAppProtection sourceIosManagedAppProtection) throws ClientException;

    /**
     * Posts a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosManagedAppProtection newIosManagedAppProtection, final ICallback<IosManagedAppProtection> callback);

    /**
     * Posts a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @return the created IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosManagedAppProtection post(final IosManagedAppProtection newIosManagedAppProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosManagedAppProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosManagedAppProtectionRequest expand(final String value);

}

