// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetastoreMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetastoreMigrationResponseBody body;

    public static GetMetastoreMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetastoreMigrationResponse self = new GetMetastoreMigrationResponse();
        return TeaModel.build(map, self);
    }

    public GetMetastoreMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetastoreMigrationResponse setBody(GetMetastoreMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

}
