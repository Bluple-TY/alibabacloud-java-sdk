// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeWebhookContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebhookContactsResponseBody body;

    public static DescribeWebhookContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebhookContactsResponse self = new DescribeWebhookContactsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebhookContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebhookContactsResponse setBody(DescribeWebhookContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebhookContactsResponseBody getBody() {
        return this.body;
    }

}