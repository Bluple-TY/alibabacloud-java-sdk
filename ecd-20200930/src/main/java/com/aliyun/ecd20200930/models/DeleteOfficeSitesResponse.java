// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSitesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOfficeSitesResponseBody body;

    public static DeleteOfficeSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSitesResponse self = new DeleteOfficeSitesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSitesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOfficeSitesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOfficeSitesResponse setBody(DeleteOfficeSitesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOfficeSitesResponseBody getBody() {
        return this.body;
    }

}
