// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateServiceSidecarInjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceSidecarInjectResponseBody body;

    public static UpdateServiceSidecarInjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSidecarInjectResponse self = new UpdateServiceSidecarInjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSidecarInjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceSidecarInjectResponse setBody(UpdateServiceSidecarInjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceSidecarInjectResponseBody getBody() {
        return this.body;
    }

}
