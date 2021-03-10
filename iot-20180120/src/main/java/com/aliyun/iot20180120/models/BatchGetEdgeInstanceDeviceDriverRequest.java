// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceDriverRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("IotIds")
    @Validation(required = true)
    public java.util.List<String> iotIds;

    public static BatchGetEdgeInstanceDeviceDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceDriverRequest self = new BatchGetEdgeInstanceDeviceDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

}
