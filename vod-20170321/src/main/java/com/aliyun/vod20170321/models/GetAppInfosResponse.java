// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppInfosResponseBody body;

    public static GetAppInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosResponse self = new GetAppInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInfosResponse setBody(GetAppInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInfosResponseBody getBody() {
        return this.body;
    }

}
