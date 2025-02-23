// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFileResponseBody body;

    public static DeleteFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileResponse self = new DeleteFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFileResponse setBody(DeleteFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileResponseBody getBody() {
        return this.body;
    }

}
