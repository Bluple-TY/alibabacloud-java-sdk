// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDISyncInstanceResponseBody body;

    public static StopDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponse self = new StopDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDISyncInstanceResponse setBody(StopDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}
