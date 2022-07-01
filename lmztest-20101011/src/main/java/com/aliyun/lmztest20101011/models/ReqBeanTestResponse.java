// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ReqBeanTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReqBeanTestResponseBody body;

    public static ReqBeanTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReqBeanTestResponse self = new ReqBeanTestResponse();
        return TeaModel.build(map, self);
    }

    public ReqBeanTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReqBeanTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReqBeanTestResponse setBody(ReqBeanTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReqBeanTestResponseBody getBody() {
        return this.body;
    }

}
