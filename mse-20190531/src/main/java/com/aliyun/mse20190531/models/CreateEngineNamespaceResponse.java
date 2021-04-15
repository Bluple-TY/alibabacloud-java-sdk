// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateEngineNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEngineNamespaceResponseBody body;

    public static CreateEngineNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineNamespaceResponse self = new CreateEngineNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEngineNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEngineNamespaceResponse setBody(CreateEngineNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEngineNamespaceResponseBody getBody() {
        return this.body;
    }

}
