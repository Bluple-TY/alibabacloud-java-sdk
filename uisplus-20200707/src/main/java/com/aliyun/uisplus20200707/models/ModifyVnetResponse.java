// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class ModifyVnetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyVnetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVnetResponse self = new ModifyVnetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVnetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
