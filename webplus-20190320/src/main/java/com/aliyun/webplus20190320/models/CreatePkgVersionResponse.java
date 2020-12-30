// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreatePkgVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePkgVersionResponseBody body;

    public static CreatePkgVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgVersionResponse self = new CreatePkgVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePkgVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePkgVersionResponse setBody(CreatePkgVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePkgVersionResponseBody getBody() {
        return this.body;
    }

}
