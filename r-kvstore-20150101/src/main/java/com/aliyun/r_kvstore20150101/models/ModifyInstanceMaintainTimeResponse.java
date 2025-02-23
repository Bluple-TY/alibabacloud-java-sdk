// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceMaintainTimeResponseBody body;

    public static ModifyInstanceMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeResponse self = new ModifyInstanceMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMaintainTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMaintainTimeResponse setBody(ModifyInstanceMaintainTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMaintainTimeResponseBody getBody() {
        return this.body;
    }

}
