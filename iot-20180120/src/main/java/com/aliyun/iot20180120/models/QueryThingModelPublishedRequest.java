// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedRequest extends TeaModel {
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

    public static QueryThingModelPublishedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedRequest self = new QueryThingModelPublishedRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public QueryThingModelPublishedRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryThingModelPublishedRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public QueryThingModelPublishedRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelPublishedRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
