// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSQLPatternsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("SourceIP")
    public String sourceIP;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("User")
    public String user;

    public static DescribeDBInstanceSQLPatternsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSQLPatternsRequest self = new DescribeDBInstanceSQLPatternsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSQLPatternsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceSQLPatternsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDBInstanceSQLPatternsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstanceSQLPatternsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeDBInstanceSQLPatternsRequest setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeDBInstanceSQLPatternsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBInstanceSQLPatternsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
