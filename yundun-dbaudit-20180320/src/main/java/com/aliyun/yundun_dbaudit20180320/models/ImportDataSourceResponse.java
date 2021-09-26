// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ImportDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDataSourceResponseBody body;

    public static ImportDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourceResponse self = new ImportDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ImportDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDataSourceResponse setBody(ImportDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDataSourceResponseBody getBody() {
        return this.body;
    }

}
