// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupIdByGroupNameResponseBody extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryGroupIdByGroupNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupIdByGroupNameResponseBody self = new QueryGroupIdByGroupNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupIdByGroupNameResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryGroupIdByGroupNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
