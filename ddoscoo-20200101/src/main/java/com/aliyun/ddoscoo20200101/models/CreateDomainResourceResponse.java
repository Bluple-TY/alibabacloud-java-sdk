// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDomainResourceResponseBody body;

    public static CreateDomainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResourceResponse self = new CreateDomainResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDomainResourceResponse setBody(CreateDomainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainResourceResponseBody getBody() {
        return this.body;
    }

}