// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrivatePoolOptionsId")
    public String privatePoolOptionsId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateElasticityAssuranceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceResponseBody self = new CreateElasticityAssuranceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateElasticityAssuranceResponseBody setPrivatePoolOptionsId(String privatePoolOptionsId) {
        this.privatePoolOptionsId = privatePoolOptionsId;
        return this;
    }
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    public CreateElasticityAssuranceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
