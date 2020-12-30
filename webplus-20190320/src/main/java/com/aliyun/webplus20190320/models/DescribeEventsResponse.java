// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventsResponseBody body;

    public static DescribeEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponse self = new DescribeEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventsResponse setBody(DescribeEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventsResponseBody getBody() {
        return this.body;
    }

}
