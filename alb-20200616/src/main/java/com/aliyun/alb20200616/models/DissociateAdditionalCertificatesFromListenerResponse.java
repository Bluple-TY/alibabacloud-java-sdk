// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateAdditionalCertificatesFromListenerResponseBody body;

    public static DissociateAdditionalCertificatesFromListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerResponse self = new DissociateAdditionalCertificatesFromListenerResponse();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateAdditionalCertificatesFromListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateAdditionalCertificatesFromListenerResponse setBody(DissociateAdditionalCertificatesFromListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateAdditionalCertificatesFromListenerResponseBody getBody() {
        return this.body;
    }

}
