// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcMortgageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcMortgageResponseBody body;

    public static GetOcIcMortgageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcMortgageResponse self = new GetOcIcMortgageResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcMortgageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcMortgageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcMortgageResponse setBody(GetOcIcMortgageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcMortgageResponseBody getBody() {
        return this.body;
    }

}
