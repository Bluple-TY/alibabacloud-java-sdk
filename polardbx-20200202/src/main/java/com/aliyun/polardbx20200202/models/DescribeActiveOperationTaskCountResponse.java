// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActiveOperationTaskCountResponseBody body;

    public static DescribeActiveOperationTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountResponse self = new DescribeActiveOperationTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTaskCountResponse setBody(DescribeActiveOperationTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTaskCountResponseBody getBody() {
        return this.body;
    }

}
