// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockProcessStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebLockProcessStatusResponseBody body;

    public static ModifyWebLockProcessStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockProcessStatusResponse self = new ModifyWebLockProcessStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockProcessStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockProcessStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockProcessStatusResponse setBody(ModifyWebLockProcessStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockProcessStatusResponseBody getBody() {
        return this.body;
    }

}
