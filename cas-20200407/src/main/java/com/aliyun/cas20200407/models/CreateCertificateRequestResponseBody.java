// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertificateRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequestResponseBody self = new CreateCertificateRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateCertificateRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
