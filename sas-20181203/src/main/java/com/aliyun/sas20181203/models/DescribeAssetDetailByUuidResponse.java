// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssetDetailByUuidResponseBody body;

    public static DescribeAssetDetailByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidResponse self = new DescribeAssetDetailByUuidResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetDetailByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetDetailByUuidResponse setBody(DescribeAssetDetailByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetDetailByUuidResponseBody getBody() {
        return this.body;
    }

}
