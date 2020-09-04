// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class FinishPublishPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static FinishPublishPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishPublishPlanResponse self = new FinishPublishPlanResponse();
        return TeaModel.build(map, self);
    }

    public FinishPublishPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FinishPublishPlanResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
