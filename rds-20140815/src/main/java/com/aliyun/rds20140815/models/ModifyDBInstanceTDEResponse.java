// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDEResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDEResponse self = new ModifyDBInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDEResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
