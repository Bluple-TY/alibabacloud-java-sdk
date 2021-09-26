// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AssociateDbToRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateDbToRuleResponseBody body;

    public static AssociateDbToRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateDbToRuleResponse self = new AssociateDbToRuleResponse();
        return TeaModel.build(map, self);
    }

    public AssociateDbToRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateDbToRuleResponse setBody(AssociateDbToRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateDbToRuleResponseBody getBody() {
        return this.body;
    }

}
