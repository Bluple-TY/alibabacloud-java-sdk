// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPortfoliosResponseBody body;

    public static ListPortfoliosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPortfoliosResponse self = new ListPortfoliosResponse();
        return TeaModel.build(map, self);
    }

    public ListPortfoliosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPortfoliosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPortfoliosResponse setBody(ListPortfoliosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortfoliosResponseBody getBody() {
        return this.body;
    }

}