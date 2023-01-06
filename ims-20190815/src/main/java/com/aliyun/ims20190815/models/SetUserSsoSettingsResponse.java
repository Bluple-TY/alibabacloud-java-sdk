// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetUserSsoSettingsResponseBody body;

    public static SetUserSsoSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsResponse self = new SetUserSsoSettingsResponse();
        return TeaModel.build(map, self);
    }

    public SetUserSsoSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserSsoSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserSsoSettingsResponse setBody(SetUserSsoSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserSsoSettingsResponseBody getBody() {
        return this.body;
    }

}
