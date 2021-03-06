// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Collection Request.
 */
public class DeviceCollectionRequest extends BaseCollectionRequest<DeviceCollectionResponse, IDeviceCollectionPage> implements IDeviceCollectionRequest {

    /**
     * The request builder for this collection of Device
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCollectionResponse.class, IDeviceCollectionPage.class);
    }

    public void get(final ICallback<IDeviceCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceCollectionPage get() throws ClientException {
        final DeviceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Device newDevice, final ICallback<Device> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDevice, callback);
    }

    public Device post(final Device newDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDevice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceCollectionRequest)this;
    }

    public IDeviceCollectionPage buildFromResponse(final DeviceCollectionResponse response) {
        final IDeviceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceCollectionPage page = new DeviceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
