// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.generated.BaseDriveItemCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Shared Drive Item.
 */
public class BaseSharedDriveItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Owner.
     * Information about the owner of the shared item being referenced.
     */
    @SerializedName("owner")
    @Expose
    public IdentitySet owner;

    /**
     * The Drive Item.
     * Used to access the underlying driveItem
     */
    @SerializedName("driveItem")
    @Expose
    public DriveItem driveItem;

    /**
     * The Items.
     * All driveItems contained in the sharing root. This collection cannot be enumerated.
     */
    public DriveItemCollectionPage items;

    /**
     * The List.
     * Used to access the underlying list
     */
    @SerializedName("list")
    @Expose
    public List list;

    /**
     * The List Item.
     * Used to access the underlying listItem
     */
    @SerializedName("listItem")
    @Expose
    public ListItem listItem;

    /**
     * The Root.
     * 
     */
    @SerializedName("root")
    @Expose
    public DriveItem root;

    /**
     * The Site.
     * Used to access the underlying site
     */
    @SerializedName("site")
    @Expose
    public Site site;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("items")) {
            final BaseDriveItemCollectionResponse response = new BaseDriveItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new DriveItemCollectionPage(response, null);
        }
    }
}
