// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedRequest extends TeaModel {
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

    @NameInMap("Simple")
    public Boolean simple;

    public static GetThingModelTslPublishedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslPublishedRequest self = new GetThingModelTslPublishedRequest();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslPublishedRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public GetThingModelTslPublishedRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetThingModelTslPublishedRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetThingModelTslPublishedRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GetThingModelTslPublishedRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetThingModelTslPublishedRequest setSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }
    public Boolean getSimple() {
        return this.simple;
    }

}
