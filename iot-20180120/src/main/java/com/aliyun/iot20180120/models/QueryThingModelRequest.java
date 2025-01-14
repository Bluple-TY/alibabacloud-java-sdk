// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelRequest extends TeaModel {
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static QueryThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelRequest self = new QueryThingModelRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public QueryThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryThingModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public QueryThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
