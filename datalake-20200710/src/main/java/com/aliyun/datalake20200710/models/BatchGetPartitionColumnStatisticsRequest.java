// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionColumnStatisticsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionNames")
    public java.util.List<String> partitionNames;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static BatchGetPartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionColumnStatisticsRequest self = new BatchGetPartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionColumnStatisticsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchGetPartitionColumnStatisticsRequest setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public BatchGetPartitionColumnStatisticsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchGetPartitionColumnStatisticsRequest setPartitionNames(java.util.List<String> partitionNames) {
        this.partitionNames = partitionNames;
        return this;
    }
    public java.util.List<String> getPartitionNames() {
        return this.partitionNames;
    }

    public BatchGetPartitionColumnStatisticsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
