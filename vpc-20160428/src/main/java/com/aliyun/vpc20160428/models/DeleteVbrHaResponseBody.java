// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVbrHaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVbrHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVbrHaResponseBody self = new DeleteVbrHaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVbrHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
