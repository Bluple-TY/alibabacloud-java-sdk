// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteProductTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductTopicResponseBody body;

    public static DeleteProductTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductTopicResponse self = new DeleteProductTopicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductTopicResponse setBody(DeleteProductTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductTopicResponseBody getBody() {
        return this.body;
    }

}
