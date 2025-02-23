// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SearchClusterInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchClusterInstancesResponseBody body;

    public static SearchClusterInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchClusterInstancesResponse self = new SearchClusterInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SearchClusterInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchClusterInstancesResponse setBody(SearchClusterInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchClusterInstancesResponseBody getBody() {
        return this.body;
    }

}
