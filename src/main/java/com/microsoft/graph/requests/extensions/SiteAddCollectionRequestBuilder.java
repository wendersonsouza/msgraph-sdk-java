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
 * The class for the Site Add Collection Request Builder.
 */
public class SiteAddCollectionRequestBuilder extends BaseActionRequestBuilder implements ISiteAddCollectionRequestBuilder {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public SiteAddCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<Site> value) {
        super(requestUrl, client, requestOptions);
  	 if(value!=null){
			bodyParams.put("value", value);
		}
      }

    public ISiteAddCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ISiteAddCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        SiteAddCollectionRequest request = new SiteAddCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }
  
        return request;
    }
}
