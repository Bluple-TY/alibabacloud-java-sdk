// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateWebLockFileEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateWebLockFileEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateWebLockFileEventsResponseBody self = new OperateWebLockFileEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateWebLockFileEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
