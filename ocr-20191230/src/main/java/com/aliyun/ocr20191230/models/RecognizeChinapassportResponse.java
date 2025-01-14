// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeChinapassportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeChinapassportResponseBody body;

    public static RecognizeChinapassportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinapassportResponse self = new RecognizeChinapassportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeChinapassportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeChinapassportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeChinapassportResponse setBody(RecognizeChinapassportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeChinapassportResponseBody getBody() {
        return this.body;
    }

}
