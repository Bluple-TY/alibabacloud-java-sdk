// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHotKeysResponseBody body;

    public static DescribeHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotKeysResponse self = new DescribeHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHotKeysResponse setBody(DescribeHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHotKeysResponseBody getBody() {
        return this.body;
    }

}
