// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBatchJobsResponseBody body;

    public static CreateBatchJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchJobsResponse self = new CreateBatchJobsResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchJobsResponse setBody(CreateBatchJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchJobsResponseBody getBody() {
        return this.body;
    }

}
