// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Information Protection App Learning Summary Request Builder.
 */
public interface IBaseWindowsInformationProtectionAppLearningSummaryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionAppLearningSummaryRequest instance
     */
    IWindowsInformationProtectionAppLearningSummaryRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionAppLearningSummaryRequest instance
     */
    IWindowsInformationProtectionAppLearningSummaryRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}
