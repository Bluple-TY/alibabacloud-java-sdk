// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckReportUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataCheckReportUrlResponseBody body;

    public static DescribeDataCheckReportUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckReportUrlResponse self = new DescribeDataCheckReportUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckReportUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCheckReportUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataCheckReportUrlResponse setBody(DescribeDataCheckReportUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCheckReportUrlResponseBody getBody() {
        return this.body;
    }

}
