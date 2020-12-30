// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppEnvStatusResponseBody body;

    public static DescribeAppEnvStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvStatusResponse self = new DescribeAppEnvStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppEnvStatusResponse setBody(DescribeAppEnvStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppEnvStatusResponseBody getBody() {
        return this.body;
    }

}
