/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The Teradata database dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TeradataTable")
@JsonFlatten
public class TeradataTableDataset extends DatasetInner {
    /**
     * The database name of Teradata. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /**
     * The table name of Teradata. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * Get the database name of Teradata. Type: string (or Expression with resultType string).
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database name of Teradata. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the table name of Teradata. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of Teradata. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

}
