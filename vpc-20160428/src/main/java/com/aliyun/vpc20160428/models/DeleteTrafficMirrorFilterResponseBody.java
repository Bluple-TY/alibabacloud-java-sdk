// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficMirrorFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorFilterResponseBody self = new DeleteTrafficMirrorFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
