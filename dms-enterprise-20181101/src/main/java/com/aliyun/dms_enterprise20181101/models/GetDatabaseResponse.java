// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseResponseBody body;

    public static GetDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponse self = new GetDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseResponse setBody(GetDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseResponseBody getBody() {
        return this.body;
    }

}
