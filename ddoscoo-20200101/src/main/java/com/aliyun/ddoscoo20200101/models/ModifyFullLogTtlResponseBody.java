// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyFullLogTtlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFullLogTtlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullLogTtlResponseBody self = new ModifyFullLogTtlResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFullLogTtlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
