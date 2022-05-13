// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabReservedsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLabReservedsResponseBody body;

    public static ListLabReservedsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabReservedsResponse self = new ListLabReservedsResponse();
        return TeaModel.build(map, self);
    }

    public ListLabReservedsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabReservedsResponse setBody(ListLabReservedsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabReservedsResponseBody getBody() {
        return this.body;
    }

}