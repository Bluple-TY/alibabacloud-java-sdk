// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateNightModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrUpdateNightModeResponseBody body;

    public static AddOrUpdateNightModeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateNightModeResponse self = new AddOrUpdateNightModeResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateNightModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateNightModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateNightModeResponse setBody(AddOrUpdateNightModeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateNightModeResponseBody getBody() {
        return this.body;
    }

}
