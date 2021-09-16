// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEscalationPlanServicesResponseBody body;

    public static ListEscalationPlanServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlanServicesResponse self = new ListEscalationPlanServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlanServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEscalationPlanServicesResponse setBody(ListEscalationPlanServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEscalationPlanServicesResponseBody getBody() {
        return this.body;
    }

}
