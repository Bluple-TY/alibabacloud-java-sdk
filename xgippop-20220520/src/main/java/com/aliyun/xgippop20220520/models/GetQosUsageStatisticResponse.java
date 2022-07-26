// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosUsageStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQosUsageStatisticResponseBody body;

    public static GetQosUsageStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQosUsageStatisticResponse self = new GetQosUsageStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetQosUsageStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQosUsageStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQosUsageStatisticResponse setBody(GetQosUsageStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQosUsageStatisticResponseBody getBody() {
        return this.body;
    }

}
