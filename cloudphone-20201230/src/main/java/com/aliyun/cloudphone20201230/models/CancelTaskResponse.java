// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class CancelTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelTaskResponseBody body;

    public static CancelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskResponse self = new CancelTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTaskResponse setBody(CancelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTaskResponseBody getBody() {
        return this.body;
    }

}
