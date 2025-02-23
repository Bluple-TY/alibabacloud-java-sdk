// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourcePortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourcePortResponseBody body;

    public static DescribeResourcePortResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePortResponse self = new DescribeResourcePortResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcePortResponse setBody(DescribeResourcePortResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePortResponseBody getBody() {
        return this.body;
    }

}
