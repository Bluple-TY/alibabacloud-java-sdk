// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelQualificationVerificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelQualificationVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelQualificationVerificationResponseBody self = new CancelQualificationVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelQualificationVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
