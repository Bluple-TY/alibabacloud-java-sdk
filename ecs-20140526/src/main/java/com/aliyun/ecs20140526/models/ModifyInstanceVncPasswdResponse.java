// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceVncPasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswdResponse self = new ModifyInstanceVncPasswdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
