// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceResponses")
    public java.util.List<InstanceOperateResponse> instanceResponses;

    @NameInMap("RequestId")
    public String requestId;

    public static StopInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponseBody self = new StopInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponseBody setInstanceResponses(java.util.List<InstanceOperateResponse> instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public java.util.List<InstanceOperateResponse> getInstanceResponses() {
        return this.instanceResponses;
    }

    public StopInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
