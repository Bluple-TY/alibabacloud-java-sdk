// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeByteHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBody body;

    public static DescribeDcdnDomainRealTimeByteHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeByteHitRateDataResponse self = new DescribeDcdnDomainRealTimeByteHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponse setBody(DescribeDcdnDomainRealTimeByteHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

}
