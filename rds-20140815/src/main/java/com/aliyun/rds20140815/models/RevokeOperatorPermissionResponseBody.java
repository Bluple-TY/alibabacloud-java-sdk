// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeOperatorPermissionResponseBody self = new RevokeOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
