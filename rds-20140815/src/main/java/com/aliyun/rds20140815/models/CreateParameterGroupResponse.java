// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupResponse self = new CreateParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
