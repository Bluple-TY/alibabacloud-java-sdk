// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyResponseBody extends TeaModel {
    @NameInMap("DBTopology")
    public GetTableDBTopologyResponseBodyDBTopology DBTopology;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTableDBTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyResponseBody self = new GetTableDBTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyResponseBody setDBTopology(GetTableDBTopologyResponseBodyDBTopology DBTopology) {
        this.DBTopology = DBTopology;
        return this;
    }
    public GetTableDBTopologyResponseBodyDBTopology getDBTopology() {
        return this.DBTopology;
    }

    public GetTableDBTopologyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableDBTopologyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableDBTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableDBTopologyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList extends TeaModel {
        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableType")
        public String tableType;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList extends TeaModel {
        @NameInMap("DbId")
        public String dbId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("TableList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> tableList;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setTableList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> tableList) {
            this.tableList = tableList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> getTableList() {
            return this.tableList;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceList extends TeaModel {
        @NameInMap("DatabaseList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> databaseList;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Sid")
        public String sid;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setDatabaseList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> databaseList) {
            this.databaseList = databaseList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> getDatabaseList() {
            return this.databaseList;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopology extends TeaModel {
        @NameInMap("DataSourceList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> dataSourceList;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

        public static GetTableDBTopologyResponseBodyDBTopology build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopology self = new GetTableDBTopologyResponseBodyDBTopology();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopology setDataSourceList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> dataSourceList) {
            this.dataSourceList = dataSourceList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        public GetTableDBTopologyResponseBodyDBTopology setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetTableDBTopologyResponseBodyDBTopology setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
