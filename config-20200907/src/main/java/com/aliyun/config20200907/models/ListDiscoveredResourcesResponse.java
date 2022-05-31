// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDiscoveredResourcesResponseBody body;

    public static ListDiscoveredResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesResponse self = new ListDiscoveredResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiscoveredResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiscoveredResourcesResponse setBody(ListDiscoveredResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiscoveredResourcesResponseBody getBody() {
        return this.body;
    }

}
