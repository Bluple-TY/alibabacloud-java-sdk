// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserGroupResponseBody body;

    public static UpdateUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponse self = new UpdateUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserGroupResponse setBody(UpdateUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserGroupResponseBody getBody() {
        return this.body;
    }

}
