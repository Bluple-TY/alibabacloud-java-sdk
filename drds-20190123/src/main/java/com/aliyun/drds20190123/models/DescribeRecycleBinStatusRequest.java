// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinStatusRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRecycleBinStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinStatusRequest self = new DescribeRecycleBinStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinStatusRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeRecycleBinStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRecycleBinStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
