// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialFindAllResponseBody body;

    public static MaterialFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllResponse self = new MaterialFindAllResponse();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialFindAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaterialFindAllResponse setBody(MaterialFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialFindAllResponseBody getBody() {
        return this.body;
    }

}
