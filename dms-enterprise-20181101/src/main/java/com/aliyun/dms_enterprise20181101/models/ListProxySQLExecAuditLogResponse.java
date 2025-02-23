// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProxySQLExecAuditLogResponseBody body;

    public static ListProxySQLExecAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProxySQLExecAuditLogResponse self = new ListProxySQLExecAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public ListProxySQLExecAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProxySQLExecAuditLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProxySQLExecAuditLogResponse setBody(ListProxySQLExecAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProxySQLExecAuditLogResponseBody getBody() {
        return this.body;
    }

}
