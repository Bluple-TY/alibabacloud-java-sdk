// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataExportOrderResponseBody body;

    public static CreateDataExportOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderResponse self = new CreateDataExportOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataExportOrderResponse setBody(CreateDataExportOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataExportOrderResponseBody getBody() {
        return this.body;
    }

}
