// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnUserBillTypeResponseBody body;

    public static DescribeCdnUserBillTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillTypeResponse self = new DescribeCdnUserBillTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserBillTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserBillTypeResponse setBody(DescribeCdnUserBillTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserBillTypeResponseBody getBody() {
        return this.body;
    }

}
