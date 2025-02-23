// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRetcodeAppResponseBody body;

    public static DeleteRetcodeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppResponse self = new DeleteRetcodeAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRetcodeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRetcodeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRetcodeAppResponse setBody(DeleteRetcodeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRetcodeAppResponseBody getBody() {
        return this.body;
    }

}
