// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AccessTokenResponseBody body;

    public static AccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessTokenResponse self = new AccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public AccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccessTokenResponse setBody(AccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessTokenResponseBody getBody() {
        return this.body;
    }

}
