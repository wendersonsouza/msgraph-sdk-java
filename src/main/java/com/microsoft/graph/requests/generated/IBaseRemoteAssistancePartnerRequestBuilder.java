// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequest;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerBeginOnboardingRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerDisconnectRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Remote Assistance Partner Request Builder.
 */
public interface IBaseRemoteAssistancePartnerRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IRemoteAssistancePartnerRequest instance
     */
    IRemoteAssistancePartnerRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IRemoteAssistancePartnerRequest instance
     */
    IRemoteAssistancePartnerRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IRemoteAssistancePartnerBeginOnboardingRequestBuilder beginOnboarding();
    IRemoteAssistancePartnerDisconnectRequestBuilder disconnect();

}
