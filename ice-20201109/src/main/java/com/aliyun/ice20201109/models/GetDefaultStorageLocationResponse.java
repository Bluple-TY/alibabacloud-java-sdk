// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDefaultStorageLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDefaultStorageLocationResponseBody body;

    public static GetDefaultStorageLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultStorageLocationResponse self = new GetDefaultStorageLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultStorageLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultStorageLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultStorageLocationResponse setBody(GetDefaultStorageLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultStorageLocationResponseBody getBody() {
        return this.body;
    }

}
