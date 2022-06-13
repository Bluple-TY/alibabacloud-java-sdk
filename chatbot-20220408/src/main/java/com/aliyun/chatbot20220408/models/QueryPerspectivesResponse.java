// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class QueryPerspectivesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPerspectivesResponseBody body;

    public static QueryPerspectivesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPerspectivesResponse self = new QueryPerspectivesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPerspectivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPerspectivesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPerspectivesResponse setBody(QueryPerspectivesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPerspectivesResponseBody getBody() {
        return this.body;
    }

}