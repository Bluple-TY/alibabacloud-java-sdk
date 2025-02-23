// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainQpsDataResponseBody body;

    public static DescribeDcdnDomainQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataResponse self = new DescribeDcdnDomainQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainQpsDataResponse setBody(DescribeDcdnDomainQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainQpsDataResponseBody getBody() {
        return this.body;
    }

}
