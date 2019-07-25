/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for adding a new or existing data disk to a virtual machine.
 */
public class DataDiskProperties {
    /**
     * Specifies options to attach a new disk to the virtual machine.
     */
    @JsonProperty(value = "attachNewDataDiskOptions")
    private AttachNewDataDiskOptions attachNewDataDiskOptions;

    /**
     * Specifies the existing lab disk id to attach to virtual machine.
     */
    @JsonProperty(value = "existingLabDiskId")
    private String existingLabDiskId;

    /**
     * Caching option for a data disk (i.e. None, ReadOnly, ReadWrite).
     * Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "hostCaching")
    private HostCachingOptions hostCaching;

    /**
     * Get specifies options to attach a new disk to the virtual machine.
     *
     * @return the attachNewDataDiskOptions value
     */
    public AttachNewDataDiskOptions attachNewDataDiskOptions() {
        return this.attachNewDataDiskOptions;
    }

    /**
     * Set specifies options to attach a new disk to the virtual machine.
     *
     * @param attachNewDataDiskOptions the attachNewDataDiskOptions value to set
     * @return the DataDiskProperties object itself.
     */
    public DataDiskProperties withAttachNewDataDiskOptions(AttachNewDataDiskOptions attachNewDataDiskOptions) {
        this.attachNewDataDiskOptions = attachNewDataDiskOptions;
        return this;
    }

    /**
     * Get specifies the existing lab disk id to attach to virtual machine.
     *
     * @return the existingLabDiskId value
     */
    public String existingLabDiskId() {
        return this.existingLabDiskId;
    }

    /**
     * Set specifies the existing lab disk id to attach to virtual machine.
     *
     * @param existingLabDiskId the existingLabDiskId value to set
     * @return the DataDiskProperties object itself.
     */
    public DataDiskProperties withExistingLabDiskId(String existingLabDiskId) {
        this.existingLabDiskId = existingLabDiskId;
        return this;
    }

    /**
     * Get caching option for a data disk (i.e. None, ReadOnly, ReadWrite). Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @return the hostCaching value
     */
    public HostCachingOptions hostCaching() {
        return this.hostCaching;
    }

    /**
     * Set caching option for a data disk (i.e. None, ReadOnly, ReadWrite). Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @param hostCaching the hostCaching value to set
     * @return the DataDiskProperties object itself.
     */
    public DataDiskProperties withHostCaching(HostCachingOptions hostCaching) {
        this.hostCaching = hostCaching;
        return this;
    }

}
