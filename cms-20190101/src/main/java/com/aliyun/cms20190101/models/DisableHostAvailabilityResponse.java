// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableHostAvailabilityResponseBody body;

    public static DisableHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableHostAvailabilityResponse self = new DisableHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public DisableHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableHostAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableHostAvailabilityResponse setBody(DisableHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
