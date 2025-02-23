// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClientCertificateResponseBody body;

    public static DeleteClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCertificateResponse self = new DeleteClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientCertificateResponse setBody(DeleteClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientCertificateResponseBody getBody() {
        return this.body;
    }

}
