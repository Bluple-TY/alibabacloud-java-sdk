// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebCacheSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheSwitchResponseBody self = new ModifyWebCacheSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
