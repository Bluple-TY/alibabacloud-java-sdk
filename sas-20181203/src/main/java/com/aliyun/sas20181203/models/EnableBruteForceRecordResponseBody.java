// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableBruteForceRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableBruteForceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableBruteForceRecordResponseBody self = new EnableBruteForceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableBruteForceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
