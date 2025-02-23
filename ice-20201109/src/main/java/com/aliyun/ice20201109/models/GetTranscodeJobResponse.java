// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTranscodeJobResponseBody body;

    public static GetTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeJobResponse self = new GetTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranscodeJobResponse setBody(GetTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
