// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVpcAndVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTransitionVpcAndVSwitchResponseBody body;

    public static DescribeTransitionVpcAndVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVpcAndVSwitchResponse self = new DescribeTransitionVpcAndVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVpcAndVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitionVpcAndVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitionVpcAndVSwitchResponse setBody(DescribeTransitionVpcAndVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitionVpcAndVSwitchResponseBody getBody() {
        return this.body;
    }

}
