// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDbfsResponseBody body;

    public static ListDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsResponse self = new ListDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ListDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDbfsResponse setBody(ListDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDbfsResponseBody getBody() {
        return this.body;
    }

}
