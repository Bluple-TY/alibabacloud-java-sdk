// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSnapshotsUsageResponseBody body;

    public static DescribeSnapshotsUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsUsageResponse self = new DescribeSnapshotsUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotsUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotsUsageResponse setBody(DescribeSnapshotsUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotsUsageResponseBody getBody() {
        return this.body;
    }

}
