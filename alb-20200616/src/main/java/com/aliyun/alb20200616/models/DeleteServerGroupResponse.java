// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServerGroupResponseBody body;

    public static DeleteServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerGroupResponse self = new DeleteServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServerGroupResponse setBody(DeleteServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerGroupResponseBody getBody() {
        return this.body;
    }

}
