// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduledTaskResponseBody body;

    public static CreateScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskResponse self = new CreateScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduledTaskResponse setBody(CreateScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
