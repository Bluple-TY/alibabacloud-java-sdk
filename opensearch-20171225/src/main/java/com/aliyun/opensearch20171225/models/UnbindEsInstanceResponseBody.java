// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UnbindEsInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static UnbindEsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindEsInstanceResponseBody self = new UnbindEsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindEsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindEsInstanceResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
