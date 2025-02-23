// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelResponseBody body;

    public static GetModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelResponse self = new GetModelResponse();
        return TeaModel.build(map, self);
    }

    public GetModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelResponse setBody(GetModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelResponseBody getBody() {
        return this.body;
    }

}
