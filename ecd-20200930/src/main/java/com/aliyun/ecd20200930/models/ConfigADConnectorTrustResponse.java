// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorTrustResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigADConnectorTrustResponseBody body;

    public static ConfigADConnectorTrustResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorTrustResponse self = new ConfigADConnectorTrustResponse();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorTrustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigADConnectorTrustResponse setBody(ConfigADConnectorTrustResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigADConnectorTrustResponseBody getBody() {
        return this.body;
    }

}
