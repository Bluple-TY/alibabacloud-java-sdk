// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionRuleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static SetDataLevelPermissionRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionRuleConfigResponseBody self = new SetDataLevelPermissionRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataLevelPermissionRuleConfigResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SetDataLevelPermissionRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
