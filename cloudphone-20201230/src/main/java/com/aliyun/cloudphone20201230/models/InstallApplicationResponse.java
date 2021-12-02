// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class InstallApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallApplicationResponseBody body;

    public static InstallApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallApplicationResponse self = new InstallApplicationResponse();
        return TeaModel.build(map, self);
    }

    public InstallApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallApplicationResponse setBody(InstallApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallApplicationResponseBody getBody() {
        return this.body;
    }

}
