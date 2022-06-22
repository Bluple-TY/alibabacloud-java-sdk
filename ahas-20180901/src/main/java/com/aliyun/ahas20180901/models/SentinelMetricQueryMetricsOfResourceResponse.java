// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricQueryMetricsOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelMetricQueryMetricsOfResourceResponseBody body;

    public static SentinelMetricQueryMetricsOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricQueryMetricsOfResourceResponse self = new SentinelMetricQueryMetricsOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelMetricQueryMetricsOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelMetricQueryMetricsOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelMetricQueryMetricsOfResourceResponse setBody(SentinelMetricQueryMetricsOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelMetricQueryMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

}
