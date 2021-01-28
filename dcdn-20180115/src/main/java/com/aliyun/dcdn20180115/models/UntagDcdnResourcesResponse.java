// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UntagDcdnResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UntagDcdnResourcesResponseBody body;

    public static UntagDcdnResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagDcdnResourcesResponse self = new UntagDcdnResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UntagDcdnResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagDcdnResourcesResponse setBody(UntagDcdnResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagDcdnResourcesResponseBody getBody() {
        return this.body;
    }

}
