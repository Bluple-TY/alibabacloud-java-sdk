// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingConfigItemResponseBody body;

    public static DescribeScalingConfigItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigItemResponse self = new DescribeScalingConfigItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingConfigItemResponse setBody(DescribeScalingConfigItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingConfigItemResponseBody getBody() {
        return this.body;
    }

}
