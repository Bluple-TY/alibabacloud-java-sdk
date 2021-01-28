// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDcdnObjectCachesResponseBody body;

    public static RefreshDcdnObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesResponse self = new RefreshDcdnObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDcdnObjectCachesResponse setBody(RefreshDcdnObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDcdnObjectCachesResponseBody getBody() {
        return this.body;
    }

}
