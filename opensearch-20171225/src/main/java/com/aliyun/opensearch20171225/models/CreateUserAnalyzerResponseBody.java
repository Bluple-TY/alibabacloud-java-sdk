// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateUserAnalyzerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static CreateUserAnalyzerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAnalyzerResponseBody self = new CreateUserAnalyzerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserAnalyzerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserAnalyzerResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
