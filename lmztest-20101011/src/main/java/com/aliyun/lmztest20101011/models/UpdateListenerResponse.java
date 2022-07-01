// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class UpdateListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateListenerResponseBody body;

    public static UpdateListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerResponse self = new UpdateListenerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateListenerResponse setBody(UpdateListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListenerResponseBody getBody() {
        return this.body;
    }

}
