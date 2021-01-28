// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class OpenDcdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenDcdnServiceResponseBody body;

    public static OpenDcdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDcdnServiceResponse self = new OpenDcdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenDcdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDcdnServiceResponse setBody(OpenDcdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDcdnServiceResponseBody getBody() {
        return this.body;
    }

}
