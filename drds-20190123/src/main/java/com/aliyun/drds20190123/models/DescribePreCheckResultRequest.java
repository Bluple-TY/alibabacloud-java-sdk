// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribePreCheckResultRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribePreCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckResultRequest self = new DescribePreCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckResultRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribePreCheckResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePreCheckResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
