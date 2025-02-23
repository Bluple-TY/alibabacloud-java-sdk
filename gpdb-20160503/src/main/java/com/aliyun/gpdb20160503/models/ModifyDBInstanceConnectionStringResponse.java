// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceConnectionStringResponseBody body;

    public static ModifyDBInstanceConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponse self = new ModifyDBInstanceConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceConnectionStringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceConnectionStringResponse setBody(ModifyDBInstanceConnectionStringResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceConnectionStringResponseBody getBody() {
        return this.body;
    }

}
