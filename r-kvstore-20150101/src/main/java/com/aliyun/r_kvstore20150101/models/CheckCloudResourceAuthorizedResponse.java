// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCloudResourceAuthorizedResponseBody body;

    public static CheckCloudResourceAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponse self = new CheckCloudResourceAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCloudResourceAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCloudResourceAuthorizedResponse setBody(CheckCloudResourceAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCloudResourceAuthorizedResponseBody getBody() {
        return this.body;
    }

}
