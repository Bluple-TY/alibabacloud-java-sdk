// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QuerySpecRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpecRegionListResponseBody body;

    public static QuerySpecRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpecRegionListResponse self = new QuerySpecRegionListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpecRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpecRegionListResponse setBody(QuerySpecRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpecRegionListResponseBody getBody() {
        return this.body;
    }

}
