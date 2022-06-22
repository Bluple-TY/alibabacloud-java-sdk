// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ClusterOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClusterOffResponseBody body;

    public static ClusterOffResponse build(java.util.Map<String, ?> map) throws Exception {
        ClusterOffResponse self = new ClusterOffResponse();
        return TeaModel.build(map, self);
    }

    public ClusterOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClusterOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClusterOffResponse setBody(ClusterOffResponseBody body) {
        this.body = body;
        return this;
    }
    public ClusterOffResponseBody getBody() {
        return this.body;
    }

}
