// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareAccountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetShareAccountListResponseBody body;

    public static GetShareAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareAccountListResponse self = new GetShareAccountListResponse();
        return TeaModel.build(map, self);
    }

    public GetShareAccountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareAccountListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareAccountListResponse setBody(GetShareAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareAccountListResponseBody getBody() {
        return this.body;
    }

}
