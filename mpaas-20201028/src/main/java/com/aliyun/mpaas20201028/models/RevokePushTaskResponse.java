// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokePushTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokePushTaskResponseBody body;

    public static RevokePushTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePushTaskResponse self = new RevokePushTaskResponse();
        return TeaModel.build(map, self);
    }

    public RevokePushTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePushTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokePushTaskResponse setBody(RevokePushTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePushTaskResponseBody getBody() {
        return this.body;
    }

}
