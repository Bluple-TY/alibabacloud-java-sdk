// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFoldersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFoldersResponseBody body;

    public static ListFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersResponse self = new ListFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoldersResponse setBody(ListFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoldersResponseBody getBody() {
        return this.body;
    }

}
