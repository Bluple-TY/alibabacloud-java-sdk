// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDiskResponseBody body;

    public static AttachDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskResponse self = new AttachDiskResponse();
        return TeaModel.build(map, self);
    }

    public AttachDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDiskResponse setBody(AttachDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDiskResponseBody getBody() {
        return this.body;
    }

}
