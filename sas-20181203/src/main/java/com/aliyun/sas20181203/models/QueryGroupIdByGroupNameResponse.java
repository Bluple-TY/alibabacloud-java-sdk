// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupIdByGroupNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGroupIdByGroupNameResponseBody body;

    public static QueryGroupIdByGroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupIdByGroupNameResponse self = new QueryGroupIdByGroupNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupIdByGroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupIdByGroupNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupIdByGroupNameResponse setBody(QueryGroupIdByGroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupIdByGroupNameResponseBody getBody() {
        return this.body;
    }

}
