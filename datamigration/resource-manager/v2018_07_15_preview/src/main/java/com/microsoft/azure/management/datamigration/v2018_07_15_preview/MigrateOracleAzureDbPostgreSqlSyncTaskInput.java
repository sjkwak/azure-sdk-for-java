/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that migrates Oracle databases to Azure Database for
 * PostgreSQL for online migrations.
 */
public class MigrateOracleAzureDbPostgreSqlSyncTaskInput {
    /**
     * Databases to migrate.
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases;

    /**
     * Connection information for target Azure Database for PostgreSQL.
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private PostgreSqlConnectionInfo targetConnectionInfo;

    /**
     * Connection information for source Oracle.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private OracleConnectionInfo sourceConnectionInfo;

    /**
     * Get databases to migrate.
     *
     * @return the selectedDatabases value
     */
    public List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withSelectedDatabases(List<MigrateOracleAzureDbPostgreSqlSyncDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get connection information for target Azure Database for PostgreSQL.
     *
     * @return the targetConnectionInfo value
     */
    public PostgreSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set connection information for target Azure Database for PostgreSQL.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withTargetConnectionInfo(PostgreSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get connection information for source Oracle.
     *
     * @return the sourceConnectionInfo value
     */
    public OracleConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set connection information for source Oracle.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskInput object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput withSourceConnectionInfo(OracleConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

}
