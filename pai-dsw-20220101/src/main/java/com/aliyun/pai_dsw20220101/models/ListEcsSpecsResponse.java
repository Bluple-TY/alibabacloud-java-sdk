// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEcsSpecsResponseBody body;

    public static ListEcsSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsResponse self = new ListEcsSpecsResponse();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEcsSpecsResponse setBody(ListEcsSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsSpecsResponseBody getBody() {
        return this.body;
    }

}
