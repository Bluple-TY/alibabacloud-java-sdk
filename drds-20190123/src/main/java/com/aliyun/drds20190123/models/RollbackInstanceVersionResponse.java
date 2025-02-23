// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RollbackInstanceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackInstanceVersionResponseBody body;

    public static RollbackInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceVersionResponse self = new RollbackInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackInstanceVersionResponse setBody(RollbackInstanceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackInstanceVersionResponseBody getBody() {
        return this.body;
    }

}
