// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PurgeDBInstanceLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static PurgeDBInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeDBInstanceLogResponse self = new PurgeDBInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public PurgeDBInstanceLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
