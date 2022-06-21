// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCrowdLabelResponseBody body;

    public static GetCrowdLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdLabelResponse self = new GetCrowdLabelResponse();
        return TeaModel.build(map, self);
    }

    public GetCrowdLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrowdLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrowdLabelResponse setBody(GetCrowdLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdLabelResponseBody getBody() {
        return this.body;
    }

}
