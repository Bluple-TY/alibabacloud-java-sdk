// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SetUserAdminResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserAdminResponseBody self = new SetUserAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
