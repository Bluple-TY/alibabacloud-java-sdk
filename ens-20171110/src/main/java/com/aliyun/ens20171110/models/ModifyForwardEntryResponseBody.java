// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyForwardEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryResponseBody self = new ModifyForwardEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
