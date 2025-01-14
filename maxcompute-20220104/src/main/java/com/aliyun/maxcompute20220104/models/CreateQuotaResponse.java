// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQuotaResponseBody body;

    public static CreateQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaResponse self = new CreateQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaResponse setBody(CreateQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaResponseBody getBody() {
        return this.body;
    }

}
