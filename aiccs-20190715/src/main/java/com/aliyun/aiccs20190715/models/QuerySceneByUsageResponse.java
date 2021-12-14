// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QuerySceneByUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySceneByUsageResponseBody body;

    public static QuerySceneByUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneByUsageResponse self = new QuerySceneByUsageResponse();
        return TeaModel.build(map, self);
    }

    public QuerySceneByUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySceneByUsageResponse setBody(QuerySceneByUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySceneByUsageResponseBody getBody() {
        return this.body;
    }

}
