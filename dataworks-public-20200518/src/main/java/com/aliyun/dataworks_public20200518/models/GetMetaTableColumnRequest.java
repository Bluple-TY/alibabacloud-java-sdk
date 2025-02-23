// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnRequest extends TeaModel {
    /**
     * <p>The ID of the E-MapReduce (EMR) cluster. You can log on to the EMR console to obtain the ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Only emr is supported.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the metadatabase of the EMR cluster. You can call the [ListMetaDB](~~185662~~) operation to query the name.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The GUID of the metatable. You can call the [GetMetaDBTableList](~~173916~~) operation to query the GUID of the metatable.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the metatable in the EMR cluster. You can call the [GetMetaDBTableList](~~173916~~) operation to query the name.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTableColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnRequest self = new GetMetaTableColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableColumnRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableColumnRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTableColumnRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetMetaTableColumnRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTableColumnRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableColumnRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
