// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWatermarkResponseBody body;

    public static DeleteWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkResponse self = new DeleteWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWatermarkResponse setBody(DeleteWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWatermarkResponseBody getBody() {
        return this.body;
    }

}
