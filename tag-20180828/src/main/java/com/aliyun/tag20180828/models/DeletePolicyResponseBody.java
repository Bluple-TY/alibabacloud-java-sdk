// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeletePolicyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponseBody self = new DeletePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
