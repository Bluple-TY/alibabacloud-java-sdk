// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengetestResponseBody body;

    public static HuichengetestResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengetestResponse self = new HuichengetestResponse();
        return TeaModel.build(map, self);
    }

    public HuichengetestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengetestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengetestResponse setBody(HuichengetestResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengetestResponseBody getBody() {
        return this.body;
    }

}