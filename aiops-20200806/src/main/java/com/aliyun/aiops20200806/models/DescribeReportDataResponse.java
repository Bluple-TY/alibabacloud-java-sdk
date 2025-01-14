// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReportDataResponseBody body;

    public static DescribeReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportDataResponse self = new DescribeReportDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportDataResponse setBody(DescribeReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportDataResponseBody getBody() {
        return this.body;
    }

}
