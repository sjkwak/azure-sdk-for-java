/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies how the Batch service responds to a particular exit condition.
 */
public class ExitOptions {
    /**
     * An action to take on the Job containing the Task, if the Task completes
     * with the given exit condition and the Job's onTaskFailed property is
     * 'performExitOptionsJobAction'.
     * The default is none for exit code 0 and terminate for all other exit
     * conditions. If the Job's onTaskFailed property is noaction, then
     * specifying this property returns an error and the add Task request fails
     * with an invalid property value error; if you are calling the REST API
     * directly, the HTTP status code is 400 (Bad Request). Possible values
     * include: 'none', 'disable', 'terminate'.
     */
    @JsonProperty(value = "jobAction")
    private JobAction jobAction;

    /**
     * An action that the Batch service performs on Tasks that depend on this
     * Task.
     * Possible values are 'satisfy' (allowing dependent tasks to progress) and
     * 'block' (dependent tasks continue to wait). Batch does not yet support
     * cancellation of dependent tasks. Possible values include: 'satisfy',
     * 'block'.
     */
    @JsonProperty(value = "dependencyAction")
    private DependencyAction dependencyAction;

    /**
     * Get the default is none for exit code 0 and terminate for all other exit conditions. If the Job's onTaskFailed property is noaction, then specifying this property returns an error and the add Task request fails with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'none', 'disable', 'terminate'.
     *
     * @return the jobAction value
     */
    public JobAction jobAction() {
        return this.jobAction;
    }

    /**
     * Set the default is none for exit code 0 and terminate for all other exit conditions. If the Job's onTaskFailed property is noaction, then specifying this property returns an error and the add Task request fails with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'none', 'disable', 'terminate'.
     *
     * @param jobAction the jobAction value to set
     * @return the ExitOptions object itself.
     */
    public ExitOptions withJobAction(JobAction jobAction) {
        this.jobAction = jobAction;
        return this;
    }

    /**
     * Get possible values are 'satisfy' (allowing dependent tasks to progress) and 'block' (dependent tasks continue to wait). Batch does not yet support cancellation of dependent tasks. Possible values include: 'satisfy', 'block'.
     *
     * @return the dependencyAction value
     */
    public DependencyAction dependencyAction() {
        return this.dependencyAction;
    }

    /**
     * Set possible values are 'satisfy' (allowing dependent tasks to progress) and 'block' (dependent tasks continue to wait). Batch does not yet support cancellation of dependent tasks. Possible values include: 'satisfy', 'block'.
     *
     * @param dependencyAction the dependencyAction value to set
     * @return the ExitOptions object itself.
     */
    public ExitOptions withDependencyAction(DependencyAction dependencyAction) {
        this.dependencyAction = dependencyAction;
        return this;
    }

}
