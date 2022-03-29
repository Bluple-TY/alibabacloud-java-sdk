// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRouteDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIstioGatewayRouteDetailResponseBody body;

    public static DescribeIstioGatewayRouteDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRouteDetailResponse self = new DescribeIstioGatewayRouteDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRouteDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIstioGatewayRouteDetailResponse setBody(DescribeIstioGatewayRouteDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIstioGatewayRouteDetailResponseBody getBody() {
        return this.body;
    }

}
