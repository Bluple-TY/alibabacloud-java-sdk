// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class EnableFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableFlowResponseBody body;

    public static EnableFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowResponse self = new EnableFlowResponse();
        return TeaModel.build(map, self);
    }

    public EnableFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFlowResponse setBody(EnableFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFlowResponseBody getBody() {
        return this.body;
    }

}
