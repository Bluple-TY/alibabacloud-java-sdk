// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class GetResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.io.InputStream body;

    public static GetResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResultResponse self = new GetResultResponse();
        return TeaModel.build(map, self);
    }

    public GetResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResultResponse setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
