// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveImageBaselineStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveImageBaselineStrategyResponseBody body;

    public static SaveImageBaselineStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveImageBaselineStrategyResponse self = new SaveImageBaselineStrategyResponse();
        return TeaModel.build(map, self);
    }

    public SaveImageBaselineStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveImageBaselineStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveImageBaselineStrategyResponse setBody(SaveImageBaselineStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveImageBaselineStrategyResponseBody getBody() {
        return this.body;
    }

}
