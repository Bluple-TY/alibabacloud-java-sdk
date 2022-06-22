// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubPodNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubPodNodeDetailResponseBody body;

    public static QueryTopologyKubPodNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubPodNodeDetailResponse self = new QueryTopologyKubPodNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubPodNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubPodNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubPodNodeDetailResponse setBody(QueryTopologyKubPodNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubPodNodeDetailResponseBody getBody() {
        return this.body;
    }

}
