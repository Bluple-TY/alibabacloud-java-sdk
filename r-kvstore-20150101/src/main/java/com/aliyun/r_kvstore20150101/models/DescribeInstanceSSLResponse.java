// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSSLResponseBody body;

    public static DescribeInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLResponse self = new DescribeInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSSLResponse setBody(DescribeInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
