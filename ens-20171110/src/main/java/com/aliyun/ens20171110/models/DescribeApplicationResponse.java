// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationResponseBody body;

    public static DescribeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResponse self = new DescribeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationResponse setBody(DescribeApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationResponseBody getBody() {
        return this.body;
    }

}
