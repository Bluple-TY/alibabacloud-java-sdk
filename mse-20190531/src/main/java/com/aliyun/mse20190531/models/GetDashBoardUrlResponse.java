// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetDashBoardUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDashBoardUrlResponseBody body;

    public static GetDashBoardUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDashBoardUrlResponse self = new GetDashBoardUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDashBoardUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDashBoardUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDashBoardUrlResponse setBody(GetDashBoardUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDashBoardUrlResponseBody getBody() {
        return this.body;
    }

}