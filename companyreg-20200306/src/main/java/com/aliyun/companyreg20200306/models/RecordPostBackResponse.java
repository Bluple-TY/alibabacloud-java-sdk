// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RecordPostBackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecordPostBackResponseBody body;

    public static RecordPostBackResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordPostBackResponse self = new RecordPostBackResponse();
        return TeaModel.build(map, self);
    }

    public RecordPostBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordPostBackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordPostBackResponse setBody(RecordPostBackResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordPostBackResponseBody getBody() {
        return this.body;
    }

}
