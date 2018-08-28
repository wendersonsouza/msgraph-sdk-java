// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRequest;
import com.microsoft.graph.models.extensions.ManagedApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Request.
 */
public class BaseManagedAppRequest extends BaseRequest implements IBaseManagedAppRequest {

    /**
     * The request for the ManagedApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ManagedApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedApp from the service
     *
     * @return the ManagedApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ManagedApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedApp with a source
     *
     * @param sourceManagedApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedApp sourceManagedApp, final ICallback<ManagedApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedApp);
    }

    /**
     * Patches this ManagedApp with a source
     *
     * @param sourceManagedApp the source object with updates
     * @return the updated ManagedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedApp patch(final ManagedApp sourceManagedApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedApp);
    }

    /**
     * Creates a ManagedApp with a new object
     *
     * @param newManagedApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedApp newManagedApp, final ICallback<ManagedApp> callback) {
        send(HttpMethod.POST, callback, newManagedApp);
    }

    /**
     * Creates a ManagedApp with a new object
     *
     * @param newManagedApp the new object to create
     * @return the created ManagedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedApp post(final ManagedApp newManagedApp) throws ClientException {
        return send(HttpMethod.POST, newManagedApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedAppRequest)this;
     }

}

