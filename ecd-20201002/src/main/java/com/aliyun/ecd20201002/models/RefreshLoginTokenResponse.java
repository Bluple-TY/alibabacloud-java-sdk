// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshLoginTokenResponseBody body;

    public static RefreshLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenResponse self = new RefreshLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshLoginTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshLoginTokenResponse setBody(RefreshLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshLoginTokenResponseBody getBody() {
        return this.body;
    }

}
