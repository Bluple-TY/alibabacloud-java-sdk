// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetDatabaseAccountPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDatabaseAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDatabaseAccountPasswordResponseBody self = new ResetDatabaseAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDatabaseAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
