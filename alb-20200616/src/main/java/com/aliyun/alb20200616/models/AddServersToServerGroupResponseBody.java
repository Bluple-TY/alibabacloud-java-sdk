// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddServersToServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupResponseBody self = new AddServersToServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AddServersToServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
