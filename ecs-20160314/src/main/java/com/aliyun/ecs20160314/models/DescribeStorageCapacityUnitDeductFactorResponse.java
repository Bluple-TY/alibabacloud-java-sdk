// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitDeductFactorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageCapacityUnitDeductFactorResponseBody body;

    public static DescribeStorageCapacityUnitDeductFactorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitDeductFactorResponse self = new DescribeStorageCapacityUnitDeductFactorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitDeductFactorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageCapacityUnitDeductFactorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageCapacityUnitDeductFactorResponse setBody(DescribeStorageCapacityUnitDeductFactorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageCapacityUnitDeductFactorResponseBody getBody() {
        return this.body;
    }

}
