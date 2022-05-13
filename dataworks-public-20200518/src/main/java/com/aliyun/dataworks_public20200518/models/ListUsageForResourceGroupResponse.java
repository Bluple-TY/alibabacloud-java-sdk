// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListUsageForResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsageForResourceGroupResponseBody body;

    public static ListUsageForResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsageForResourceGroupResponse self = new ListUsageForResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListUsageForResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsageForResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsageForResourceGroupResponse setBody(ListUsageForResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsageForResourceGroupResponseBody getBody() {
        return this.body;
    }

}