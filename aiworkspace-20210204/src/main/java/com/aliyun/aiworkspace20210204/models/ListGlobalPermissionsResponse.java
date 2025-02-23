// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListGlobalPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGlobalPermissionsResponseBody body;

    public static ListGlobalPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalPermissionsResponse self = new ListGlobalPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalPermissionsResponse setBody(ListGlobalPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalPermissionsResponseBody getBody() {
        return this.body;
    }

}
