// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHealthCheckTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckTemplatesResponseBody self = new DeleteHealthCheckTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
