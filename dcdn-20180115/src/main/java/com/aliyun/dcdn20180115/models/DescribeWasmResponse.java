// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeWasmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWasmResponseBody body;

    public static DescribeWasmResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWasmResponse self = new DescribeWasmResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWasmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWasmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWasmResponse setBody(DescribeWasmResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWasmResponseBody getBody() {
        return this.body;
    }

}