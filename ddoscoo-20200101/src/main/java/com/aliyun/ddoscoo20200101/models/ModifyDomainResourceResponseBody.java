// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyDomainResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResourceResponseBody self = new ModifyDomainResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}