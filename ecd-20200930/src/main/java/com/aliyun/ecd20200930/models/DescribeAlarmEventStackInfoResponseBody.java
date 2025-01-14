// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The stack information of the alert details.
    @NameInMap("StackInfo")
    public String stackInfo;

    public static DescribeAlarmEventStackInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoResponseBody self = new DescribeAlarmEventStackInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventStackInfoResponseBody setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
        return this;
    }
    public String getStackInfo() {
        return this.stackInfo;
    }

}
