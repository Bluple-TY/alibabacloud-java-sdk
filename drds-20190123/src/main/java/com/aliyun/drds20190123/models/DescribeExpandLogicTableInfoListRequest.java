// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeExpandLogicTableInfoListRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeExpandLogicTableInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpandLogicTableInfoListRequest self = new DescribeExpandLogicTableInfoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpandLogicTableInfoListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeExpandLogicTableInfoListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
