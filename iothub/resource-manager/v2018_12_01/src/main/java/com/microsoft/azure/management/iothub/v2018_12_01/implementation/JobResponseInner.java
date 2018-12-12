/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01.implementation;

import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.microsoft.azure.management.iothub.v2018_12_01.JobType;
import com.microsoft.azure.management.iothub.v2018_12_01.JobStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the Job Response object.
 */
public class JobResponseInner {
    /**
     * The job identifier.
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /**
     * The start time of the job.
     */
    @JsonProperty(value = "startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 startTimeUtc;

    /**
     * The time the job stopped processing.
     */
    @JsonProperty(value = "endTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 endTimeUtc;

    /**
     * The type of the job. Possible values include: 'unknown', 'export',
     * 'import', 'backup', 'readDeviceProperties', 'writeDeviceProperties',
     * 'updateDeviceConfiguration', 'rebootDevice', 'factoryResetDevice',
     * 'firmwareUpdate'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private JobType type;

    /**
     * The status of the job. Possible values include: 'unknown', 'enqueued',
     * 'running', 'completed', 'failed', 'cancelled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /**
     * If status == failed, this string containing the reason for the failure.
     */
    @JsonProperty(value = "failureReason", access = JsonProperty.Access.WRITE_ONLY)
    private String failureReason;

    /**
     * The status message for the job.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /**
     * The job identifier of the parent job, if any.
     */
    @JsonProperty(value = "parentJobId", access = JsonProperty.Access.WRITE_ONLY)
    private String parentJobId;

    /**
     * Get the job identifier.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Get the start time of the job.
     *
     * @return the startTimeUtc value
     */
    public DateTime startTimeUtc() {
        if (this.startTimeUtc == null) {
            return null;
        }
        return this.startTimeUtc.dateTime();
    }

    /**
     * Get the time the job stopped processing.
     *
     * @return the endTimeUtc value
     */
    public DateTime endTimeUtc() {
        if (this.endTimeUtc == null) {
            return null;
        }
        return this.endTimeUtc.dateTime();
    }

    /**
     * Get the type of the job. Possible values include: 'unknown', 'export', 'import', 'backup', 'readDeviceProperties', 'writeDeviceProperties', 'updateDeviceConfiguration', 'rebootDevice', 'factoryResetDevice', 'firmwareUpdate'.
     *
     * @return the type value
     */
    public JobType type() {
        return this.type;
    }

    /**
     * Get the status of the job. Possible values include: 'unknown', 'enqueued', 'running', 'completed', 'failed', 'cancelled'.
     *
     * @return the status value
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Get if status == failed, this string containing the reason for the failure.
     *
     * @return the failureReason value
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Get the status message for the job.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the job identifier of the parent job, if any.
     *
     * @return the parentJobId value
     */
    public String parentJobId() {
        return this.parentJobId;
    }

}
