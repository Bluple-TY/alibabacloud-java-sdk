// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionOnDemandConfigResponseBody extends TeaModel {
    // The maximum number of instances.
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    // The description of the resource.
    @NameInMap("resource")
    public String resource;

    public static GetFunctionOnDemandConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionOnDemandConfigResponseBody self = new GetFunctionOnDemandConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionOnDemandConfigResponseBody setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public GetFunctionOnDemandConfigResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
