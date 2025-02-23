// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeScaleOutMigrateTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScaleOutMigrateTaskListResponseBody body;

    public static DescribeScaleOutMigrateTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScaleOutMigrateTaskListResponse self = new DescribeScaleOutMigrateTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScaleOutMigrateTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScaleOutMigrateTaskListResponse setBody(DescribeScaleOutMigrateTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScaleOutMigrateTaskListResponseBody getBody() {
        return this.body;
    }

}
