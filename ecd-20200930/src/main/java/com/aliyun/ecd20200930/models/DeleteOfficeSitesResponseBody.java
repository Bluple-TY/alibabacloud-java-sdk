// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSitesResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOfficeSitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSitesResponseBody self = new DeleteOfficeSitesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
