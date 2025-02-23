// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReRunTaskFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReRunTaskFlowInstanceResponseBody body;

    public static ReRunTaskFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReRunTaskFlowInstanceResponse self = new ReRunTaskFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReRunTaskFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReRunTaskFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReRunTaskFlowInstanceResponse setBody(ReRunTaskFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReRunTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
