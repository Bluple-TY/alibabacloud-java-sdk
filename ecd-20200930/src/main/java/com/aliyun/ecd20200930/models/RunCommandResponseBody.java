// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    // The ID of the command execution.
    @NameInMap("InvokeId")
    public String invokeId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
