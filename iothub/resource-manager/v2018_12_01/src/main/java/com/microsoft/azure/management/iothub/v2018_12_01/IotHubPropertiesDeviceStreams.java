/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The device streams properties of iothub.
 */
public class IotHubPropertiesDeviceStreams {
    /**
     * List of Device Streams Endpoints.
     */
    @JsonProperty(value = "streamingEndpoints")
    private List<String> streamingEndpoints;

    /**
     * Get list of Device Streams Endpoints.
     *
     * @return the streamingEndpoints value
     */
    public List<String> streamingEndpoints() {
        return this.streamingEndpoints;
    }

    /**
     * Set list of Device Streams Endpoints.
     *
     * @param streamingEndpoints the streamingEndpoints value to set
     * @return the IotHubPropertiesDeviceStreams object itself.
     */
    public IotHubPropertiesDeviceStreams withStreamingEndpoints(List<String> streamingEndpoints) {
        this.streamingEndpoints = streamingEndpoints;
        return this;
    }

}
