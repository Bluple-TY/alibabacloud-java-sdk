// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSubtitleProduceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSubtitleProduceJobResponseBody body;

    public static SubmitSubtitleProduceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSubtitleProduceJobResponse self = new SubmitSubtitleProduceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSubtitleProduceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSubtitleProduceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSubtitleProduceJobResponse setBody(SubmitSubtitleProduceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSubtitleProduceJobResponseBody getBody() {
        return this.body;
    }

}
