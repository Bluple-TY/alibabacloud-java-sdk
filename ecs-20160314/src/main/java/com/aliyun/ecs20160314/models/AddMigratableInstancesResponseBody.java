// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class AddMigratableInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMigratableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMigratableInstancesResponseBody self = new AddMigratableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMigratableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
