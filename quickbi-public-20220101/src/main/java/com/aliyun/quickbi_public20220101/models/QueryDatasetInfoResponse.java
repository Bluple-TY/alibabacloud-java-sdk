// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetInfoResponseBody body;

    public static QueryDatasetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetInfoResponse self = new QueryDatasetInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetInfoResponse setBody(QueryDatasetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetInfoResponseBody getBody() {
        return this.body;
    }

}
