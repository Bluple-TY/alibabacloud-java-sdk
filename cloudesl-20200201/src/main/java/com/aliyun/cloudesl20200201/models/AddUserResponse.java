// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AddUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserResponseBody body;

    public static AddUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserResponse self = new AddUserResponse();
        return TeaModel.build(map, self);
    }

    public AddUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserResponse setBody(AddUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserResponseBody getBody() {
        return this.body;
    }

}
