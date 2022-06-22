// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class WorkspaceCreateExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WorkspaceCreateExperimentResponseBody body;

    public static WorkspaceCreateExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceCreateExperimentResponse self = new WorkspaceCreateExperimentResponse();
        return TeaModel.build(map, self);
    }

    public WorkspaceCreateExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkspaceCreateExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkspaceCreateExperimentResponse setBody(WorkspaceCreateExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkspaceCreateExperimentResponseBody getBody() {
        return this.body;
    }

}
