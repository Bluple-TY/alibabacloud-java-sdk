// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenFlowLogServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenFlowLogServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenFlowLogServiceResponseBody self = new OpenFlowLogServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenFlowLogServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
