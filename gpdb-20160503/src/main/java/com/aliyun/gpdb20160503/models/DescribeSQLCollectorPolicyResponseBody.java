// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    public static DescribeSQLCollectorPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponseBody self = new DescribeSQLCollectorPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLCollectorPolicyResponseBody setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

}
