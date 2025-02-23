// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ConfirmAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmAuthorizationResponseBody body;

    public static ConfirmAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAuthorizationResponse self = new ConfirmAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAuthorizationResponse setBody(ConfirmAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAuthorizationResponseBody getBody() {
        return this.body;
    }

}
