// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateRdsExternalStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static UpdateRdsExternalStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRdsExternalStoreResponse self = new UpdateRdsExternalStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRdsExternalStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRdsExternalStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
