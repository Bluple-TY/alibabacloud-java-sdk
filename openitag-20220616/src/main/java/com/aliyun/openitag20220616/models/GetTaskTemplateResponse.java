// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskTemplateResponseBody body;

    public static GetTaskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskTemplateResponse self = new GetTaskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskTemplateResponse setBody(GetTaskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskTemplateResponseBody getBody() {
        return this.body;
    }

}
