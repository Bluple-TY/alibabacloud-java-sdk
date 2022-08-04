// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetricsOfAppResponseBody body;

    public static GetMetricsOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfAppResponse self = new GetMetricsOfAppResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricsOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricsOfAppResponse setBody(GetMetricsOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricsOfAppResponseBody getBody() {
        return this.body;
    }

}
