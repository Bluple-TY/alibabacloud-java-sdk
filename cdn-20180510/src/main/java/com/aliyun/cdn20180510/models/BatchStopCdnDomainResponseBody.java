// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStopCdnDomainResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStopCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopCdnDomainResponseBody self = new BatchStopCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
