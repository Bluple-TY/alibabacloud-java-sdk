// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteMfaEnabledResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOfficeSiteMfaEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteMfaEnabledResponseBody self = new ModifyOfficeSiteMfaEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteMfaEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
