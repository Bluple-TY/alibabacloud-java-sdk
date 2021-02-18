// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureSubscriptionInstanceAlertResponseBody body;

    public static ConfigureSubscriptionInstanceAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceAlertResponse self = new ConfigureSubscriptionInstanceAlertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSubscriptionInstanceAlertResponse setBody(ConfigureSubscriptionInstanceAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSubscriptionInstanceAlertResponseBody getBody() {
        return this.body;
    }

}
