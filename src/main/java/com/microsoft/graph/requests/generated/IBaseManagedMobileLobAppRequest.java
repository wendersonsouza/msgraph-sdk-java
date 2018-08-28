// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Mobile Lob App Request.
 */
public interface IBaseManagedMobileLobAppRequest extends IHttpRequest {

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedMobileLobApp> callback);

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @return the ManagedMobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileLobApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedMobileLobApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedMobileLobApp sourceManagedMobileLobApp, final ICallback<ManagedMobileLobApp> callback);

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @return the updated ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileLobApp patch(final ManagedMobileLobApp sourceManagedMobileLobApp) throws ClientException;

    /**
     * Posts a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedMobileLobApp newManagedMobileLobApp, final ICallback<ManagedMobileLobApp> callback);

    /**
     * Posts a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileLobApp post(final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseManagedMobileLobAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseManagedMobileLobAppRequest expand(final String value);

}

