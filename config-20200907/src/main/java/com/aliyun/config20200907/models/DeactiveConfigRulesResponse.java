// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeactiveConfigRulesResponseBody body;

    public static DeactiveConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveConfigRulesResponse self = new DeactiveConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactiveConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactiveConfigRulesResponse setBody(DeactiveConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveConfigRulesResponseBody getBody() {
        return this.body;
    }

}
