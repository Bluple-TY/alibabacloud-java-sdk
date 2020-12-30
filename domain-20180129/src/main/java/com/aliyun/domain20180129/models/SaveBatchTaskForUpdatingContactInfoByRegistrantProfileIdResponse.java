// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body;

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse self = new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse setBody(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody getBody() {
        return this.body;
    }

}
