// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePassportMRZResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizePassportMRZResponseBody body;

    public static RecognizePassportMRZResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportMRZResponse self = new RecognizePassportMRZResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePassportMRZResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePassportMRZResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePassportMRZResponse setBody(RecognizePassportMRZResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePassportMRZResponseBody getBody() {
        return this.body;
    }

}
