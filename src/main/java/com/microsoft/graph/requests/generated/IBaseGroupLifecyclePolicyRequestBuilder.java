// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequest;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyAddGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRemoveGroupRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Group Lifecycle Policy Request Builder.
 */
public interface IBaseGroupLifecyclePolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IGroupLifecyclePolicyRequest instance
     */
    IGroupLifecyclePolicyRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupLifecyclePolicyRequest instance
     */
    IGroupLifecyclePolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IGroupLifecyclePolicyAddGroupRequestBuilder addGroup(final String groupId);
    IGroupLifecyclePolicyRemoveGroupRequestBuilder removeGroup(final String groupId);

}
