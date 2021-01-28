// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainTrafficDataResponseBody body;

    public static DescribeDcdnDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTrafficDataResponse self = new DescribeDcdnDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainTrafficDataResponse setBody(DescribeDcdnDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
