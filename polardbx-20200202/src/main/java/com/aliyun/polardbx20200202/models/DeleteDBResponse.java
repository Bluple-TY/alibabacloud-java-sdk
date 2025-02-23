// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBResponseBody body;

    public static DeleteDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResponse self = new DeleteDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBResponse setBody(DeleteDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBResponseBody getBody() {
        return this.body;
    }

}
