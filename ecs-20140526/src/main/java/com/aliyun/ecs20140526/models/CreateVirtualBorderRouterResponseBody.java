// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponseBody extends TeaModel {
    @NameInMap("VbrId")
    public String vbrId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponseBody self = new CreateVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterResponseBody setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public CreateVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
