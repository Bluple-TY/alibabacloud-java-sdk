// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class InvokeFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("Data")
    public String data;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Definition")
    public String definition;

    public static InvokeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeFlowRequest self = new InvokeFlowRequest();
        return TeaModel.build(map, self);
    }

    public InvokeFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public InvokeFlowRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public InvokeFlowRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InvokeFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InvokeFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

}
