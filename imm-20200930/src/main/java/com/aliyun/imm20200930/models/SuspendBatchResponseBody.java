// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendBatchResponseBody self = new SuspendBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
