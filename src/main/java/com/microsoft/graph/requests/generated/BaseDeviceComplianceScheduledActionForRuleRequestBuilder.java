// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleRequest;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Scheduled Action For Rule Request Builder.
 */
public class BaseDeviceComplianceScheduledActionForRuleRequestBuilder extends BaseRequestBuilder implements IBaseDeviceComplianceScheduledActionForRuleRequestBuilder {

    /**
     * The request builder for the DeviceComplianceScheduledActionForRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceComplianceScheduledActionForRuleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceComplianceScheduledActionForRuleRequest instance
     */
    public IDeviceComplianceScheduledActionForRuleRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceComplianceScheduledActionForRuleRequest instance
     */
    public IDeviceComplianceScheduledActionForRuleRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceComplianceScheduledActionForRuleRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceComplianceActionItemCollectionRequestBuilder scheduledActionConfigurations() {
        return new DeviceComplianceActionItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionConfigurations"), getClient(), null);
    }

    public IDeviceComplianceActionItemRequestBuilder scheduledActionConfigurations(final String id) {
        return new DeviceComplianceActionItemRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionConfigurations") + "/" + id, getClient(), null);
    }
}

