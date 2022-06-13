// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDutyRosterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDutyRosterResponseBody body;

    public static GetDutyRosterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDutyRosterResponse self = new GetDutyRosterResponse();
        return TeaModel.build(map, self);
    }

    public GetDutyRosterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDutyRosterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDutyRosterResponse setBody(GetDutyRosterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDutyRosterResponseBody getBody() {
        return this.body;
    }

}