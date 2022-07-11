// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTasksResponseBody body;

    public static DescribeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponse self = new DescribeTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTasksResponse setBody(DescribeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTasksResponseBody getBody() {
        return this.body;
    }

}
