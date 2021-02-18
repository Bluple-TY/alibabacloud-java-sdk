// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEndpointSwitchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEndpointSwitchStatusResponseBody body;

    public static DescribeEndpointSwitchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSwitchStatusResponse self = new DescribeEndpointSwitchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSwitchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndpointSwitchStatusResponse setBody(DescribeEndpointSwitchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointSwitchStatusResponseBody getBody() {
        return this.body;
    }

}
