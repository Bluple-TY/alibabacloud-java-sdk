// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHotParamRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHotParamRuleDeleteResponseBody body;

    public static SentinelHotParamRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHotParamRuleDeleteResponse self = new SentinelHotParamRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHotParamRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHotParamRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHotParamRuleDeleteResponse setBody(SentinelHotParamRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHotParamRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
