// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class GetImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageResponseBody body;

    public static GetImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponse self = new GetImageResponse();
        return TeaModel.build(map, self);
    }

    public GetImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageResponse setBody(GetImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageResponseBody getBody() {
        return this.body;
    }

}
