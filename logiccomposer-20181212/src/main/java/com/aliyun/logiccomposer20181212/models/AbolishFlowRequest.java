// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class AbolishFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static AbolishFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishFlowRequest self = new AbolishFlowRequest();
        return TeaModel.build(map, self);
    }

    public AbolishFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
