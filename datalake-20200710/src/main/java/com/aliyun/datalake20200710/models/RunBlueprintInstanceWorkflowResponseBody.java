// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunBlueprintInstanceWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RunBlueprintInstanceWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunBlueprintInstanceWorkflowResponseBody self = new RunBlueprintInstanceWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RunBlueprintInstanceWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunBlueprintInstanceWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
