// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody body;

    public static GetAggregateResourceComplianceGroupByResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByResourceTypeResponse self = new GetAggregateResourceComplianceGroupByResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse setBody(GetAggregateResourceComplianceGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
