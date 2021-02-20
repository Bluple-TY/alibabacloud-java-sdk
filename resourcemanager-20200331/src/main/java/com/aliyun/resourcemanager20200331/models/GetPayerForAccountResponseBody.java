// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPayerForAccountResponseBody extends TeaModel {
    @NameInMap("PayerAccountName")
    public String payerAccountName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PayerAccountId")
    public String payerAccountId;

    public static GetPayerForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPayerForAccountResponseBody self = new GetPayerForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPayerForAccountResponseBody setPayerAccountName(String payerAccountName) {
        this.payerAccountName = payerAccountName;
        return this;
    }
    public String getPayerAccountName() {
        return this.payerAccountName;
    }

    public GetPayerForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPayerForAccountResponseBody setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

}
