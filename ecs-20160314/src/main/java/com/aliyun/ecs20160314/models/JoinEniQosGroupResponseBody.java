// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class JoinEniQosGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static JoinEniQosGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinEniQosGroupResponseBody self = new JoinEniQosGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinEniQosGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
