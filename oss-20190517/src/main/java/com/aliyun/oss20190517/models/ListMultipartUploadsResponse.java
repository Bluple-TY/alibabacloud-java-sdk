// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListMultipartUploadsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultipartUploadsResponseBody body;

    public static ListMultipartUploadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultipartUploadsResponse self = new ListMultipartUploadsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultipartUploadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultipartUploadsResponse setBody(ListMultipartUploadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultipartUploadsResponseBody getBody() {
        return this.body;
    }

}
