// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataImportProcessResponseBody body;

    public static QueryDataImportProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessResponse self = new QueryDataImportProcessResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataImportProcessResponse setBody(QueryDataImportProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataImportProcessResponseBody getBody() {
        return this.body;
    }

}
