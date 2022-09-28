// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetOrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrderListResponseBody body;

    public static GetOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderListResponse self = new GetOrderListResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderListResponse setBody(GetOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderListResponseBody getBody() {
        return this.body;
    }

}
