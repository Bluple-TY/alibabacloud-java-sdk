// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResizeDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeDiskResponseBody body;

    public static ResizeDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskResponse self = new ResizeDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResizeDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeDiskResponse setBody(ResizeDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeDiskResponseBody getBody() {
        return this.body;
    }

}
