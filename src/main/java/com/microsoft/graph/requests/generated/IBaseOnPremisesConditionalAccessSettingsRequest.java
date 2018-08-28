// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.OnPremisesConditionalAccessSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base On Premises Conditional Access Settings Request.
 */
public interface IBaseOnPremisesConditionalAccessSettingsRequest extends IHttpRequest {

    /**
     * Gets the OnPremisesConditionalAccessSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OnPremisesConditionalAccessSettings> callback);

    /**
     * Gets the OnPremisesConditionalAccessSettings from the service
     *
     * @return the OnPremisesConditionalAccessSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesConditionalAccessSettings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OnPremisesConditionalAccessSettings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnPremisesConditionalAccessSettings with a source
     *
     * @param sourceOnPremisesConditionalAccessSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnPremisesConditionalAccessSettings sourceOnPremisesConditionalAccessSettings, final ICallback<OnPremisesConditionalAccessSettings> callback);

    /**
     * Patches this OnPremisesConditionalAccessSettings with a source
     *
     * @param sourceOnPremisesConditionalAccessSettings the source object with updates
     * @return the updated OnPremisesConditionalAccessSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesConditionalAccessSettings patch(final OnPremisesConditionalAccessSettings sourceOnPremisesConditionalAccessSettings) throws ClientException;

    /**
     * Posts a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings, final ICallback<OnPremisesConditionalAccessSettings> callback);

    /**
     * Posts a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the new object to create
     * @return the created OnPremisesConditionalAccessSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesConditionalAccessSettings post(final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseOnPremisesConditionalAccessSettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseOnPremisesConditionalAccessSettingsRequest expand(final String value);

}

