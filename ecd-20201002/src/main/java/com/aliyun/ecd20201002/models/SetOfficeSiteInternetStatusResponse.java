// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetOfficeSiteInternetStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetOfficeSiteInternetStatusResponseBody body;

    public static SetOfficeSiteInternetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteInternetStatusResponse self = new SetOfficeSiteInternetStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteInternetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetOfficeSiteInternetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetOfficeSiteInternetStatusResponse setBody(SetOfficeSiteInternetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetOfficeSiteInternetStatusResponseBody getBody() {
        return this.body;
    }

}