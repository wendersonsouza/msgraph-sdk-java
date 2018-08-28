// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionRequest;
import com.microsoft.graph.models.extensions.WindowsInformationProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection Request.
 */
public class BaseWindowsInformationProtectionRequest extends BaseRequest implements IBaseWindowsInformationProtectionRequest {

    /**
     * The request for the WindowsInformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWindowsInformationProtectionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends WindowsInformationProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WindowsInformationProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsInformationProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtection from the service
     *
     * @return the WindowsInformationProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsInformationProtection> callback) {
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
     * Patches this WindowsInformationProtection with a source
     *
     * @param sourceWindowsInformationProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsInformationProtection sourceWindowsInformationProtection, final ICallback<WindowsInformationProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtection);
    }

    /**
     * Patches this WindowsInformationProtection with a source
     *
     * @param sourceWindowsInformationProtection the source object with updates
     * @return the updated WindowsInformationProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtection patch(final WindowsInformationProtection sourceWindowsInformationProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtection);
    }

    /**
     * Creates a WindowsInformationProtection with a new object
     *
     * @param newWindowsInformationProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsInformationProtection newWindowsInformationProtection, final ICallback<WindowsInformationProtection> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtection);
    }

    /**
     * Creates a WindowsInformationProtection with a new object
     *
     * @param newWindowsInformationProtection the new object to create
     * @return the created WindowsInformationProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtection post(final WindowsInformationProtection newWindowsInformationProtection) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsInformationProtectionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WindowsInformationProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsInformationProtectionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WindowsInformationProtectionRequest)this;
     }

}

