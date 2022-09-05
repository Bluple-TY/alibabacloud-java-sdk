// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetCreativeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCreativeInfoResponseBody body;

    public static GetCreativeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreativeInfoResponse self = new GetCreativeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCreativeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreativeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreativeInfoResponse setBody(GetCreativeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreativeInfoResponseBody getBody() {
        return this.body;
    }

}
