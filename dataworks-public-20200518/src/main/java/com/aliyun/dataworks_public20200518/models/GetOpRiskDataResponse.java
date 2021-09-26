// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpRiskDataResponseBody body;

    public static GetOpRiskDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataResponse self = new GetOpRiskDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpRiskDataResponse setBody(GetOpRiskDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpRiskDataResponseBody getBody() {
        return this.body;
    }

}
