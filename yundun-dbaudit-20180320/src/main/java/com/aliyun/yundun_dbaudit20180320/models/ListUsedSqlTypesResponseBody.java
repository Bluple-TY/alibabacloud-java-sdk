// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListUsedSqlTypesResponseBody extends TeaModel {
    @NameInMap("ServerData")
    public String serverData;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsedSqlTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsedSqlTypesResponseBody self = new ListUsedSqlTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsedSqlTypesResponseBody setServerData(String serverData) {
        this.serverData = serverData;
        return this;
    }
    public String getServerData() {
        return this.serverData;
    }

    public ListUsedSqlTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
