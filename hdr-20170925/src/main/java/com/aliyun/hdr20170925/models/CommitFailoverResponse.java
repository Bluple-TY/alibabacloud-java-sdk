// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CommitFailoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommitFailoverResponseBody body;

    public static CommitFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitFailoverResponse self = new CommitFailoverResponse();
        return TeaModel.build(map, self);
    }

    public CommitFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitFailoverResponse setBody(CommitFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitFailoverResponseBody getBody() {
        return this.body;
    }

}
