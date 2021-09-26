// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterServiceConfigHistoryResponseBody body;

    public static ListClusterServiceConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigHistoryResponse self = new ListClusterServiceConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceConfigHistoryResponse setBody(ListClusterServiceConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
