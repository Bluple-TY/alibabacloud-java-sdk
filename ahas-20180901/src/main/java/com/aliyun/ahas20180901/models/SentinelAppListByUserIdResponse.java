// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppListByUserIdResponseBody body;

    public static SentinelAppListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppListByUserIdResponse self = new SentinelAppListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppListByUserIdResponse setBody(SentinelAppListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppListByUserIdResponseBody getBody() {
        return this.body;
    }

}
