// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBaselineKeyPathResponseBody body;

    public static GetBaselineKeyPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathResponse self = new GetBaselineKeyPathResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineKeyPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaselineKeyPathResponse setBody(GetBaselineKeyPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaselineKeyPathResponseBody getBody() {
        return this.body;
    }

}
