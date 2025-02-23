// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteEngineNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEngineNamespaceResponseBody body;

    public static DeleteEngineNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEngineNamespaceResponse self = new DeleteEngineNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEngineNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEngineNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEngineNamespaceResponse setBody(DeleteEngineNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEngineNamespaceResponseBody getBody() {
        return this.body;
    }

}
