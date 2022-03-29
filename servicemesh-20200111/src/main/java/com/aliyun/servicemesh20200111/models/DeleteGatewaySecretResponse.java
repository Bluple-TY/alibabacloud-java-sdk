// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteGatewaySecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewaySecretResponseBody body;

    public static DeleteGatewaySecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySecretResponse self = new DeleteGatewaySecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewaySecretResponse setBody(DeleteGatewaySecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewaySecretResponseBody getBody() {
        return this.body;
    }

}
