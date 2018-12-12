/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Compilation error when evaluating route.
 */
public class RouteCompilationError {
    /**
     * Route error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Severity of the route error. Possible values include: 'error',
     * 'warning'.
     */
    @JsonProperty(value = "severity")
    private RouteErrorSeverity severity;

    /**
     * Location where the route error happened.
     */
    @JsonProperty(value = "location")
    private RouteErrorRange location;

    /**
     * Get route error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set route error message.
     *
     * @param message the message value to set
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get severity of the route error. Possible values include: 'error', 'warning'.
     *
     * @return the severity value
     */
    public RouteErrorSeverity severity() {
        return this.severity;
    }

    /**
     * Set severity of the route error. Possible values include: 'error', 'warning'.
     *
     * @param severity the severity value to set
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withSeverity(RouteErrorSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get location where the route error happened.
     *
     * @return the location value
     */
    public RouteErrorRange location() {
        return this.location;
    }

    /**
     * Set location where the route error happened.
     *
     * @param location the location value to set
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withLocation(RouteErrorRange location) {
        this.location = location;
        return this;
    }

}
