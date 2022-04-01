// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListWorkflowActivityInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkflowActivityInstancesResponseBody body;

    public static ListWorkflowActivityInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowActivityInstancesResponse self = new ListWorkflowActivityInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowActivityInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowActivityInstancesResponse setBody(ListWorkflowActivityInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowActivityInstancesResponseBody getBody() {
        return this.body;
    }

}
