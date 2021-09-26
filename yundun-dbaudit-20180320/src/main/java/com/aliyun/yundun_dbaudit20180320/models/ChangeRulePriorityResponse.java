// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeRulePriorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeRulePriorityResponseBody body;

    public static ChangeRulePriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRulePriorityResponse self = new ChangeRulePriorityResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRulePriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRulePriorityResponse setBody(ChangeRulePriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRulePriorityResponseBody getBody() {
        return this.body;
    }

}
