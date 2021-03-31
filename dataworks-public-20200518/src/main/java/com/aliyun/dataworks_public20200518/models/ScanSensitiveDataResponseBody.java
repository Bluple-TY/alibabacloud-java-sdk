// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataResponseBody extends TeaModel {
    @NameInMap("Sensitives")
    public java.util.Map<String, ?> sensitives;

    @NameInMap("RequestId")
    public String requestId;

    public static ScanSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanSensitiveDataResponseBody self = new ScanSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanSensitiveDataResponseBody setSensitives(java.util.Map<String, ?> sensitives) {
        this.sensitives = sensitives;
        return this;
    }
    public java.util.Map<String, ?> getSensitives() {
        return this.sensitives;
    }

    public ScanSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
