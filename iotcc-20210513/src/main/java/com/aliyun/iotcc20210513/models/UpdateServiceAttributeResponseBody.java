// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateServiceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAttributeResponseBody self = new UpdateServiceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
