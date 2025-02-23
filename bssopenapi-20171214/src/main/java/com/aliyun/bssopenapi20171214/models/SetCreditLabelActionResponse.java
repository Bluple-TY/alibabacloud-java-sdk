// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetCreditLabelActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCreditLabelActionResponseBody body;

    public static SetCreditLabelActionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLabelActionResponse self = new SetCreditLabelActionResponse();
        return TeaModel.build(map, self);
    }

    public SetCreditLabelActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCreditLabelActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCreditLabelActionResponse setBody(SetCreditLabelActionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCreditLabelActionResponseBody getBody() {
        return this.body;
    }

}
