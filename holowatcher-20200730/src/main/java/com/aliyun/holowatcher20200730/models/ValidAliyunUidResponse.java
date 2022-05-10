// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ValidAliyunUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidAliyunUidResponseBody body;

    public static ValidAliyunUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidAliyunUidResponse self = new ValidAliyunUidResponse();
        return TeaModel.build(map, self);
    }

    public ValidAliyunUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidAliyunUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidAliyunUidResponse setBody(ValidAliyunUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidAliyunUidResponseBody getBody() {
        return this.body;
    }

}
