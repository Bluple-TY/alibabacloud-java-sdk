// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDiagnosisSettingsResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDiagnosisSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiagnosisSettingsResponseBody self = new UpdateDiagnosisSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDiagnosisSettingsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateDiagnosisSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
