// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetApplicationBasicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationBasicResponseBody body;

    public static GetApplicationBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationBasicResponse self = new GetApplicationBasicResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationBasicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationBasicResponse setBody(GetApplicationBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationBasicResponseBody getBody() {
        return this.body;
    }

}
