/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OperationMonitoringLevel.
 */
public final class OperationMonitoringLevel extends ExpandableStringEnum<OperationMonitoringLevel> {
    /** Static value None for OperationMonitoringLevel. */
    public static final OperationMonitoringLevel NONE = fromString("None");

    /** Static value Error for OperationMonitoringLevel. */
    public static final OperationMonitoringLevel ERROR = fromString("Error");

    /** Static value Information for OperationMonitoringLevel. */
    public static final OperationMonitoringLevel INFORMATION = fromString("Information");

    /** Static value Error, Information for OperationMonitoringLevel. */
    public static final OperationMonitoringLevel ERROR_INFORMATION = fromString("Error, Information");

    /**
     * Creates or finds a OperationMonitoringLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding OperationMonitoringLevel
     */
    @JsonCreator
    public static OperationMonitoringLevel fromString(String name) {
        return fromString(name, OperationMonitoringLevel.class);
    }

    /**
     * @return known OperationMonitoringLevel values
     */
    public static Collection<OperationMonitoringLevel> values() {
        return values(OperationMonitoringLevel.class);
    }
}
