// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSentinelBlockFallbackDefinitionsResponseBody body;

    public static ListSentinelBlockFallbackDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelBlockFallbackDefinitionsResponse self = new ListSentinelBlockFallbackDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSentinelBlockFallbackDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSentinelBlockFallbackDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSentinelBlockFallbackDefinitionsResponse setBody(ListSentinelBlockFallbackDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSentinelBlockFallbackDefinitionsResponseBody getBody() {
        return this.body;
    }

}
